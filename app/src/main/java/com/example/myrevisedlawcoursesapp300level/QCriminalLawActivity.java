package com.example.myrevisedlawcoursesapp300level;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.InterstitialAd;

public class QCriminalLawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_criminal_law);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_qcrim);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        TextView text = (TextView) findViewById(R.id.text_qcrim);
        text.setTextIsSelectable(true);
    }
}