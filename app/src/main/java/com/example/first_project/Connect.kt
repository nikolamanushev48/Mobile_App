package com.example.first_project

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class Connect: AppCompatActivity() {
    private val url = //address of server
    private val queue = Volley.newRequestQueue(this)
    private val text = findViewById<TextView>(R.id.text2)

    fun request() {
        val stringRequest = StringRequest(
            Request.Method.GET,
            this.url,
            { response ->
                text.text = response.toString()
            },
            { volleyError ->
                text.text = volleyError.message
            }
        )
        this.queue.add(stringRequest)
    }
}
