package com.alt.myblack

sealed class MenuItems(var isSelected: Boolean = false) {
    object Home: MenuItems()
    object FPay: MenuItems()
    object ContactUs: MenuItems()
    object About: MenuItems()
}