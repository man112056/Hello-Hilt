package com.samples.manish.simple

import javax.inject.Inject

class SimpleApiService @Inject constructor(){

    fun fetchData(): String{
        return "----some random json based on simple api service----"
    }
}