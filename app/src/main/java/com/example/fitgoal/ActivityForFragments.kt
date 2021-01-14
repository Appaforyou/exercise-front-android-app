package com.example.fitgoal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.fitgoal.CurrentFragment.Companion.currentFragment


class ActivityForFragments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_fragments)


        supportFragmentManager.commit {
            replace(R.id.frameLayoutFragment, currentFragment.fragment)
        }
    }
}

class CurrentFragment(var fragment: Fragment) {
    companion object {
        var currentFragment: CurrentFragment = CurrentFragment(SignUpFragment())
    }
}