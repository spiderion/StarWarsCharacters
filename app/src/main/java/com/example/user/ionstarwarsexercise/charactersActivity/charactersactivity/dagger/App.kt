package com.example.user.ionstarwarsexercise.charactersActivity.charactersactivity.dagger

import android.app.Application

class App : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component=   DaggerAppComponent.builder().androidModule(AndroidModule(this)).build()
    }
}