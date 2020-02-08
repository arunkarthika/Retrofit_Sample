package com.blive.retrofit_sample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.blive.retrofit_sample.Presenter.Presenter

class MainActivity : AppCompatActivity(),mvpviews.f1 {
    lateinit var  presenter:Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter= Presenter(this)
        presenter.sendlivedata("Hi Vishnu","tysyhfghfg")
    }

    override fun onc(gdh: String) {
        Toast.makeText(this,gdh,Toast.LENGTH_LONG).show()

    }
}