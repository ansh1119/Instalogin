package com.example.instalogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x:AppCompatButton=findViewById(R.id.Login)
        x.setOnClickListener{
            Toast.makeText(this,"Loggin in",Toast.LENGTH_SHORT).show()
            intent=Intent(this,afterlogin::class.java)
            startActivity(intent)}
    }
}