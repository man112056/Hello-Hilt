package com.samples.manish

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class HelloHiltApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}
