package com.example.buttomnavigationview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
private const val NUM_PAGES = 5
class Adapter(fa: FragmentActivity):FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = NUM_PAGES
    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 ->  ScreenSlidePageFragment()
            1 -> MovieFragment()
            2 -> MusicFragment()
            3 ->UserFragment()
            4 -> HomeFragment()
            else -> UserFragment()
        }
    }
}