package com.blive.retrofit_sample

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by sans on 04-04-2019.
 */
object ApiClientBase {
    private val retrofit: Retrofit? = null
    private var retrofit2: Retrofit? = null
    val client: Retrofit?
        get() {
            if (retrofit2 == null) {
                val okHttpClient = OkHttpClient.Builder()
                okHttpClient.addInterceptor { chain: Interceptor.Chain ->
                    val request = chain.request()
                    val newRequest = request.newBuilder().header("Authorization", "Bearer " +"1d264a32eccc")
                    chain.proceed(newRequest.build())
                }
                okHttpClient.readTimeout(15, TimeUnit.SECONDS)
                        .connectTimeout(15, TimeUnit.SECONDS)
                retrofit2 = Retrofit.Builder()
                        .baseUrl("https://stg.sjhinfotech.com/BLive24hrs/api/v12/")
                        .client(okHttpClient.build())
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                return retrofit2
            }
            return retrofit
        }
}