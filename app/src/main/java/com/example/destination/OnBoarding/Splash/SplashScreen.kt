package com.example.destination.OnBoarding.Splash

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.example.destination.OnBoarding.Login.LoginActivity
import com.example.destination.R
import kotlinx.android.synthetic.main.activity_main.*


class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animate: ObjectAnimator = ObjectAnimator.ofFloat(icon,"x",600f)
        animate.duration = 600
        val animator: AnimatorSet = AnimatorSet()
        animator.playTogether(animate)
        animator.start()

        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
        }, 2000)

    }
}
