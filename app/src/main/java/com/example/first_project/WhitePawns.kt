package com.example.first_project

import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity

class WhitePawns(): AppCompatActivity() {
    fun move() {
        white_pawn_1.setOnClickListener(){
            white_pawn_1.animate().apply {
                duration = 1000;
                translationY(125f)
            }.start()
        }

        white_pawn_2.setOnClickListener(){
            white_pawn_2.animate().apply {
                duration = 1000;
                translationY(125f)
            }.start()
        }

        white_pawn_3.setOnClickListener(){
            white_pawn_3.animate().apply {
                duration = 1000;
                translationY(125f)
            }.start()
        }

        white_pawn_4.setOnClickListener(){
            white_pawn_4.animate().apply {
                duration = 1000;
                translationY(125f)
            }.start()
        }

        white_pawn_5.setOnClickListener(){
            white_pawn_5.animate().apply {
                duration = 1000;
                translationY(125f)
            }.start()
        }

        white_pawn_6.setOnClickListener(){
            white_pawn_6.animate().apply {
                duration = 1000;
                translationY(125f)
            }.start()
        }

        white_pawn_7.setOnClickListener(){
            white_pawn_7.animate().apply {
                duration = 1000;
                translationY(125f)
            }.start()
        }

        white_pawn_8.setOnClickListener(){
            white_pawn_8.animate().apply {
                duration = 1000;
                translationY(125f)
            }.start()
        }
    }
}