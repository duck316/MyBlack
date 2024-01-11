package com.alt.myblack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.view.menu.MenuAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alt.myblack.MenuItems.*

class MainActivity : AppCompatActivity() {

    private val menus = listOf(
        Home,
        FPay,
        ContactUs,
        About
    )

    private val contents = mutableListOf(
        Content("Prueba Contenido home", Home),
        Content("Prueba Contenido formas de pago", FPay),
        Content("Prueba Contenido contact us", ContactUs),
        Content("Prueba Contenido about", About)
    )

    private  lateinit var rvCategories: RecyclerView
    private  lateinit var menuadapter: MenuAdapters
    private lateinit var rvContent:RecyclerView
    private  lateinit var contenAdapter: ContentAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initcomponent()
        initUI()
    }

    private fun initcomponent(){
        rvCategories= findViewById(R.id.rvCategories)
        rvContent= findViewById(R.id.rvContent)
    }

    private fun initUI(){
        menuadapter = MenuAdapters(menus){position -> updateMenu(position)}
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = menuadapter

        contenAdapter = ContentAdapter(contents)
        rvContent.layoutManager = LinearLayoutManager(this)
        rvContent.adapter = contenAdapter
    }

    private fun updateMenu(position: Int){
        menus[position].isSelected  = !menus[position].isSelected
        menuadapter.notifyItemChanged(position)
        updateContent()

    }

    private fun updateContent(){
        val selectedContent: List<MenuItems> = menus.filter { it.isSelected }
        val newconten =contents.filter { selectedContent.contains(it.menucategory) }
        contenAdapter.conten = newconten
        contenAdapter.notifyDataSetChanged()
    }
}