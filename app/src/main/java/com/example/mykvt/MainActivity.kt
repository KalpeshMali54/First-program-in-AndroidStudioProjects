package com.example.mykvt

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val buttondark=findViewById<Button>(R.id.btnDark)
            val butonlight=findViewById<Button>(R.id.btnLight)
            val layout=findViewById<LinearLayout>(R.id.LinearLayout)

            buttondark.setOnClickListener{
                //change to darkmod
                layout.setBackgroundResource(R.color.black)
                Toast.makeText(applicationContext,"Dark theme",Toast.LENGTH_SHORT).show()


            }
        butonlight.setOnClickListener{
            layout.setBackgroundResource(R.color.yellow)
            Toast.makeText(applicationContext,"Light theme",Toast.LENGTH_SHORT).show()
        }
        }
    }
