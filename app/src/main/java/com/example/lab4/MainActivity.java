package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ivedimoLaukas;
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivedimoLaukas = (EditText) findViewById(R.id.ivedimas);
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://stackoverflow.com/");
    }

    public void atvertiWebView(View w){
        String ivestasTekstas = ivedimoLaukas.getText().toString();
        webView.loadUrl(ivestasTekstas);
    }
}