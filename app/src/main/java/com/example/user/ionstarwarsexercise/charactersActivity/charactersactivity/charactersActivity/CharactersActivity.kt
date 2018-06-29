package com.example.user.ionstarwarsexercise.charactersActivity.charactersactivity.charactersActivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.user.ionstarwarsexercise.R
import com.example.user.ionstarwarsexercise.charactersActivity.charactersactivity.dagger.AppComponent

class CharactersActivity : AppCompatActivity(), ChareactersContract.ViewCharactersInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as AppComponent).inject(this)
    }
}
