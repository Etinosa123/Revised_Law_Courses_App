package com.example.myrevisedlawcoursesapp300level;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class CriminalLawActivity extends AppCompatActivity {

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal_law);
        /*
        Button crashButton = new Button(this);
        crashButton.setText("Crash");
        crashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                throw new RuntimeException("Test Crash");
            }
        });
        addContentView(crashButton, new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));

         */
        context = this;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar24);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        ListView list = (ListView) findViewById(R.id.crimlaw1);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(context,CrimeNatureActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(context, CFSActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(context, HisSouActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(context, GenPriActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(context, PartiesCrimeActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(context, StriLiabilityActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(context, DefCrimeActivity.class));
                        break;
                }
            }
        });


    }
}