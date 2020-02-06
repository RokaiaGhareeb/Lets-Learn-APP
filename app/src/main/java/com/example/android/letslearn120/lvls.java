package com.example.android.letslearn120;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class lvls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvls);
    }

    public void Next1(View view) {
        Intent i = new Intent(this,lvl1q1.class);
        startActivity(i);
    }
    public void Next2(View view) {
        Intent i = new Intent(this,lvl2q2.class);
        startActivity(i);
    }
    public void Next3(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
