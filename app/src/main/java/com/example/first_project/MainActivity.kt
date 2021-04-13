package com.example.first_project

//import android.R
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button)
        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener(){
            setContentView(R.layout.activity_main)


            black_pawn_1.setOnClickListener(){
                black_pawn_1.animate().apply {
                    duration = 1000;
                    translationY(-225f)
                }.start()
            }
            black_pawn_2.setOnClickListener(){
                black_pawn_2.animate().apply {
                    duration = 1000;
                    translationY(-225f)
                }.start()
            }
            black_pawn_3.setOnClickListener(){
                black_pawn_3.animate().apply {
                    duration = 1000;
                    translationY(-225f)
                }.start()
            }
            black_pawn_4.setOnClickListener(){
                black_pawn_4.animate().apply {
                    duration = 1000;
                    translationY(-225f)
                }.start()
            }
            black_pawn_5.setOnClickListener(){
                black_pawn_5.animate().apply {
                    duration = 1000;
                    translationY(-225f)
                }.start()
            }
            black_pawn_6.setOnClickListener(){
                black_pawn_6.animate().apply {
                    duration = 1000;
                    translationY(-225f)
                }.start()
            }
            black_pawn_7.setOnClickListener(){
                black_pawn_7.animate().apply {
                    duration = 1000;
                    translationY(-225f)
                }.start()
            }
            black_pawn_8.setOnClickListener(){
                black_pawn_8.animate().apply {
                    duration = 1000;
                    translationY(-225f)
                }.start()
            }


        }
    }
}

