package com.example.febproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebActivity : AppCompatActivity() {
    lateinit var webview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        webview=findViewById(R.id.webView)

        webview.webViewClient= WebViewClient()

        webview.loadUrl("https://www.emobilis.ac.ke/")
        webview.settings.javaScriptEnabled=true
        webview.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        if(webview.canGoBack()){

           webview.goBack()
        }else
        super.onBackPressed()

    }
}