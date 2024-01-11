package com.alt.myblack

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.isGone
import androidx.recyclerview.widget.RecyclerView

class MenuViewHolder(view:View) : RecyclerView.ViewHolder(view){

    private val tvmenu: TextView = view.findViewById(R.id.MenuItems)
    private val  micon: ImageView = view.findViewById(R.id.MenuIcon)
    private val menuconten: CardView = view.findViewById(R.id.menuconten)

    fun render(MenuList: MenuItems, onItemSelected: (Int) -> Unit){
        tvmenu.text = "prueba menu"

        val color = if(MenuList.isSelected){
            R.color.black
        }else{
            R.color.MyBlack_UnSelectes
        }

        menuconten.setCardBackgroundColor(ContextCompat.getColor(menuconten.context, color))

        itemView.setOnClickListener { onItemSelected(layoutPosition) }

        when(MenuList){
            MenuItems.About -> {
                tvmenu.text = "About"
                micon.setImageResource(R.drawable.baseline_about_ind_24)
            }
            MenuItems.ContactUs ->{
                tvmenu.text = "Contact Us"
                micon.setImageResource(R.drawable.baseline_contact_mail_24)
            }
            MenuItems.FPay -> {
                tvmenu.text = "Mode Pay"
                micon.setImageResource(R.drawable.baseline_paid_24)
            }
            MenuItems.Home -> {
                tvmenu.text = "Main"
                tvmenu.isGone
                micon.setImageResource(R.drawable.baseline_home_24)
            }
        }
    }
}