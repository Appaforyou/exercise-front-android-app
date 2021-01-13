package com.example.fitgoal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.fragment_sign_up.view.*


class SignUpFragment : Fragment() {

    private fun nextFragment() {
        activity?.supportFragmentManager?.commit {
            addToBackStack(null)
            replace(R.id.frameLayoutFragment, CreateAccountFragment())
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_up, container, false).apply {

            googleImageButton.setOnClickListener {
                nextFragment()
            }

            facebookImageButton.setOnClickListener {
                nextFragment()
            }

            twitterImageButton.setOnClickListener {
                nextFragment()
            }

            createAccImageButton.setOnClickListener {
                nextFragment()
            }





        }
    }


}