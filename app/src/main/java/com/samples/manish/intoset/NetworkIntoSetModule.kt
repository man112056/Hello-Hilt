package com.samples.manish.bindOthers.intoset

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
abstract class ApiServiceModule {

    @Binds
    @IntoSet
    abstract fun bindFirstApiService(firstApiService: ApiServiceImpl): ApiService

    @Binds
    @IntoSet
    abstract fun bindSecondApiService(secondApiService: SecondApiServiceImpl): ApiService
}
