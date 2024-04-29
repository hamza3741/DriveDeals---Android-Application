package com.example.smdproject
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout

class SignupPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_page)

        val CreateAccountbutton = findViewById<Button>(R.id.button2)
        // Set OnClickListener to the arrow_back9 icon
        CreateAccountbutton.setOnClickListener {
            startActivity(Intent(this, LoginPage::class.java))
        }
        val arrowBack = findViewById<ImageView>(R.id.imageView14)
        // Set OnClickListener to the arrow_back9 icon
        arrowBack.setOnClickListener {
            startActivity(Intent(this, LoginPage::class.java))
        }

    }
}