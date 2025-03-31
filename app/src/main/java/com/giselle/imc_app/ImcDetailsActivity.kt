package com.giselle.imc_app

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.giselle.imc_app.databinding.ActivityImcDetailsBinding

class ImcDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImcDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImcDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()

        val imcResult = intent.getDoubleExtra("IMC_RESULT", 0.0)
        val imcWeight = intent.getDoubleExtra("IMC_WEIGHT", 0.0)
        val imcHeight = intent.getDoubleExtra("IMC_HEIGHT", 0.0)
        val txtImcValue = "IMC: %.2f".format(imcResult)

        binding.txtImcPeso.text = "Peso: ${imcWeight}kg"
        binding.txtImcAltura.text = "Altura: ${imcHeight}M"
        binding.txtImcValue.text = txtImcValue

    }

    private fun initListeners() {
        binding.btnClose.setOnClickListener {
            finish()
        }

    }
}