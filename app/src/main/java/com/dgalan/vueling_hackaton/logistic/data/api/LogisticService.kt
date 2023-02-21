package com.dgalan.vueling_hackaton.logistic.data.api

import com.dgalan.vueling_hackaton.logistic.data.model.LogisticResultDto
import retrofit2.Response
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface LogisticService {

    @Headers("authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiVnVlbGluZ0VtcGxveWVlVXNlciIsImh0dHA6Ly9zY2hlbWFzLnhtbHNvYXAub3JnL3dzLzIwMDUvMDUvaWRlbnRpdHkvY2xhaW1zL2VtYWlsYWRkcmVzcyI6InRlc3RAdnVlbGluZ2VtcGxveWVlLmNvbSIsImp0aSI6ImJmNWIxNzdiLWEwMGUtNDFkMi1iNDdiLTRmZjVmZmJkY2Y5MyIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvcm9sZSI6IlVzZXIiLCJleHAiOjE2NzcwMTYzMjYsImlzcyI6Imh0dHA6Ly9sb2NhbGhvc3Q6NTAwMSIsImF1ZCI6Imh0dHA6Ly9sb2NhbGhvc3Q6NDIwMCJ9.9YdXq6VlZy0xcnzQy9au3UFCU08oHxQG6oLYwTXPyP8")
    @POST("/Handling")
    suspend fun getLogisticList(@Query("startDate") startDate: String = "2023/02/21", @Query("endDate") endDate: String = "2023/02/21"): Response<LogisticResultDto?>
}