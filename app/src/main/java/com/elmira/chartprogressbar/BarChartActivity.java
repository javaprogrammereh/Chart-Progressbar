package com.elmira.chartprogressbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

import com.anychart.graphics.vector.Fill;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
//import com.github.mikephil.charting.utils.Fill;

import java.util.ArrayList;
import java.util.List;

public class BarChartActivity extends AppCompatActivity {

    private BarChart chart;
    ArrayList<BarEntry> values = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bar_chart);
        setTitle("BarChartActivity");
        /**/
        getEntries();
        /**/
        chart = findViewById(R.id.chartbar);
        chart.setDrawBarShadow(false);
        chart.setDrawValueAboveBar(true);
        chart.getDescription().setEnabled(false);
        chart.setMaxVisibleValueCount(100);
        chart.setPinchZoom(false);
        chart.setTouchEnabled(false);
        chart.setDragEnabled(false);
        chart.setScaleEnabled(false);
        chart.setDrawGridBackground(false);
        chart.getDescription().setEnabled(false);
        chart.getLegend().setEnabled(false);
        chart.getAxisRight().setDrawGridLines(false);
        chart.getAxisLeft().setDrawGridLines(false);
        chart.getXAxis().setDrawGridLines(false);
        /**/
        XAxis xAxis = chart.getXAxis();
        xAxis.setTextColor(Color.WHITE);
        xAxis.setAxisLineColor(Color.WHITE);
        xAxis.setAxisLineWidth(0);
        xAxis.setDrawAxisLine(false);
        xAxis.setTextSize(0f);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setGranularity(0f);
        xAxis.setLabelCount(0);
        /**/
        YAxis leftAxis = chart.getAxisLeft();
        leftAxis.setLabelCount(0, false);
        leftAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        leftAxis.setSpaceTop(0f);
        leftAxis.setAxisMinimum(0f);
        leftAxis.setTextSize(0f);
        leftAxis.setTextColor(Color.WHITE);
        leftAxis.setAxisLineColor(Color.WHITE);
        leftAxis.setAxisLineWidth(0);
        /**/
        YAxis rightAxis = chart.getAxisRight();
        rightAxis.setDrawGridLines(false);
        rightAxis.setLabelCount(0, false);
        rightAxis.setSpaceTop(0f);
        rightAxis.setAxisMinimum(0f);
        rightAxis.setTextSize(0f);
        rightAxis.setTextColor(Color.WHITE);
        rightAxis.setAxisLineColor(Color.WHITE);
        rightAxis.setAxisLineWidth(0);
        /**/
        setData();
    }
    /**/
    private void getEntries() {
        values = new ArrayList<>();
        values.add(new BarEntry(0f, 1));
        values.add(new BarEntry(1f, 2));
        values.add(new BarEntry(2f, 3));
        values.add(new BarEntry(3f, 4));
        values.add(new BarEntry(4f, 5));
        values.add(new BarEntry(5f, 6));
        values.add(new BarEntry(6f, 7));
        values.add(new BarEntry(7f, 8));
        values.add(new BarEntry(8f, 9));
        values.add(new BarEntry(9f, 10));
        values.add(new BarEntry(10f, 11));
        values.add(new BarEntry(11f, 12));
        values.add(new BarEntry(12f, 13));
        values.add(new BarEntry(13f, 14));
        values.add(new BarEntry(14f, 15));
        values.add(new BarEntry(15f, 16));
        values.add(new BarEntry(16f, 17));
        values.add(new BarEntry(17f, 18));
        values.add(new BarEntry(18f, 19));
        values.add(new BarEntry(19f, 20));
        values.add(new BarEntry(20f, 21));
    }
    /**/
    private void setData() {
//        int[] colors = new int[]{
//                Color.parseColor("#6F88E3")
//                , Color.parseColor("#6F88E3")
//                ,Color.parseColor("#6F88E3")
//                , Color.parseColor("#D87194")
//                ,Color.parseColor("#6F88E3")
//                , Color.parseColor("#6F88E3")};

        BarDataSet set1;
        set1 = new BarDataSet(values, "");
//        set1.setColors(colors);
        for(int i = 0; i<21;i++){
            int[] colors2 = new int[]{
                    Color.parseColor("#6F88E3")
                    , Color.parseColor("#6F88E3")
                    ,Color.parseColor("#6F88E3")
                    , Color.parseColor("#6F88E3")};
            if(set1.getEntryForIndex(i).getY()<21){
                Log.d("",""+set1.getEntryForIndex(i).getY());
                set1.setColors(colors2);
                set1.addColor(Color.parseColor("#D87194"));
                set1.notifyDataSetChanged();
            }
//
        }

//        set1.setHighLightColor(Color.parseColor("#70DCD1"));
//        bardataset.setColors(new int[]{getResources().getColor(R.color.red)});
        set1.setDrawIcons(false);
        set1.setValueTextColor(Color.WHITE);
        /**/
        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);
        BarData data = new BarData(dataSets);
        data.setValueTextSize(0f);
        data.setBarWidth(0.4f);
        chart.setData(data);
    }
}
