package com.aliza.alizamotion.ui.movieCard3d

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.aliza.alizamotion.R
import com.aliza.alizamotion.base.BaseFragment
import com.aliza.alizamotion.databinding.FragmentMovieCard3dBinding
import com.aliza.alizamotion.ui.movie.MoviesModel

class FragmentMovieCard3D :
    BaseFragment<FragmentMovieCard3dBinding>(FragmentMovieCard3dBinding::inflate) {

    private val moviesList: MutableList<MoviesModel> = mutableListOf()
    private val moviesAdapter by lazy { MoviesAdapter(moviesList) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Recycler
        addMovies()
        binding.apply {
            recyclerView.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = moviesAdapter
            }
        }
    }

    private fun addMovies() {
        moviesList.add(MoviesModel(1, "Aquaman", R.drawable.aquaman_poster))
        moviesList.add(MoviesModel(2, "Shang-Chi", R.drawable.shangchi_poster))
        moviesList.add(MoviesModel(3, "Last night in Soho", R.drawable.lastnigh_poster))
        moviesList.add(MoviesModel(4, "Venom: Let There Be Carnage", R.drawable.venum_poster))
    }
}