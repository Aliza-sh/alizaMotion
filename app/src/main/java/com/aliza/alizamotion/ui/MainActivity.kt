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
import com.aliza.alizamotion.ui.houses.FragmentHouses
import com.aliza.alizamotion.ui.login.FragmentLogin
import com.aliza.alizamotion.ui.movie.FragmentMovie

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun inflateBinding(): ActivityMainBinding =ActivityMainBinding.inflate(layoutInflater)

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