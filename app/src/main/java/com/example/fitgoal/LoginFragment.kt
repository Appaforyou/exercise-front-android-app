package com.example.fitgoal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import com.example.fitgoal.CurrentFragment.Companion.currentFragment
import kotlinx.android.synthetic.main.fragment_login.view.*


class LoginFragment : Fragment() {

    private fun nextFragment() {
        activity?.supportFragmentManager?.commit {
            addToBackStack(null)
            currentFragment.fragment = FirstWizardFragment()
            replace(R.id.frameLayoutFragment, currentFragment.fragment)
        }
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
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