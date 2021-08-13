package com.example.jusochangcupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    internal lateinit var viewpager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Viewpager = findViewById<ViewPager>(R.id.viewpager)

        val adapter = ViewPagerAdapter(this)
        viewpager.adapter = adapter
    }
}
