package com.cashi.ledger

class TigerBeetleHealthService {

    fun ping() {
        TigerBeetleClientFactory.create().use { client ->
            println("Successfully connected to TigerBeetle")
        }
    }
}