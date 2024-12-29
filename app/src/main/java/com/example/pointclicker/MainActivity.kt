package com.example.pointclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pointclicker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var score:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnClickMe.setOnClickListener {
            score++
            binding.tvScore.text="Score :$score"
        }



    }
}