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

public class TortsActivity extends AppCompatActivity {
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar45);
        setSupportActionBar(toolbar);
        context = this;
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ListView list = (ListView) findViewById(R.id.torts);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(context, TortBackActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(context, DistinTortActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(context, TortPriActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(context, TortClassActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent (context, TrespassP.class));
                        break;
                    case 5:
                        startActivity(new Intent(context, TrespassLActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent (context, TrespassCActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(context, NegliActivity.class));
                        break;
                    case 8:
                        startActivity(new Intent(context, OccupyActivity.class));
                        break;
                }
            }
        });

    }
}