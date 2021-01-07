package com.example.fitgoal

import android.os.Bundle
import android.text.InputType
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.fragment_second_wizard.view.*


class SecondWizardFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second_wizard, container, false).apply {


            editTextAge.inputType = InputType.TYPE_CLASS_PHONE

            falshivayaKnopka2.setOnClickListener {
                activity?.supportFragmentManager?.commit {
                    replace(R.id.frameLayoutFragment, ThirdWizardFragment())
                }
            }



        }
    }


}