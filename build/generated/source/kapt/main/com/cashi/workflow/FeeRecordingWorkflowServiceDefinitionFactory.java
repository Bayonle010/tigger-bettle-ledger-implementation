package com.cashi.workflow;

public class FeeRecordingWorkflowServiceDefinitionFactory implements dev.restate.sdk.endpoint.definition.ServiceDefinitionFactory<com.cashi.workflow.FeeRecordingWorkflow> {

    @java.lang.Override
    public dev.restate.sdk.endpoint.definition.ServiceDefinition create(com.cashi.workflow.FeeRecordingWorkflow bindableService, dev.restate.sdk.endpoint.definition.HandlerRunner.Options overrideHandlerOptions) {
        dev.restate.sdk.HandlerRunner.Options handlerRunnerOptions = dev.restate.sdk.HandlerRunner.Options.DEFAULT;
        if (overrideHandlerOptions != null) {
            if (overrideHandlerOptions instanceof dev.restate.sdk.HandlerRunner.Options) {
                handlerRunnerOptions = (dev.restate.sdk.HandlerRunner.Options)overrideHandlerOptions;
            } else {
                throw new IllegalArgumentException("The provided options class MUST be instance of dev.restate.sdk.HandlerRunner.Options, but was " + overrideHandlerOptions.getClass());
            }
        }
        return dev.restate.sdk.endpoint.definition.ServiceDefinition.of(
            FeeRecordingWorkflowHandlers.Metadata.SERVICE_NAME,
            dev.restate.sdk.endpoint.definition.ServiceType.WORKFLOW,
            java.util.List.of(
            
                dev.restate.sdk.endpoint.definition.HandlerDefinition.of(
                "run",
                dev.restate.sdk.endpoint.definition.HandlerType.WORKFLOW,
                FeeRecordingWorkflowHandlers.Metadata.Serde.RUN_INPUT,
                FeeRecordingWorkflowHandlers.Metadata.Serde.RUN_OUTPUT,
                dev.restate.sdk.HandlerRunner.of(bindableService::run, FeeRecordingWorkflowHandlers.Metadata.SERDE_FACTORY, handlerRunnerOptions)
                )
            
            )
        );
    }

    @java.lang.Override
    public boolean supports(Object serviceObject) {
        return serviceObject instanceof com.cashi.workflow.FeeRecordingWorkflow;
    }
}