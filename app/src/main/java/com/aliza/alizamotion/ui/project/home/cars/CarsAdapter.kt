package com.aliza.alizamotion.ui.project.home.cars

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aliza.alizamotion.databinding.ItemRentCarsBinding

class CarsAdapter constructor(
    private val items: MutableList<CarsModel>,
    private val carEvents: CarEvents
) : RecyclerView.Adapter<CarsAdapter.ViewHolder>() {

    private lateinit var binding: ItemRentCarsBinding
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ItemRentCarsBinding.inflate(inflater, parent, false)
        context = parent.context
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    inner class ViewHolder(itemView: ItemRentCarsBinding) : RecyclerView.ViewHolder(itemView.root) {

        fun bind(item: CarsModel) {
            binding.apply {
                itemCarsImg.setImageResource(item.img)
                itemCarName.text = item.name
                itemCarPrice.text = item.price.toString()

                root.setOnClickListener {
                    carEvents.onCarClicked(item, adapterPosition)
                }
            }
        }
    }

    interface CarEvents {
        fun onCarClicked(car: CarsModel, position: Int)
    }
}