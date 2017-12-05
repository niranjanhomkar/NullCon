package com.example.niranjan.nullcon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class SponsorUsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public SponsorUsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SponsorUsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SponsorUsFragment newInstance(String param1, String param2) {
        SponsorUsFragment fragment = new SponsorUsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    WebView webView_new;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sponsor_us,container,false);
        webView_new = (WebView) view.findViewById(R.id.new_web);
        //webView_new.loadUrl("https://nullcon.net/website/sponsor.php");
        webView_new.loadUrl("file:///android_asset/hello.html");
        WebSettings webSettings = webView_new.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView_new.setWebViewClient(new WebViewClient());

        // Inflate the layout for this fragment
        return view;
        //return inflater.inflate(R.layout.fragment_sponsor_us, container, false);
    }
}
