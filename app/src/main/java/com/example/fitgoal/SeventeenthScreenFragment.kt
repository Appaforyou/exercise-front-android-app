package com.example.fitgoal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class SeventeenthScreenFragment : Fragment() {


    lateinit var recyclerViewHor: RecyclerView
    lateinit var recyclerViewVert: RecyclerView

    private val imagesVertical = listOf(
        DataVerticalCard(R.drawable.vert1),
        DataVerticalCard(R.drawable.vert2),
        DataVerticalCard(R.drawable.vert3),
        DataVerticalCard(R.drawable.vert1),
        DataVerticalCard(R.drawable.vert2),
        DataVerticalCard(R.drawable.vert3),
        DataVerticalCard(R.drawable.vert1),
        DataVerticalCard(R.drawable.vert2),
        DataVerticalCard(R.drawable.vert3),
        DataVerticalCard(R.drawable.vert1),
        DataVerticalCard(R.drawable.vert2),
        DataVerticalCard(R.drawable.vert3),
        DataVerticalCard(R.drawable.vert1),
        DataVerticalCard(R.drawable.vert2),
        DataVerticalCard(R.drawable.vert3),
        DataVerticalCard(R.drawable.vert1),
        DataVerticalCard(R.drawable.vert2),
        DataVerticalCard(R.drawable.vert3),
    )
    private val imagesHorizontal = listOf(
        DataHorizontalCard(R.drawable.horiz1),
        DataHorizontalCard(R.drawable.horiz2),
        DataHorizontalCard(R.drawable.horiz3),
        DataHorizontalCard(R.drawable.horiz1),
        DataHorizontalCard(R.drawable.horiz2),
        DataHorizontalCard(R.drawable.horiz3),
        DataHorizontalCard(R.drawable.horiz1),
        DataHorizontalCard(R.drawable.horiz2),
        DataHorizontalCard(R.drawable.horiz3),
        DataHorizontalCard(R.drawable.horiz1),
        DataHorizontalCard(R.drawable.horiz2),
        DataHorizontalCard(R.drawable.horiz3),
        DataHorizontalCard(R.drawable.horiz1),
        DataHorizontalCard(R.drawable.horiz2),
        DataHorizontalCard(R.drawable.horiz3),
        DataHorizontalCard(R.drawable.horiz1),
        DataHorizontalCard(R.drawable.horiz2),
        DataHorizontalCard(R.drawable.horiz3),
        DataHorizontalCard(R.drawable.horiz1),
        DataHorizontalCard(R.drawable.horiz2),
        DataHorizontalCard(R.drawable.horiz3),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seventeenth_screen, container, false).apply {
            retainInstance = true

            recyclerViewHor = findViewById(R.id.recyclerViewHorizontal)
            val linearLayoutManagerHorizontal = LinearLayoutManager(this.context)
            linearLayoutManagerHorizontal.orientation = LinearLayoutManager.HORIZONTAL
            recyclerViewHor.layoutManager = linearLayoutManagerHorizontal

            val adapterHorizontal = HorizontalAdapter(imagesHorizontal)

            recyclerViewHor.adapter = adapterHorizontal


            recyclerViewVert = findViewById(R.id.recyclerViewVertical)
            val linearLayoutManagerVertical = LinearLayoutManager(this.context)
            recyclerViewVert.layoutManager = linearLayoutManagerVertical

            val adapterVertical = VerticalAdapter(imagesVertical)

            recyclerViewVert.adapter = adapterVertical


        }
    }




}