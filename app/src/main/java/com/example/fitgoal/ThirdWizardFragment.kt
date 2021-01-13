package com.example.fitgoal

import android.os.Bundle
import android.text.InputType
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.fragment_second_wizard.view.*
import kotlinx.android.synthetic.main.fragment_third_wizard.view.*


class ThirdWizardFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third_wizard, container, false).apply {



            editTextHeight.inputType = InputType.TYPE_CLASS_PHONE

            falshivayaKnopka3.setOnClickListener {
                activity?.supportFragmentManager?.commit {
                    addToBackStack(null)
                    replace(R.id.frameLayoutFragment, FourthWizardFragment())
                }
            }






        }
    }

}