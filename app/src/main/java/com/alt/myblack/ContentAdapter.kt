package com.alt.myblack

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContentAdapter(var conten:List<Content>):RecyclerView.Adapter<ContentViewHodelr>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHodelr {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contentitems, parent, false)
        return ContentViewHodelr(view)
    }

    override fun onBindViewHolder(holder: ContentViewHodelr, position: Int) {
        holder.render(conten[position])
    }

    override fun getItemCount() = conten.size

}