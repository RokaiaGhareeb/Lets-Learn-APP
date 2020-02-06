package com.example.android.letslearn120;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidinterview.com.customlistviewimagetext.CustomListAdapter;

public class Learn extends AppCompatActivity {

    ListView list;
    String[] alpha = {
            "A a", "B b", "C c", "D d", "E e", "F f", "G g", "H h", "I i", "J j", "K k", "L l",
            "M m", "N n", "O o", "P p", "Q q", "R r", "S s", "T t", "U u", "V v", "W w", "X x",
            "Y y", "Z z"
    };
    String[] itemname = {
            "Apple", "Ball", "Cat", "Dinasour", "Elephant", "Fish",
            "Girl", "Hat", "Ice-cream", "Juice", "Kite", "Lion",
            "Mother", "Nose", "Orange", "Parrot", "Queen", "Rabbit",
            "Sun", "Tea", "Universe", "Vase", "Window", "X-ray",
            "Yoyo", "Zebra"

    };
    Integer[] imgid = {
            R.drawable.apple, R.drawable.ball, R.drawable.cat,
            R.drawable.dynasoure, R.drawable.elephant, R.drawable.fish,
            R.drawable.girl, R.drawable.hat, R.drawable.food,
            R.drawable.juice, R.drawable.kite, R.drawable.lion,
            R.drawable.mother, R.drawable.nose, R.drawable.orange,
            R.drawable.parrot, R.drawable.queen, R.drawable.rabbit,
            R.drawable.sun, R.drawable.tea, R.drawable.universe,
            R.drawable.vase, R.drawable.window, R.drawable.x,
            R.drawable.yoyo, R.drawable.zebra


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid, alpha);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        MainActivity.mp.start();

    }
    public void back(View view) {
        Intent i = new Intent(this,learnstrt.class);
        startActivity(i);
    }


}




