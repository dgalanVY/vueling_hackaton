package com.dgalan.vueling_hackaton.common.utils

import com.dgalan.vueling_hackaton.logistic.data.model.LogisticDto
import com.dgalan.vueling_hackaton.logistic.data.model.LogisticResultDto
import com.dgalan.vueling_hackaton.logistic.domain.model.Logistic
import com.dgalan.vueling_hackaton.logistic.domain.model.LogisticResult

fun LogisticResultDto?.toLogisticResult(): LogisticResult =
    LogisticResult(
        this?.result?.toLogistic() ?: emptyList(),
        this?.errors ?: "",
        this?.isOk ?: false
    )

private fun List<LogisticDto>.toLogistic(): List<Logistic> =
    this.map { dto ->
        with(dto) {
            Logistic(
                day,
                hour,
                handlingFunction,
                fullTimeEmployees,
                partTimeEmployees,
                totalEmployees,
                fullTimeCost,
                partTimeCost,
                totalCost
            )
        }
    }
