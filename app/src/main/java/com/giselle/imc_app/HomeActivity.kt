package com.giselle.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.giselle.imc_app.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners() {
        binding.btnCalc.setOnClickListener {
            imcCalc()
        }
    }

    private fun imcCalc() {
        val peso = binding.edtWeight.text.toString()
        val altura = binding.edtHeight.text.toString()
        if(peso.isNotEmpty() && altura.isNotEmpty()) {
            //Toast.makeText(this, "Peso: $peso - Altura: $altura", Toast.LENGTH_SHORT).show()
            val pesoValue = peso.toDouble()
            val alturaValue = altura.toDouble()
            val imcResult = pesoValue/(alturaValue*alturaValue)
            val imcResultText = "Seu IMC é: %.2f".format(imcResult)
            Toast.makeText(this, imcResultText, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Preencha um valor válido", Toast.LENGTH_SHORT).show()
        }


//        val intent = Intent(this, ImcDetailsActivity::class.java)
//        startActivity(intent)
    }


}