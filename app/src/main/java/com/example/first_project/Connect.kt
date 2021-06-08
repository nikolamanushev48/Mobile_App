package com.example.first_project

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class Connect: AppCompatActivity() {
    private val url = "http://87.243.110.69:8010/api"
    private val queue = Volley.newRequestQueue(this)
    private val text = findViewById<TextView>(R.id.text2)

    fun request() {
        val stringRequest = StringRequest(
            Request.Method.GET,
            url,
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