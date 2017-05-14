package com.example.bht.chart;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huynh on 14-May-17.
 */

public class Salary_Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.salary_frag, container, false);

        LineChart lineChart = (LineChart) view.findViewById(R.id.linechart);

        List<Entry> entries = new ArrayList<>();

        entries.add(new Entry(18.5f, 0));
        entries.add(new Entry(13.5f, 1));
        entries.add(new Entry(16.5f, 2));
        entries.add(new Entry(17.5f, 3));
        entries.add(new Entry(11.5f, 4));
        entries.add(new Entry(19.5f, 5));
        entries.add(new Entry(12.5f, 6));
        entries.add(new Entry(13.5f, 7));
        entries.add(new Entry(11.5f, 8));
        entries.add(new Entry(18.5f, 9));
        entries.add(new Entry(13.5f, 10));
        entries.add(new Entry(19.5f, 11));

        LineDataSet dataSet = new LineDataSet(entries, "");

        ArrayList<String> laber = getXAxisValues();

        LineData lineData = new LineData(laber, dataSet);
        dataSet.setDrawCubic(true);
        lineChart.setData(lineData);
        lineChart.setDescription("Salary Total");
        lineChart.animateY(3000, Easing.EasingOption.EaseOutBack);
        lineChart.invalidate();

        return view;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("JAN");
        xAxis.add("FEB");
        xAxis.add("MAR");
        xAxis.add("APR");
        xAxis.add("MAY");
        xAxis.add("JUN");
        xAxis.add("JULY");
        xAxis.add("AUG");
        xAxis.add("SEP");
        xAxis.add("OCT");
        xAxis.add("NOV");
        xAxis.add("DEC");
        return xAxis;
    }
}
