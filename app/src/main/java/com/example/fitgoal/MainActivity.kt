package com.example.fitgoal

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private fun openNextActivity() {
        val intent = Intent(this, OnBoardingActivity::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        object : CountDownTimer(2000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                Log.d("TAG", "TAG")
            }

            override fun onFinish() {
                openNextActivity()
            }
        }.start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.statusBarColor = resources.getColor(R.color.color_top2)
        setTheme(R.style.Theme_FitGoal)
    }
}
