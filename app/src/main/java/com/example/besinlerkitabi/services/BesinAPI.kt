package com.example.besinlerkitabi.services

import com.example.besinlerkitabi.model.Besin
import io.reactivex.Single
import retrofit2.http.GET

interface BesinAPI {
    //https://github.com/atilsamancioglu/BTK20-JSONVeriSeti/blob/master/besinler.json
    @GET("atilsamancioglu/BTK20-JSONVeriSeti/master/besinler.json")
    fun getBesin():Single<List<Besin>>
}