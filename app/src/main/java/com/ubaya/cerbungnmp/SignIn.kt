package com.ubaya.cerbungnmp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.ubaya.cerbungnmp.databinding.ActivitySignInBinding

class SignIn : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    var userName = "Hitler"
    var password= "123456"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignUp1.setOnClickListener(){
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }
        binding.btnSignIn.setOnClickListener(){
            if(binding.txtUsernameIn.text.toString()=="Hitler" && binding.txtPasswordIn.text.toString()=="123456"){
                val intent = Intent(this,Home::class.java)
                Toast.makeText(this, "Login Successfully", Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Incorrect Username or Password", Toast.LENGTH_LONG).show()
            }

        }
    }
}