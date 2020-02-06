package com.example.android.letslearn120;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class learnstrt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnstrt);
    }
    public void goo(View view) {
        Intent i = new Intent(this,Learn.class);
        startActivity(i);
    }

    public void go(View view) {
        Intent i = new Intent(this,vediov.class);
        startActivity(i);
    }
    public void back(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
