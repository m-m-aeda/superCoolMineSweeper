package com.goodboy.manoma.suprecoolminesweeper.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.goodboy.manoma.suprecoolminesweeper.R;

public class Controller extends AppCompatActivity {
    private SweepResultListener receiver = new SweepResultReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
