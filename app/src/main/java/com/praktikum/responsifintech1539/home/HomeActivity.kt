package com.praktikum.responsifintech1539.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.praktikum.responsifintech1539.R
import com.praktikum.responsifintech1539.recovery.RecoveryActivity
import com.praktikum.responsifintech1539.register.RegisterActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var btnlog: Button
    private lateinit var btnrec: Button
    private lateinit var btnreg: Button
    private lateinit var btnhom: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnlog = findViewById(R.id.btnlog)
        btnrec = findViewById(R.id.btnrec)
        btnreg = findViewById(R.id.btnreg)
        btnhom = findViewById(R.id.btnhom)

        btnrec.setOnClickListener {
            val intent = Intent(this, RecoveryActivity::class.java)
            startActivity(intent)
        }

        btnreg.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        btnhom.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}