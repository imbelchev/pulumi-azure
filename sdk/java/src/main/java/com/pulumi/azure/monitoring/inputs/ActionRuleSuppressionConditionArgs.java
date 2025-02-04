// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.azure.monitoring.inputs.ActionRuleSuppressionConditionAlertContextArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleSuppressionConditionAlertRuleIdArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleSuppressionConditionDescriptionArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleSuppressionConditionMonitorArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleSuppressionConditionMonitorServiceArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleSuppressionConditionSeverityArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleSuppressionConditionTargetResourceTypeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionRuleSuppressionConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionRuleSuppressionConditionArgs Empty = new ActionRuleSuppressionConditionArgs();

    /**
     * A `alert_context` block as defined below.
     * 
     */
    @Import(name="alertContext")
    private @Nullable Output<ActionRuleSuppressionConditionAlertContextArgs> alertContext;

    /**
     * @return A `alert_context` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleSuppressionConditionAlertContextArgs>> alertContext() {
        return Optional.ofNullable(this.alertContext);
    }

    /**
     * A `alert_rule_id` block as defined below.
     * 
     */
    @Import(name="alertRuleId")
    private @Nullable Output<ActionRuleSuppressionConditionAlertRuleIdArgs> alertRuleId;

    /**
     * @return A `alert_rule_id` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleSuppressionConditionAlertRuleIdArgs>> alertRuleId() {
        return Optional.ofNullable(this.alertRuleId);
    }

    /**
     * A `description` block as defined below.
     * 
     */
    @Import(name="description")
    private @Nullable Output<ActionRuleSuppressionConditionDescriptionArgs> description;

    /**
     * @return A `description` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleSuppressionConditionDescriptionArgs>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A `monitor` block as defined below.
     * 
     */
    @Import(name="monitor")
    private @Nullable Output<ActionRuleSuppressionConditionMonitorArgs> monitor;

    /**
     * @return A `monitor` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleSuppressionConditionMonitorArgs>> monitor() {
        return Optional.ofNullable(this.monitor);
    }

    /**
     * A `monitor_service` as block defined below.
     * 
     */
    @Import(name="monitorService")
    private @Nullable Output<ActionRuleSuppressionConditionMonitorServiceArgs> monitorService;

    /**
     * @return A `monitor_service` as block defined below.
     * 
     */
    public Optional<Output<ActionRuleSuppressionConditionMonitorServiceArgs>> monitorService() {
        return Optional.ofNullable(this.monitorService);
    }

    /**
     * A `severity` block as defined below.
     * 
     */
    @Import(name="severity")
    private @Nullable Output<ActionRuleSuppressionConditionSeverityArgs> severity;

    /**
     * @return A `severity` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleSuppressionConditionSeverityArgs>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * A `target_resource_type` block as defined below.
     * 
     */
    @Import(name="targetResourceType")
    private @Nullable Output<ActionRuleSuppressionConditionTargetResourceTypeArgs> targetResourceType;

    /**
     * @return A `target_resource_type` block as defined below.
     * 
     */
    public Optional<Output<ActionRuleSuppressionConditionTargetResourceTypeArgs>> targetResourceType() {
        return Optional.ofNullable(this.targetResourceType);
    }

    private ActionRuleSuppressionConditionArgs() {}

    private ActionRuleSuppressionConditionArgs(ActionRuleSuppressionConditionArgs $) {
        this.alertContext = $.alertContext;
        this.alertRuleId = $.alertRuleId;
        this.description = $.description;
        this.monitor = $.monitor;
        this.monitorService = $.monitorService;
        this.severity = $.severity;
        this.targetResourceType = $.targetResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionRuleSuppressionConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionRuleSuppressionConditionArgs $;

        public Builder() {
            $ = new ActionRuleSuppressionConditionArgs();
        }

        public Builder(ActionRuleSuppressionConditionArgs defaults) {
            $ = new ActionRuleSuppressionConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertContext A `alert_context` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder alertContext(@Nullable Output<ActionRuleSuppressionConditionAlertContextArgs> alertContext) {
            $.alertContext = alertContext;
            return this;
        }

        /**
         * @param alertContext A `alert_context` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder alertContext(ActionRuleSuppressionConditionAlertContextArgs alertContext) {
            return alertContext(Output.of(alertContext));
        }

        /**
         * @param alertRuleId A `alert_rule_id` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder alertRuleId(@Nullable Output<ActionRuleSuppressionConditionAlertRuleIdArgs> alertRuleId) {
            $.alertRuleId = alertRuleId;
            return this;
        }

        /**
         * @param alertRuleId A `alert_rule_id` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder alertRuleId(ActionRuleSuppressionConditionAlertRuleIdArgs alertRuleId) {
            return alertRuleId(Output.of(alertRuleId));
        }

        /**
         * @param description A `description` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<ActionRuleSuppressionConditionDescriptionArgs> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A `description` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder description(ActionRuleSuppressionConditionDescriptionArgs description) {
            return description(Output.of(description));
        }

        /**
         * @param monitor A `monitor` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitor(@Nullable Output<ActionRuleSuppressionConditionMonitorArgs> monitor) {
            $.monitor = monitor;
            return this;
        }

        /**
         * @param monitor A `monitor` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitor(ActionRuleSuppressionConditionMonitorArgs monitor) {
            return monitor(Output.of(monitor));
        }

        /**
         * @param monitorService A `monitor_service` as block defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitorService(@Nullable Output<ActionRuleSuppressionConditionMonitorServiceArgs> monitorService) {
            $.monitorService = monitorService;
            return this;
        }

        /**
         * @param monitorService A `monitor_service` as block defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitorService(ActionRuleSuppressionConditionMonitorServiceArgs monitorService) {
            return monitorService(Output.of(monitorService));
        }

        /**
         * @param severity A `severity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<ActionRuleSuppressionConditionSeverityArgs> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity A `severity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder severity(ActionRuleSuppressionConditionSeverityArgs severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param targetResourceType A `target_resource_type` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceType(@Nullable Output<ActionRuleSuppressionConditionTargetResourceTypeArgs> targetResourceType) {
            $.targetResourceType = targetResourceType;
            return this;
        }

        /**
         * @param targetResourceType A `target_resource_type` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceType(ActionRuleSuppressionConditionTargetResourceTypeArgs targetResourceType) {
            return targetResourceType(Output.of(targetResourceType));
        }

        public ActionRuleSuppressionConditionArgs build() {
            return $;
        }
    }

}
