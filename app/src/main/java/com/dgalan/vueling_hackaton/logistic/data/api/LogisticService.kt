package com.dgalan.vueling_hackaton.logistic.data.api

import com.dgalan.vueling_hackaton.logistic.data.model.LogisticResultDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LogisticService {

    @GET("people")
    suspend fun getLogisticList(@Query("page") page: Int = 1): Response<LogisticResultDto?> //TODO(api)
}