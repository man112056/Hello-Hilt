package com.samples.manish.provides

import javax.inject.Inject

class Repository @Inject constructor(
    private val apiService: ApiService
) {

    fun getData(): String {
        return apiService.fetchData()
    }
}