package ru.startandroid.develop.simplebrowser;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        (findViewById(R.id.btnWeb)).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ya.ru"))));
    }
}