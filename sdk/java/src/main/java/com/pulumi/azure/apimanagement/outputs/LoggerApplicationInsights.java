// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LoggerApplicationInsights {
    /**
     * @return The instrumentation key used to push data to Application Insights.
     * 
     */
    private String instrumentationKey;

    private LoggerApplicationInsights() {}
    /**
     * @return The instrumentation key used to push data to Application Insights.
     * 
     */
    public String instrumentationKey() {
        return this.instrumentationKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggerApplicationInsights defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instrumentationKey;
        public Builder() {}
        public Builder(LoggerApplicationInsights defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instrumentationKey = defaults.instrumentationKey;
        }

        @CustomType.Setter
        public Builder instrumentationKey(String instrumentationKey) {
            this.instrumentationKey = Objects.requireNonNull(instrumentationKey);
            return this;
        }
        public LoggerApplicationInsights build() {
            final var o = new LoggerApplicationInsights();
            o.instrumentationKey = instrumentationKey;
            return o;
        }
    }
}
