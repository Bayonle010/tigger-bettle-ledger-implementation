package com.cashi.ledger.service

import com.cashi.ledger.TigerBeetleClientFactory

class TigerBeetleHealthService {

    fun ping() {
        TigerBeetleClientFactory.create().use { client ->
            println("Successfully connected to TigerBeetle")
        }
    }
}