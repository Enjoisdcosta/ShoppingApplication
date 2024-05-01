package com.example.shoppingapplication.data.api

import com.example.shoppingapplication.data.model.dogfact.DogFactModel
import retrofit2.http.GET

interface ApiEndpoints {

    @GET(ApiDetail.DOG_FACT_ENDPOINT)
    suspend fun getDogFacts(): DogFactModel


    interface ApiService {
        @GET("your_endpoint")
        suspend fun getFoodData():FoodData

    }


}