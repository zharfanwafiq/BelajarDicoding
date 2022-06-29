package com.zharfan.belajardicoding

import android.content.Intent
import android.net.Uri
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

    private fun moveActivity() = with(binding) {
        btnMoveActivity.setOnClickListener {
            startActivity(Intent(this@IntentActivity, MoveActivity::class.java))
        }

        btnMoveActivityWithData.setOnClickListener {
            val sendData = Intent(this@IntentActivity, MoveWithDataActivity::class.java)
                .putExtra(MoveWithDataActivity.EXTRA_NAME, "Zharfan Wafiq")
                .putExtra(MoveWithDataActivity.EXTRA_AGE, 19)
            startActivity(sendData)
        }

        btDialNumber.setOnClickListener{
            val phoneNumber = "082185647869"
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber")))
        }
    }


}