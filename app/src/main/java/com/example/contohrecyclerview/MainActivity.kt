package com.example.contohrecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contohrecyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)

        // Atur LayoutManager ke Horizontal
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager

        // Siapkan data
        val data = (1..20).map { "Item $it" }

        // Atur adapter
        val adapter = MyAdapter(data)
        recyclerView.adapter = adapter

        val restaurants = listOf(
            Restaurant(R.drawable.breakfast, "Nama Restoran 1", 4.5f),
            Restaurant(R.drawable.breakfast, "Nama Restoran 2", 4.5f),
            Restaurant(R.drawable.breakfast, "Nama Restoran 3", 4.5f),
            Restaurant(R.drawable.breakfast, "Nama Restoran 4", 4.5f),
            Restaurant(R.drawable.breakfast, "Nama Restoran 5", 4.5f)
            // Tambahkan lebih banyak restoran sesuai kebutuhan
        )
    }
}