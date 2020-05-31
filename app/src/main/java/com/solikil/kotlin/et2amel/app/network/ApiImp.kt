package com.solikil.kotlin.et2amel.app.network

import okhttp3.OkHttpClient
import javax.inject.Inject

class ApiImp @Inject constructor(
    private val okHttpClient: OkHttpClient
) : Api {

    override fun getFiles() {
        //TO DO("Not yet implemented")
    }
}
