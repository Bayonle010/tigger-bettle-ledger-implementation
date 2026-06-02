package com.cashi.ledger

import com.cashi.ledger.service.TigerBeetleHealthService
import io.kotest.core.spec.style.FeatureSpec

class TigerBeetleHealthFeatureTest : FeatureSpec({

    feature("TigerBeetle connectivity") {

        scenario("Connect to local TigerBeetle replica") {

            val service = TigerBeetleHealthService()

            service.ping()
        }
    }
})