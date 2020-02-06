package com.example.android.letslearn120;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(MainActivity.this,R.raw.strt);
        mp.start();
        mp.setLooping(true);
    }
    public static int score = 0;
    public void letMeOut(View view) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void startTheGame(View view) {
        Intent i = new Intent(this,lvls.class);
        startActivity(i);
    }

    public void startToLearn(View view) {
        Intent i = new Intent(this,learnstrt.class);
        startActivity(i);
    }
}
