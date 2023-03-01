package com.example.loginapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class NewPassword : AppCompatActivity() {

    lateinit var tvNew: TextView
    lateinit var etNew: EditText
    lateinit var etNew2: EditText
    lateinit var btnSave: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_password)
        tvNew=findViewById(R.id.tvNew)
        etNew=findViewById(R.id.etNew)
        etNew2=findViewById(R.id.etNew2)
        btnSave=findViewById(R.id.btnSave)
        btnSave.setOnClickListener {
            if (etNew.text.isEmpty()){
                etNew.error="Enter your new password"
                etNew.requestFocus()
            }
            else if (etNew2.text.isEmpty()){
                etNew2.error="Confirm your password"
                etNew2.requestFocus()
            }
            else if(etNew2.text.toString().equals(etNew.text.toString())==false){
                etNew2.error="Confirm password is not same"
            }
            else{
                var intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            Toast.makeText(applicationContext,"Password is successfully changed",Toast.LENGTH_SHORT)
                .show()
        }
    }
}