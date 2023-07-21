package com.example.core

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

abstract class BaseFragment(@LayoutRes layoutId: Int) : Fragment(layoutId) {

    abstract val abstractNavigator: AbstractNavigator
    private val navController: NavController by lazy {
        findNavController()
    }

    override fun onResume() {
        super.onResume()
        abstractNavigator.bind(navController)
    }

    override fun onStop() {
        super.onStop()
        abstractNavigator.unBind()
    }
}