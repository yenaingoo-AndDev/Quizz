package com.example.quizz.navigation

import com.example.home.HomeFragmentDirections
import com.example.home.HomeNavigation
import javax.inject.Inject

class HomeNavigationImpl @Inject constructor() : HomeNavigation() {

    override fun navigateToQuestion(id: Int) {
        val direction = HomeFragmentDirections.actionHomeFragmentToQuestionFragment(id = id)
        navController?.navigate(direction)
    }
}