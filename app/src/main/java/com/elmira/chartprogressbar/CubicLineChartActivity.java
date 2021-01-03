package com.elmira.chartprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.SeekBar;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class CubicLineChartActivity extends AppCompatActivity {

    private LineChart chart;
    ArrayList lineEntries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubic_line_chart);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cubic_line_chart);

        setTitle("CubicLineChartActivity");
        getEntries();

        chart = findViewById(R.id.chart1);
        chart.setViewPortOffsets(0, 0, 0, 0);
        chart.setBackgroundColor(Color.rgb(104, 241, 175));
        // no description text
        chart.getDescription().setEnabled(false);
        // enable touch gestures
        chart.setTouchEnabled(false);
        // enable scaling and dragging
        chart.setDragEnabled(false);
        chart.setScaleEnabled(false);
        // if disabled, scaling can be done on x- and y-axis separately
        chart.setPinchZoom(false);
//        chart.setDrawGridBackground(false);
//        chart.setMaxHighlightDistance(300);
        XAxis x = chart.getXAxis();
        x.setEnabled(false);
        YAxis y = chart.getAxisLeft();
        y.setLabelCount(6, false);
        y.setTextColor(Color.WHITE);
        y.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART);
        y.setDrawGridLines(false);
        y.setAxisLineColor(Color.WHITE);
        chart.getAxisRight().setEnabled(false);
        chart.getLegend().setEnabled(false);
        chart.animateXY(2000, 2000);
        // don't forget to refresh the drawing
        chart.invalidate();
        setData();
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

    private void setData() {
        LineDataSet set1;
        // create a dataset and give it a type
        set1 = new LineDataSet(lineEntries, "DataSet 1");
        set1.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        set1.setCubicIntensity(0.2f);
        set1.setDrawFilled(true);
        set1.setDrawCircles(false);
        set1.setLineWidth(1.8f);
        set1.setCircleRadius(4f);
        set1.setCircleColor(Color.WHITE);
        set1.setHighLightColor(Color.rgb(244, 117, 117));
        set1.setColor(Color.WHITE);
        set1.setFillColor(Color.WHITE);
        set1.setFillAlpha(100);
        set1.setDrawHorizontalHighlightIndicator(false);
        // create a data object with the data sets
        LineData data = new LineData(set1);
        data.setValueTextSize(9f);
        data.setDrawValues(false);
        // set data
        chart.setData(data);
    }
}
