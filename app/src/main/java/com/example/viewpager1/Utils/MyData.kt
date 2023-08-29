package com.example.viewpager1.Utils

import com.example.viewpager1.Models.User
import com.example.viewpager1.R

object MyData {
    val list = ArrayList<User>()
    fun addUser(){
        list.add(User(R.drawable.img1, "Click va Paymega o’tish xizmati"))
        list.add(User(R.drawable.img3, "Barcha operatorlar bo’yicha statistika"))
        list.add(User(R.drawable.img2, "Tariflarni filtrlash"))
        list.add(User(R.drawable.img4, "Yangi imkoniyatlar"))
    }
}