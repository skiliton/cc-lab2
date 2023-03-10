package ua.repeta.cclab2.dto

import java.time.DayOfWeek
import java.time.OffsetTime
import java.util.*

class DutyScheduleReadDto(
    val id: UUID,
    val name: String,
    val surname: String,
    val description: String,
    val schedule: Map<DayOfWeek, Pair<OffsetTime, OffsetTime>>
)
