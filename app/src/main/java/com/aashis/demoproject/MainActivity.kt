package com.aashis.demoproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonlogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonlogin = findViewById(R.id.registerbtn)
        buttonlogin.setOnClickListener(this)

    }


    override fun onClick(view: View){
        if (view == buttonlogin){
            Toast.makeText(this, "Register Completed", Toast.LENGTH_LONG).show()
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}