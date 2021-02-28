package com.example.myrevisedlawcoursesapp300level;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CommercialActivity2 extends AppCompatActivity {

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercial2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar17);
        setSupportActionBar(toolbar);
        context= this;
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ListView list = (ListView) findViewById(R.id.comms2);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent(context, HirePurchaseActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(context, DistinHireActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(context,HireActActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(context,HireDynamicActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(context, RepossessActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(context, AgencyActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(context,CreateAgeActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(context, DutiesAgencyActivity.class));
                        break;
                    case 8:
                        startActivity(new Intent(context, TerminationActivity.class));
                        break;
                }
            }
        });
    }
}