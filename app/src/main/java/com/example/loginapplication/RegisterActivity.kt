package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    lateinit var tvRegister: TextView
    lateinit var etName: EditText
    lateinit var etPhone: EditText
    lateinit var etPassword: EditText
    lateinit var etConfirm: EditText
    lateinit var tvGender:TextView
    lateinit var rBtn1:RadioButton
    lateinit var rBtn2:RadioButton
    lateinit var rBtn3:RadioButton
    lateinit var btnRegister: Button
    lateinit var alreadyRegister:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        tvRegister=findViewById(R.id.tvRegister)
        etName=findViewById(R.id.etName)
        etPhone=findViewById(R.id.etPhone)
        etPassword=findViewById(R.id.etPassword)
        etConfirm=findViewById(R.id.etConfirm)
        tvGender=findViewById(R.id.tvGender)
        rBtn1=findViewById(R.id.rBtn1)
        rBtn2=findViewById(R.id.rBtn2)
        rBtn3=findViewById(R.id.rBtn3)
        alreadyRegister=findViewById(R.id.alreadyRegister)
        btnRegister=findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            if (etName.text.isEmpty()){
                etName.error="Enter your name"
            }
            else if (etPhone.text.isEmpty()){
                etPhone.error="Enter your Contact"
            }
            else if (etPassword.text.isEmpty()){
                etPassword.error="Enter your Password"
            }
            else if (etConfirm.text.isEmpty()){
                etConfirm.error="Enter your Confirm Password"
            }
            else if (tvGender.text.isEmpty()){
                tvGender.error="Select Gender"
            }

        }
        alreadyRegister.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}