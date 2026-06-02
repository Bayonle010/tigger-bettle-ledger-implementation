package di

import com.cashi.ledger.service.LedgerService
import com.cashi.ledger.service.TigerBeetleLedgerService
import org.koin.dsl.module
import service.FeeCalculator
import service.IdempotencyStore
import service.TransactionFeeService

val appModule = module {
    single { FeeCalculator() }
    single { IdempotencyStore() }
    single<LedgerService> { TigerBeetleLedgerService() }
    single { TransactionFeeService(get(), get ()) }
}