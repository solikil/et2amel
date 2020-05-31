package com.solikil.kotlin.et2amel.app.network

import com.solikil.kotlin.et2amel.app.base.dagger.ApplicationScope
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

private const val TIMEOUT_SECONDS = 30L

@Module
class NetworkModule {

    @ApplicationScope
    @Provides
    fun providesHttpClient(): OkHttpClient {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
            .connectTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .writeTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

    @ApplicationScope
    @Provides
    fun providesApi(apiInterface: ApiImp): Api =
        apiInterface
}
