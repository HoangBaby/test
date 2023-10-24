package com.example.baitap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView gioiThieuActivity,thanhToanActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gioiThieuActivity = (TextView) findViewById(R.id.gioiThieuActivity);
        thanhToanActivity=(TextView) findViewById(R.id.thanhToanActivity);
        gioiThieuActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, gioi_thieu_user_Activity.class);
                startActivity(intent);
            }
        });
        thanhToanActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, thanh_toan_Activity.class);
                startActivity(intent);
            }
        });
    }
}