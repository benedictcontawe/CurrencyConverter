package com.example.currencyconverter.View

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.currencyconverter.R
import com.example.currencyconverter.MainViewModel
import com.example.currencyconverter.databinding.MainBinder

public class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : MainBinder
    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.setViewModel(viewModel)
    }

    override fun onStart() {
        super.onStart()

        setLiveDataObservers()
        setEventListeners()

        viewModel.readGSON()
    }

    private fun setLiveDataObservers(){
        viewModel.getStatus().observe(this, object : Observer<String> {
            override fun onChanged(data: String?) {
                binding.tvStatus.setText(data?:"null")
            }
        })
    }

    private fun setEventListeners(){
        binding.btnConvert.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            binding.btnConvert.id -> {
                Toast.makeText(this, "CONVERT", Toast.LENGTH_SHORT).show()
                viewModel.requestCurrency(binding.etAmount.text.toString(),binding.spinnerFromCurrency.selectedItem.toString(),binding.spinnerToCurrency.selectedItem.toString())
            }
        }
    }
}
