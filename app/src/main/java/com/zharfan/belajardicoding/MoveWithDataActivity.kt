package com.zharfan.belajardicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.zharfan.belajardicoding.databinding.ActivityMoveWithDataBinding

class MoveWithDataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMoveWithDataBinding

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveWithDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getData()
    }

    private fun getData() = with(binding) {

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)

        val tvDataReceived: TextView = tvDataReceived

        val text = "Nama Saya $name , dan umur $age"
        tvDataReceived.text = text

    }
}