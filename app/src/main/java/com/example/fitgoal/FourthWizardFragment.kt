package com.example.fitgoal

import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_fourth_wizard.view.*

class FourthWizardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth_wizard, container, false).apply {
            retainInstance = true
            activity?.window?.statusBarColor = resources.getColor(R.color.color_top4)

            editTextWeigh.inputType = InputType.TYPE_CLASS_PHONE

            falshivayaKnopka4.setOnClickListener {
                (activity as ActivityForFragments).navController.navigate(R.id.action_fourthWizardFragment2_to_fifthWizardFragment2)
            }
        }
    }
}
