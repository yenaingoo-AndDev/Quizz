package com.example.quizz.navigation

import com.example.question.QuestionFragmentDirections
import com.example.question.QuestionNavigation
import javax.inject.Inject

class QuestionNavigationImpl @Inject constructor() : QuestionNavigation() {

    override fun navigateToSuccess() {
        val direction = QuestionFragmentDirections.actionQuestionFragmentToSuccessFragment()
        navController?.navigate(direction)
    }

    override fun navigateToError() {
        val direction = QuestionFragmentDirections.actionQuestionFragmentToFailFragment()
        navController?.navigate(direction)
    }
}