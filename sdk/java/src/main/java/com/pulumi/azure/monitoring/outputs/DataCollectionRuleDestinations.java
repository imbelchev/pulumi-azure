// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.azure.monitoring.outputs.DataCollectionRuleDestinationsAzureMonitorMetrics;
import com.pulumi.azure.monitoring.outputs.DataCollectionRuleDestinationsLogAnalytic;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataCollectionRuleDestinations {
    /**
     * @return A `azure_monitor_metrics` block as defined above.
     * 
     */
    private @Nullable DataCollectionRuleDestinationsAzureMonitorMetrics azureMonitorMetrics;
    /**
     * @return One or more `log_analytics` blocks as defined below.
     * 
     */
    private @Nullable List<DataCollectionRuleDestinationsLogAnalytic> logAnalytics;

    private DataCollectionRuleDestinations() {}
    /**
     * @return A `azure_monitor_metrics` block as defined above.
     * 
     */
    public Optional<DataCollectionRuleDestinationsAzureMonitorMetrics> azureMonitorMetrics() {
        return Optional.ofNullable(this.azureMonitorMetrics);
    }
    /**
     * @return One or more `log_analytics` blocks as defined below.
     * 
     */
    public List<DataCollectionRuleDestinationsLogAnalytic> logAnalytics() {
        return this.logAnalytics == null ? List.of() : this.logAnalytics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleDestinations defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DataCollectionRuleDestinationsAzureMonitorMetrics azureMonitorMetrics;
        private @Nullable List<DataCollectionRuleDestinationsLogAnalytic> logAnalytics;
        public Builder() {}
        public Builder(DataCollectionRuleDestinations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureMonitorMetrics = defaults.azureMonitorMetrics;
    	      this.logAnalytics = defaults.logAnalytics;
        }

        @CustomType.Setter
        public Builder azureMonitorMetrics(@Nullable DataCollectionRuleDestinationsAzureMonitorMetrics azureMonitorMetrics) {
            this.azureMonitorMetrics = azureMonitorMetrics;
            return this;
        }
        @CustomType.Setter
        public Builder logAnalytics(@Nullable List<DataCollectionRuleDestinationsLogAnalytic> logAnalytics) {
            this.logAnalytics = logAnalytics;
            return this;
        }
        public Builder logAnalytics(DataCollectionRuleDestinationsLogAnalytic... logAnalytics) {
            return logAnalytics(List.of(logAnalytics));
        }
        public DataCollectionRuleDestinations build() {
            final var o = new DataCollectionRuleDestinations();
            o.azureMonitorMetrics = azureMonitorMetrics;
            o.logAnalytics = logAnalytics;
            return o;
        }
    }
}
