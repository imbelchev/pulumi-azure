// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetManagementGroupNotification {
    /**
     * @return Specifies a list of email addresses to send the budget notification to when the threshold is exceeded.
     * 
     */
    private List<String> contactEmails;
    /**
     * @return Should the notification be enabled? Defaults to `true`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The comparison operator for the notification. Must be one of `EqualTo`, `GreaterThan`, or `GreaterThanOrEqualTo`.
     * 
     */
    private String operator;
    /**
     * @return Threshold value associated with a notification. Notification is sent when the cost exceeded the threshold. It is always percent and has to be between 0 and 1000.
     * 
     */
    private Integer threshold;
    /**
     * @return The type of threshold for the notification. This determines whether the notification is triggered by forecasted costs or actual costs. The allowed values are `Actual` and `Forecasted`. Default is `Actual`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String thresholdType;

    private BudgetManagementGroupNotification() {}
    /**
     * @return Specifies a list of email addresses to send the budget notification to when the threshold is exceeded.
     * 
     */
    public List<String> contactEmails() {
        return this.contactEmails;
    }
    /**
     * @return Should the notification be enabled? Defaults to `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The comparison operator for the notification. Must be one of `EqualTo`, `GreaterThan`, or `GreaterThanOrEqualTo`.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return Threshold value associated with a notification. Notification is sent when the cost exceeded the threshold. It is always percent and has to be between 0 and 1000.
     * 
     */
    public Integer threshold() {
        return this.threshold;
    }
    /**
     * @return The type of threshold for the notification. This determines whether the notification is triggered by forecasted costs or actual costs. The allowed values are `Actual` and `Forecasted`. Default is `Actual`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> thresholdType() {
        return Optional.ofNullable(this.thresholdType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetManagementGroupNotification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> contactEmails;
        private @Nullable Boolean enabled;
        private String operator;
        private Integer threshold;
        private @Nullable String thresholdType;
        public Builder() {}
        public Builder(BudgetManagementGroupNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactEmails = defaults.contactEmails;
    	      this.enabled = defaults.enabled;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.thresholdType = defaults.thresholdType;
        }

        @CustomType.Setter
        public Builder contactEmails(List<String> contactEmails) {
            this.contactEmails = Objects.requireNonNull(contactEmails);
            return this;
        }
        public Builder contactEmails(String... contactEmails) {
            return contactEmails(List.of(contactEmails));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Integer threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        @CustomType.Setter
        public Builder thresholdType(@Nullable String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        public BudgetManagementGroupNotification build() {
            final var o = new BudgetManagementGroupNotification();
            o.contactEmails = contactEmails;
            o.enabled = enabled;
            o.operator = operator;
            o.threshold = threshold;
            o.thresholdType = thresholdType;
            return o;
        }
    }
}
