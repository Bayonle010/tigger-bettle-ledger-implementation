package com.cashi.ledger

fun main() {
    println("Initializing TigerBeetle ledger accounts...")

    LedgerAccountInitializer().initialize()

    println("Ledger initialization completed.")
}