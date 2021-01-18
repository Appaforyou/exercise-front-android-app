package com.example.fitgoal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.NavController
import androidx.navigation.Navigation


class ActivityForFragments : AppCompatActivity() {

    lateinit var navController: NavController



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_fragments)
        navController = Navigation.findNavController(this, R.id.nav_host)

        

    }
}

