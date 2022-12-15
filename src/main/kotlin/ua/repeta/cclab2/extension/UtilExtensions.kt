package ua.repeta.cclab2.extension

import java.time.OffsetTime
import java.time.ZoneOffset

fun timeOfTheDay(hour: Int, minute: Int) = OffsetTime.of(hour, minute, 0, 0, ZoneOffset.UTC)
