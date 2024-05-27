package com.aliza.alizamotion.ui.project.detail

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.aliza.alizamotion.R
import com.aliza.alizamotion.base.BaseFragment
import com.aliza.alizamotion.databinding.FragmentProjectDetailBinding
import com.aliza.alizamotion.ui.project.home.cars.CarsModel

class FragmentProjectDetail(private val car: CarsModel) : BaseFragment<FragmentProjectDetailBinding>(FragmentProjectDetailBinding::inflate) {

    private val carsAdapter by lazy { DetailCarsAdapter(carsData()) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            //Get data
            detailCarImg.setImageResource(car.img)
            detailCarName.text = car.name
            detailRentPrice.text = car.price.toString()
            //Cars
            detailList.apply {
                layoutManager = LinearLayoutManager(requireContext())
                adapter = carsAdapter
            }
        }
    }

    override fun getCallerClassName(): String {
        return "FragmentProjectDetail"

    }

    private fun carsData(): MutableList<CarsModel> = arrayListOf(
        CarsModel(R.drawable.car1, 1200, "اسپارتک"),
        CarsModel(R.drawable.car2, 840, "جیپ سفید"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car2, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car1, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car4, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car1, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car2, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car4, 980, "جیپ آبی")
    )
}