package com.kanny.myassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val newUser = "admin"
    val newPassword = "admin"

    private lateinit var userNameInput : EditText
    private lateinit var passwordInput : EditText
    private lateinit var signinButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userNameInput=findViewById(R.id.userNameInput)
        passwordInput=findViewById(R.id.passwordInput)

        signinButton=findViewById(R.id.signinButton)
        

        signinButton.setOnClickListener {
            val username = userNameInput.text.toString()
            val password = passwordInput.text.toString()

            login(username, password)
        }
    }
    private fun login(username: String, password: String) {
        if (loginisvalid(username, password)) {
            val intent:Intent = Intent(this, SecondActivity ::class.java)
            intent.putExtra("name", username)
            startActivity(intent)
        }else {
            Toast.makeText(applicationContext, "Invalid Login Attempt", Toast.LENGTH_SHORT).show()
        }
    }
    private fun loginisvalid(username: String, password: String): Boolean {
        if(username == newUser && password == newPassword) return true
        return false
    }
}