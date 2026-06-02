package com.cashi.ledger

import io.kotest.core.spec.style.FeatureSpec

class LedgerAccountInitializationFeatureTest : FeatureSpec({

    feature("Ledger account initialization") {

        scenario("Create required system accounts in TigerBeetle") {
            LedgerAccountInitializer().initialize()
        }
    }
})