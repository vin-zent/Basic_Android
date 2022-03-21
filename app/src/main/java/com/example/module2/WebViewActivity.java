package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.material.snackbar.Snackbar;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView webView = findViewById(R.id.web_view);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        // Check internet Connection
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {


            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://google.com");

            WebSettings webSetting = webView.getSettings();
            webSetting.setJavaScriptEnabled(true);

        } else {
            Snackbar.make(findViewById(R.id.web_view), "NO INTERNET", Snackbar.LENGTH_SHORT).show();

        }
    }
}