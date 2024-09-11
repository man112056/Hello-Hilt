package com.samples.manish.mix

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object LoggerModule {

    @Provides
    fun provideLogger(): Logger {
        return Logger()
    }
}
