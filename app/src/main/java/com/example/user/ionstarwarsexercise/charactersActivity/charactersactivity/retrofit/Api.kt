package com.example.user.ionstarwarsexercise.charactersActivity.charactersactivity.retrofit

import com.example.user.ionstarwarsexercise.charactersActivity.charactersactivity.model.repository.BaseClass
import io.reactivex.Observable
import retrofit2.http.GET


interface Api {



    @GET("people")
    fun getStarWarsCharacters(): Observable<BaseClass>
}