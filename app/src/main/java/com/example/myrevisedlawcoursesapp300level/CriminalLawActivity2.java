package com.example.myrevisedlawcoursesapp300level;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CriminalLawActivity2 extends AppCompatActivity {

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal_law2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar25);
        setSupportActionBar(toolbar);
        context = this;
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ListView list = (ListView) findViewById(R.id.crimlaw2);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(context, PoliceActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(context, ProsecuteActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(context, SearchActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(context, OffeStealActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(context, OffeAnaActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(context, ArmedRobActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(context, FalsePreActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(context, CheatActivity.class));
                        break;
                    case 8:
                        startActivity(new Intent(context, CyberActivity.class));
                        break;
                    case 9:
                        startActivity(new Intent(context, AssemblyActivity.class));
                        break;
                    case 10:
                        startActivity(new Intent(context, SediActivity.class));
                        break;
                    case 11:
                        startActivity(new Intent(context, SexualActivity.class));
                        break;
                }
            }
        });
    }
}