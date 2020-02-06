package com.example.android.letslearn120;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.sql.Struct;

public class lvl1q1 extends AppCompatActivity {
    private ImageView image1;
    private TextView textView;
    private RadioButton nord;
    private RadioButton yesrd;
    private int[] imageArray;
    private  String[] str;
    public  static int cnt = 0;
    public static int flg = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1q1);
        image1 = (ImageView) findViewById(R.id.imageView);
        textView = (TextView) findViewById(R.id.textView);
        nord = (RadioButton) findViewById(R.id.Noradiobutton1);
        yesrd = (RadioButton) findViewById(R.id.Yesradiobutton1);
        imageArray = new int[5];
        imageArray[0] = R.drawable.apple;
        imageArray[1] = R.drawable.ball;
        imageArray[2] = R.drawable.panda;
        imageArray[3] = R.drawable.elephant;
        imageArray[4] = R.drawable.dynasoure;
        image1.setImageResource(imageArray[cnt]);
        str = new String[5];
        str[0] = "Is this Tree?";
        str[1] = "Is this Ball?";
        str[2] = "Is this Cat?";
        str[3] = "Is this Elephant?";
        str[4] = "Is this YoYo?";
        textView.setText(str[cnt]);
    }

    public void Next(View view) {
        MainActivity.mp.pause();
        if((nord.isChecked() && cnt % 2 == 0) ||( yesrd.isChecked() && cnt % 2 != 0)){
            MainActivity.score += 10;
            flg = 1;
        }
        else{
            flg = 0;
        }
        cnt++;
        Intent i = new Intent(this,resultshowup.class);
        startActivity(i);

    }
}
