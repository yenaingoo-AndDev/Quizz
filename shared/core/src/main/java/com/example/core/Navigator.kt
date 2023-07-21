package com.example.core

import androidx.navigation.NavController

interface Navigator {

    fun bind(navController: NavController)

    fun unBind()
}