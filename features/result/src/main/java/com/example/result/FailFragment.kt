package com.example.result

import android.os.Bundle
import android.view.View
import com.example.core.AbstractNavigator
import com.example.core.BaseFragment
import com.example.result.databinding.FragmentFailBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FailFragment : BaseFragment(R.layout.fragment_fail) {

    private lateinit var binding: FragmentFailBinding

    @Inject
    lateinit var resultNavigation: ResultNavigation

    override val abstractNavigator: AbstractNavigator by lazy {
        resultNavigation
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentFailBinding.bind(view)

        binding.apply {
            btnTryAgain.setOnClickListener {
                resultNavigation.tryAgain()
            }
        }
    }
}