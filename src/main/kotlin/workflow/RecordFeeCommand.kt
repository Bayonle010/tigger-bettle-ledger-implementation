package com.cashi.workflow

import domain.Fee
import domain.Transaction

data class RecordFeeCommand(
    val transaction: Transaction,
    val fee: Fee
)
