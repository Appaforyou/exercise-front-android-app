package com.example.fitgoal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_create_account.view.*

class CreateAccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        activity?.window?.statusBarColor = resources.getColor(R.color.color_top3)
        retainInstance = true

        return inflater.inflate(R.layout.fragment_create_account, container, false).apply {

            createAccImageButton2.setOnClickListener {
                (activity as ActivityForFragments).navController.navigate(R.id.action_createAccountFragment_to_loginFragment)
            }
        }
    }
}
