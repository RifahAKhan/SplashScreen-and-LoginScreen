package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun callNextCreateAccountScreen(view: View) {
        startActivity(Intent(this@MainActivity,CreateAccount2ndclass::class.java))

    }

    fun callNextScreen(view: View) {
        startActivity(Intent(this@MainActivity,NextScreen::class.java))

    }


}