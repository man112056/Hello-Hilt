package com.samples.manish.bind

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class NetworkModule {

    /*
    class MUST BE abstarct if binding is happening for interface
     */

    @Binds
    abstract fun bindApiService(
        apiServiceImpl: ApiServiceImpl
    ): ApiService
}