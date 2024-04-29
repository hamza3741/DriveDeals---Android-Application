package com.example.smdproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class EditProfile: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_profile)

        val arrowBack16 =findViewById<ImageView>(R.id.arrow_back22)

        // Set OnClickListener to the arrow_back9 icon
        arrowBack16.setOnClickListener {
            // Replace the current fragment with the Screen8 fragment
            openFragment()
        }

    }
    private fun openFragment() {
        // Create an instance of your fragment
        val fragment = profile()

        // Get the FragmentManager
        val fragmentManager = supportFragmentManager

        // Start a new FragmentTransaction
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()

        // Replace the existing fragment (if any) with your fragment
        transaction.replace(R.id.frame_container, fragment)

        // Commit the transaction
        transaction.commit()
    }
}