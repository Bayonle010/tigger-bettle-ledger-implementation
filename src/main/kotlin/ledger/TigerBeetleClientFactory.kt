package com.cashi.ledger

import com.tigerbeetle.Client
import com.tigerbeetle.UInt128

object TigerBeetleClientFactory {

    fun create(): Client {
        return Client(
            UInt128.asBytes(0),
            arrayOf("127.0.0.1:3000")
        )
    }
}