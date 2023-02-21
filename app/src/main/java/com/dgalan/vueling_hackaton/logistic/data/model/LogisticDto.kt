package com.dgalan.vueling_hackaton.logistic.data.model

data class LogisticResultDto(
    val result: List<LogisticDto>,
    val errors: String,
    val isOk: Boolean
)

data class LogisticDto(
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