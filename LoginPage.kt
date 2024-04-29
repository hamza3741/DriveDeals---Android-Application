package com.example.smdproject
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView

class LoginPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        val loginbutton = findViewById<Button>(R.id.loginbutton)
        // Set OnClickListener to the arrow_back9 icon
        loginbutton.setOnClickListener {
            startActivity(Intent(this, HomeScreenActivity::class.java))
        }
        val Signupbutton = findViewById<TextView>(R.id.textView5)
        // Set OnClickListener to the arrow_back9 icon
        Signupbutton.setOnClickListener {
            startActivity(Intent(this, SignupPage::class.java))
        }

    }
}