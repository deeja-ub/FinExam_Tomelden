package edu.ubaguio.finexam_tomelden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EventScheduler : AppCompatActivity() {
    private lateinit var editBtn: Button
    private lateinit var homeBtn: Button
    private lateinit var logoutBtn: Button
    private lateinit var saveBtn: Button
    private lateinit var clearBtn: Button
    private lateinit var recipient: EditText
    private lateinit var date: EditText
    private lateinit var startTime: EditText
    private lateinit var endTime: EditText
    private lateinit var eventTitle: EditText
    private lateinit var venue: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_scheduler)

        editBtn = findViewById(R.id.btnEditProfileHome)
        homeBtn = findViewById(R.id.btnHomeHome)
        logoutBtn = findViewById(R.id.btnLogoutHome)
        saveBtn = findViewById(R.id.btnSave)
        clearBtn = findViewById(R.id.btnClear)
        recipient = findViewById(R.id.etRecipient)
        date = findViewById(R.id.etDate)
        startTime = findViewById(R.id.etStartTime)
        endTime = findViewById(R.id.etEndTime)
        eventTitle = findViewById(R.id.etEventTitle)
        venue = findViewById(R.id.etVenue)

        editBtn.setOnClickListener {
            val iEdit = Intent(this@EventScheduler, UserProfileActivity::class.java)
            startActivity(iEdit)
        }

        homeBtn.setOnClickListener {
            val iHome = Intent(this@EventScheduler, HomeActivity::class.java)
            startActivity(iHome)
        }

        logoutBtn.setOnClickListener {
            val iLogout = Intent(this@EventScheduler, LoginActivity::class.java)
            startActivity(iLogout)
        }

        saveBtn.setOnClickListener {

        }

        clearBtn.setOnClickListener {

        }
    }
}