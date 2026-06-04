package com.cashi.ledger

import com.tigerbeetle.Client
import com.tigerbeetle.UInt128

object TigerBeetleClientFactory {

    fun create(): Client {
        val address = System.getenv("TIGERBEETLE_ADDRESS") ?: "127.0.0.1:3000"

        return Client(
            UInt128.asBytes(0),
            arrayOf(address)
        )
    }
}