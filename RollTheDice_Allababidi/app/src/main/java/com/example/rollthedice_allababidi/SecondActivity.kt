package com.example.rollthedice_allababidi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val tag = "SecondActivity"
        val imageViewDice = findViewById<ImageView>(R.id.imageViewDado)
        val btnResult = findViewById<Button>(R.id.btnRisultato)
        val random = intent.getIntExtra("random", -1)

        val dice = when(random) {
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            else -> {R.drawable.dice_face_6}
        }
        imageViewDice.setImageResource(dice as Int)

        btnResult.setOnClickListener {
            val toast = Toast.makeText(this, "Risultato:", Toast.LENGTH_SHORT)
            toast.show()
            recallIntent(random)
        }

    }

    private fun recallIntent(random: Int) {
        val intent = Intent(this, ThirdActivity::class.java)
        intent.putExtra("random", random)
        startActivity(intent)
    }
}