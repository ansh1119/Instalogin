package com.example.instalogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x:Button=findViewById(R.id.Login)
        x.setOnClickListener(){
            Toast.makeText(this,"LOGGING IN",Toast.LENGTH_SHORT).show()
        }

        }
    }