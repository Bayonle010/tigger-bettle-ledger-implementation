package com.cashi.workflow;

@SuppressWarnings("unchecked")
public final class FeeRecordingWorkflowHandlers {

    private FeeRecordingWorkflowHandlers() {}

    
    public static dev.restate.common.WorkflowRequestBuilder<com.cashi.workflow.RecordFeeCommand, com.cashi.ledger.LedgerTransferResult> run(String key, com.cashi.workflow.RecordFeeCommand req) {
    return (dev.restate.common.WorkflowRequestBuilder) dev.restate.common.Request.of(
            dev.restate.common.Target.workflow(FeeRecordingWorkflowHandlers.Metadata.SERVICE_NAME, key, "run"),
            FeeRecordingWorkflowHandlers.Metadata.Serde.RUN_INPUT,
            FeeRecordingWorkflowHandlers.Metadata.Serde.RUN_OUTPUT,
            req);
    }

    

    public final static class Metadata {

        public static final String SERVICE_NAME = "FeeRecordingWorkflow";
        public static final dev.restate.serde.SerdeFactory SERDE_FACTORY = new dev.restate.serde.jackson.JacksonSerdeFactory();

        private Metadata() {}

        public final static class Serde {
            
                public static final dev.restate.serde.Serde<com.cashi.workflow.RecordFeeCommand> RUN_INPUT = SERDE_FACTORY.create(dev.restate.serde.TypeTag.of(new dev.restate.serde.TypeRef<com.cashi.workflow.RecordFeeCommand>() {}));
                public static final dev.restate.serde.Serde<com.cashi.ledger.LedgerTransferResult> RUN_OUTPUT = SERDE_FACTORY.create(dev.restate.serde.TypeTag.of(new dev.restate.serde.TypeRef<com.cashi.ledger.LedgerTransferResult>() {}));
            

            private Serde() {}
        }

    }
}