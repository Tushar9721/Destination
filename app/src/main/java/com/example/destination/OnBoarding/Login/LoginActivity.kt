package com.example.destination.OnBoarding.Login

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.Fade
import android.transition.Transition
import android.transition.TransitionManager
import android.view.View
import com.example.destination.Home.HomeScreen
import com.example.destination.R
import kotlinx.android.synthetic.main.activity_on_board.*


class LoginActivity : AppCompatActivity(), View.OnClickListener {

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
        ivBrowseGuest.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when(v?.id){

            R.id.ivBrowseGuest ->{
                val intent = Intent(this,HomeScreen::class.java)
                startActivity(intent)
                finish()
            }

        }

    }


}
