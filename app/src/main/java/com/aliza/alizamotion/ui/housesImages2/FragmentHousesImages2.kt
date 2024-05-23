package com.aliza.alizamotion.ui.housesImages2

import android.os.Bundle
import android.view.View
import com.aliza.alizamotion.R
import com.aliza.alizamotion.base.BaseFragment
import com.aliza.alizamotion.databinding.FragmentHousesImages2Binding

class FragmentHousesImages2 : BaseFragment<FragmentHousesImages2Binding>(
    FragmentHousesImages2Binding::inflate
) {

    private var index = 0
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        //Image 1
        binding.img1.setOnClickListener {
            if (index == 0) return@setOnClickListener

            binding.motionLayout.setTransition(R.id.img2, R.id.img1)
            binding.motionLayout.transitionToEnd()

            index = 0
        }
        //Image 2
        binding.img2.setOnClickListener {
            if (index == 1) return@setOnClickListener

            if (index == 2) {
                binding.motionLayout.setTransition(R.id.img3, R.id.img2)
            } else {
                binding.motionLayout.setTransition(R.id.img1, R.id.img2)
            }
            binding.motionLayout.transitionToEnd()

            index = 1
        }
        //Image 3
        binding.img3.setOnClickListener {
            if (index == 2) return@setOnClickListener

            binding.motionLayout.setTransition(R.id.img2, R.id.img3)
            binding.motionLayout.transitionToEnd()

            index = 2
        }
    }
}