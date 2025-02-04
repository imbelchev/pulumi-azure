// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.ApplicationGatewayHttpListenerCustomErrorConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayHttpListener {
    /**
     * @return One or more `custom_error_configuration` blocks as defined below.
     * 
     */
    private @Nullable List<ApplicationGatewayHttpListenerCustomErrorConfiguration> customErrorConfigurations;
    /**
     * @return The ID of the Web Application Firewall Policy which should be used for this HTTP Listener.
     * 
     */
    private @Nullable String firewallPolicyId;
    /**
     * @return The ID of the associated Frontend Configuration.
     * 
     */
    private @Nullable String frontendIpConfigurationId;
    /**
     * @return The Name of the Frontend IP Configuration used for this HTTP Listener.
     * 
     */
    private String frontendIpConfigurationName;
    /**
     * @return The ID of the associated Frontend Port.
     * 
     */
    private @Nullable String frontendPortId;
    /**
     * @return The Name of the Frontend Port use for this HTTP Listener.
     * 
     */
    private String frontendPortName;
    /**
     * @return The Hostname which should be used for this HTTP Listener. Setting this value changes Listener Type to &#39;Multi site&#39;.
     * 
     */
    private @Nullable String hostName;
    /**
     * @return A list of Hostname(s) should be used for this HTTP Listener. It allows special wildcard characters.
     * 
     */
    private @Nullable List<String> hostNames;
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private @Nullable String id;
    /**
     * @return The Name of the HTTP Listener.
     * 
     */
    private String name;
    /**
     * @return The Protocol to use for this HTTP Listener. Possible values are `Http` and `Https`.
     * 
     */
    private String protocol;
    /**
     * @return Should Server Name Indication be Required?
     * 
     */
    private @Nullable Boolean requireSni;
    /**
     * @return The ID of the associated SSL Certificate.
     * 
     */
    private @Nullable String sslCertificateId;
    /**
     * @return The name of the associated SSL Certificate which should be used for this HTTP Listener.
     * 
     */
    private @Nullable String sslCertificateName;
    /**
     * @return The ID of the associated SSL Profile.
     * 
     */
    private @Nullable String sslProfileId;
    /**
     * @return The name of the associated SSL Profile which should be used for this HTTP Listener.
     * 
     */
    private @Nullable String sslProfileName;

    private ApplicationGatewayHttpListener() {}
    /**
     * @return One or more `custom_error_configuration` blocks as defined below.
     * 
     */
    public List<ApplicationGatewayHttpListenerCustomErrorConfiguration> customErrorConfigurations() {
        return this.customErrorConfigurations == null ? List.of() : this.customErrorConfigurations;
    }
    /**
     * @return The ID of the Web Application Firewall Policy which should be used for this HTTP Listener.
     * 
     */
    public Optional<String> firewallPolicyId() {
        return Optional.ofNullable(this.firewallPolicyId);
    }
    /**
     * @return The ID of the associated Frontend Configuration.
     * 
     */
    public Optional<String> frontendIpConfigurationId() {
        return Optional.ofNullable(this.frontendIpConfigurationId);
    }
    /**
     * @return The Name of the Frontend IP Configuration used for this HTTP Listener.
     * 
     */
    public String frontendIpConfigurationName() {
        return this.frontendIpConfigurationName;
    }
    /**
     * @return The ID of the associated Frontend Port.
     * 
     */
    public Optional<String> frontendPortId() {
        return Optional.ofNullable(this.frontendPortId);
    }
    /**
     * @return The Name of the Frontend Port use for this HTTP Listener.
     * 
     */
    public String frontendPortName() {
        return this.frontendPortName;
    }
    /**
     * @return The Hostname which should be used for this HTTP Listener. Setting this value changes Listener Type to &#39;Multi site&#39;.
     * 
     */
    public Optional<String> hostName() {
        return Optional.ofNullable(this.hostName);
    }
    /**
     * @return A list of Hostname(s) should be used for this HTTP Listener. It allows special wildcard characters.
     * 
     */
    public List<String> hostNames() {
        return this.hostNames == null ? List.of() : this.hostNames;
    }
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The Name of the HTTP Listener.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Protocol to use for this HTTP Listener. Possible values are `Http` and `Https`.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Should Server Name Indication be Required?
     * 
     */
    public Optional<Boolean> requireSni() {
        return Optional.ofNullable(this.requireSni);
    }
    /**
     * @return The ID of the associated SSL Certificate.
     * 
     */
    public Optional<String> sslCertificateId() {
        return Optional.ofNullable(this.sslCertificateId);
    }
    /**
     * @return The name of the associated SSL Certificate which should be used for this HTTP Listener.
     * 
     */
    public Optional<String> sslCertificateName() {
        return Optional.ofNullable(this.sslCertificateName);
    }
    /**
     * @return The ID of the associated SSL Profile.
     * 
     */
    public Optional<String> sslProfileId() {
        return Optional.ofNullable(this.sslProfileId);
    }
    /**
     * @return The name of the associated SSL Profile which should be used for this HTTP Listener.
     * 
     */
    public Optional<String> sslProfileName() {
        return Optional.ofNullable(this.sslProfileName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayHttpListener defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ApplicationGatewayHttpListenerCustomErrorConfiguration> customErrorConfigurations;
        private @Nullable String firewallPolicyId;
        private @Nullable String frontendIpConfigurationId;
        private String frontendIpConfigurationName;
        private @Nullable String frontendPortId;
        private String frontendPortName;
        private @Nullable String hostName;
        private @Nullable List<String> hostNames;
        private @Nullable String id;
        private String name;
        private String protocol;
        private @Nullable Boolean requireSni;
        private @Nullable String sslCertificateId;
        private @Nullable String sslCertificateName;
        private @Nullable String sslProfileId;
        private @Nullable String sslProfileName;
        public Builder() {}
        public Builder(ApplicationGatewayHttpListener defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customErrorConfigurations = defaults.customErrorConfigurations;
    	      this.firewallPolicyId = defaults.firewallPolicyId;
    	      this.frontendIpConfigurationId = defaults.frontendIpConfigurationId;
    	      this.frontendIpConfigurationName = defaults.frontendIpConfigurationName;
    	      this.frontendPortId = defaults.frontendPortId;
    	      this.frontendPortName = defaults.frontendPortName;
    	      this.hostName = defaults.hostName;
    	      this.hostNames = defaults.hostNames;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.requireSni = defaults.requireSni;
    	      this.sslCertificateId = defaults.sslCertificateId;
    	      this.sslCertificateName = defaults.sslCertificateName;
    	      this.sslProfileId = defaults.sslProfileId;
    	      this.sslProfileName = defaults.sslProfileName;
        }

        @CustomType.Setter
        public Builder customErrorConfigurations(@Nullable List<ApplicationGatewayHttpListenerCustomErrorConfiguration> customErrorConfigurations) {
            this.customErrorConfigurations = customErrorConfigurations;
            return this;
        }
        public Builder customErrorConfigurations(ApplicationGatewayHttpListenerCustomErrorConfiguration... customErrorConfigurations) {
            return customErrorConfigurations(List.of(customErrorConfigurations));
        }
        @CustomType.Setter
        public Builder firewallPolicyId(@Nullable String firewallPolicyId) {
            this.firewallPolicyId = firewallPolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder frontendIpConfigurationId(@Nullable String frontendIpConfigurationId) {
            this.frontendIpConfigurationId = frontendIpConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder frontendIpConfigurationName(String frontendIpConfigurationName) {
            this.frontendIpConfigurationName = Objects.requireNonNull(frontendIpConfigurationName);
            return this;
        }
        @CustomType.Setter
        public Builder frontendPortId(@Nullable String frontendPortId) {
            this.frontendPortId = frontendPortId;
            return this;
        }
        @CustomType.Setter
        public Builder frontendPortName(String frontendPortName) {
            this.frontendPortName = Objects.requireNonNull(frontendPortName);
            return this;
        }
        @CustomType.Setter
        public Builder hostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }
        @CustomType.Setter
        public Builder hostNames(@Nullable List<String> hostNames) {
            this.hostNames = hostNames;
            return this;
        }
        public Builder hostNames(String... hostNames) {
            return hostNames(List.of(hostNames));
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder requireSni(@Nullable Boolean requireSni) {
            this.requireSni = requireSni;
            return this;
        }
        @CustomType.Setter
        public Builder sslCertificateId(@Nullable String sslCertificateId) {
            this.sslCertificateId = sslCertificateId;
            return this;
        }
        @CustomType.Setter
        public Builder sslCertificateName(@Nullable String sslCertificateName) {
            this.sslCertificateName = sslCertificateName;
            return this;
        }
        @CustomType.Setter
        public Builder sslProfileId(@Nullable String sslProfileId) {
            this.sslProfileId = sslProfileId;
            return this;
        }
        @CustomType.Setter
        public Builder sslProfileName(@Nullable String sslProfileName) {
            this.sslProfileName = sslProfileName;
            return this;
        }
        public ApplicationGatewayHttpListener build() {
            final var o = new ApplicationGatewayHttpListener();
            o.customErrorConfigurations = customErrorConfigurations;
            o.firewallPolicyId = firewallPolicyId;
            o.frontendIpConfigurationId = frontendIpConfigurationId;
            o.frontendIpConfigurationName = frontendIpConfigurationName;
            o.frontendPortId = frontendPortId;
            o.frontendPortName = frontendPortName;
            o.hostName = hostName;
            o.hostNames = hostNames;
            o.id = id;
            o.name = name;
            o.protocol = protocol;
            o.requireSni = requireSni;
            o.sslCertificateId = sslCertificateId;
            o.sslCertificateName = sslCertificateName;
            o.sslProfileId = sslProfileId;
            o.sslProfileName = sslProfileName;
            return o;
        }
    }
}
