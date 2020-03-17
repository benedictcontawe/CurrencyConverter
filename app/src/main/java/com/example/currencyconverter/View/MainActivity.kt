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
import com.example.currencyconverter.Model.Room.Table.CurrencyTable
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

        setEventListeners()
        setLiveDataObservers()

        viewModel.readGSON()
    }

    private fun setLiveDataObservers(){

        viewModel.getCurrency().observe(this, object : Observer<List<CurrencyTable>> {
            override fun onChanged(data: List<CurrencyTable>) {
                //You have converted [fromAmount] [fromCurrency] to [toAmount] [toCurrency]. Commission Fee - 0.70 [fromCurrency].
                binding.tvStatus.setText("You have converted " +
                        "${data[0].fromAmount} " +
                        "${data[0].fromCurrency} " +
                        "to " +
                        "${data[0].toAmount} " +
                        "${data[0].toCurrency}" +
                        ". Commission Fee - 0.70 [fromCurrency].")
                Toast.makeText(this@MainActivity, "Converted!", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun setEventListeners() {
        binding.btnConvert.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            binding.btnConvert.id -> {
                viewModel.requestCurrency(binding.etAmount.text.toString(),binding.spinnerFromCurrency.selectedItem.toString(),binding.spinnerToCurrency.selectedItem.toString())
            }
        }
    }
}
