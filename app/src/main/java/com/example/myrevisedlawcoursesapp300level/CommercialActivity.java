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
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;

public class CommercialActivity extends AppCompatActivity {
    private AdView mAdView;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercial);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar16);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        context = this;
        ListView list = (ListView) findViewById(R.id.comms);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(context, SaleActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(context, SimilarSaleActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(context,SaleTermsActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(context, ImpliedActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(context,TransferPropertyActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(context, PeerformanceActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(context, ExaminationActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(context, BuyerDutiesActivity.class));
                        break;
                }
            }
        });
        mAdView = findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        RequestConfiguration configuration = new RequestConfiguration.Builder().build();
        MobileAds.setRequestConfiguration(configuration);
    }

}