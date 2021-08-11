package com.example.getcellinfos.Pager

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.getcellinfos.WifiClass.WifiFragment

class PagerAdapter(private val fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 1

    override fun createFragment(position: Int): Fragment {
        return WifiFragment(fragmentActivity)
    }
}