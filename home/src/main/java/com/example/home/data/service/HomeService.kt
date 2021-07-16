package com.example.home.data.service

import com.example.home.data.model.HomeModel
import retrofit2.Response
import retrofit2.http.GET

interface HomeService {
    @GET("Home")
    suspend fun getHomeModel(): Response<HomeModel>
}