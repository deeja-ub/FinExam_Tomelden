package edu.ubaguio.finexam_tomelden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegistrationActivity : AppCompatActivity() {
    private lateinit var signupBtn: Button
    private lateinit var loginBtn: Button
    private lateinit var email: EditText
    private lateinit var mobileNumber: EditText
    private lateinit var password: EditText
    private lateinit var reEnterPassword: EditText
    private lateinit var homeBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)


        signupBtn = findViewById(R.id.btnSignup)
        loginBtn = findViewById(R.id.btnLoginSignup)
        email = findViewById(R.id.etEmailRegister)
        mobileNumber = findViewById(R.id.etMobileNumber)
        password = findViewById(R.id.etPasswordReg)
        reEnterPassword = findViewById(R.id.etReEnterPassword)
        homeBtn = findViewById(R.id.btnHomeRegister)

        signupBtn.setOnClickListener {
            val iSignup = Intent(this@RegistrationActivity, UserProfileActivity::class.java)
            with(iSignup){
                putExtra("Email", email.text.toString())
                putExtra("Mobile_Number", mobileNumber.text.toString())
                putExtra("Password", password.text.toString())
                putExtra("Confirm_Password_Signup", reEnterPassword.text.toString())
            }
            startActivity(iSignup)
            Toast.makeText(this, "User Profile Created!", Toast.LENGTH_LONG).show()
        }

        loginBtn.setOnClickListener {
            val iLoginRedirect = Intent(this@RegistrationActivity, LoginActivity::class.java)
            startActivity(iLoginRedirect)
        }

        homeBtn.setOnClickListener {
            val iHome = Intent(this@RegistrationActivity, HomeActivity::class.java)
            startActivity(iHome)
        }
    }
}