package com.example.bht.chart;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bht on 5/13/17.
 */

public class StarChartFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chart,container,false);
        PieChart pieChart = (PieChart) view.findViewById(R.id.pie_chart);
        List<PieEntry> entries = new ArrayList<>();




        final int[] MY_COLORS = {Color.rgb(192,0,0), Color.rgb(255,0,0), Color.rgb(255,192,0),
                Color.rgb(127,127,127), Color.rgb(146,208,80), Color.rgb(0,176,80), Color.rgb(79,129,189)};
        ArrayList<Integer> colors = new ArrayList<Integer>();
        for(int c: MY_COLORS) colors.add(c);

        entries.add(new PieEntry(18.5f, "5 star"));
        entries.add(new PieEntry(26.7f, "4 star"));
        entries.add(new PieEntry(24.0f, "3 star"));
        entries.add(new PieEntry(15.8f, "2 star"));
        entries.add(new PieEntry(15.0f, "1 star"));




        PieDataSet set = new PieDataSet(entries, "Vote");
        set.setColors(colors);
        PieData data = new PieData(set);
        pieChart.setData(data);
        pieChart.animateY(3000, Easing.EasingOption.EaseOutBack);
        pieChart.invalidate();
        return view;
    }
}
