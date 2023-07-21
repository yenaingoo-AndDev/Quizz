package com.example.question

import android.os.Bundle
import android.view.View
import com.example.core.AbstractNavigator
import com.example.core.BaseFragment
import com.example.question.databinding.FragmentQuestionBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class QuestionFragment : BaseFragment(R.layout.fragment_question) {

    private lateinit var binding: FragmentQuestionBinding

    @Inject
    lateinit var questionNavigation: QuestionNavigation

    override val abstractNavigator: AbstractNavigator by lazy {
        questionNavigation
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentQuestionBinding.bind(view)
        val questionId = arguments?.getInt("id") ?: 0
        binding.apply {
            tvQuestion.text = "Question #$questionId"

            btnTrue.setOnClickListener {
                questionNavigation.navigateToSuccess()
            }

            btnFalse.setOnClickListener {
                questionNavigation.navigateToError()
            }
        }
    }
}