package com.example.android.kotiappy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Show a message when the app starts
         */
        Toast.makeText(this, "Hello I am Ali", Toast.LENGTH_SHORT).show();
    }
}
