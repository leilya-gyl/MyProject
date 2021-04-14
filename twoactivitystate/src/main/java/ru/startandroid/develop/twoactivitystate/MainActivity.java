package ru.startandroid.develop.twoactivitystate;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    final String TAG = "States";

    Button btnActTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo = findViewById(R.id.btnActTwo);

        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(intent);
            }
        };

        btnActTwo.setOnClickListener(oclBtn);

        Log.d(TAG,"MainActivity: onCreate()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"MainActivity: onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"MainActivity: onDestroy()");
    }
}