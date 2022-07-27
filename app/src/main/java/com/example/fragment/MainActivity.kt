package com.example.fragment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnMakePhoneCall = findViewById<Button>(R.id.btnMakePhoneCall)
        var btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener(){
            val intent = Intent(this, NextActivity::class.java)
            intent.putExtra("personName", "John")
            startActivity(intent)
        }

        btnMakePhoneCall.setOnClickListener(){
            //val number = Uri.parse("tel:999")
            //val intent = Intent(Intent.ACTION_DIAL, number)

            val value = Uri.parse("geo:3.1466, 101.6958")
            val intent = Intent(Intent.ACTION_VIEW, value)
            startActivity(intent)
        }
    }
}