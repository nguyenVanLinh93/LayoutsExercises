package com.example.nguyenlinh.layoutsexercises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton01;
    private Button mButton02;
    private Button mButton03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton01 = (Button)findViewById(R.id.btn01);
        mButton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linearLayout = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(linearLayout);
            }
        });

        mButton02 = (Button)findViewById(R.id.btn02);
        mButton02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linearLayout = new Intent(MainActivity.this, TableLayout.class);
                startActivity(linearLayout);
            }
        });

        mButton03 = (Button)findViewById(R.id.btn03);
        mButton03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linearLayout = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(linearLayout);
            }
        });
    }
}
