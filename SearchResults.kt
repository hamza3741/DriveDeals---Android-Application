package com.example.smdproject
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout

class SearchResults: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_results)
        val carResultLayout = findViewById<RelativeLayout>(R.id.CarResult)

        // Set OnClickListener to the RelativeLayout
        carResultLayout.setOnClickListener {
            // Start the ViewSearchResult Activity
            val intent = Intent(this, ViewSearchResult::class.java)
            startActivity(intent)
        }
        val arrowBack = findViewById<ImageView>(R.id.arrow_back12)
        // Set OnClickListener to the arrow_back9 icon
        arrowBack.setOnClickListener {
            startActivity(Intent(this, HomeScreenActivity::class.java))
        }

    }
}