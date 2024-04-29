package com.example.smdproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeScreenActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)
        val searchView = findViewById<SearchView>(R.id.searchview1)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Start the SearchResults Activity regardless of the query
                startActivity(Intent(this@HomeScreenActivity, SearchResults::class.java))
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // Handle search text change here
                return false
            }
        })

        val Insurancepage = findViewById<Button>(R.id.Insurancebtn)
        Insurancepage.setOnClickListener {
            startActivity(Intent(this, InsuranceHome::class.java))
        }
        val Dealershipbtn = findViewById<Button>(R.id.Dealershipbtn)
        Dealershipbtn.setOnClickListener {
            startActivity(Intent(this, DealershipHome::class.java))
        }

        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.action_chat -> {
                    replaceFragment(AllChats())
                    true
                }
                R.id.action_upload -> {
                    replaceFragment(sellcar())
                    true
                }
                R.id.action_myads ->{
                    replaceFragment(Myads())
                    true
                }
                R.id.action_profile->{
                    replaceFragment(profile())
                    true
                }
                R.id.action_home->{
                    // Finish and restart the activity to reload the same activity
                    finish()
                    startActivity(intent)
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                    true
                }

                else -> {false}
            }
        }

    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commitAllowingStateLoss()
    }
}