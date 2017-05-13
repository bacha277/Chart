package com.example.bht.chart;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bht on 5/13/17.
 */

public class StartVote extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vote_star_frag,container,false);

        final ImageView star1 = (ImageView) view.findViewById(R.id.star1);
        final ImageView star2 = (ImageView) view.findViewById(R.id.star2);
        final ImageView star3 = (ImageView) view.findViewById(R.id.star3);
        final ImageView star4 = (ImageView) view.findViewById(R.id.star4);
        final ImageView star5 = (ImageView) view.findViewById(R.id.star5);
        final TextView show = (TextView) view.findViewById(R.id.txt_show);

        final ArrayList<ImageView> list = new ArrayList<>();
        list.add(star1);
        list.add(star2);
        list.add(star3);
        list.add(star4);
        list.add(star5);

        star1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i < 1; i++) {
                    list.get(i).setImageResource(R.drawable.select);
                }
                for (int i = 1; i < list.size(); i++) {
                    list.get(i).setImageResource(R.drawable.un_select);
                }

                show.setText("You voted "+1+" star");
            }
        });

        star2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 2; i++) {
                    list.get(i).setImageResource(R.drawable.select);
                }
                for (int i = 2; i < list.size(); i++) {
                    list.get(i).setImageResource(R.drawable.un_select);
                }
                show.setText("You voted "+2+" star");
            }
        });

        star3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 3; i++) {
                    list.get(i).setImageResource(R.drawable.select);
                }
                for (int i = 3; i < list.size(); i++) {
                    list.get(i).setImageResource(R.drawable.un_select);
                }
                show.setText("You voted "+3+" star");
            }
        });

        star4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 4; i++) {
                    list.get(i).setImageResource(R.drawable.select);
                }
                for (int i = 4; i < list.size(); i++) {
                    list.get(i).setImageResource(R.drawable.un_select);
                }
                show.setText("You voted "+4+" star");
            }
        });

        star5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 5; i++) {
                    list.get(i).setImageResource(R.drawable.select);
                }
                for (int i = 5; i < list.size(); i++) {
                    list.get(i).setImageResource(R.drawable.un_select);
                }
                show.setText("You voted "+5+" star");
            }
        });

        return view;
    }
}
