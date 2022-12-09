package edu.ubaguio.finexam_tomelden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    private lateinit var loginLoginBtn: Button
    private lateinit var signupLoginBtn: Button
    private lateinit var homeLoginBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginLoginBtn = findViewById(R.id.btnLoginValidate)

        loginLoginBtn.setOnClickListener{
            val iLogin = Intent(this@LoginActivity, LoginActivity::class.java)
            startActivity(iLogin)
        }

        signupLoginBtn = findViewById(R.id.btnSignupRegistration)

        signupLoginBtn.setOnClickListener{
            val iLogin = Intent(this@LoginActivity, RegistrationActivity::class.java)
            startActivity(iLogin)
        }

        homeLoginBtn = findViewById(R.id.btnHomeLogin)

        homeLoginBtn.setOnClickListener{
            val iLogin = Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(iLogin)
        }
    }
}