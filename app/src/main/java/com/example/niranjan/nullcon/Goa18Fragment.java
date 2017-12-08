package com.example.niranjan.nullcon;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;


/**
 * A simple {@link Fragment} subclass.
 */
public class Goa18Fragment extends Fragment {

    TabHost tabHost;

    public Goa18Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_goa18,container,false);
        tabHost = view.findViewById(R.id.tabHost);
        tabHost.setup();

        //tab 1
        TabHost.TabSpec spec = tabHost.newTabSpec("Tab One");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Tab One");
        tabHost.addTab(spec);

        //tab2
        spec = tabHost.newTabSpec("Tab two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Tab Two");
        tabHost.addTab(spec);

        //tab3
        spec = tabHost.newTabSpec("Tab Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Tab Three");
        tabHost.addTab(spec);

        return view;
    }

}
