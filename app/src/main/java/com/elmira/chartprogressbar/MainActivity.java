package com.elmira.chartprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnProgress,btnLine,btnBar,btnLine2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProgress = findViewById(R.id.btn_prog);
        btnLine = findViewById(R.id.btn_ph_line);
        btnBar = findViewById(R.id.btn_any_bar);
        btnLine2 = findViewById(R.id.btn_any_line);

        btnProgress.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProgressbarActivity.class);
            startActivity(intent);
        });
        btnLine.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityPhilJayLine.class);
            startActivity(intent);
        });
        btnBar.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityRadar.class);
            startActivity(intent);
        });
        btnLine2.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityAnyLine.class);
            startActivity(intent);
        });
    }
}