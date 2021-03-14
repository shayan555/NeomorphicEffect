package com.example.neomorphiceffect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import soup.neumorphism.NeumorphButton

class MainActivity : AppCompatActivity() {
    private lateinit var button:NeumorphButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.click)
        button.setOnClickListener()
        {

        }

    }
}