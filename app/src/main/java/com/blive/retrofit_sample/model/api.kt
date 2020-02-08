package com.blive.retrofit_sample.model

import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query

interface api {
    @POST("profile")
    fun getProfile(@Query("user_id") user_id: String?, @Query("follower_id") followerId: String?): Call<accountmodel>

}