package com.giselle.imc_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.giselle.imc_app.databinding.ActivityImcDetailsBinding

class ImcDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImcDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImcDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()

    }

    private fun initListeners() {
        binding.btnClose.setOnClickListener {
            finish()
        }

    }
}