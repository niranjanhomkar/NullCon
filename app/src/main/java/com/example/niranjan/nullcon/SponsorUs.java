package com.example.niranjan.nullcon;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Niranjan on 29-11-2017.
 */

public class SponsorUs extends Activity {

    WebView webView_sponsorus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sponsor_us);

        webView_sponsorus =  (WebView)findViewById(R.id.webview_sponsor_us);

        /*webView_sponsorus.loadUrl("https://nullcon.net/website/sponsor.php");
        webView_sponsorus.getSettings().setJavaScriptEnabled(true);*/

        /*webView_sponsorus.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                webView_sponsorus.loadUrl(
                        "javascript:(function() { " +
                                "var element = document.getElementByClassName('cfpBox');"
                                + "element.parentNode.removeChild(element);" +
                                "})()");
            }
        });*/


        webView_sponsorus.getSettings().setJavaScriptEnabled(true);
        webView_sponsorus.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url)
            {
                webView_sponsorus.loadUrl("javascript:(function() { " + "document.getElementsByClassName('mainConetent')[0].style.display='none''; " + "})()");
            }
        });
        webView_sponsorus.loadUrl("https://nullcon.net/website/sponsor.php");



    }
}
