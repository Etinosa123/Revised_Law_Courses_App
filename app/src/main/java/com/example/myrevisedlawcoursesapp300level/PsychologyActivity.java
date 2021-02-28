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

public class PsychologyActivity extends AppCompatActivity {

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychology);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar44);
        setSupportActionBar(toolbar);
        context = this;
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ListView list = (ListView) findViewById(R.id.psych);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent(context, DefPsychActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(context, ResMetActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(context, TheoryActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(context, SocIntActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(context, AggrActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(context, GroupDynActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(context, SocializeActivity.class));
                        break;

                }
            }
        });
    }
}