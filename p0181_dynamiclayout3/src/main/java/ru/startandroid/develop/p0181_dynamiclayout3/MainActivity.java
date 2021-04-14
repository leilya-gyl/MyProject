package ru.startandroid.develop.p0181_dynamiclayout3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    SeekBar sbWeight;
    Button btn1, btn2;

    LinearLayout.LayoutParams lparam1;
    LinearLayout.LayoutParams lparam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbWeight = findViewById(R.id.sbWeight);
        sbWeight.setOnSeekBarChangeListener(this);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        lparam1 = (LinearLayout.LayoutParams)btn1.getLayoutParams();
        lparam2 = (LinearLayout.LayoutParams)btn2.getLayoutParams();
    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        int leftValue = progress;
        int rightValue = seekBar.getMax() - progress;

        lparam1.weight = leftValue;
        lparam2.weight = rightValue;
        btn1.setText(String.valueOf(leftValue));
        btn2.setText(String.valueOf(rightValue));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}