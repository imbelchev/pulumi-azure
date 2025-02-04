// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorSsoConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorSsoConfigurationArgs Empty = new MonitorSsoConfigurationArgs();

    /**
     * The Datadog Monitor Id which should be used for this Datadog Monitor SSO Configuration. Changing this forces a new Datadog Monitor SSO Configuration to be created.
     * 
     */
    @Import(name="datadogMonitorId", required=true)
    private Output<String> datadogMonitorId;

    /**
     * @return The Datadog Monitor Id which should be used for this Datadog Monitor SSO Configuration. Changing this forces a new Datadog Monitor SSO Configuration to be created.
     * 
     */
    public Output<String> datadogMonitorId() {
        return this.datadogMonitorId;
    }

    /**
     * The application Id to perform SSO operation.
     * 
     */
    @Import(name="enterpriseApplicationId", required=true)
    private Output<String> enterpriseApplicationId;

    /**
     * @return The application Id to perform SSO operation.
     * 
     */
    public Output<String> enterpriseApplicationId() {
        return this.enterpriseApplicationId;
    }

    /**
     * The name of the SingleSignOn configuration. Defaults to `default`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the SingleSignOn configuration. Defaults to `default`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The state of SingleSignOn configuration.
     * 
     */
    @Import(name="singleSignOnEnabled", required=true)
    private Output<String> singleSignOnEnabled;

    /**
     * @return The state of SingleSignOn configuration.
     * 
     */
    public Output<String> singleSignOnEnabled() {
        return this.singleSignOnEnabled;
    }

    private MonitorSsoConfigurationArgs() {}

    private MonitorSsoConfigurationArgs(MonitorSsoConfigurationArgs $) {
        this.datadogMonitorId = $.datadogMonitorId;
        this.enterpriseApplicationId = $.enterpriseApplicationId;
        this.name = $.name;
        this.singleSignOnEnabled = $.singleSignOnEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorSsoConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorSsoConfigurationArgs $;

        public Builder() {
            $ = new MonitorSsoConfigurationArgs();
        }

        public Builder(MonitorSsoConfigurationArgs defaults) {
            $ = new MonitorSsoConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datadogMonitorId The Datadog Monitor Id which should be used for this Datadog Monitor SSO Configuration. Changing this forces a new Datadog Monitor SSO Configuration to be created.
         * 
         * @return builder
         * 
         */
        public Builder datadogMonitorId(Output<String> datadogMonitorId) {
            $.datadogMonitorId = datadogMonitorId;
            return this;
        }

        /**
         * @param datadogMonitorId The Datadog Monitor Id which should be used for this Datadog Monitor SSO Configuration. Changing this forces a new Datadog Monitor SSO Configuration to be created.
         * 
         * @return builder
         * 
         */
        public Builder datadogMonitorId(String datadogMonitorId) {
            return datadogMonitorId(Output.of(datadogMonitorId));
        }

        /**
         * @param enterpriseApplicationId The application Id to perform SSO operation.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseApplicationId(Output<String> enterpriseApplicationId) {
            $.enterpriseApplicationId = enterpriseApplicationId;
            return this;
        }

        /**
         * @param enterpriseApplicationId The application Id to perform SSO operation.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseApplicationId(String enterpriseApplicationId) {
            return enterpriseApplicationId(Output.of(enterpriseApplicationId));
        }

        /**
         * @param name The name of the SingleSignOn configuration. Defaults to `default`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the SingleSignOn configuration. Defaults to `default`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param singleSignOnEnabled The state of SingleSignOn configuration.
         * 
         * @return builder
         * 
         */
        public Builder singleSignOnEnabled(Output<String> singleSignOnEnabled) {
            $.singleSignOnEnabled = singleSignOnEnabled;
            return this;
        }

        /**
         * @param singleSignOnEnabled The state of SingleSignOn configuration.
         * 
         * @return builder
         * 
         */
        public Builder singleSignOnEnabled(String singleSignOnEnabled) {
            return singleSignOnEnabled(Output.of(singleSignOnEnabled));
        }

        public MonitorSsoConfigurationArgs build() {
            $.datadogMonitorId = Objects.requireNonNull($.datadogMonitorId, "expected parameter 'datadogMonitorId' to be non-null");
            $.enterpriseApplicationId = Objects.requireNonNull($.enterpriseApplicationId, "expected parameter 'enterpriseApplicationId' to be non-null");
            $.singleSignOnEnabled = Objects.requireNonNull($.singleSignOnEnabled, "expected parameter 'singleSignOnEnabled' to be non-null");
            return $;
        }
    }

}
