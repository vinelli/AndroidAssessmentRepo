package com.kanny.myassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    private lateinit var proceed: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        proceed = findViewById(R.id.cont)

        proceed.setOnClickListener {
            dialer()
        }
    }
    private fun dialer() {
        val myIntent = Intent(this, FirstActivity::class.java)
        startActivity(myIntent)
    }
}