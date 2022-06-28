package com.zharfan.belajardicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.zharfan.belajardicoding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object

    val STATE_RESULT = "state_result"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClick()
        if (savedInstanceState != null) {
            binding.apply {
                val volume = savedInstanceState.getString(STATE_RESULT)
                tvResult.text = volume
            }
        }
    }

    private fun onClick() = with(binding) {

        btnCalculate.setOnClickListener {
            val inputLength = etLength.text.toString().trim()
            val inputWidth = etWidth.text.toString().trim()
            val inputHeight = etHeight.text.toString().trim()

            when {
                inputLength.isEmpty() -> etLength.error = "Field ini tidak boleh kosong"
                inputWidth.isEmpty() -> etWidth.error = "Field ini tidak boleh kosong"
                inputHeight.isEmpty() -> etHeight.error = "Field ini tidak boleh kosong"
                else -> {
                    val volume =
                        inputLength.toDouble() * inputWidth.toDouble() * inputHeight.toDouble()
                    tvResult.text = volume.toString()
                }
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) =
        with(binding) {
            super.onSaveInstanceState(outState)
            outState.putString(STATE_RESULT, tvResult.text.toString())
        }
}