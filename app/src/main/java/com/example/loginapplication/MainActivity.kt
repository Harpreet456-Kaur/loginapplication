package com.example.loginapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var tvLogin:TextView
    lateinit var tvEmail:TextView
    lateinit var tvPass:TextView
    lateinit var etEmail:EditText
    lateinit var etPass:EditText
    lateinit var btnLogin:Button
    lateinit var noAccount:TextView
    lateinit var btnForget:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          tvLogin=findViewById(R.id.tvLogin)
          tvEmail=findViewById(R.id.tvEmail)
          tvPass=findViewById(R.id.tvPass)
          etEmail=findViewById(R.id.etEmail)
          etPass=findViewById(R.id.etPass)
          btnLogin=findViewById(R.id.btnLogin)
          noAccount=findViewById(R.id.noAccount)
          btnForget=findViewById(R.id.btnForget)

        btnLogin.setOnClickListener {
            if(etEmail.text.isEmpty())
            {
                etEmail.setError("Enter Email")

            }
            else if(etPass.text.isEmpty())
            {
                etPass.setError("Enter Password")
            }
            else
            {
                Toast.makeText(applicationContext,"Login",Toast.LENGTH_SHORT)
                    .show()
            }
        }
        noAccount.setOnClickListener {
            val intent= Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
        btnForget.setOnClickListener {
            val intent=Intent(this,ForgetActivity::class.java)
            startActivity(intent)
        }
    }

}