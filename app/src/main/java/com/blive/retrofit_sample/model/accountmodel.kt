package com.blive.retrofit_sample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class accountmodel {
    @SerializedName("status")
    @Expose
    var status: String? = null

}