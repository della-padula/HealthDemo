package com.takout.healthdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import im.dacer.androidcharts.LineView;

public class MainActivity extends AppCompatActivity {

    int randomint = 9;

    ProgressBar progressBarRowling;
    ProgressBar progressBarPress;
    ProgressBar progressBarAvgPower;

    HorizontalScrollView lineChart;

    TextView todayDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int c1 = getResources().getColor(R.color.colorPro1);
        int c2 = getResources().getColor(R.color.colorPro1);

        progressBarRowling = findViewById(R.id.pg_rowling);
        progressBarPress = findViewById(R.id.pg_press);
        progressBarAvgPower = findViewById(R.id.pg_avgpower);

        lineChart = findViewById(R.id.chart_record);
        todayDate = findViewById(R.id.tv_date);

        progressBarRowling.getIndeterminateDrawable().setColorFilter(c1, PorterDuff.Mode.MULTIPLY);
        progressBarPress.getIndeterminateDrawable().setColorFilter(c2, PorterDuff.Mode.MULTIPLY);

        progressBarRowling.setProgress(70);
        progressBarPress.setProgress(90);
        progressBarAvgPower.setProgress(40);

        // Set Test Data
        DemoData.setDemoFitnessData(8);


        final LineView lineView = findViewById(R.id.line_view);

        initLineView(lineView);
        lineView.setDataList(getRecordData());

    }

    private ArrayList<ArrayList<Integer>> getRecordData() {
        ArrayList<ArrayList<Integer>> returnList = new ArrayList<>();

        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < DemoData.demoFitnessData.getRowingRecordList().size(); ++i) {
            result.add(DemoData.demoFitnessData.getRowingRecordList().get(i).getPower());
        }

        returnList.add(result);


        ArrayList<Integer> result2 = new ArrayList<>();
        for(int i = 0; i < DemoData.demoFitnessData.getPressRecordList().size(); ++i) {
            result2.add(DemoData.demoFitnessData.getPressRecordList().get(i).getPower());
        }

        returnList.add(result2);

        return returnList;
    }

    private void initLineView(LineView lineView) {
        ArrayList<String> test = new ArrayList<String>();
        for (int i = 0; i < DemoData.demoFitnessData.getRowingRecordList().size(); i++) {
            test.add(String.valueOf(i + 1));
        }

        lineView.setBottomTextList(test);
        lineView.setColorArray(new int[] {
                Color.parseColor("#F44336"), Color.parseColor("#9C27B0"),
                Color.parseColor("#2196F3"), Color.parseColor("#009688")
        });
        lineView.setDrawDotLine(false);
        lineView.setShowPopup(LineView.SHOW_POPUPS_NONE);
    }
}
