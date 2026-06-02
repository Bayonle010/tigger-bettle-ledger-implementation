package com.cashi.ledger

import com.tigerbeetle.Client
import com.tigerbeetle.UInt128

object TiggerBeetleClientFactory {
    fun create(): Client {
        val clusterId = UInt128.asBytes(0)
        val addresses = arrayOf("3000")

        return Client(clusterId, addresses)
    }
}