package com.example.fitgoal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import com.example.fitgoal.CurrentFragment.Companion.currentFragment
import kotlinx.android.synthetic.main.fragment_create_account.view.*


class CreateAccountFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        retainInstance = true

        return inflater.inflate(R.layout.fragment_create_account, container, false).apply {


            createAccImageButton2.setOnClickListener {
                activity?.supportFragmentManager?.commit {
                    addToBackStack(null)
                    currentFragment.fragment = LoginFragment()
                    replace(R.id.frameLayoutFragment, LoginFragment())

                }
            }


        }
    }
}




