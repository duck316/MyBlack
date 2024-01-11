package com.alt.myblack

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContentViewHodelr (view: View): RecyclerView.ViewHolder(view){
    private val txcontent: TextView = view.findViewById(R.id.ContentText)


    fun render(conte: Content, ){
        txcontent.text = conte.name
    }
}