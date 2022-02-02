package com.example.kochat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*

class SignUpActivity : AppCompatActivity() {
    private lateinit var edtName: TextInputLayout
    private lateinit var edtEmail: TextInputLayout
    private lateinit var edtPassword: TextInputLayout

    private lateinit var btnLogin: Button
    private lateinit var btnSignUp: Button

    private fun getElementsReference() {
        edtName = findViewById(R.id.edt_name)
        edtEmail = findViewById(R.id.edt_email)
        edtPassword = findViewById(R.id.edt_password)

        btnLogin = findViewById(R.id.btn_login)
        btnSignUp = findViewById(R.id.btn_sign_up)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        getElementsReference()

        btnLogin.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}