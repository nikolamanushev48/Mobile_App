package com.example.first_project

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.util.*
import kotlin.concurrent.timerTask

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button)
        val queue = Volley.newRequestQueue(this)
        val text = findViewById<TextView>(R.id.text2)

        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener(){
            val url = //address of server
            val stringRequest = StringRequest(
                Request.Method.GET,
                url,
                { response ->
                    if(response.toInt() == 1) {
                        setContentView(R.layout.activity_main)
                    }

                    if(response.toInt() == 2) {
                        setContentView(R.layout.activity_main2)
                    }
                },
                { volleyError ->
                    val error: String = "ERROR: Connection to server failed!"
                    Toast.makeText(this, error, Toast.LENGTH_LONG).show()
                }
            )
            queue.add(stringRequest)
        }

        val buttonSend: Button = findViewById(R.id.button)
        buttonSend.setOnClickListener() {
            val url = //address of server
            val stringRequest = StringRequest(
                Request.Method.POST,
                url,
                { response ->
                    Toast.makeText(this, response, Toast.LENGTH_LONG).show()
                },
                { volleyError ->
                    val error: String = "ERROR: Connection or sent information failed!"
                    Toast.makeText(this, error, Toast.LENGTH_LONG).show()
                }
            )
            queue.add(stringRequest)
        }
    }
}

