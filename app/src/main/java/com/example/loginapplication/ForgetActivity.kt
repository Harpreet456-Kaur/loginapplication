package com.example.loginapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ForgetActivity : AppCompatActivity() {

    lateinit var tvForget: TextView
    lateinit var etForget: EditText
    lateinit var forGet: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget)

        tvForget = findViewById(R.id.tvForget)
        etForget = findViewById(R.id.etForget)
        forGet = findViewById(R.id.forGet)
        forGet.setOnClickListener {
            if (etForget.text.isEmpty()) {
                etForget.error = "Enter Your EMail"
                etForget.requestFocus()
            } else {
                var intent = Intent(this, OtpScreen::class.java)
                intent.putExtra("Email", etForget.text.toString())
                startActivity(intent)
            }
        }
    }
}