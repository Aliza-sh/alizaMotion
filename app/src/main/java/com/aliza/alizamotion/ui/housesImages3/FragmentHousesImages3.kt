package com.aliza.alizamotion.ui.housesImages3

import android.os.Bundle
import android.view.View
import com.aliza.alizamotion.R
import com.aliza.alizamotion.base.BaseFragment
import com.aliza.alizamotion.databinding.FragmentHousesImages3Binding

class FragmentHousesImages3 : BaseFragment<FragmentHousesImages3Binding>(
    FragmentHousesImages3Binding::inflate
) {

    private var index = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.img1.setOnClickListener {
            if (index == 0) return@setOnClickListener

            binding.motionLayout.setTransition(R.id.state_img2, R.id.state_img1)
            binding.motionLayout.transitionToEnd()

            index = 0
        }

        binding.img2.setOnClickListener {
            if (index == 1) return@setOnClickListener

            if (index == 2) {
                binding.motionLayout.setTransition(R.id.state_img3, R.id.state_img2)
            } else {
                binding.motionLayout.setTransition(R.id.state_img1, R.id.state_img2)
            }
            binding.motionLayout.transitionToEnd()

            index = 1
        }

        binding.img3.setOnClickListener {
            if (index == 2) return@setOnClickListener

            binding.motionLayout.setTransition(R.id.state_img2, R.id.state_img3)
            binding.motionLayout.transitionToEnd()

            index = 2
        }

    }
}