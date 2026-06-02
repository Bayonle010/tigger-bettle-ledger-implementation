package com.cashi.ledger.mapper

import java.nio.ByteBuffer
import java.util.UUID

object TigerBeetleIdMapper {

    fun fromUuid(uuid: UUID): ByteArray {
        return ByteBuffer
            .allocate(16)
            .putLong(uuid.mostSignificantBits)
            .putLong(uuid.leastSignificantBits)
            .array()
    }
}