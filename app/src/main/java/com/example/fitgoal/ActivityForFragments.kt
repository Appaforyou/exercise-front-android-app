package com.example.fitgoal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit


class ActivityForFragments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_fragments)


        supportFragmentManager.commit {
            replace(R.id.frameLayoutFragment, OnBoardingFragment())
        }
    }
}