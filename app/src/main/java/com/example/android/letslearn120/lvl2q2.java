package com.example.android.letslearn120;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class lvl2q2 extends AppCompatActivity {
    private ImageView img;
    private EditText edt;
    private int[] imgs;
    private String[] wrd;
    public static int cnt2 = 0;
    public static int flg2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl2q2);
        img = (ImageView) findViewById(R.id.wordimg);
        edt = (EditText) findViewById(R.id.wordin);
        imgs = new int[5];
        wrd = new String[5];
        imgs[0] = R.drawable.apple;
        imgs[1] = R.drawable.ball;
        imgs[2] = R.drawable.cat;
        imgs[3] = R.drawable.dynasoure;
        imgs[4] = R.drawable.elephant;
        wrd[0] = "Apple";
        wrd[1] = "Ball";
        wrd[2] = "Cat";
        wrd[3] = "Dinasour";
        wrd[4] = "Elephant";
        img.setImageResource(imgs[cnt2]);
    }

    public void Next(View view) {
        MainActivity.mp.pause();
        if (edt.getText().toString().equals(wrd[cnt2])) {
            MainActivity.score += 10;
            flg2 = 1;
        } else {
            flg2 = 0;
        }
        cnt2++;
        Intent i = new Intent(this, resultshowup2.class);
        startActivity(i);
    }
}
