package com.example.adib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent3 = Intent ( this, MainActivity::class.java)
            startActivity(intent3)
        }
    }
}