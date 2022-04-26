package edu.quintrix.cookieclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var currentScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageCookie : ImageView = findViewById<View>(R.id.imageCookie) as ImageView
        val labelTotal : TextView = findViewById<TextView>(R.id.textView) as TextView

        imageCookie.setOnClickListener {
            currentScore++
            //Toast.makeText(this, "score = $currentScore", Toast.LENGTH_SHORT).show()
            labelTotal.text = "$currentScore"
        }


    }
}