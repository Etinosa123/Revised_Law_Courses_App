
package com.example.myrevisedlawcoursesapp300level;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;

public class QuestionActivity extends AppCompatActivity {
    private Context context;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_question);
        setSupportActionBar(toolbar);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2005641929118957/8785373232");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.e("TAG", "The interstitial wasn't loaded yet.");
        }
        RequestConfiguration configuration = new RequestConfiguration.Builder().build();
        MobileAds.setRequestConfiguration(configuration);
        
        ActionBar action = getSupportActionBar();
        action.setDisplayHomeAsUpEnabled(true);
        context = this;
        ListView list = (ListView)findViewById(R.id.list_level3qq);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent intent = new Intent(context, QCriminalLawActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(context, QCriminalLawActivity2.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(context, QCommercialActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(context, QCommercialActivity2.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(context, QTortsActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(context,  QTortsActivity2.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(context, QOilLawActivity.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(context, QOilLawActivity2.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(context, QPsychologyActivity.class);
                        startActivity(intent8);
                        break;
                }

            }
        });
    }
}