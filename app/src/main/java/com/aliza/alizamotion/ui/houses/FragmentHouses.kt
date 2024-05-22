package com.aliza.alizamotion.ui.houses

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.aliza.alizamotion.R
import com.aliza.alizamotion.base.BaseFragment
import com.aliza.alizamotion.databinding.FragmentHousesBinding

class FragmentHouses : BaseFragment<FragmentHousesBinding>(FragmentHousesBinding::inflate) {

    private var housesAdapter: HousesAdapter = HousesAdapter(housesData())
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.apply {
            housePageRecycler.apply {
                layoutManager = LinearLayoutManager(requireContext())
                adapter = housesAdapter
            }
        }
    }

    private fun housesData(): MutableList<HouseModel> = arrayListOf(
        HouseModel(
            "عنوان مطلب 1",
            "محل نمایش توضیحات مطلب 1",
            R.drawable.house1
        ),
        HouseModel(
            "عنوان مطلب 2",
            "محل نمایش توضیحات مطلب 2",
            R.drawable.house2
        ),
        HouseModel(
            "عنوان مطلب 3",
            "محل نمایش توضیحات مطلب 3",
            R.drawable.house5
        ),
        HouseModel(
            "عنوان مطلب 4",
            "محل نمایش توضیحات مطلب 4",
            R.drawable.house4
        ),
        HouseModel(
            "عنوان مطلب 5",
            "محل نمایش توضیحات مطلب 5",
            R.drawable.house3
        )
    )

}