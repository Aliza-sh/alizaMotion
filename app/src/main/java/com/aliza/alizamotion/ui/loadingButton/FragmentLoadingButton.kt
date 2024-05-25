package com.aliza.alizamotion.ui.loadingButton

import android.os.Bundle
import android.view.View
import androidx.core.view.postDelayed
import com.aliza.alizamotion.R
import com.aliza.alizamotion.base.BaseFragment
import com.aliza.alizamotion.databinding.FragmentLoadingButtonBinding

class FragmentLoadingButton : BaseFragment<FragmentLoadingButtonBinding>(
    FragmentLoadingButtonBinding::inflate
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.materialButton.setOnClickListener {
            binding.motionLayout.transitionToState(R.id.loading_end)

            it.postDelayed(3000) {
                binding.motionLayout.transitionToState(R.id.downloaded)
            }
        }
    }
}