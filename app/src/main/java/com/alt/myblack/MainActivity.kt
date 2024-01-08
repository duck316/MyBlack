package com.alt.myblack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.view.menu.MenuAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val menus = listOf(
        MenuItems.Home,
        MenuItems.FPay,
        MenuItems.ContactUs,
        MenuItems.About
    )
    private  lateinit var rvCategories: RecyclerView
    private  lateinit var menuadapter: MenuAdapters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initcomponent()
        initUI()
    }

    private fun initcomponent(){
        rvCategories= findViewById(R.id.rvCategories)
    }

    private fun initUI(){
        menuadapter = MenuAdapters(menus)
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = menuadapter

    }
}