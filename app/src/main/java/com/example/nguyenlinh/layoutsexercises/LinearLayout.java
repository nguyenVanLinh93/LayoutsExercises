package com.example.nguyenlinh.layoutsexercises;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 *  Set Color in RadioButton sets the background color of the TextView and the Clear button makes the TextView black
 *
 *  @author nguyenlinh
 *  @version 1.0
 *  @since 2017-1-17
 */
public class LinearLayout extends AppCompatActivity {

    private RadioGroup mRadioGroup;
    private Button mButton01;
    private Button mButton02;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        mButton01 = (Button)findViewById(R.id.btn01); // button set color
        mButton02 = (Button)findViewById(R.id.btn02); // button clear
        mRadioGroup = (RadioGroup)findViewById(R.id.rgr01);
        mTextView = (TextView) findViewById(R.id.tv01);

        mButton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checked = mRadioGroup.getCheckedRadioButtonId();                  // lay id radiobutton da dc check
                RadioButton RadioButtonCheckd = (RadioButton)findViewById(checked);   // lay radiobutton

                String color = "" + RadioButtonCheckd.getText();                      // lay text thanh chuoi string

                /*
                so sanh gia tri va set mau
                 */
                if(color.equalsIgnoreCase("red")){
                    mTextView.setBackgroundColor(getResources().getColor(R.color.red));
                }
                if(color.equalsIgnoreCase("white")){
                    mTextView.setBackgroundColor(getResources().getColor(R.color.white));
                }
                if(color.equalsIgnoreCase("blue")){
                    mTextView.setBackgroundColor(getResources().getColor(R.color.blue));
                }

            }
        });

        /*
        set black
         */
        mButton02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

    }
}
