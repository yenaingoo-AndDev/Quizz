package com.example.result

import android.os.Bundle
import android.view.View
import com.example.core.AbstractNavigator
import com.example.core.BaseFragment
import com.example.result.databinding.FragmentSuccessBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SuccessFragment : BaseFragment(R.layout.fragment_success) {

    private lateinit var binding: FragmentSuccessBinding

    @Inject
    lateinit var resultNavigation: ResultNavigation

    override val abstractNavigator: AbstractNavigator by lazy {
        resultNavigation
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentSuccessBinding.bind(view)
        binding.apply {
            btnRestart.setOnClickListener {
                resultNavigation.restart()
            }
        }
    }
}