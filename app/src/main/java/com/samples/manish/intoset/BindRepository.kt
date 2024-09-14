package com.samples.manish.bindOthers.intoset

import android.util.Log
import javax.inject.Inject

class BindRepository @Inject constructor(private val apiServiceSet: Set<@JvmSuppressWildcards ApiService>) {

    fun getDataFromAllService(): String {
        /*
        here apiService is initalised using its implementation class.
        OOPs concept - inheritance
         */
        Log.d("Manish", "repo: ")
        val response = apiServiceSet.joinToString("WHILE") // combing api response coming from both api REAL TIME usage ?? need to check
        return response
    }
}