package com.example.fitgoal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class OnboardingItemsAdapter(private val onboardingItems: List<OnboardingItem>) :
    RecyclerView.Adapter<OnboardingItemsAdapter.OnboardingItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingItemViewHolder {
        return OnboardingItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.onboarding_item_container,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OnboardingItemViewHolder, position: Int) {
        holder.bind(onboardingItems[position])
    }

    override fun getItemCount(): Int {
        return onboardingItems.size
    }

    inner class OnboardingItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val imageFitOnboarding = view.findViewById<ImageView>(R.id.imageFitOnboarding)
        private val imageTextOnboarding = view.findViewById<ImageView>(R.id.imageTextOnboarding)

        fun bind(onboardingItem: OnboardingItem) {
            imageFitOnboarding.setImageResource(onboardingItem.onboardingFitImage)
            imageTextOnboarding.setImageResource(onboardingItem.onboardingTextImage)
        }
    }
}
