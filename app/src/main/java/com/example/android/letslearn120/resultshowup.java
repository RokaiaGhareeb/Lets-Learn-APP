package com.example.android.letslearn120;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class resultshowup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultshowup);
        TextView txt = (TextView)findViewById(R.id.scoretxtvw);
        txt.setText(MainActivity.score +"");
        ImageView img = (ImageView)findViewById(R.id.imageView2);
        if(lvl1q1.flg == 1){
            img.setImageResource(R.drawable.goodjob);
            MediaPlayer mp2 = MediaPlayer.create(resultshowup.this,R.raw.clab);
            mp2.start();
        }else if(lvl1q1.flg == 0){
            img.setImageResource(R.drawable.wrong);
        }
    }
    public void Next(View view) {
        MainActivity.mp.start();
        if(lvl1q1.cnt < 5){
            Intent i = new Intent(this,lvl1q1.class);
            startActivity(i);
        }
        else{
            Intent i = new Intent(this,lvls.class);
            startActivity(i);
        }
    }
}
