package com.zharfan.belajardicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zharfan.belajardicoding.databinding.ActivityIntentBinding

class IntentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        moveActivity()
    }

    private fun moveActivity()= with(binding) {
        btnMoveActivity.setOnClickListener{
            startActivity(Intent(this@IntentActivity,MoveActivity::class.java))
        }
    }


}