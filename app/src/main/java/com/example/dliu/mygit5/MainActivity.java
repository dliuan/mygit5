package com.example.dliu.mygit5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "onCreate: ");
        Log.i("MainActivity", "onCreate:123 ");
        Log.i("MainActivity", "onCreate: 345");

    }
}
