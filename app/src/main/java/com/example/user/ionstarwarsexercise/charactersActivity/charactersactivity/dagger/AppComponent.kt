package com.example.user.ionstarwarsexercise.charactersActivity.charactersactivity.dagger

import com.example.user.ionstarwarsexercise.charactersActivity.charactersactivity.charactersActivity.CharactersActivity
import dagger.Component

@Component(modules = arrayOf(AndroidModule::class))
interface AppComponent {

    fun inject(charactersActivity: CharactersActivity)

}