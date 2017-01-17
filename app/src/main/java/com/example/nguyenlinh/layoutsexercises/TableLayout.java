package com.example.nguyenlinh.layoutsexercises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 *  Set Color button sets the background color of the TextView and the Clear button makes the TextView black
 *
 *  @author nguyenlinh
 *  @version 1.0
 *  @since 2017-1-17
 */
public class TableLayout extends AppCompatActivity {

    private Button mButton01;
    private Button mButton02;
    private Button mButton03;
    private Button mButton04;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        mButton01 = (Button)findViewById(R.id.btn01); // button color 1
        mButton02 = (Button)findViewById(R.id.btn02); // button color 2
        mButton03 = (Button)findViewById(R.id.btn03); // button color 3
        mButton04 = (Button)findViewById(R.id.btn04); // button clear
        mTextView = (TextView) findViewById(R.id.txtv01);

        /*
        set color red
         */
        mButton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setBackgroundColor(getResources().getColor(R.color.red));
            }
        });

        /*
        set color yellow
         */
        mButton02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });

        /*
        set color blue
         */
        mButton03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setBackgroundColor(getResources().getColor(R.color.blue));
            }
        });

        /*
        set black
         */
        mButton04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setBackgroundColor(getResources().getColor(R.color.black));
            }
        });
    }
}
