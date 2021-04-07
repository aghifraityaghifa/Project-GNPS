package com.example.gnpsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SurveiActivity extends AppCompatActivity {
    LinearLayout btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survei);

        btn1 = (LinearLayout) findViewById(R.id.btnsurvei1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SurveiActivity.this, DetailLapangActivity.class);
                startActivity(intent);
            }
        });
    }

    public void bckhome(View view) {
        startActivity(new Intent(SurveiActivity.this, HomeActivity.class));
        finish();
    }
}