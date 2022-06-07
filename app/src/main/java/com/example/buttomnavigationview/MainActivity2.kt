package com.example.buttomnavigationview

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.buttomnavigationview.databinding.ActivityMain2Binding
import me.relex.circleindicator.CircleIndicator3


class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val pagerAdapter = Adapter(this)
        binding.pager.adapter = pagerAdapter


//        val viewpager: ViewPager2 = view.findViewById(R.id.viewpager)
//        viewpager.adapter = mAdapter

        val indicator: CircleIndicator3 = binding.indicator
        indicator.setViewPager(binding.pager)

//        indicator =
//        indicator.createIndicators(5,0);
//
//        indicator.animatePageSelected(2)

    }
    override fun onBackPressed() {
        if (binding.pager.currentItem == 0) {
            super.onBackPressed()
        } else {
            binding.pager.currentItem = viewPager.currentItem - 1
        }
    }

}