package com.example.fitgoal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class VerticalAdapter(
    val images: List<DataVerticalCard>
): RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder>() {


    inner class VerticalViewHolder: RecyclerView.ViewHolder{
        val imageVertical: ImageView
        constructor(item: View): super(item) {
            imageVertical = item.findViewById(R.id.imageVertical)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_vertical, parent, false)
        return VerticalViewHolder(view)
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        val item = images[position]

        holder.imageVertical.setImageResource(item.image)
    }

    override fun getItemCount(): Int {
        return images.size
    }

}
