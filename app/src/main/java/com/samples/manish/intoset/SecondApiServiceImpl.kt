package com.samples.manish.bindOthers.intoset

import javax.inject.Inject

/*
this class is nothing to do with @Binds
Required for @IntoSet in module when multi impl is accepted for ApService
 */
class SecondApiServiceImpl @Inject constructor(): ApiService {
    override fun fetchData(): String {
        return "second api service impl response"
    }
}