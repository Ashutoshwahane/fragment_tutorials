package com.example.fragmentstutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    private val fragmentManager  = supportFragmentManager
    private val firstFragment = FirstFragment()
    private val secondFragment = SecondFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myfragment,firstFragment)
        fragmentTransaction.commit()

    }

    fun btnOne(view: View) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myfragment,firstFragment)
        fragmentTransaction.commit()
    }
    fun btnSecond(view: View) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myfragment,secondFragment)
        fragmentTransaction.commit()
    }
}
