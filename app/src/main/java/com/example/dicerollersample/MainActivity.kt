package com.example.dicerollersample

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll_btn: Button = findViewById(R.id.btn_roll)
        roll_btn.text = "Lets Roll!"
        roll_btn.setOnClickListener {
            rollDice()
        }

        diceImage = findViewById(R.id.dice_img)
    }

    private fun rollDice() {
        val RandonInt = Random().nextInt(6) + 1
        val drawableResource = when (RandonInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> {
                R.drawable.dice_6
            }
        }

        diceImage.setImageResource(drawableResource)
    }
}