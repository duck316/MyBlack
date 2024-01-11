package com.alt.myblack

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MenuAdapters(private val menu:List<MenuItems>, private val OnItemSelected:(Int) -> Unit ):
    RecyclerView.Adapter<MenuViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemmenu, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.render(menu[position], OnItemSelected)
    }

    override fun getItemCount() = menu.size
}