package edu.ubaguio.finexam_tomelden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var loginRedirectBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginRedirectBtn = findViewById(R.id.btnLoginRedirect)

        loginRedirectBtn.setOnClickListener{
            val iLogin = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(iLogin)
        }
    }
}