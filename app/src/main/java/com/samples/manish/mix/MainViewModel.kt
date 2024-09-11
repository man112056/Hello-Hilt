package com.samples.manish.mix

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val analyticsService: AnalyticsService
) : ViewModel() {

    fun trackUserInteraction() {
        analyticsService.logEvent("User Interaction")
    }
}
