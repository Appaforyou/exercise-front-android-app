package com.example.fitgoal

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first_wizard.view.*
import kotlinx.android.synthetic.main.image_with_checkbox.view.*
import kotlinx.android.synthetic.main.image_with_checkbox.view.imageViewFemale

class FirstWizardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first_wizard, container, false).apply {
            retainInstance = true
            activity?.window?.statusBarColor = resources.getColor(R.color.color_top4)

            checkBoxFemale.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    imageViewFemale.setBackgroundColor(Color.parseColor("#AFE8EF"))
                }
                if (!isChecked) {
                    imageViewFemale.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
                }
            }

            checkBoxMale.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    imageViewMale.setBackgroundColor(Color.parseColor("#AFE8EF"))
                }
                if (!isChecked) {
                    imageViewMale.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
                }
            }

            falshivayaKnopka.setOnClickListener {
                (activity as ActivityForFragments).navController.navigate(R.id.action_firstWizardFragment_to_secondWizardFragment2)
            }
        }
    }
}
