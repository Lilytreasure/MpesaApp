package com.example.mpesaui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment
import com.example.mpesaui.Fragments.FragmentHome
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
                R.id.GrowBtn->replaceFragments(FragmentHome())
                R.id.ServiceBtn->replaceFragments(FragmentHome())
                R.id.Trbtn->replaceFragments(FragmentHome())
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