package com.example.question

import com.example.core.AbstractNavigator

abstract class QuestionNavigation : AbstractNavigator() {

    abstract fun navigateToSuccess()

    abstract fun navigateToError()
}