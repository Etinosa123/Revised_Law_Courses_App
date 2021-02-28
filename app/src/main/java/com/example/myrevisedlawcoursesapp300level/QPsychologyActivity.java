package com.example.myrevisedlawcoursesapp300level;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class QPsychologyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_psychology);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_qpsych);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        TextView text = (TextView) findViewById(R.id.text_qpsych);
        text.setTextIsSelectable(true);
    }
}