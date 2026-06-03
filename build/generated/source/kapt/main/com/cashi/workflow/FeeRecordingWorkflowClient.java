package com.cashi.workflow;

import dev.restate.sdk.CallDurableFuture;
import dev.restate.sdk.Context;
import dev.restate.sdk.common.StateKey;
import dev.restate.serde.Serde;
import dev.restate.common.Target;
import java.util.Optional;
import java.time.Duration;
import java.util.function.Consumer;

public class FeeRecordingWorkflowClient {

    public static ContextClient fromContext(Context ctx, String key) {
        return new ContextClient(ctx, key);
    }

    public static IngressClient fromClient(dev.restate.client.Client client, String key) {
        return new IngressClient(client, key);
    }

    public static IngressClient connect(String baseUri, String key) {
        return new IngressClient(dev.restate.client.Client.connect(baseUri, FeeRecordingWorkflowHandlers.Metadata.SERDE_FACTORY), key);
    }

    public static IngressClient connect(String baseUri, dev.restate.client.RequestOptions requestOptions, String key) {
        return new IngressClient(dev.restate.client.Client.connect(baseUri, FeeRecordingWorkflowHandlers.Metadata.SERDE_FACTORY, requestOptions), key);
    }

    public static class ContextClient {

        private final Context ctx;
        private final String key;

        public ContextClient(Context ctx, String key) {
            this.ctx = ctx;
            this.key = key;
        }

        
        public CallDurableFuture<com.cashi.ledger.LedgerTransferResult> run(com.cashi.workflow.RecordFeeCommand req) {
            return this.ctx.call(
                FeeRecordingWorkflowHandlers.run(this.key, req)
            );
        }

        public CallDurableFuture<com.cashi.ledger.LedgerTransferResult> run(com.cashi.workflow.RecordFeeCommand req, Consumer<dev.restate.common.RequestBuilder<com.cashi.workflow.RecordFeeCommand, com.cashi.ledger.LedgerTransferResult>> requestBuilderApplier) {
            var reqBuilder = FeeRecordingWorkflowHandlers.run(this.key, req);
            if (requestBuilderApplier != null) {
                requestBuilderApplier.accept(reqBuilder);
            }
            return this.ctx.call(reqBuilder);
        }
        

        public Send send() {
            return new Send();
        }

        public class Send {

            
            public dev.restate.sdk.InvocationHandle<com.cashi.ledger.LedgerTransferResult> run(com.cashi.workflow.RecordFeeCommand req) {
                return ContextClient.this.ctx.send(
                    FeeRecordingWorkflowHandlers.run(ContextClient.this.key, req)
                );
            }
            public dev.restate.sdk.InvocationHandle<com.cashi.ledger.LedgerTransferResult> run(com.cashi.workflow.RecordFeeCommand req, Consumer<dev.restate.common.RequestBuilder<com.cashi.workflow.RecordFeeCommand, com.cashi.ledger.LedgerTransferResult>> requestBuilderApplier) {
                var reqBuilder = FeeRecordingWorkflowHandlers.run(ContextClient.this.key, req);
                if (requestBuilderApplier != null) {
                    requestBuilderApplier.accept(reqBuilder);
                }
                return ContextClient.this.ctx.send(reqBuilder);
            }
            public dev.restate.sdk.InvocationHandle<com.cashi.ledger.LedgerTransferResult> run(com.cashi.workflow.RecordFeeCommand req, Duration delay) {
                return ContextClient.this.ctx.send(
                    FeeRecordingWorkflowHandlers.run(ContextClient.this.key, req), delay
                );
            }
            public dev.restate.sdk.InvocationHandle<com.cashi.ledger.LedgerTransferResult> run(com.cashi.workflow.RecordFeeCommand req, Duration delay, Consumer<dev.restate.common.RequestBuilder<com.cashi.workflow.RecordFeeCommand, com.cashi.ledger.LedgerTransferResult>> requestBuilderApplier) {
                var reqBuilder = FeeRecordingWorkflowHandlers.run(ContextClient.this.key, req);
                if (requestBuilderApplier != null) {
                    requestBuilderApplier.accept(reqBuilder);
                }
                return ContextClient.this.ctx.send(reqBuilder, delay);
            }
            
        }
    }

    public static class IngressClient {

        private final dev.restate.client.Client client;
        private final String key;

