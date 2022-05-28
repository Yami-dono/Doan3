package com.example.doan3.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.doan3.Adapter.MainViewPagerAdapter
import com.example.doan3.R
import com.example.doan3.databinding.ActivityHomeBinding

import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private var tabLayout: TabLayout?= null
    private var viewPager: ViewPager? = null

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setTheme(R.style.splash_screen)
        setContentView(view)
        AnhXa()
        init()

    }
    private fun init() {
        val mainViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPagerAdapter.addFragment(Fragment_home(),"" )
        mainViewPagerAdapter.addFragment(Fragment_search(), "")

        viewPager!!.adapter = mainViewPagerAdapter
        tabLayout!!.setupWithViewPager(viewPager)
        tabLayout!!.getTabAt(0)!!.setIcon(R.drawable.home)
        tabLayout!!.getTabAt(1)!!.setIcon(R.drawable.iconsearch)

    }

    private fun AnhXa() {
        tabLayout = binding.myTabLayout
        viewPager =  binding.myViewPager

    }
}
