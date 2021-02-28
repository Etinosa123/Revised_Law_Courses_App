package com.example.myrevisedlawcoursesapp300level;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class CoursesFragment extends Fragment {
    private AdView mAdView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_courses, container, false);
        ListView list = (ListView) rootView.findViewById(R.id.list_level3);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(getActivity(), CriminalLawActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), CriminalLawActivity2.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), CommercialActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), CommercialActivity2.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), TortsActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), TortsActivity2.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), OilLawActivity.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), OilLawActivity2.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), PsychologyActivity.class);
                        startActivity(intent8);
                        break;
                }

            }
        });

        return rootView;
    }
}