        public IngressClient(dev.restate.client.Client client, String key) {
            this.client = client;
            this.key = key;
        }

        
        public dev.restate.client.Client.WorkflowHandle<com.cashi.ledger.LedgerTransferResult> workflowHandle() {
            return IngressClient.this.client.workflowHandle(
                FeeRecordingWorkflowHandlers.Metadata.SERVICE_NAME,
                this.key,
                FeeRecordingWorkflowHandlers.Metadata.Serde.RUN_OUTPUT);
        }

        public dev.restate.client.SendResponse<com.cashi.ledger.LedgerTransferResult> submit(com.cashi.workflow.RecordFeeCommand req) {
            return IngressClient.this.client.send(
                FeeRecordingWorkflowHandlers.run(this.key, req)
            );
        }

        public dev.restate.client.SendResponse<com.cashi.ledger.LedgerTransferResult> submit(com.cashi.workflow.RecordFeeCommand req, Duration delay) {
            return IngressClient.this.client.send(
                FeeRecordingWorkflowHandlers.run(this.key, req), delay
            );
        }

        public dev.restate.client.SendResponse<com.cashi.ledger.LedgerTransferResult> submit(com.cashi.workflow.RecordFeeCommand req, Consumer<dev.restate.common.RequestBuilder<com.cashi.workflow.RecordFeeCommand, com.cashi.ledger.LedgerTransferResult>> requestBuilderApplier) {
            var reqBuilder = FeeRecordingWorkflowHandlers.run(this.key, req);
            if (requestBuilderApplier != null) {
                requestBuilderApplier.accept(reqBuilder);
            }
            return IngressClient.this.client.send(reqBuilder);
        }

        public dev.restate.client.SendResponse<com.cashi.ledger.LedgerTransferResult> submit(com.cashi.workflow.RecordFeeCommand req, Duration delay, Consumer<dev.restate.common.RequestBuilder<com.cashi.workflow.RecordFeeCommand, com.cashi.ledger.LedgerTransferResult>> requestBuilderApplier) {
            var reqBuilder = FeeRecordingWorkflowHandlers.run(this.key, req);
            if (requestBuilderApplier != null) {
                requestBuilderApplier.accept(reqBuilder);
            }
            return IngressClient.this.client.send(reqBuilder, delay);
        }

        public java.util.concurrent.CompletableFuture<dev.restate.client.SendResponse<com.cashi.ledger.LedgerTransferResult>> submitAsync(com.cashi.workflow.RecordFeeCommand req) {
            return IngressClient.this.client.sendAsync(
                FeeRecordingWorkflowHandlers.run(this.key, req)
            );
        }

        public java.util.concurrent.CompletableFuture<dev.restate.client.SendResponse<com.cashi.ledger.LedgerTransferResult>> submitAsync(com.cashi.workflow.RecordFeeCommand req,  Duration delay) {
            return IngressClient.this.client.sendAsync(
                FeeRecordingWorkflowHandlers.run(this.key, req), delay
            );
        }

        public java.util.concurrent.CompletableFuture<dev.restate.client.SendResponse<com.cashi.ledger.LedgerTransferResult>> submitAsync(com.cashi.workflow.RecordFeeCommand req, Consumer<dev.restate.common.RequestBuilder<com.cashi.workflow.RecordFeeCommand, com.cashi.ledger.LedgerTransferResult>> requestBuilderApplier) {
            var reqBuilder = FeeRecordingWorkflowHandlers.run(this.key, req);
            if (requestBuilderApplier != null) {
                requestBuilderApplier.accept(reqBuilder);
            }
            return IngressClient.this.client.sendAsync(reqBuilder);
        }

        public java.util.concurrent.CompletableFuture<dev.restate.client.SendResponse<com.cashi.ledger.LedgerTransferResult>> submitAsync(com.cashi.workflow.RecordFeeCommand req, Duration delay, Consumer<dev.restate.common.RequestBuilder<com.cashi.workflow.RecordFeeCommand, com.cashi.ledger.LedgerTransferResult>> requestBuilderApplier) {
            var reqBuilder = FeeRecordingWorkflowHandlers.run(this.key, req);
            if (requestBuilderApplier != null) {
                requestBuilderApplier.accept(reqBuilder);
            }
            return IngressClient.this.client.sendAsync(reqBuilder, delay);
        }
        

        public Send send() {
            return new Send();
        }

        public class Send {

            
        }
    }
}