package com.foodgrubber.dependancyinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UFCevent ufCevent = new UFCevent(new Boxer(),new Judoka());
        ufCevent.figth();
    }
}