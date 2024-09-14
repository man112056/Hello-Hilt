package com.samples.manish.bindOthers.intoset

import android.util.Log
import javax.inject.Inject

class ApiServiceImpl @Inject constructor() : ApiService {
    override fun fetchData(): String {
        Log.d("Manish", "impl base")
        val response = "some random response form api for bind hilt"
        return response
    }
}