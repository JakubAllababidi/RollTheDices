package com.example.rollthedice_allababidi

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val tag = "ThirdActivity"
        val textViewResult = findViewById<TextView>(R.id.textViewResult)
        val imageViewIcons = findViewById<ImageView>(R.id.imageViewIcons)
        val random = intent.getIntExtra("random", -1)


        if (random % 2 != 0) {
            textViewResult.text = "Hai vinto!"
            imageViewIcons.setImageResource(R.drawable.coppa)
        }
        else {
            textViewResult.text = "Hai Perso :("
            imageViewIcons.setImageResource(R.drawable.faccina)
        }
    }
}