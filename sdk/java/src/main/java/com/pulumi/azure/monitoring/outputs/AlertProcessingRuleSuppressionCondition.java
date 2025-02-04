// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleSuppressionConditionAlertContext;
import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleSuppressionConditionAlertRuleId;
import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleSuppressionConditionAlertRuleName;
import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleSuppressionConditionDescription;
import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleSuppressionConditionMonitorCondition;
import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleSuppressionConditionMonitorService;
import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleSuppressionConditionSeverity;
import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleSuppressionConditionSignalType;
import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleSuppressionConditionTargetResource;
import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleSuppressionConditionTargetResourceGroup;
import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleSuppressionConditionTargetResourceType;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertProcessingRuleSuppressionCondition {
    /**
     * @return A `alert_context` block as defined above.
     * 
     */
    private @Nullable AlertProcessingRuleSuppressionConditionAlertContext alertContext;
    /**
     * @return A `alert_rule_id` block as defined above.
     * 
     */
    private @Nullable AlertProcessingRuleSuppressionConditionAlertRuleId alertRuleId;
    /**
     * @return A `alert_rule_name` block as defined above.
     * 
     */
    private @Nullable AlertProcessingRuleSuppressionConditionAlertRuleName alertRuleName;
    /**
     * @return A `description` block as defined below.
     * 
     */
    private @Nullable AlertProcessingRuleSuppressionConditionDescription description;
    /**
     * @return A `monitor_condition` block as defined below.
     * 
     */
    private @Nullable AlertProcessingRuleSuppressionConditionMonitorCondition monitorCondition;
    /**
     * @return A `monitor_service` block as defined below.
     * 
     */
    private @Nullable AlertProcessingRuleSuppressionConditionMonitorService monitorService;
    /**
     * @return A `severity` block as defined below.
     * 
     */
    private @Nullable AlertProcessingRuleSuppressionConditionSeverity severity;
    /**
     * @return A `signal_type` block as defined below.
     * 
     */
    private @Nullable AlertProcessingRuleSuppressionConditionSignalType signalType;
    /**
     * @return A `target_resource` block as defined below.
     * 
     */
    private @Nullable AlertProcessingRuleSuppressionConditionTargetResource targetResource;
    /**
     * @return A `target_resource_group` block as defined below.
     * 
     */
    private @Nullable AlertProcessingRuleSuppressionConditionTargetResourceGroup targetResourceGroup;
    /**
     * @return A `target_resource_type` block as defined below.
     * 
     */
    private @Nullable AlertProcessingRuleSuppressionConditionTargetResourceType targetResourceType;

    private AlertProcessingRuleSuppressionCondition() {}
    /**
     * @return A `alert_context` block as defined above.
     * 
     */
    public Optional<AlertProcessingRuleSuppressionConditionAlertContext> alertContext() {
        return Optional.ofNullable(this.alertContext);
    }
    /**
     * @return A `alert_rule_id` block as defined above.
     * 
     */
    public Optional<AlertProcessingRuleSuppressionConditionAlertRuleId> alertRuleId() {
        return Optional.ofNullable(this.alertRuleId);
    }
    /**
     * @return A `alert_rule_name` block as defined above.
     * 
     */
    public Optional<AlertProcessingRuleSuppressionConditionAlertRuleName> alertRuleName() {
        return Optional.ofNullable(this.alertRuleName);
    }
    /**
     * @return A `description` block as defined below.
     * 
     */
    public Optional<AlertProcessingRuleSuppressionConditionDescription> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return A `monitor_condition` block as defined below.
     * 
     */
    public Optional<AlertProcessingRuleSuppressionConditionMonitorCondition> monitorCondition() {
        return Optional.ofNullable(this.monitorCondition);
    }
    /**
     * @return A `monitor_service` block as defined below.
     * 
     */
    public Optional<AlertProcessingRuleSuppressionConditionMonitorService> monitorService() {
        return Optional.ofNullable(this.monitorService);
    }
    /**
     * @return A `severity` block as defined below.
     * 
     */
    public Optional<AlertProcessingRuleSuppressionConditionSeverity> severity() {
        return Optional.ofNullable(this.severity);
    }
    /**
     * @return A `signal_type` block as defined below.
     * 
     */
    public Optional<AlertProcessingRuleSuppressionConditionSignalType> signalType() {
        return Optional.ofNullable(this.signalType);
    }
    /**
     * @return A `target_resource` block as defined below.
     * 
     */
    public Optional<AlertProcessingRuleSuppressionConditionTargetResource> targetResource() {
        return Optional.ofNullable(this.targetResource);
    }
    /**
     * @return A `target_resource_group` block as defined below.
     * 
     */
    public Optional<AlertProcessingRuleSuppressionConditionTargetResourceGroup> targetResourceGroup() {
        return Optional.ofNullable(this.targetResourceGroup);
    }
    /**
     * @return A `target_resource_type` block as defined below.
     * 
     */
    public Optional<AlertProcessingRuleSuppressionConditionTargetResourceType> targetResourceType() {
        return Optional.ofNullable(this.targetResourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertProcessingRuleSuppressionCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AlertProcessingRuleSuppressionConditionAlertContext alertContext;
        private @Nullable AlertProcessingRuleSuppressionConditionAlertRuleId alertRuleId;
        private @Nullable AlertProcessingRuleSuppressionConditionAlertRuleName alertRuleName;
        private @Nullable AlertProcessingRuleSuppressionConditionDescription description;
        private @Nullable AlertProcessingRuleSuppressionConditionMonitorCondition monitorCondition;
        private @Nullable AlertProcessingRuleSuppressionConditionMonitorService monitorService;
        private @Nullable AlertProcessingRuleSuppressionConditionSeverity severity;
        private @Nullable AlertProcessingRuleSuppressionConditionSignalType signalType;
        private @Nullable AlertProcessingRuleSuppressionConditionTargetResource targetResource;
        private @Nullable AlertProcessingRuleSuppressionConditionTargetResourceGroup targetResourceGroup;
        private @Nullable AlertProcessingRuleSuppressionConditionTargetResourceType targetResourceType;
        public Builder() {}
        public Builder(AlertProcessingRuleSuppressionCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertContext = defaults.alertContext;
    	      this.alertRuleId = defaults.alertRuleId;
    	      this.alertRuleName = defaults.alertRuleName;
    	      this.description = defaults.description;
    	      this.monitorCondition = defaults.monitorCondition;
    	      this.monitorService = defaults.monitorService;
    	      this.severity = defaults.severity;
    	      this.signalType = defaults.signalType;
    	      this.targetResource = defaults.targetResource;
    	      this.targetResourceGroup = defaults.targetResourceGroup;
    	      this.targetResourceType = defaults.targetResourceType;
        }

        @CustomType.Setter
        public Builder alertContext(@Nullable AlertProcessingRuleSuppressionConditionAlertContext alertContext) {
            this.alertContext = alertContext;
            return this;
        }
        @CustomType.Setter
        public Builder alertRuleId(@Nullable AlertProcessingRuleSuppressionConditionAlertRuleId alertRuleId) {
            this.alertRuleId = alertRuleId;
            return this;
        }
        @CustomType.Setter
        public Builder alertRuleName(@Nullable AlertProcessingRuleSuppressionConditionAlertRuleName alertRuleName) {
            this.alertRuleName = alertRuleName;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable AlertProcessingRuleSuppressionConditionDescription description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder monitorCondition(@Nullable AlertProcessingRuleSuppressionConditionMonitorCondition monitorCondition) {
            this.monitorCondition = monitorCondition;
            return this;
        }
        @CustomType.Setter
        public Builder monitorService(@Nullable AlertProcessingRuleSuppressionConditionMonitorService monitorService) {
            this.monitorService = monitorService;
            return this;
        }
        @CustomType.Setter
        public Builder severity(@Nullable AlertProcessingRuleSuppressionConditionSeverity severity) {
            this.severity = severity;
            return this;
        }
        @CustomType.Setter
        public Builder signalType(@Nullable AlertProcessingRuleSuppressionConditionSignalType signalType) {
            this.signalType = signalType;
            return this;
        }
        @CustomType.Setter
        public Builder targetResource(@Nullable AlertProcessingRuleSuppressionConditionTargetResource targetResource) {
            this.targetResource = targetResource;
            return this;
        }
        @CustomType.Setter
        public Builder targetResourceGroup(@Nullable AlertProcessingRuleSuppressionConditionTargetResourceGroup targetResourceGroup) {
            this.targetResourceGroup = targetResourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder targetResourceType(@Nullable AlertProcessingRuleSuppressionConditionTargetResourceType targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }
        public AlertProcessingRuleSuppressionCondition build() {
            final var o = new AlertProcessingRuleSuppressionCondition();
            o.alertContext = alertContext;
            o.alertRuleId = alertRuleId;
            o.alertRuleName = alertRuleName;
            o.description = description;
            o.monitorCondition = monitorCondition;
            o.monitorService = monitorService;
            o.severity = severity;
            o.signalType = signalType;
            o.targetResource = targetResource;
            o.targetResourceGroup = targetResourceGroup;
            o.targetResourceType = targetResourceType;
            return o;
        }
    }
}
