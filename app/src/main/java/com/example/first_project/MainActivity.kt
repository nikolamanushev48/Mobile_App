package com.example.first_project

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button)
        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener(){
            val url = //adress of server
            val queue = Volley.newRequestQueue(this)
            val text = findViewById<TextView>(R.id.text2)

            val stringRequest = StringRequest(
                Request.Method.GET,
                url,
                { response ->
                    /*
                    if(response.toInt() == 1) {
                        //setContentView(R.layout.activity_main)
                        text.text = response.toString()
                    }

                    if(response.toInt() == 2) {
                        //setContentView(R.layout.activity_main2)
                        text.text = response.toString()
                    }
                    */
                    text.text = response.toString()
                },
                { volleyError ->
                    text.text = volleyError.message
                }
            )
            queue.add(stringRequest)
        }

        /*
        var game: Int = 1// player = server.set_game()
        if(game == 1) {
            val player1: BlackPawns = BlackPawns(1)
            player1.move()
        }
        if(game == 2) {
            val player2: BlackPawns = BlackPawns()
            player2.move()
        }

         */
    }
}

