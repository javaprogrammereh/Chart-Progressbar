package com.elmira.chartprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;

import com.progress.progressview.ProgressView;
import com.yhd.semicircle.SemiCircleView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ActivitySemiCircularProgressBar extends AppCompatActivity {

    private ProgressView mProgressView1, mProgressView2, mProgressLine;
    SemiCircleView semiCircleView;

    private Random r = new Random(1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi_circular_progress_bar);
        mProgressView1 = findViewById(R.id.progressView1);
        mProgressView2 = findViewById(R.id.progressView2);
        mProgressLine = findViewById(R.id.progressLine);
        semiCircleView = findViewById(R.id.smc);



        int[] colorList = new int[]{Color.BLUE, Color.BLUE, Color.BLUE};
        mProgressView2.applyGradient(colorList);
        mProgressView1.applyGradient(colorList);
        mProgressLine.applyGradient(colorList);

        float progress = r.nextFloat();
//        float progress = (float) 1.0;
//        mProgressView.setProgress(progress);
        mProgressView1.setProgress(progress);
        mProgressView2.setProgress(progress);
        mProgressLine.setProgress(progress);

        List<float[]> deepArray = new ArrayList<>();
        deepArray.add(new float[]{0.0f, 0.5f});
//        deepArray.add(new float[]{0.4f, 0.1f});
//        deepArray.add(new float[]{0.6f, 0.1f});
        semiCircleView.setDeepArray(deepArray);


    }
}