package com.aashis.demoproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle","Onstart");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.i("Lifecycle","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle","onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle","onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle","onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","onDestroy");

    }
}