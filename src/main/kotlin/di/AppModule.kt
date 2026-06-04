package di

import com.cashi.ledger.service.LedgerService
import com.cashi.ledger.service.TigerBeetleLedgerService
import com.cashi.workflow.FeeRecordingWorkflowExecutor
import com.cashi.workflow.RestateFeeRecordingWorkflowClient
import org.koin.dsl.module
import service.FeeCalculator
import service.IdempotencyStore
import service.TransactionFeeService

val appModule = module {
    single { FeeCalculator() }
    single { IdempotencyStore() }
    single<LedgerService> { TigerBeetleLedgerService() }
    single<FeeRecordingWorkflowExecutor> {
        RestateFeeRecordingWorkflowClient(
            restateBaseUrl = System.getenv("RESTATE_BASE_URL") ?: "http://localhost:8080"
        )
    }
    single { TransactionFeeService(feeCalculator = get(), workflowExecutor = get ()) }
}