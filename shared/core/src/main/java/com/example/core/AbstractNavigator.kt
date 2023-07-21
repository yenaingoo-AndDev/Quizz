package com.example.core

import androidx.navigation.NavController

abstract class AbstractNavigator : Navigator {

    var navController: NavController? = null

    override fun bind(navController: NavController) {
        this.navController = navController
    }

    override fun unBind() {
        navController = null
    }

}