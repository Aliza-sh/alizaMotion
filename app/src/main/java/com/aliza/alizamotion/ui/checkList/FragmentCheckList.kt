package com.aliza.alizamotion.ui.checkList

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.aliza.alizamotion.R
import com.aliza.alizamotion.base.BaseFragment
import com.aliza.alizamotion.databinding.FragmentCheckListBinding
import com.aliza.alizamotion.ui.movie.MoviesModel

class FragmentCheckList :
    BaseFragment<FragmentCheckListBinding>(FragmentCheckListBinding::inflate) {

    private val moviesList: MutableList<MoviesModel> = mutableListOf()
    private val moviesAdapter by lazy { CheckListAdapter(moviesList) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        addMovies()
        binding.apply {
            recyclerView.apply {
                layoutManager = LinearLayoutManager(requireContext())
                adapter = moviesAdapter
            }
        }
    }

    private fun addMovies() {
        moviesList.add(MoviesModel(1, "تکمیل دوره جامع انیمیشن سازی", R.drawable.ic_work))
        moviesList.add(MoviesModel(2, "خرید برای خونه", R.drawable.ic_shopping_cart))
        moviesList.add(MoviesModel(3, "تعمیر کولر", R.drawable.ic_home))
        moviesList.add(MoviesModel(4, "تماس با محسن", R.drawable.ic_call))
        moviesList.add(MoviesModel(5, "تعویض روغن ماشین", R.drawable.ic_directions_car))
        moviesList.add(MoviesModel(6, "تولد محمد", R.drawable.ic_celebration))
        moviesList.add(MoviesModel(7, "رزرو زمین فوتبال", R.drawable.ic_sports_tennis))
    }
}