package com.zharfan.belajardicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.zharfan.belajardicoding.databinding.ActivityMoveBinding

class MoveActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMoveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}