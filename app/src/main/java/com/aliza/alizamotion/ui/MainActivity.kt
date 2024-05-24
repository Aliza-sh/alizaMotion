package com.aliza.alizamotion.ui

import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.aliza.alizamotion.base.BaseActivity
import com.aliza.alizamotion.R
import com.aliza.alizamotion.databinding.ActivityMainBinding
import com.aliza.alizamotion.ui.bigHeader.FragmentBigHeader
import com.aliza.alizamotion.ui.checkList.FragmentCheckList
import com.aliza.alizamotion.ui.fabMenu.FragmentFabMenu
import com.aliza.alizamotion.ui.houses.FragmentHouses
import com.aliza.alizamotion.ui.housesImages.FragmentHousesImages
import com.aliza.alizamotion.ui.housesImages2.FragmentHousesImages2
import com.aliza.alizamotion.ui.lockScreen.FragmentLockScreen
import com.aliza.alizamotion.ui.login.FragmentLogin
import com.aliza.alizamotion.ui.menuVertical.FragmentMenuVertical
import com.aliza.alizamotion.ui.movie.FragmentMovie
import com.aliza.alizamotion.ui.profile.FragmentProfile
import com.aliza.alizamotion.ui.profileTelegram.FragmentProfileTelegram
import com.aliza.alizamotion.ui.searchbox.FragmentSearchBox
import com.aliza.alizamotion.ui.splash.FragmentSplash
import com.aliza.alizamotion.ui.story.FragmentStory

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun inflateBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    @RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.apply {
            btnFrgMovie.setOnClickListener {
                replaceFragment(FragmentMovie())
            }
            btnFrgLogin.setOnClickListener {
                replaceFragment(FragmentLogin())
            }
            btnFrgHouses.setOnClickListener {
                replaceFragment(FragmentHouses())
            }
            btnFrgBigHeader.setOnClickListener {
                replaceFragment(FragmentBigHeader())
            }
            btnFrgSplash.setOnClickListener {
                replaceFragment(FragmentSplash())
            }
            btnFrgSearchBox.setOnClickListener {
                replaceFragment(FragmentSearchBox())
            }
            btnFrgProfile.setOnClickListener {
                replaceFragment(FragmentProfile())
            }
            btnFrgLockScreen.setOnClickListener {
                replaceFragment(FragmentLockScreen())
            }
            btnFrgHousesImages.setOnClickListener {
                replaceFragment(FragmentHousesImages())
            }
            btnFrgStory.setOnClickListener {
                replaceFragment(FragmentStory())
            }
            btnFrgFabMenu.setOnClickListener {
                replaceFragment(FragmentFabMenu())
            }
            btnFrgCheckList.setOnClickListener {
                replaceFragment(FragmentCheckList())
            }
            btnFrgProfileTelegram.setOnClickListener {
                replaceFragment(FragmentProfileTelegram())
            }
            btnFrgHousesImages2.setOnClickListener {
                replaceFragment(FragmentHousesImages2())
            }
            btnFrgMenuVertical.setOnClickListener {
                replaceFragment(FragmentMenuVertical())
            }
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container_main, fragment)
            .addToBackStack(null)
            .commit()
    }
}