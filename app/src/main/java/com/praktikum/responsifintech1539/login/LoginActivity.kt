package com.praktikum.responsifintech1539.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ToggleButton
import com.praktikum.responsifintech1539.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        title = "Login"
        val email = findViewById<EditText>(R.id.mail)
        val password = findViewById<EditText>(R.id.pass)
        val log = findViewById<ToggleButton>(R.id.btlog)
        val pass = findViewById<EditText>(R.id.fpass)
        val account = findViewById<EditText>(R.id.acc)


    }
}