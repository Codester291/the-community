package com.tolani.thecommunity

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var text: TextView = findViewById(R.id.account_creation)

        text.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        })

        var btn: Button = findViewById(R.id.login_button)
        btn.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, MainPageActivity::class.java))
        })
    }
}
