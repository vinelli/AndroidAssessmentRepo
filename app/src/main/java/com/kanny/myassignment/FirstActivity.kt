package com.kanny.myassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity

class FirstActivity : AppCompatActivity() {



    private lateinit var callButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)


        callButton = findViewById(R.id.dial)

        callButton.setOnClickListener {
            dialNo()
        }
    }
}
    private fun dialNo(){
        val mainIntent: Intent = Intent(Intent.ACTION_DIAL)
        startActivity(mainIntent)

        }
    }

