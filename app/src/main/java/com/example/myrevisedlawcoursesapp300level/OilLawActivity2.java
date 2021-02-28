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

public class OilLawActivity2 extends AppCompatActivity {

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oil_law2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar42);
        setSupportActionBar(toolbar);

        context= this;
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        ListView list = (ListView) findViewById(R.id.oilList);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent(context,OilTransActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(context, PetrolTaxActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(context, LiquiGasActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(context, ArbiOilActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(context, SovResActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(context, PetTechActivity.class));
                        break;
                }
            }
        });
    }
}