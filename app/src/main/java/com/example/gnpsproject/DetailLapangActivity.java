package com.example.gnpsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DetailLapangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_lapang);

    }

    public void bcksurvei(View v) {
        startActivity(new Intent(DetailLapangActivity.this, SurveiActivity.class));
        finish();
    }
}