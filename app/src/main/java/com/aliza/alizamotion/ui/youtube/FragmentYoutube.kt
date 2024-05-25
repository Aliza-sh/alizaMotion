package com.aliza.alizamotion.ui.youtube

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.aliza.alizamotion.R
import com.aliza.alizamotion.base.BaseFragment
import com.aliza.alizamotion.databinding.FragmentYoutubeBinding
import com.aliza.alizamotion.ui.movie.MoviesModel

class FragmentYoutube : BaseFragment<FragmentYoutubeBinding>(FragmentYoutubeBinding::inflate) {

    private val moviesList: MutableList<MoviesModel> = mutableListOf()
    private val moviesAdapter by lazy { MoviesAdapter(moviesList) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Add data
        addMovies()
        //RecyclerView
        binding.apply {
            recyclerView.apply {
                layoutManager = LinearLayoutManager(requireContext())
                adapter = moviesAdapter
            }
        }
    }
    private fun addMovies() {
        moviesList.add(MoviesModel(1, "The Shawshank Redemption", R.drawable.top_the_shawshank_redemption))
        moviesList.add(MoviesModel(2, "The Godfather", R.drawable.top_the_godfather))
        moviesList.add(MoviesModel(3, "The Godfather: Part II", R.drawable.top_the_godfather__part_ii))
        moviesList.add(MoviesModel(4, "The Dark Knight", R.drawable.top_the_dark_knight))
        moviesList.add(MoviesModel(5, "12 Angry Men", R.drawable.top_12_angry_men))
        moviesList.add(MoviesModel(6, "Schindler’s List", R.drawable.top_schindlers_list))
        moviesList.add(MoviesModel(7, "Forrest Gump", R.drawable.top_forrest_gump))
        moviesList.add(MoviesModel(8, "The Empire Strikes Back", R.drawable.top_the_empire_strikes_back))
        moviesList.add(MoviesModel(9, "Inception", R.drawable.top_inception))
    }
}