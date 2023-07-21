package com.example.home

import com.example.core.AbstractNavigator

abstract class HomeNavigation : AbstractNavigator() {

    abstract fun navigateToQuestion(id: Int)
}