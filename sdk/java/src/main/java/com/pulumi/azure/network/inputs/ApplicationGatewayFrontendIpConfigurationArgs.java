// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayFrontendIpConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayFrontendIpConfigurationArgs Empty = new ApplicationGatewayFrontendIpConfigurationArgs();

    /**
     * The ID of the Rewrite Rule Set
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the Frontend IP Configuration.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Frontend IP Configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Private IP Address to use for the Application Gateway.
     * 
     */
    @Import(name="privateIpAddress")
    private @Nullable Output<String> privateIpAddress;

    /**
     * @return The Private IP Address to use for the Application Gateway.
     * 
     */
    public Optional<Output<String>> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }

    /**
     * The Allocation Method for the Private IP Address. Possible values are `Dynamic` and `Static`.
     * 
     */
    @Import(name="privateIpAddressAllocation")
    private @Nullable Output<String> privateIpAddressAllocation;

    /**
     * @return The Allocation Method for the Private IP Address. Possible values are `Dynamic` and `Static`.
     * 
     */
    public Optional<Output<String>> privateIpAddressAllocation() {
        return Optional.ofNullable(this.privateIpAddressAllocation);
    }

    /**
     * The ID of the associated private link configuration.
     * 
     */
    @Import(name="privateLinkConfigurationId")
    private @Nullable Output<String> privateLinkConfigurationId;

    /**
     * @return The ID of the associated private link configuration.
     * 
     */
    public Optional<Output<String>> privateLinkConfigurationId() {
        return Optional.ofNullable(this.privateLinkConfigurationId);
    }

    /**
     * The name of the private link configuration to use for this frontend IP configuration.
     * 
     */
    @Import(name="privateLinkConfigurationName")
    private @Nullable Output<String> privateLinkConfigurationName;

    /**
     * @return The name of the private link configuration to use for this frontend IP configuration.
     * 
     */
    public Optional<Output<String>> privateLinkConfigurationName() {
        return Optional.ofNullable(this.privateLinkConfigurationName);
    }

    /**
     * The ID of a Public IP Address which the Application Gateway should use. The allocation method for the Public IP Address depends on the `sku` of this Application Gateway. Please refer to the [Azure documentation for public IP addresses](https://docs.microsoft.com/azure/virtual-network/public-ip-addresses#application-gateways) for details.
     * 
     */
    @Import(name="publicIpAddressId")
    private @Nullable Output<String> publicIpAddressId;

    /**
     * @return The ID of a Public IP Address which the Application Gateway should use. The allocation method for the Public IP Address depends on the `sku` of this Application Gateway. Please refer to the [Azure documentation for public IP addresses](https://docs.microsoft.com/azure/virtual-network/public-ip-addresses#application-gateways) for details.
     * 
     */
    public Optional<Output<String>> publicIpAddressId() {
        return Optional.ofNullable(this.publicIpAddressId);
    }

    /**
     * The ID of the Subnet.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    private ApplicationGatewayFrontendIpConfigurationArgs() {}

    private ApplicationGatewayFrontendIpConfigurationArgs(ApplicationGatewayFrontendIpConfigurationArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.privateIpAddress = $.privateIpAddress;
        this.privateIpAddressAllocation = $.privateIpAddressAllocation;
        this.privateLinkConfigurationId = $.privateLinkConfigurationId;
        this.privateLinkConfigurationName = $.privateLinkConfigurationName;
        this.publicIpAddressId = $.publicIpAddressId;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayFrontendIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayFrontendIpConfigurationArgs $;

        public Builder() {
            $ = new ApplicationGatewayFrontendIpConfigurationArgs();
        }

        public Builder(ApplicationGatewayFrontendIpConfigurationArgs defaults) {
            $ = new ApplicationGatewayFrontendIpConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Rewrite Rule Set
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Rewrite Rule Set
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the Frontend IP Configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Frontend IP Configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateIpAddress The Private IP Address to use for the Application Gateway.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(@Nullable Output<String> privateIpAddress) {
            $.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * @param privateIpAddress The Private IP Address to use for the Application Gateway.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(String privateIpAddress) {
            return privateIpAddress(Output.of(privateIpAddress));
        }

        /**
         * @param privateIpAddressAllocation The Allocation Method for the Private IP Address. Possible values are `Dynamic` and `Static`.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddressAllocation(@Nullable Output<String> privateIpAddressAllocation) {
            $.privateIpAddressAllocation = privateIpAddressAllocation;
            return this;
        }

        /**
         * @param privateIpAddressAllocation The Allocation Method for the Private IP Address. Possible values are `Dynamic` and `Static`.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddressAllocation(String privateIpAddressAllocation) {
            return privateIpAddressAllocation(Output.of(privateIpAddressAllocation));
        }

        /**
         * @param privateLinkConfigurationId The ID of the associated private link configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkConfigurationId(@Nullable Output<String> privateLinkConfigurationId) {
            $.privateLinkConfigurationId = privateLinkConfigurationId;
            return this;
        }

        /**
         * @param privateLinkConfigurationId The ID of the associated private link configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkConfigurationId(String privateLinkConfigurationId) {
            return privateLinkConfigurationId(Output.of(privateLinkConfigurationId));
        }

        /**
         * @param privateLinkConfigurationName The name of the private link configuration to use for this frontend IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkConfigurationName(@Nullable Output<String> privateLinkConfigurationName) {
            $.privateLinkConfigurationName = privateLinkConfigurationName;
            return this;
        }

        /**
         * @param privateLinkConfigurationName The name of the private link configuration to use for this frontend IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkConfigurationName(String privateLinkConfigurationName) {
            return privateLinkConfigurationName(Output.of(privateLinkConfigurationName));
        }

        /**
         * @param publicIpAddressId The ID of a Public IP Address which the Application Gateway should use. The allocation method for the Public IP Address depends on the `sku` of this Application Gateway. Please refer to the [Azure documentation for public IP addresses](https://docs.microsoft.com/azure/virtual-network/public-ip-addresses#application-gateways) for details.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(@Nullable Output<String> publicIpAddressId) {
            $.publicIpAddressId = publicIpAddressId;
            return this;
        }

        /**
         * @param publicIpAddressId The ID of a Public IP Address which the Application Gateway should use. The allocation method for the Public IP Address depends on the `sku` of this Application Gateway. Please refer to the [Azure documentation for public IP addresses](https://docs.microsoft.com/azure/virtual-network/public-ip-addresses#application-gateways) for details.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(String publicIpAddressId) {
            return publicIpAddressId(Output.of(publicIpAddressId));
        }

        /**
         * @param subnetId The ID of the Subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public ApplicationGatewayFrontendIpConfigurationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
