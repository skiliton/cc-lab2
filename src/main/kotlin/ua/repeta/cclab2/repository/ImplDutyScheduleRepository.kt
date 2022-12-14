package ua.repeta.cclab2.repository

import org.springframework.stereotype.Repository
import ua.repeta.cclab2.model.DutySchedule
import java.time.DayOfWeek
import java.time.Instant
import java.util.*

@Repository
class ImplDutyScheduleRepository : DutyScheduleRepository {

    private val storage = Collections.synchronizedMap(mutableMapOf<UUID, DutySchedule>())

    override fun create(dutySchedule: DutySchedule): DutySchedule {
        return storage.putIfAbsent(dutySchedule.id, dutySchedule) ?: dutySchedule
    }

    override fun removeById(id: UUID): DutySchedule? {
        return storage.remove(id)
    }

    override fun getAll(): List<DutySchedule> {
        return storage.values.toList()
    }

    override fun update(
        id: UUID,
        name: String?,
        surname: String?,
        description: String?,
        schedule: Map<DayOfWeek, Pair<Instant, Instant>>?
    ): DutySchedule? {
        return storage.computeIfPresent(id) { uuid, dutySchedule ->
            name?.let { dutySchedule.name = it }
            surname?.let { dutySchedule.surname = it }
            description?.let { dutySchedule.description = it }
            schedule?.let { dutySchedule.schedule = it }
            dutySchedule
        }
    }
}
