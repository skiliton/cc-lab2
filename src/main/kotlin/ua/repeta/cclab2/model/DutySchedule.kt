package ua.repeta.cclab2.model

import java.time.DayOfWeek
import java.time.Instant
import java.util.*

data class DutySchedule(
    val id: UUID = UUID.randomUUID(),
    var name: String?,
    var surname: String?,
    var description: String?,
    var schedule: Map<DayOfWeek, Pair<Instant, Instant>>?
)
