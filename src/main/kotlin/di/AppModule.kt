package di

import org.koin.dsl.module
import service.FeeCalculator
import service.IdempotencyStore
import service.TransactionFeeService

val appModule = module {
    single { FeeCalculator() }
    single { IdempotencyStore() }
    single { TransactionFeeService(get()) }
}