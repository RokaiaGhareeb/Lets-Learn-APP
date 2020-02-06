package com.example.android.letslearn120;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class resultshowup2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultshowup2);
        TextView txt = (TextView)findViewById(R.id.scoretxtvw);
        txt.setText(MainActivity.score +"");
        ImageView img = (ImageView)findViewById(R.id.imageView2);
        if(lvl2q2.flg2 == 1){
            img.setImageResource(R.drawable.goodjob);
            MediaPlayer mp3 = MediaPlayer.create(resultshowup2.this,R.raw.clab);
            mp3.start();
        }else if(lvl2q2.flg2 == 0){
            img.setImageResource(R.drawable.wrong);
        }
    }
    public void Next(View view) {
        MainActivity.mp.start();
        if(lvl2q2.cnt2 < 5){
            Intent i = new Intent(this,lvl2q2.class);
            startActivity(i);
        }
        else{
            Intent i = new Intent(this,lvls.class);
            startActivity(i);
        }
    }
}
