package com.samples.manish.provides

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProvideViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    fun callApiRepo(): String {
        val response = repository.getData()
        Log.d("Manish", "response received in provide vm: - " + response)
        return response
    }
}