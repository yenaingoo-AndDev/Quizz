package com.example.result

import com.example.core.AbstractNavigator

abstract class ResultNavigation : AbstractNavigator() {

    abstract fun tryAgain()

    abstract fun restart()
}