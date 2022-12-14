package ua.repeta.cclab2.mapper

import ua.repeta.cclab2.dto.DutyScheduleCreateDto
import ua.repeta.cclab2.dto.DutyScheduleReadDto
import ua.repeta.cclab2.model.DutySchedule

object DutyScheduleDtoMappers {
    fun mapToDutySchedule(original: DutyScheduleCreateDto): DutySchedule {
        return DutySchedule(
            name = original.name,
            surname = original.surname,
            description = original.description,
            schedule = original.schedule,
        )
    }

    fun mapToDutyScheduleReadDto(original: DutySchedule): DutyScheduleReadDto {
        return DutyScheduleReadDto(
            id = original.id,
            name = original.name!!,
            surname = original.surname!!,
            description = original.description!!,
            schedule = original.schedule!!,
        )
    }
}
