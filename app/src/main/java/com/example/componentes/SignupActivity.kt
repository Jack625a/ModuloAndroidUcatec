package com.example.componentes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.google.firebase.auth.FirebaseAuth

class SignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignupBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_signup)
        firebaseAuth=FirebaseAuth.getInstance()

        binding.signupButton.setOnclickListner{
            val email=binding.signupEmail.text.toString()
            val password=binding.signupPassword.text.toString()
            val confirmPassword=binding.confirmarPassword.text.toString()

            if (email.isNotEmpty()&&password.isNotEmpty()&&confirmPassword.isNotEmpty()){
                firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful){
                        val intent= Intent(this,LoginActivity::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this,it.exception.toString(),Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }



    }
}