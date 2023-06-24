package com.alexcao.interm.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var messageTV: TextView
    private lateinit var getDataBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        messageTV = findViewById(R.id.textView)
        getDataBtn = findViewById(R.id.second_btn)

        getDataBtn.setOnClickListener {
            val message = intent.getStringExtra(MESSAGE_KEY)
            messageTV.text = message
        }
    }
}