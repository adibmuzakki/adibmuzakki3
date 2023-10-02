package com.example.adib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent1 = Intent ( this, MainActivity3::class.java)
            startActivity(intent1)
        }
        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent2 = Intent ( this, MainActivity2::class.java)
            startActivity(intent2)
        }
    }
}