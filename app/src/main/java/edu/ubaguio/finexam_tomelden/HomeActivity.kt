package edu.ubaguio.finexam_tomelden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    private lateinit var loginHomeBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        loginHomeBtn = findViewById(R.id.btnHomeHome)

        loginHomeBtn.setOnClickListener{
            val iLogin = Intent(this@HomeActivity, LoginActivity::class.java)
            startActivity(iLogin)
        }
    }
}