package com.example.mpesaui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    // This application has not integrated  the actual Mpesa API
    // The application is an exact replica of the Mpesa Application
    // The application would perform as the actual Mpesa app when integrated with the MPesa API


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}