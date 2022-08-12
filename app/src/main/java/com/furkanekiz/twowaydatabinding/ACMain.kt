package com.furkanekiz.twowaydatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.furkanekiz.twowaydatabinding.databinding.AcMainBinding

class ACMain : AppCompatActivity() {

    private lateinit var binding: AcMainBinding
    private lateinit var viewModel: ACMainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.ac_main)
        viewModel = ViewModelProvider(this)[(ACMainViewModel::class.java)]
        binding.viewModel = viewModel

        binding.lifecycleOwner = this


    }
}