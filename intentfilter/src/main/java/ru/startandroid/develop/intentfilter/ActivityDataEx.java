package ru.startandroid.develop.intentfilter;

import java.sql.Date;
import java.text.SimpleDateFormat;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDataEx extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, yyyy");
        String date = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvDate = findViewById(R.id.tvDate);
        tvDate.setText(date);
    }
}