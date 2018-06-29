package com.example.user.ionstarwarsexercise.charactersActivity.charactersactivity.model.repository

import java.util.HashMap

class BaseClass {  // needs to extent realm

    var name: String? = null
    var height: String? = null
    var mass: String? = null
    var hair_color: String? = null
    var skin_color: String? = null
    var eye_color: String? = null
    var birth_year: String? = null
    var gender: String? = null
    var homeworld: String? = null
    var films: List<String>? = null
    var species: List<String>? = null
    var vehicles: List<String>? = null
    var starships: List<String>? = null
    var created: String? = null
    var edited: String? = null
    var url: String? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties[name] = value
    }

}
