package com.example.fitgoal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class OnBoardingActivity : AppCompatActivity() {

    private  lateinit var onboardingItemsAdapter: OnboardingItemsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        setOnboardingItems()
    }

    private  fun  setOnboardingItems() {
        onboardingItemsAdapter = OnboardingItemsAdapter(
            listOf(
                OnboardingItem(
                    onboardingFitImage = R.drawable.fit_image_15,
                    onboardingTextImage = R.drawable.fit_text_15
                ),
                OnboardingItem(
                    onboardingFitImage = R.drawable.fit_image_25,
                    onboardingTextImage = R.drawable.fit_text_25
                ),
                OnboardingItem(
                    onboardingFitImage = R.drawable.fit_image_35,
                    onboardingTextImage = R.drawable.fit_text_35
                )
            )
        )
        val onboardingViewPager = findViewById<ViewPager2>(R.id.onboardingViewPager)
        onboardingViewPager.adapter = onboardingItemsAdapter
    }
}