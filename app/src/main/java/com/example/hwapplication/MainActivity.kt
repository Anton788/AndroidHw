package com.example.hwapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Notes"
    }

    fun fullScreen(view: View){
        val screen =  Intent(this, BackActivity::class.java)
        startActivity(screen)
    }
}