package com.cashi.workflow

import com.cashi.ledger.service.TigerBeetleLedgerService
import dev.restate.sdk.http.vertx.RestateHttpServer
import dev.restate.sdk.endpoint.Endpoint

fun main() {
    val ledgerService = TigerBeetleLedgerService()

    RestateHttpServer.listen(
        Endpoint.bind(
            FeeRecordingWorkflow(ledgerService)
        )
    )
}