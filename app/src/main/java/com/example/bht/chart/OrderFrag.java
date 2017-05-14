package com.example.bht.chart;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.DataSet;

import java.util.ArrayList;

/**
 * Created by huynh on 13-May-17.
 */

public class OrderFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_order,container,false);
        BarChart barChart = (BarChart) view.findViewById(R.id.barchart);


        ArrayList<BarEntry> order =new ArrayList<>();
        order.add(new BarEntry(6f,0));
        order.add(new BarEntry(10f,1));
        order.add(new BarEntry(15f,2));
        order.add(new BarEntry(11f,3));
        order.add(new BarEntry(15f,4));
        order.add(new BarEntry(20f,5));
        order.add(new BarEntry(19f,6));
        order.add(new BarEntry(12f,7));
        order.add(new BarEntry(6f,8));
        order.add(new BarEntry(7f,9));
        order.add(new BarEntry(7f,10));
        order.add(new BarEntry(2f,11));



        ArrayList<BarEntry> del_order = new ArrayList<>();
        del_order.add(new BarEntry(8f,0));
        del_order.add(new BarEntry(10f,1));
        del_order.add(new BarEntry(23f,2));
        del_order.add(new BarEntry(11f,3));
        del_order.add(new BarEntry(8f,4));
        del_order.add(new BarEntry(5f,5));
        del_order.add(new BarEntry(6f,6));
        del_order.add(new BarEntry(8f,7));
        del_order.add(new BarEntry(12f,8));
        del_order.add(new BarEntry(9f,9));
        del_order.add(new BarEntry(10f,10));
        del_order.add(new BarEntry(4f,11));

        BarDataSet setOrder = new BarDataSet(order,"Order");
        setOrder.setColor(Color.rgb(0, 255, 0));

        BarDataSet setCancelOrder = new BarDataSet(del_order,"Cancel Order");
        setCancelOrder.setColor(Color.rgb(255,48,48));

        ArrayList<String> labels = new ArrayList<String>();
        labels = getXAxisValues();


        ArrayList<BarDataSet> dataSets = new ArrayList<>();
        dataSets.add(setOrder);
        dataSets.add(setCancelOrder);

        BarData barData = new BarData(getXAxisValues(),dataSets);

        barChart.setData(barData);
        barChart.animateXY(2000, 2000);
        barChart.invalidate();

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
