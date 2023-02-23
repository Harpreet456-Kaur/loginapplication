package com.example.loginapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class OtpScreen : AppCompatActivity() {

    lateinit var tvOtp: TextView
    lateinit var etOtp: EditText
    lateinit var btnOtp: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_screen)
        tvOtp=findViewById(R.id.tvOtp)
        etOtp=findViewById(R.id.etOtp)
        intent?.let {
            val email=intent.getStringExtra("Email")
            tvOtp.text = email
        }
        btnOtp=findViewById(R.id.btnOtp)
        btnOtp.setOnClickListener {
            if(etOtp.text.toString().length<6){
                etOtp.error="Enter your 6 digit OTP"
                etOtp.requestFocus()
            }
            else{
            val intent=Intent(this,NewPassword::class.java)
            startActivity(intent)
        }
        }
    }
}