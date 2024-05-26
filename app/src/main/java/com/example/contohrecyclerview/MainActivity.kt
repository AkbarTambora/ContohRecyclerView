package com.example.contohrecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contohrecyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val restaurants = listOf(
            Restaurant(R.drawable.breakfast, "Nama Restoran 1", 4.5f),
            Restaurant(R.drawable.breakfast, "Nama Restoran 2", 4.5f),
            Restaurant(R.drawable.breakfast, "Nama Restoran 3", 4.5f),
            Restaurant(R.drawable.breakfast, "Nama Restoran 4", 4.5f),
            Restaurant(R.drawable.breakfast, "Nama Restoran 5", 4.5f)
            // Tambahkan lebih banyak restoran sesuai kebutuhan
        )

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = RestaurantAdapter(restaurants)
        }
    }
}