package com.samples.manish.simple

import javax.inject.Inject

class SimpleRepository @Inject constructor(private val apiService: SimpleApiService) {

    fun callSimpleApi(): String{
        val response = apiService.fetchData()
        return response
    }
}