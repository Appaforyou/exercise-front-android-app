package com.example.fitgoal

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import com.example.fitgoal.CurrentFragment.Companion.currentFragment
import kotlinx.android.synthetic.main.fragment_first_wizard.view.*
import kotlinx.android.synthetic.main.image_with_checkbox.view.*
import kotlinx.android.synthetic.main.image_with_checkbox.view.imageViewFemale


class FirstWizardFragment : Fragment() {






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first_wizard, container, false).apply {


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
                activity?.supportFragmentManager?.commit {
                    addToBackStack(null)
                    currentFragment.fragment = SecondWizardFragment()
                    replace(R.id.frameLayoutFragment, currentFragment.fragment)
                }
            }







        }
    }

}