package com.cashi.workflow

import com.cashi.ledger.service.TigerBeetleLedgerService
import dev.restate.sdk.endpoint.Endpoint
import dev.restate.sdk.http.vertx.RestateHttpServer

fun main() {
    val ledgerService = TigerBeetleLedgerService()

    RestateHttpServer.listen(
        Endpoint.bind(
            FeeRecordingWorkflow(ledgerService)
        ),
        9080
    )
}