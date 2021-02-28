package com.example.myrevisedlawcoursesapp300level;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class OilLawActivity extends AppCompatActivity {


    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oil_law);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar41);
        setSupportActionBar(toolbar);
        context = this;
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ListView list = (ListView) findViewById(R.id.oillaw1);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(context, IntOilActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(context, RefOilActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(context, OwnPetActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(context, WOIActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(context, NOIActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(context, BasintoActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(context, NNPCActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(context, TheCjvActivity.class));
                        break;
                }
            }
        });
    }

}