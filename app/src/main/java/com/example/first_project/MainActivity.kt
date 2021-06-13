package com.example.first_project

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject
import java.util.*

class MainActivity : AppCompatActivity() {
    var x_Down:Float = 0.0F
    var y_Down:Float = 0.0F
    @SuppressLint("SetTextI18n","ShowToast", "ClickableViewAccessibility")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button)
        val queue = Volley.newRequestQueue(this)
        val text = findViewById<TextView>(R.id.text2)
        val actionBar = supportActionBar

        actionBar!!.hide()
        var listener = View.OnTouchListener(function = { view, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                view.y = motionEvent.rawY - view.height/2
                view.x = motionEvent.rawX - view.width/2
            }

            true
        })

        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener(){
            val url = "http://192.168.10.107:8010/api/"
            val stringRequest = StringRequest(
                Request.Method.GET,
                url,
                { response ->
                    if(response.toInt() == 1) {
                        setContentView(R.layout.activity_main)

                        white_pawn_1.setOnTouchListener(listener)
                        white_pawn_2.setOnTouchListener(listener)
                        white_pawn_3.setOnTouchListener(listener)
                        white_pawn_4.setOnTouchListener(listener)
                        white_pawn_5.setOnTouchListener(listener)
                        white_pawn_6.setOnTouchListener(listener)
                        white_pawn_7.setOnTouchListener(listener)
                        white_pawn_8.setOnTouchListener(listener)
                    }

                    if(response.toInt() == 2) {
                        setContentView(R.layout.activity_main2)

                        black_pawn_1.setOnTouchListener(listener)
                        black_pawn_2.setOnTouchListener(listener)
                        black_pawn_3.setOnTouchListener(listener)
                        black_pawn_4.setOnTouchListener(listener)
                        black_pawn_5.setOnTouchListener(listener)
                        black_pawn_6.setOnTouchListener(listener)
                        black_pawn_7.setOnTouchListener(listener)
                        black_pawn_8.setOnTouchListener(listener)
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
            val url = "http://192.168.10.107:8010/api2/"

            val info = JSONObject()
            info.put("id", "1476")
            info.put("msg", "Samo Levski")

            val send = object : JsonObjectRequest(
                Request.Method.POST,
                url,
                info,
                { response ->
                    Toast.makeText(this, response.toString(), Toast.LENGTH_SHORT).show()
                },
                { volleyError->
                    Toast.makeText(this, "ERROR: Connection or sending information failed!", Toast.LENGTH_SHORT).show()
                }
            ) {
                @Throws(AuthFailureError::class)
                override fun getHeaders(): Map<String, String> {
                    val headers = HashMap<String, String>()
                    headers.put("Content-Type", "application/json")
                    return headers
                }
            }
            queue.add(send)
        }
    }
}