package com.example.destination.OnBoarding.Login

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.Fade
import android.transition.Transition
import android.transition.TransitionManager
import android.view.View
import com.example.destination.R
import kotlinx.android.synthetic.main.activity_on_board.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board)

        startAnimation()
        onClick()

    }

    private fun startAnimation() {

        val animate: ObjectAnimator = ObjectAnimator.ofFloat(ivLoginPage,"y",420f)
        animate.duration = 1000
        val animator: AnimatorSet = AnimatorSet()
        animator.playTogether(animate)
        animator.start()

    }

    private fun onClick() {


    }


}
