package com.example.first_project

//import android.R
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button)
        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener(){
            setContentView(R.layout.activity_main)
        }
    }
}

