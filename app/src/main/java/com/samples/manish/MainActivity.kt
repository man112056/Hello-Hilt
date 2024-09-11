package com.samples.manish

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.android.architecture.blueprints.todoapp.R
import com.samples.manish.bind.BindViewModel
import com.samples.manish.mix.MainViewModel
import com.samples.manish.provides.ProvideViewModel
import com.samples.manish.simple.SimpleViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    // ComponentActivity
    private val viewModel: MainViewModel by viewModels()
    private val simpleViewModel: SimpleViewModel by viewModels()
    private val bindViewModel: BindViewModel by viewModels()
    private val provideViewModel: ProvideViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        viewModel.trackUserInteraction()
//        simpleViewModel.makeSimpleApiCall()
//        bindViewModel.makeApiCall()
        provideViewModel.callApiRepo()
    }
}
