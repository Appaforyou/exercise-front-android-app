package com.example.fitgoal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class HorizontalAdapter(
    val images: List<DataHorizontalCard>
): RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder>() {

    inner class HorizontalViewHolder: RecyclerView.ViewHolder{
        val imageHorizontal: ImageView
        constructor(item: View): super(item) {
            imageHorizontal = item.findViewById(R.id.imageHorizontal)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_horizontal, parent, false)
        return HorizontalViewHolder(view)
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        val item = images[position]

        holder.imageHorizontal.setImageResource(item.image)
    }

    override fun getItemCount(): Int {
        return images.size
    }


}