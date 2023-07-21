package com.example.home

import android.os.Bundle
import android.view.View
import com.example.core.AbstractNavigator
import com.example.core.BaseFragment
import com.example.home.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : BaseFragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    @Inject
    lateinit var homeNavigation: HomeNavigation

    override val abstractNavigator: AbstractNavigator by lazy {
        homeNavigation
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentHomeBinding.bind(view)

        binding.apply {
            btnQuestionOne.setOnClickListener {
                homeNavigation.navigateToQuestion(1)
            }

            btnQuestionTwo.setOnClickListener {
                homeNavigation.navigateToQuestion(2)
            }
        }
    }
}