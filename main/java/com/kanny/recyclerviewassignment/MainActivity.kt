package com.kanny.recyclerviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kanny.recyclerviewassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myregadapter : RegistryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val students : List<NameRegistry> = listOf (
            NameRegistry("Segun", "Odegbami", true),
            NameRegistry("Mary", "Oka", false),
            NameRegistry("Simon", "Dangbana", true),
            NameRegistry("Kachi", "Agada", true)
        )

        myregadapter = RegistryAdapter(students)
        binding.recyclerView.adapter

    }
}