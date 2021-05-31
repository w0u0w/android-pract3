package ru.mirea.velikanov.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView timeLabel = findViewById(R.id.time);

        Intent intent = getIntent();
        String time = intent.getStringExtra("time");
        timeLabel.setText(time);
    }
}