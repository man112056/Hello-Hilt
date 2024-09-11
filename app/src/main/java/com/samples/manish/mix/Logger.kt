package com.samples.manish.mix


import javax.inject.Inject

class Logger @Inject constructor() {
    fun log(message: String) {
        println(message)
    }
}
