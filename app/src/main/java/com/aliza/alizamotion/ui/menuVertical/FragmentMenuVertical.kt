package com.aliza.alizamotion.ui.menuVertical

import android.os.Bundle
import android.view.View
import com.aliza.alizamotion.R
import com.aliza.alizamotion.base.BaseFragment
import com.aliza.alizamotion.databinding.FragmentMenuVerticalBinding

class FragmentMenuVertical :
    BaseFragment<FragmentMenuVerticalBinding>(FragmentMenuVerticalBinding::inflate) {

    private var isMenuOpened = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.menu1Txt.setOnClickListener {
            if (isMenuOpened) {
                binding.motionLayout.setTransition(R.id.state2, R.id.state1)
            } else {
                binding.motionLayout.setTransition(R.id.state1, R.id.state2)
            }
            binding.motionLayout.transitionToEnd()

            isMenuOpened = !isMenuOpened
        }

        binding.menu2Txt.setOnClickListener {
            if (isMenuOpened) {
                binding.motionLayout.setTransition(R.id.state3, R.id.state1)
            } else {
                binding.motionLayout.setTransition(R.id.state1, R.id.state3)
            }
            binding.motionLayout.transitionToEnd()

            isMenuOpened = !isMenuOpened
        }

        binding.menu3Txt.setOnClickListener {
            if (isMenuOpened) {
                binding.motionLayout.setTransition(R.id.state4, R.id.state1)
            } else {
                binding.motionLayout.setTransition(R.id.state1, R.id.state4)
            }
            binding.motionLayout.transitionToEnd()

            isMenuOpened = !isMenuOpened
        }
    }
}