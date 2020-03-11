package com.tolani.thecommunity

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.WindowManager

class SplashScreenActivity : AppCompatActivity() {

    val SPLASH_TIMEOUT: Long = 4000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
        }, SPLASH_TIMEOUT)
    }
}
