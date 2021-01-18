package com.example.fitgoal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.fragment_login.view.*


class LoginFragment : Fragment() {

    private fun nextFragment() {
        (activity as ActivityForFragments).navController.navigate(R.id.action_loginFragment_to_firstWizardFragment)
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.window?.statusBarColor = resources.getColor(R.color.color_top3)
        retainInstance = true
        return inflater.inflate(R.layout.fragment_login, container, false).apply {


            googleImageButtonLogin.setOnClickListener {
                nextFragment()
            }

            facebookImageButtonLogin.setOnClickListener {
                nextFragment()
            }

            twitterImageButtonLogin.setOnClickListener {
                nextFragment()
            }

            loginImageButton.setOnClickListener {
                nextFragment()
            }


        }
    }


}