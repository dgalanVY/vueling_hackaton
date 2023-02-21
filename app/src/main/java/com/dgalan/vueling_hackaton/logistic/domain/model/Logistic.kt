package com.dgalan.vueling_hackaton.logistic.domain.model

import com.dgalan.vueling_hackaton.logistic.data.model.LogisticDto

data class LogisticResult(
    val result: List<Logistic>,
    val errors: String,
    val isOk: Boolean
)

data class Logistic(
    val day: String,
    val hour: Int,
    val handlingFunction: String,
    val fullTimeEmployees: Int,
    val partTimeEmployees: Int,
    val totalEmployees: Int,
    val fullTimeCost: Double,
    val partTimeCost: Int,
    val totalCost: Double
)