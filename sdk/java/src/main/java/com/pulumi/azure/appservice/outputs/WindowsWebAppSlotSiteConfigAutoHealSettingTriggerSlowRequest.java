// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest {
    /**
     * @return The number of Slow Requests in the time `interval` to trigger this rule.
     * 
     */
    private Integer count;
    /**
     * @return The time interval in the form `hh:mm:ss`.
     * 
     */
    private String interval;
    /**
     * @return The path for which this slow request rule applies.
     * 
     */
    private @Nullable String path;
    /**
     * @return The threshold of time passed to qualify as a Slow Request in `hh:mm:ss`.
     * 
     */
    private String timeTaken;

    private WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest() {}
    /**
     * @return The number of Slow Requests in the time `interval` to trigger this rule.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The time interval in the form `hh:mm:ss`.
     * 
     */
    public String interval() {
        return this.interval;
    }
    /**
     * @return The path for which this slow request rule applies.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The threshold of time passed to qualify as a Slow Request in `hh:mm:ss`.
     * 
     */
    public String timeTaken() {
        return this.timeTaken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer count;
        private String interval;
        private @Nullable String path;
        private String timeTaken;
        public Builder() {}
        public Builder(WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.interval = defaults.interval;
    	      this.path = defaults.path;
    	      this.timeTaken = defaults.timeTaken;
        }

        @CustomType.Setter
        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        @CustomType.Setter
        public Builder interval(String interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder timeTaken(String timeTaken) {
            this.timeTaken = Objects.requireNonNull(timeTaken);
            return this;
        }
        public WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest build() {
            final var o = new WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest();
            o.count = count;
            o.interval = interval;
            o.path = path;
            o.timeTaken = timeTaken;
            return o;
        }
    }
}
