package com.samples.manish.bind

import android.util.Log
import javax.inject.Inject

class BindRepository @Inject constructor(private val apiService: ApiService) {

    fun getData(): String{
        /*
        here apiService is initalised using its implementation class.
        OOPs concept - inheritance
         */
        Log.d("Manish", "repo: ")
        val response = apiService.fetchData()
        return response
    }
}