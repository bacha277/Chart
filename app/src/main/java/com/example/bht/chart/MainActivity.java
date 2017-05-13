package com.example.bht.chart;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_voteChart = (Button) findViewById(R.id.voteChart);
        Button btn_vote = (Button) findViewById(R.id.voteStart);

        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        btn_voteChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StarChartFrag starFrag = new StarChartFrag();
                callFragment(starFrag);

            }
        });

        btn_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartVote starVote = new StartVote();
                callFragment(starVote);
            }
        });


    }

    public void callFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        //Khi được goi, fragment truyền vào sẽ thay thế vào vị trí FrameLayout trong Activity chính
        transaction.replace(R.id.root, fragment);
        transaction.commit();
    }

}
