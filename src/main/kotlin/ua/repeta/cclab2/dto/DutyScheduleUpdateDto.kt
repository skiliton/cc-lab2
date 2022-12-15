package ua.repeta.cclab2.dto

import java.time.DayOfWeek
import java.time.OffsetTime

data class DutyScheduleUpdateDto(
    val name: String?,
    val surname: String?,
    val description: String?,
    val schedule: Map<DayOfWeek, Pair<OffsetTime, OffsetTime>>?
)
