// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DataCollectionRuleDataSourcesPerformanceCounter {
    /**
     * @return Specifies a list of specifier names of the performance counters you want to collect. Use a wildcard `*` to collect counters for all instances. To get a list of performance counters on Windows, run the command `typeperf`.
     * 
     */
    private List<String> counterSpecifiers;
    /**
     * @return The name which should be used for this data source. This name should be unique across all data sources regardless of type within the Data Collection Rule.
     * 
     */
    private String name;
    /**
     * @return The number of seconds between consecutive counter measurements (samples). The value should be integer between `1` and `300` inclusive.
     * 
     */
    private Integer samplingFrequencyInSeconds;
    /**
     * @return Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible values include but not limited to `Microsoft-InsightsMetrics`,and `Microsoft-Perf`.
     * 
     */
    private List<String> streams;

    private DataCollectionRuleDataSourcesPerformanceCounter() {}
    /**
     * @return Specifies a list of specifier names of the performance counters you want to collect. Use a wildcard `*` to collect counters for all instances. To get a list of performance counters on Windows, run the command `typeperf`.
     * 
     */
    public List<String> counterSpecifiers() {
        return this.counterSpecifiers;
    }
    /**
     * @return The name which should be used for this data source. This name should be unique across all data sources regardless of type within the Data Collection Rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The number of seconds between consecutive counter measurements (samples). The value should be integer between `1` and `300` inclusive.
     * 
     */
    public Integer samplingFrequencyInSeconds() {
        return this.samplingFrequencyInSeconds;
    }
    /**
     * @return Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible values include but not limited to `Microsoft-InsightsMetrics`,and `Microsoft-Perf`.
     * 
     */
    public List<String> streams() {
        return this.streams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleDataSourcesPerformanceCounter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> counterSpecifiers;
        private String name;
        private Integer samplingFrequencyInSeconds;
        private List<String> streams;
        public Builder() {}
        public Builder(DataCollectionRuleDataSourcesPerformanceCounter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.counterSpecifiers = defaults.counterSpecifiers;
    	      this.name = defaults.name;
    	      this.samplingFrequencyInSeconds = defaults.samplingFrequencyInSeconds;
    	      this.streams = defaults.streams;
        }

        @CustomType.Setter
        public Builder counterSpecifiers(List<String> counterSpecifiers) {
            this.counterSpecifiers = Objects.requireNonNull(counterSpecifiers);
            return this;
        }
        public Builder counterSpecifiers(String... counterSpecifiers) {
            return counterSpecifiers(List.of(counterSpecifiers));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder samplingFrequencyInSeconds(Integer samplingFrequencyInSeconds) {
            this.samplingFrequencyInSeconds = Objects.requireNonNull(samplingFrequencyInSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder streams(List<String> streams) {
            this.streams = Objects.requireNonNull(streams);
            return this;
        }
        public Builder streams(String... streams) {
            return streams(List.of(streams));
        }
        public DataCollectionRuleDataSourcesPerformanceCounter build() {
            final var o = new DataCollectionRuleDataSourcesPerformanceCounter();
            o.counterSpecifiers = counterSpecifiers;
            o.name = name;
            o.samplingFrequencyInSeconds = samplingFrequencyInSeconds;
            o.streams = streams;
            return o;
        }
    }
}
