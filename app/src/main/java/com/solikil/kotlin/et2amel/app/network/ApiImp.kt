package com.solikil.kotlin.et2amel.app.network

import javax.inject.Inject
import okhttp3.OkHttpClient

class ApiImp @Inject constructor(
    private val okHttpClient: OkHttpClient
) : Api {

    override fun getFiles() {
        // TO DO("Not yet implemented")
    }
}
