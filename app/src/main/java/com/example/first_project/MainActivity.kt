package com.example.first_project

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button)
        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener(){
            val player: BlackPawns = BlackPawns()
            player.setContentView(R.layout.activity_main2)
            player.move()
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

