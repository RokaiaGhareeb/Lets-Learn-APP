package com.example.android.letslearn120;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class vediov extends AppCompatActivity {
    public  VideoView vid;
    public static  MediaController m;
    static int stoppos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vediov);
        vid =(VideoView)findViewById(R.id.videoView);
        String path = "android.resource://"+getPackageName()+"/" + R.raw.v;
        Uri u = Uri.parse(path);
        vid.setVideoURI(u);
        MainActivity.mp.pause();
    }
    public void play(View v) {

        vid.start();
    }
    public void pause(View v){
        vid.pause();
        stoppos = vid.getCurrentPosition();
    }
    public void resume(View v){
        vid.seekTo(stoppos);
        vid.start();
    }
    public void back(View v){
            Intent i = new Intent(this,learnstrt.class);
            startActivity(i);

    }
}
