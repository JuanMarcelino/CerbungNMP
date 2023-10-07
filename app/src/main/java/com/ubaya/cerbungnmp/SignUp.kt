package com.ubaya.cerbungnmp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.ubaya.cerbungnmp.databinding.ActivitySignInBinding
import com.ubaya.cerbungnmp.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignUp2.setOnClickListener(){
            val intent = Intent(this,SignIn::class.java)
            startActivity(intent)
        }
        


    }
}