package com.example.exan4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.exan4.databinding.ActivityMainBinding
import com.example.exan4.databinding.FragmentMessageBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: FragmentMessageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}