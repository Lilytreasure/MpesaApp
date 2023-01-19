package com.example.mpesaui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment
import com.example.mpesaui.Fragments.FragmentGrow
import com.example.mpesaui.Fragments.FragmentHome
import com.example.mpesaui.Fragments.FragmentServices
import com.example.mpesaui.Fragments.FragmentTransact
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    // This application has not integrated  the actual Mpesa API
    // The application is an exact replica of the Mpesa Application
    // The application would perform as the actual Mpesa app when integrated with the MPesa API
    private  lateinit var  mainView: NestedScrollView
    private lateinit var  bottomNavigationView: BottomNavigationView





    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView=findViewById(R.id.BottomView)
        //display Home fragment by default when the application loads
        replaceFragments(FragmentHome())


        bottomNavigationView.setOnItemSelectedListener(){
            when(it.itemId){
                R.id.hmBtn->replaceFragments(FragmentHome())
                R.id.GrowBtn->replaceFragments(FragmentGrow())
                R.id.ServiceBtn->replaceFragments(FragmentServices())
                R.id.Trbtn->replaceFragments(FragmentTransact())
            }


            true
        }


        //main OnCreate method ends here
    }


    //replace fragments function
    private fun replaceFragments(fragment: Fragment){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.mainView,fragment)
        fragmentTransaction.commit()


    }

}