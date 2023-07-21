package com.example.quizz.navigation

import com.example.quizz.R
import com.example.result.ResultNavigation
import javax.inject.Inject

class ResultNavigationImpl @Inject constructor() : ResultNavigation() {

    override fun tryAgain() {
        navController?.popBackStack(R.id.questionFragment, false)
    }

    override fun restart() {
        navController?.popBackStack(R.id.homeFragment, false)
    }
}