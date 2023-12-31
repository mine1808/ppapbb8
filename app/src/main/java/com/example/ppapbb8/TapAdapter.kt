package com.example.ppapbb8

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class TapAdapter (activity : AppCompatActivity) : FragmentStateAdapter(activity) {
    val page = arrayOf<Fragment>(HomeFragment(), MaterialFragment(), QuizFragment())
    override fun getItemCount(): Int {
        return page.size
    }

    override fun createFragment(position: Int): Fragment {
        return page[position]
    }
}