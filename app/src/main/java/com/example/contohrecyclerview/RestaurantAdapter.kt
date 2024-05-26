package com.example.contohrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contohrecyclerview.databinding.ItemRestaurantBinding

class RestaurantAdapter(private val restaurants: List<Restaurant>) : RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val binding = ItemRestaurantBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RestaurantViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val restaurant = restaurants[position]
        holder.binding.apply {
            imageRestaurant.setImageResource(restaurant.image)
            textRestaurantName.text = restaurant.name
            textRating.text = restaurant.rating.toString()
        }
    }

    override fun getItemCount(): Int = restaurants.size

    class RestaurantViewHolder(val binding: ItemRestaurantBinding) : RecyclerView.ViewHolder(binding.root)

}