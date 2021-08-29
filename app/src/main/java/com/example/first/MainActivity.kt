package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.first.fragments.FirstFragment
import com.example.first.fragments.SecondFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun clickManagerFirst(view: View){
        replaceFragment(FirstFragment())
    }
    fun clickManagerSecond(view: View){
        replaceFragment(SecondFragment())
    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentcontainer,fragment)
        fragmentTransaction.commit()
    }
}
