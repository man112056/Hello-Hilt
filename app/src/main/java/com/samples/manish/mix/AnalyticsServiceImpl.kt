package com.samples.manish.mix


import javax.inject.Inject

class AnalyticsServiceImpl @Inject constructor(
    private val logger: Logger
) : AnalyticsService {

    override fun logEvent(eventName: String) {
        logger.log("Event logged: $eventName")
    }
}