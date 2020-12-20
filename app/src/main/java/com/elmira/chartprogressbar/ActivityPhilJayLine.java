package com.elmira.chartprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class ActivityPhilJayLine extends AppCompatActivity {

    LineChart lineChart;
    LineData lineData;
    LineDataSet lineDataSet;
    ArrayList lineEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phil_jay);
        lineChart = findViewById(R.id.lineChart);
        getEntries();
        lineDataSet = new LineDataSet(lineEntries, "ActivityPhilJay");
        lineData = new LineData(lineDataSet);
        lineChart.setData(lineData);
        lineDataSet.setValueTextColor(Color.BLACK);
        lineDataSet.setValueTextSize(14f);
        lineDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        lineDataSet.setLineWidth(2f);
        lineDataSet.setCircleRadius(7f);

    }
    private void getEntries() {
        lineEntries = new ArrayList<>();
        lineEntries.add(new Entry(2f, 0));
        lineEntries.add(new Entry(4f, 1));
        lineEntries.add(new Entry(6f, 1));
        lineEntries.add(new Entry(8f, 3));
        lineEntries.add(new Entry(9f, 2));
        lineEntries.add(new Entry(10f, 5));
        lineEntries.add(new Entry(12f, 3));
        lineEntries.add(new Entry(15f, 2));
    }

}