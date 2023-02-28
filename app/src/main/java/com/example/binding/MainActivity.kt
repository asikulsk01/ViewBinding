package com.example.binding

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userName = binding.etUname.text.toString()
        val pass = binding.etPassword.text.toString()

        binding.btnSignIn.setOnClickListener {

            //Check whether username and password is filled or not
            //if (userName.isNotEmpty()){
                //Check whether T&C is checked or not
                if (binding.cbTnc.isChecked){
                    //Login success.
                    intent = Intent(this, Welcome::class.java)
                    startActivity(intent)
                }
                else{
                    binding.cbTnc.backgroundTintList = ColorStateList.valueOf(Color.RED)
                    Toast.makeText(this,"Please accpet the T&C",Toast.LENGTH_SHORT).show()
                }
            //}
            //else{
               // Toast.makeText(this,"Please check username and password",Toast.LENGTH_SHORT).show()
           // }
        }

    }
}