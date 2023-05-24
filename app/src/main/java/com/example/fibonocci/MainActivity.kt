package com.example.fibonocci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fibonocci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayNumberList()
    }
    fun displayNumberList(): List<Int>{
        val number= mutableListOf(0,1)
        for (i in 2..100 ){
            number.add(number[i-1] + number[i-2])
        }
        return number.take(100)



    }

}