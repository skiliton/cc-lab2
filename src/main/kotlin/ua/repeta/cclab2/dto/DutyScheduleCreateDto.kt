package ua.repeta.cclab2.dto

import java.time.DayOfWeek
import java.time.Instant

data class DutyScheduleCreateDto(
    val name: String,
    val surname: String,
    val description: String,
    val schedule: Map<DayOfWeek, Pair<Instant, Instant>>
)
