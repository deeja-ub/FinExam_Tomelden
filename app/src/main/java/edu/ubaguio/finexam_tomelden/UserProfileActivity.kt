package edu.ubaguio.finexam_tomelden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class UserProfileActivity : AppCompatActivity() {
    private lateinit var uploadBtn: Button
    private lateinit var saveDetailsBtn: Button
    private lateinit var cancelDetailsBtn: Button
    private lateinit var homeBtn: Button
    private lateinit var logoutBtn: Button
    private lateinit var addEventBtn: Button
    private lateinit var firstName: EditText
    private lateinit var lastName: EditText
    private lateinit var email: EditText
    private lateinit var mobileNumber: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile_acitivity)

        uploadBtn = findViewById(R.id.btnUpload)
        saveDetailsBtn = findViewById(R.id.btnSaveDetails)
        cancelDetailsBtn = findViewById(R.id.btnCancelDetails)
        homeBtn = findViewById(R.id.btnHomeProfile)
        logoutBtn = findViewById(R.id.btnLogoutProfile)
        addEventBtn = findViewById(R.id.btnAddEventHome)
        firstName = findViewById(R.id.etFirstName)
        lastName = findViewById(R.id.etLastName)
        email = findViewById(R.id.etEmailProfile)
        mobileNumber = findViewById(R.id.etMobileNumberProfile)

        homeBtn.setOnClickListener {
            val iRedirect = Intent(this@UserProfileActivity, HomeActivity::class.java)
            startActivity(iRedirect)
        }

        logoutBtn.setOnClickListener {
            val iLogout = Intent(this@UserProfileActivity, LoginActivity::class.java)
            startActivity(iLogout)
        }

        addEventBtn.setOnClickListener {
            val iAddEvent = Intent(this@UserProfileActivity, EventScheduler::class.java)
            startActivity(iAddEvent)
        }
    }
}