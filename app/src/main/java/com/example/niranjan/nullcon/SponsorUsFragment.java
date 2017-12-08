package com.example.niranjan.nullcon;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class SponsorUsFragment extends Fragment {


    public SponsorUsFragment() {
        // Required empty public constructor
    }

    WebView webView_new;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_sponsor_us,container,false);
        webView_new = (WebView) view.findViewById(R.id.webview_sponsor_us_fragment);
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
