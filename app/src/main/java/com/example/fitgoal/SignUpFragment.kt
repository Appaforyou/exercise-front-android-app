package com.example.fitgoal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_sign_up.*
import kotlinx.android.synthetic.main.fragment_sign_up.view.*

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        activity?.window?.statusBarColor = resources.getColor(R.color.color_top3)
        retainInstance = true

        return inflater.inflate(R.layout.fragment_sign_up, container, false).apply {
        }
    }

    override fun onStart() {
        super.onStart()
        googleImageButton.setOnClickListener {
            (activity as ActivityForFragments).navController.navigate(R.id.action_signUpFragment_to_createAccountFragment)
        }

        facebookImageButton.setOnClickListener {
            (activity as ActivityForFragments).navController.navigate(R.id.action_signUpFragment_to_createAccountFragment)
        }

        twitterImageButton.setOnClickListener {
            (activity as ActivityForFragments).navController.navigate(R.id.action_signUpFragment_to_createAccountFragment)
        }

        createAccImageButton.setOnClickListener {
            (activity as ActivityForFragments).navController.navigate(R.id.action_signUpFragment_to_createAccountFragment)
        }
    }
}
