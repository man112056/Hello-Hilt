package com.samples.manish.bind

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BindViewModel @Inject constructor(
    private val bindRepository: BindRepository
) : ViewModel() {

    fun makeApiCall(): String {
        Log.d("Manish", "viewmodel ")
        val response = bindRepository.getData()
        Log.d("Manish", "response from viewmodel: "+response)
        return response
    }
}
