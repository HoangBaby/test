package com.example.baitap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class thanh_toan_Activity extends AppCompatActivity {
    ImageButton imbtnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanh_toan);
        imbtnback = (ImageButton) findViewById(R.id.imbtnback);
        imbtnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thanh_toan_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}