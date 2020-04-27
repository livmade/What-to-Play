package io.livmade.letsplayagame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
val gameList = arrayListOf("Fortnite", "Super Mario", "Call of Duty")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Decider.setOnClickListener{
            val random = Random()
            val randomGame = random.nextInt(gameList.count())
            whatGameAreWePlaying.text = gameList[randomGame]
        }

     addGame.setOnClickListener {
         val newGame = enterAGame.text.toString()
         gameList.add(newGame)
         enterAGame.text.clear()
         println(gameList)
     }
    }
}
