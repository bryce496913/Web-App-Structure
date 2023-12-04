package com.yourpackage; // Replace with your actual package name

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Replace with your layout file name

        webView = findViewById(R.id.webView);
        configureWebView();
        loadWebsite("[Add your Website URL here]");
    }

    private void configureWebView() {
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript if needed
        webView.setWebViewClient(new WebViewClient()); // Open links in the app, not in the browser
    }

    private void loadWebsite(String url) {
        if (url != null && !url.isEmpty()) {
            webView.loadUrl(url);
        } else {
            // Handle invalid URL
            webView.loadUrl("about:blank");
        }
    }
}
