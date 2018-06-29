package com.example.user.ionstarwarsexercise.charactersActivity.charactersactivity.retrofit

import com.example.user.ionstarwarsexercise.charactersActivity.charactersactivity.constants.Constants
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitObj {


      val api:Api
    get(){
        val intercepter = HttpLoggingInterceptor()
        intercepter.level = HttpLoggingInterceptor.Level.BODY

        val client = OkHttpClient()
                .newBuilder()
                .connectTimeout(Constants.REQUEST_TIMEOUT,TimeUnit.SECONDS)
                .readTimeout(Constants.REQUEST_TIMEOUT,TimeUnit.SECONDS)
                .writeTimeout(Constants.REQUEST_TIMEOUT,TimeUnit.SECONDS)
                .addInterceptor(intercepter)
                .build()

        val retrofit=  Retrofit.Builder()
                .baseUrl(Constants.STARWARS_BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        return  retrofit.create(Api::class.java)

    }
}