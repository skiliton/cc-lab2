package ua.repeta.cclab2.repository

import ua.repeta.cclab2.model.DutySchedule
import java.time.DayOfWeek
import java.time.Instant
import java.util.*

interface DutyScheduleRepository {
    fun create(dutySchedule: DutySchedule): DutySchedule
    fun removeById(id: UUID): DutySchedule?
    fun getAll(): List<DutySchedule>
    fun update(
        id: UUID,
        name: String? = null,
        surname: String? = null,
        description: String? = null,
        schedule: Map<DayOfWeek, Pair<Instant, Instant>>? = null
    ): DutySchedule?
}
