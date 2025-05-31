package com.example.rollthedice_allababidi

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tag = "MainActivity"
        val btnThrow = findViewById<Button>(R.id.btnThrow)
        btnThrow.setOnClickListener {
            val random = generateNumber()
            Log.d(tag, "random: " + random)
            val toast = Toast.makeText(this, "Il dato è stato tirato", Toast.LENGTH_SHORT)
            toast.show()
            recallIntent(random)
        }
    }

    private fun generateNumber(): Int{
        return (1..6).random()
    }

    private fun recallIntent(random: Int) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("random", random)
        startActivity(intent)
    }

}