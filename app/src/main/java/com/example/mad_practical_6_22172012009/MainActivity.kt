package com.example.mad_practical_6_22172012009

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun playPause(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERVALUE,MyService.PLAYERVALUE).apply { startService(this) }
    }
    fun playStop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERVALUE,MyService.PLAYERVALUE).apply { startService(this) }
    }
}