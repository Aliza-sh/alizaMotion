package com.aliza.alizamotion.ui.project.splash

import android.os.Bundle
import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout
import com.aliza.alizamotion.R
import com.aliza.alizamotion.base.BaseFragment
import com.aliza.alizamotion.databinding.FragmentProjectSplashBinding
import com.aliza.alizamotion.ui.project.home.FragmentProjectHome

class FragmentProjectSplash : BaseFragment<FragmentProjectSplashBinding>(FragmentProjectSplashBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Auto run
        binding.splashMotionLayout.transitionToState(R.id.end_splash)
        //Start home page
        binding.splashMotionLayout.addTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(motionLayout: MotionLayout?, startId: Int, endId: Int) {

            }

            override fun onTransitionChange(motionLayout: MotionLayout?, startId: Int, endId: Int, progress: Float) {

            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                parentFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container_main, FragmentProjectHome())
                    .addToBackStack(null)
                    .commit()
            }

            override fun onTransitionTrigger(motionLayout: MotionLayout?, triggerId: Int, positive: Boolean, progress: Float) {

            }

        })
    }
}