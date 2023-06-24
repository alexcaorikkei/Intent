package com.alexcao.interm.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button

val MESSAGE_KEY = "message"

class MainActivity : AppCompatActivity() {

    private lateinit var explicitButton: Button
    private lateinit var implicitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        explicitButton = findViewById(R.id.exp)
        implicitButton = findViewById(R.id.imp)

        explicitButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(MESSAGE_KEY, "Hello from MainActivity")
            startActivity(intent)
        }

        implicitButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Hello from MainActivity")
            intent.type = "text/plain"
            startActivity(intent)
        }
    }
}