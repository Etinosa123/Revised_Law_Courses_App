package com.example.myrevisedlawcoursesapp300level;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


import com.google.android.material.navigation.NavigationView;

public class
MainActivity extends AppCompatActivity implements  NavigationView.OnNavigationItemSelectedListener {
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawerlayouy);
        ActionBarDrawerToggle action = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.nav_open_drawer, R.string.nav_close_drawer);
        drawer.addDrawerListener(action);
        action.syncState();

        NavigationView nav = (NavigationView) findViewById(R.id.nav_view);
        nav.setNavigationItemSelectedListener(this);

        Fragment fr = new CoursesFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.content_frame, fr);
        ft.commit();

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        if (!getResources().getString(R.string.banner_ad_unit_id).equals("")){
            mAdView = findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);
          //  RequestConfiguration configuration = new RequestConfiguration.Builder().build();
        //    MobileAds.setRequestConfiguration(configuration);
        }else {
            mAdView = (AdView) findViewById(R.id.adView);
            mAdView.setVisibility(View.GONE);
        }
        if (getResources().getString(R.string.interstitial_ad_unit_id).length() > 0 && Config.INTERSTITIAL_INTERVAL > 0){
            mInterstitialAd = new InterstitialAd(this);
            mInterstitialAd.setAdUnitId(getResources().getString(R.string.interstitial_ad_unit_id));
            AdRequest adRequestinter = new AdRequest.Builder().build();
            mInterstitialAd.loadAd(adRequestinter);

            mInterstitialAd.setAdListener(new AdListener(){
                @Override
                public void onAdClosed(){
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                }
            });
        }

    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item){
        int id = item.getItemId();
        Fragment fragment = null;
        Intent intent = null;

        switch (id){
            case R.id.nav_questions:
                intent = new Intent(this, QuestionActivity.class);
                break;
            case R.id.nav_rate:
                intent = new Intent(this, RateActivity.class);
                break;
            case R.id.nav_credits:
                intent = new Intent(this, CreditsActivity.class);
                break;
            default:
                fragment = new CoursesFragment();
        }
        if (fragment != null){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }else {
            startActivity(intent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerlayouy);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onBackPressed(){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerlayouy);
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else
        super.onBackPressed();
    }
}