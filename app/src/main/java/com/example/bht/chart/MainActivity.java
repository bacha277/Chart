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
        Button btn_order = (Button) findViewById(R.id.order);
        Button btn_salary = (Button) findViewById(R.id.salary);

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
        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrderFrag orderFrag = new OrderFrag();
                callFragment(orderFrag);
            }
        });

        btn_salary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Salary_Fragment salary_fragment = new Salary_Fragment();
                callFragment(salary_fragment);
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
