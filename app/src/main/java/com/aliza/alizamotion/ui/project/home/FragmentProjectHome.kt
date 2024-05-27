package com.aliza.alizamotion.ui.project.home

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.aliza.alizamotion.R
import com.aliza.alizamotion.base.BaseFragment
import com.aliza.alizamotion.databinding.FragmentProjectHomeBinding
import com.aliza.alizamotion.ui.project.detail.FragmentProjectDetail
import com.aliza.alizamotion.ui.project.home.cars.CarsAdapter
import com.aliza.alizamotion.ui.project.home.cars.CarsModel
import com.aliza.alizamotion.ui.project.home.images.ImagesAdapter
import com.aliza.alizamotion.ui.project.home.images.ImagesModel

class FragmentProjectHome :
    BaseFragment<FragmentProjectHomeBinding>(FragmentProjectHomeBinding::inflate),
    CarsAdapter.CarEvents {

    private val imagesAdapter by lazy { ImagesAdapter(loadImages()) }
    private val carsAdapter by lazy { CarsAdapter(loadCars(), this) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Init views
        binding.apply {
            //Images recycler
            contentImagesList.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, true)
                adapter = imagesAdapter
            }
            //cars recycler
            contentRentList.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, true)
                adapter = carsAdapter
            }
        }
    }

    private fun loadImages(): MutableList<ImagesModel> = arrayListOf(
        ImagesModel(R.drawable.alps1),
        ImagesModel(R.drawable.alps2),
        ImagesModel(R.drawable.alps3)
    )

    private fun loadCars(): MutableList<CarsModel> = arrayListOf(
        CarsModel(R.drawable.offroad_car_1, 1200, "اسپارتک"),
        CarsModel(R.drawable.offroad_car_2, 840, "جیپ سفید"),
        CarsModel(R.drawable.offroad_car_3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.offroad_car_4, 980, "جیپ آبی")
    )

    override fun getCallerClassName(): String {
        return "FragmentProjectHome"
    }

    override fun onCarClicked(car: CarsModel, position: Int) {
        parentFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container_main, FragmentProjectDetail(car))
            .addToBackStack(null)
            .commit()
    }
}