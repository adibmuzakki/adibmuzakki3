package com.example.adib

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent4 = Intent ( this, MainActivity::class.java)
            startActivity(intent4)
        }
    }
}