package com.blive.retrofit_sample.Presenter

import com.blive.retrofit_sample.ApiClientBase
import com.blive.retrofit_sample.model.accountmodel
import com.blive.retrofit_sample.model.api
import com.blive.retrofit_sample.mvpviews
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Presenter(views: mvpviews.f1) : mvpviews.views {
    private var views: mvpviews.f1? = views
    lateinit var apiinterface: api
    override fun sendlivedata(str: String, gdh: String) {
        views!!.onc(str)
        apiinterface=ApiClientBase.client!!.create(api::class.java)
        val call: Call<accountmodel> = apiinterface.getProfile("100002","100001")
        call!!.enqueue(object : Callback<accountmodel?> {
            override fun onResponse(call: Call<accountmodel?>, response: Response<accountmodel?>) {
                views!!.onc(response.message())
            }

            override fun onFailure(call: Call<accountmodel?>, t: Throwable) {
                views!!.onc(t.localizedMessage)
            }

        })


    }


    }
