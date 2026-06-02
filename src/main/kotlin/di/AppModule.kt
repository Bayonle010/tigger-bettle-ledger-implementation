package di

import com.cashi.ledger.FakeLedgerService
import com.cashi.ledger.LedgerService
import org.koin.dsl.module
import service.FeeCalculator
import service.IdempotencyStore
import service.TransactionFeeService

val appModule = module {
    single { FeeCalculator() }
    single { IdempotencyStore() }
    single<LedgerService> { FakeLedgerService() }
    single { TransactionFeeService(get(), get ()) }
}