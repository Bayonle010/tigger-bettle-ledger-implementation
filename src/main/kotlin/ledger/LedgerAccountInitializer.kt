package com.cashi.ledger

import com.cashi.ledger.mapper.LedgerAccountCode
import com.cashi.ledger.mapper.LedgerIds
import com.cashi.ledger.service.SystemAccountId
import com.tigerbeetle.AccountBatch
import com.tigerbeetle.AccountFlags
import com.tigerbeetle.CreateAccountStatus

class LedgerAccountInitializer {

    fun initialize() {
        TigerBeetleClientFactory.create().use { client ->
            val accounts = AccountBatch(2)

            accounts.add()
            accounts.setId(SystemAccountId.CUSTOMER_LIABILITY_POOL)
            accounts.setLedger(LedgerIds.USD)
            accounts.setCode(LedgerAccountCode.CUSTOMER_LIABILITY_POOL)
            accounts.setFlags(AccountFlags.NONE)

            accounts.add()
            accounts.setId(SystemAccountId.PLATFORM_FEE_REVENUE)
            accounts.setLedger(LedgerIds.USD)
            accounts.setCode(LedgerAccountCode.PLATFORM_FEE_REVENUE)
            accounts.setFlags(AccountFlags.NONE)

            val results = client.createAccounts(accounts)

            while (results.next()) {
                when (results.getStatus()) {
                    CreateAccountStatus.Created -> {
                        println("Account at ${results.position} created")
                    }

                    CreateAccountStatus.Exists -> {
                        println("Account at ${results.position} already exists")
                    }

                    else -> {
                        error(
                            "Failed to create account at ${results.position}: ${results.getStatus()}"
                        )
                    }
                }
            }
        }
    }
}