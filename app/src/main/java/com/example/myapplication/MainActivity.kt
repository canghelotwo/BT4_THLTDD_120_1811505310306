package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var btSignUp: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btSignUp = findViewById<View>(R.id.button_dn) as Button
        btSignUp!!.setOnClickListener {
            Toast.makeText(this@MainActivity, "Đăng Nhập thành công", Toast.LENGTH_LONG).show()
            val it = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(it)
        }
    }
}