package com.example.destination.OnBoarding

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation
import com.example.destination.R
import kotlinx.android.synthetic.main.activity_main.*


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            startActivity(Intent(this, OnBoard::class.java))
            finish()
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
        }, 2000)

    }
}
