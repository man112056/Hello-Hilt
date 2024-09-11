package com.samples.manish.simple

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SimpleViewModel @Inject constructor(
    private val repository: SimpleRepository
) : ViewModel() {

    fun makeSimpleApiCall() {
        val response = repository.callSimpleApi()
        Log.d("Manish", "In viewmodel data received from simple api"+response)
    }
}