package com.example.home.usecase

import com.example.home.data.model.HomeModel

interface GetHomeUseCase {
    suspend fun invoke(): HomeModel
}