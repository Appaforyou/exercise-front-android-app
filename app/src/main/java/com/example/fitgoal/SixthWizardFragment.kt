package com.example.fitgoal

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import com.example.fitgoal.CurrentFragment.Companion.currentFragment
import kotlinx.android.synthetic.main.fragment_sixth.view.*


class SixthWizardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sixth, container, false).apply {


            checkBoxGoalBody.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    imageGoalBody.setBackgroundColor(Color.parseColor("#AFE8EF"))
                }
                if (!isChecked) {
                    imageGoalBody.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
                }
            }

            checkBoxGoalBody2.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    imageGoalBody2.setBackgroundColor(Color.parseColor("#AFE8EF"))
                }
                if (!isChecked) {
                    imageGoalBody2.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
                }
            }

            checkBoxGoalBody3.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    imageGoalBody3.setBackgroundColor(Color.parseColor("#AFE8EF"))
                }
                if (!isChecked) {
                    imageGoalBody3.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
                }
            }

            checkBoxGoalBody4.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    imageGoalBody4.setBackgroundColor(Color.parseColor("#AFE8EF"))
                }
                if (!isChecked) {
                    imageGoalBody4.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
                }
            }

            falshivayaKnopka6.setOnClickListener {
                activity?.supportFragmentManager?.commit {
                    addToBackStack(null)
                    currentFragment.fragment = SeventeenthScreenFragment()
                    replace(R.id.frameLayoutFragment, currentFragment.fragment)
                }
            }





        }
    }



}