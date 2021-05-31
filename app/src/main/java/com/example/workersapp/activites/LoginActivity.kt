package com.example.workersapp.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.workersapp.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }

        val registerScreen=findViewById<TextView>(R.id.tv_register)

        registerScreen.setOnClickListener{
            val change_activity= Intent(this, RegisterActivity::class.java)
            startActivity(change_activity)
            finish()
        }
    }
}