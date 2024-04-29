package com.example.smdproject
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class ViewSearchResult: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_search_result)
        val arrowBack = findViewById<ImageView>(R.id.arrow_back12)
        // Set OnClickListener to the arrow_back9 icon
        arrowBack.setOnClickListener {
            startActivity(Intent(this, SearchResults::class.java))
        }
        val Messagebtn = findViewById<Button>(R.id.Messagebtn)
        // Set OnClickListener to the arrow_back9 icon
        Messagebtn.setOnClickListener {
            setContentView(R.layout.chat_screen) // Use screen16.xml layout directly
            // Perform fragment transaction to replace frame_container with Screen16 fragment
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_container, chatscreen())
            fragmentTransaction.commit()
        }
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commitAllowingStateLoss()
    }
}