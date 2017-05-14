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
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bht on 5/13/17.
 */

public class StarChartFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chart, container, false);
        PieChart pieChart = (PieChart) view.findViewById(R.id.pie_chart);
        List<Entry> entries = new ArrayList<>();


        final int[] MY_COLORS = {Color.rgb(192, 0, 0), Color.rgb(255, 0, 0), Color.rgb(255, 192, 0),
                Color.rgb(127, 127, 127), Color.rgb(146, 208, 80), Color.rgb(0, 176, 80), Color.rgb(79, 129, 189)};
        ArrayList<Integer> colors = new ArrayList<Integer>();
        for (int c : MY_COLORS) colors.add(c);

        entries.add(new Entry(18.5f, 0));
        entries.add(new Entry(18.5f, 1));
        entries.add(new Entry(18.5f, 2));
        entries.add(new Entry(18.5f, 3));
        entries.add(new Entry(18.5f, 4));

        ArrayList<String> laber = new ArrayList<>();
        laber.add("5 Star");
        laber.add("4 Star");
        laber.add("3 Star");
        laber.add("2 Star");
        laber.add("1 Star");

        PieDataSet dataSet = new PieDataSet(entries, "111");

        dataSet.setColors(colors);

        PieData data = new PieData(laber, dataSet);
        pieChart.setData(data);
        pieChart.setDescription("Vote Total");
        pieChart.animateY(3000, Easing.EasingOption.EaseOutBack);
        pieChart.invalidate();
        return view;
    }
}
