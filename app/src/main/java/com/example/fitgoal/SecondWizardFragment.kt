package com.example.fitgoal

import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_second_wizard.view.*

class SecondWizardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second_wizard, container, false).apply {
            retainInstance = true
            activity?.window?.statusBarColor = resources.getColor(R.color.color_top4)

            editTextAge.inputType = InputType.TYPE_CLASS_PHONE

            falshivayaKnopka2.setOnClickListener {
                (activity as ActivityForFragments).navController.navigate(R.id.action_secondWizardFragment2_to_thirdWizardFragment3)
            }
        }
    }
}
