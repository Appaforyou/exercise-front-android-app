package com.example.fitgoal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit


class ActivityForFragments : AppCompatActivity() {
    private val currentFragment: Fragment
        get() = supportFragmentManager.findFragmentById(R.id.frameLayoutFragment) as Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_fragments)


        if (supportFragmentManager.findFragmentById(R.id.frameLayoutFragment) is Fragment) {
            supportFragmentManager.commit {
                replace(R.id.frameLayoutFragment, currentFragment)
            }
        } else {
            supportFragmentManager.commit {
                replace(R.id.frameLayoutFragment, SignUpFragment())
            }
        }

    }
}

