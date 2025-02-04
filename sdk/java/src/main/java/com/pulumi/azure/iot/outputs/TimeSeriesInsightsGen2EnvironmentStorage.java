// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TimeSeriesInsightsGen2EnvironmentStorage {
    /**
     * @return Access key of storage account for Azure IoT Time Series Insights Gen2 Environment
     * 
     */
    private String key;
    /**
     * @return Name of storage account for Azure IoT Time Series Insights Gen2 Environment. Changing this forces a new resource to be created.
     * 
     */
    private String name;

    private TimeSeriesInsightsGen2EnvironmentStorage() {}
    /**
     * @return Access key of storage account for Azure IoT Time Series Insights Gen2 Environment
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Name of storage account for Azure IoT Time Series Insights Gen2 Environment. Changing this forces a new resource to be created.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSeriesInsightsGen2EnvironmentStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String name;
        public Builder() {}
        public Builder(TimeSeriesInsightsGen2EnvironmentStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public TimeSeriesInsightsGen2EnvironmentStorage build() {
            final var o = new TimeSeriesInsightsGen2EnvironmentStorage();
            o.key = key;
            o.name = name;
            return o;
        }
    }
}
