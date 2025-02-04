// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.azure.network.inputs.VnpGatewayNatRuleExternalMappingArgs;
import com.pulumi.azure.network.inputs.VnpGatewayNatRuleInternalMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VnpGatewayNatRuleState extends com.pulumi.resources.ResourceArgs {

    public static final VnpGatewayNatRuleState Empty = new VnpGatewayNatRuleState();

    /**
     * (Deprecated) A list of CIDR Ranges which are used for external mapping of the VPN Gateway NAT Rule.
     * 
     * @deprecated
     * `external_address_space_mappings` will be removed in favour of the property `external_mapping` in version 4.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* `external_address_space_mappings` will be removed in favour of the property `external_mapping` in version 4.0 of the AzureRM Provider. */
    @Import(name="externalAddressSpaceMappings")
    private @Nullable Output<List<String>> externalAddressSpaceMappings;

    /**
     * @return (Deprecated) A list of CIDR Ranges which are used for external mapping of the VPN Gateway NAT Rule.
     * 
     * @deprecated
     * `external_address_space_mappings` will be removed in favour of the property `external_mapping` in version 4.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* `external_address_space_mappings` will be removed in favour of the property `external_mapping` in version 4.0 of the AzureRM Provider. */
    public Optional<Output<List<String>>> externalAddressSpaceMappings() {
        return Optional.ofNullable(this.externalAddressSpaceMappings);
    }

    /**
     * One or more `external_mapping` blocks as documented below.
     * 
     */
    @Import(name="externalMappings")
    private @Nullable Output<List<VnpGatewayNatRuleExternalMappingArgs>> externalMappings;

    /**
     * @return One or more `external_mapping` blocks as documented below.
     * 
     */
    public Optional<Output<List<VnpGatewayNatRuleExternalMappingArgs>>> externalMappings() {
        return Optional.ofNullable(this.externalMappings);
    }

    /**
     * (Deprecated) A list of CIDR Ranges which are used for internal mapping of the VPN Gateway NAT Rule.
     * 
     * @deprecated
     * `internal_address_space_mappings` will be removed in favour of the property `internal_mapping` in version 4.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* `internal_address_space_mappings` will be removed in favour of the property `internal_mapping` in version 4.0 of the AzureRM Provider. */
    @Import(name="internalAddressSpaceMappings")
    private @Nullable Output<List<String>> internalAddressSpaceMappings;

    /**
     * @return (Deprecated) A list of CIDR Ranges which are used for internal mapping of the VPN Gateway NAT Rule.
     * 
     * @deprecated
     * `internal_address_space_mappings` will be removed in favour of the property `internal_mapping` in version 4.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* `internal_address_space_mappings` will be removed in favour of the property `internal_mapping` in version 4.0 of the AzureRM Provider. */
    public Optional<Output<List<String>>> internalAddressSpaceMappings() {
        return Optional.ofNullable(this.internalAddressSpaceMappings);
    }

    /**
     * One or more `internal_mapping` blocks as documented below.
     * 
     */
    @Import(name="internalMappings")
    private @Nullable Output<List<VnpGatewayNatRuleInternalMappingArgs>> internalMappings;

    /**
     * @return One or more `internal_mapping` blocks as documented below.
     * 
     */
    public Optional<Output<List<VnpGatewayNatRuleInternalMappingArgs>>> internalMappings() {
        return Optional.ofNullable(this.internalMappings);
    }

    /**
     * The ID of the IP Configuration this VPN Gateway NAT Rule applies to. Possible values are `Instance0` and `Instance1`.
     * 
     */
    @Import(name="ipConfigurationId")
    private @Nullable Output<String> ipConfigurationId;

    /**
     * @return The ID of the IP Configuration this VPN Gateway NAT Rule applies to. Possible values are `Instance0` and `Instance1`.
     * 
     */
    public Optional<Output<String>> ipConfigurationId() {
        return Optional.ofNullable(this.ipConfigurationId);
    }

    /**
     * The source NAT direction of the VPN NAT. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The source NAT direction of the VPN NAT. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The name which should be used for this VPN Gateway NAT Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this VPN Gateway NAT Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Name of the Resource Group in which this VPN Gateway NAT Rule should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group in which this VPN Gateway NAT Rule should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The type of the VPN Gateway NAT Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the VPN Gateway NAT Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The ID of the VPN Gateway that this VPN Gateway NAT Rule belongs to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="vpnGatewayId")
    private @Nullable Output<String> vpnGatewayId;

    /**
     * @return The ID of the VPN Gateway that this VPN Gateway NAT Rule belongs to. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> vpnGatewayId() {
        return Optional.ofNullable(this.vpnGatewayId);
    }

    private VnpGatewayNatRuleState() {}

    private VnpGatewayNatRuleState(VnpGatewayNatRuleState $) {
        this.externalAddressSpaceMappings = $.externalAddressSpaceMappings;
        this.externalMappings = $.externalMappings;
        this.internalAddressSpaceMappings = $.internalAddressSpaceMappings;
        this.internalMappings = $.internalMappings;
        this.ipConfigurationId = $.ipConfigurationId;
        this.mode = $.mode;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.type = $.type;
        this.vpnGatewayId = $.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VnpGatewayNatRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VnpGatewayNatRuleState $;

        public Builder() {
            $ = new VnpGatewayNatRuleState();
        }

        public Builder(VnpGatewayNatRuleState defaults) {
            $ = new VnpGatewayNatRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalAddressSpaceMappings (Deprecated) A list of CIDR Ranges which are used for external mapping of the VPN Gateway NAT Rule.
         * 
         * @return builder
         * 
         * @deprecated
         * `external_address_space_mappings` will be removed in favour of the property `external_mapping` in version 4.0 of the AzureRM Provider.
         * 
         */
        @Deprecated /* `external_address_space_mappings` will be removed in favour of the property `external_mapping` in version 4.0 of the AzureRM Provider. */
        public Builder externalAddressSpaceMappings(@Nullable Output<List<String>> externalAddressSpaceMappings) {
            $.externalAddressSpaceMappings = externalAddressSpaceMappings;
            return this;
        }

        /**
         * @param externalAddressSpaceMappings (Deprecated) A list of CIDR Ranges which are used for external mapping of the VPN Gateway NAT Rule.
         * 
         * @return builder
         * 
         * @deprecated
         * `external_address_space_mappings` will be removed in favour of the property `external_mapping` in version 4.0 of the AzureRM Provider.
         * 
         */
        @Deprecated /* `external_address_space_mappings` will be removed in favour of the property `external_mapping` in version 4.0 of the AzureRM Provider. */
        public Builder externalAddressSpaceMappings(List<String> externalAddressSpaceMappings) {
            return externalAddressSpaceMappings(Output.of(externalAddressSpaceMappings));
        }

        /**
         * @param externalAddressSpaceMappings (Deprecated) A list of CIDR Ranges which are used for external mapping of the VPN Gateway NAT Rule.
         * 
         * @return builder
         * 
         * @deprecated
         * `external_address_space_mappings` will be removed in favour of the property `external_mapping` in version 4.0 of the AzureRM Provider.
         * 
         */
        @Deprecated /* `external_address_space_mappings` will be removed in favour of the property `external_mapping` in version 4.0 of the AzureRM Provider. */
        public Builder externalAddressSpaceMappings(String... externalAddressSpaceMappings) {
            return externalAddressSpaceMappings(List.of(externalAddressSpaceMappings));
        }

        /**
         * @param externalMappings One or more `external_mapping` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder externalMappings(@Nullable Output<List<VnpGatewayNatRuleExternalMappingArgs>> externalMappings) {
            $.externalMappings = externalMappings;
            return this;
        }

        /**
         * @param externalMappings One or more `external_mapping` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder externalMappings(List<VnpGatewayNatRuleExternalMappingArgs> externalMappings) {
            return externalMappings(Output.of(externalMappings));
        }

        /**
         * @param externalMappings One or more `external_mapping` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder externalMappings(VnpGatewayNatRuleExternalMappingArgs... externalMappings) {
            return externalMappings(List.of(externalMappings));
        }

        /**
         * @param internalAddressSpaceMappings (Deprecated) A list of CIDR Ranges which are used for internal mapping of the VPN Gateway NAT Rule.
         * 
         * @return builder
         * 
         * @deprecated
         * `internal_address_space_mappings` will be removed in favour of the property `internal_mapping` in version 4.0 of the AzureRM Provider.
         * 
         */
        @Deprecated /* `internal_address_space_mappings` will be removed in favour of the property `internal_mapping` in version 4.0 of the AzureRM Provider. */
        public Builder internalAddressSpaceMappings(@Nullable Output<List<String>> internalAddressSpaceMappings) {
            $.internalAddressSpaceMappings = internalAddressSpaceMappings;
            return this;
        }

        /**
         * @param internalAddressSpaceMappings (Deprecated) A list of CIDR Ranges which are used for internal mapping of the VPN Gateway NAT Rule.
         * 
         * @return builder
         * 
         * @deprecated
         * `internal_address_space_mappings` will be removed in favour of the property `internal_mapping` in version 4.0 of the AzureRM Provider.
         * 
         */
        @Deprecated /* `internal_address_space_mappings` will be removed in favour of the property `internal_mapping` in version 4.0 of the AzureRM Provider. */
        public Builder internalAddressSpaceMappings(List<String> internalAddressSpaceMappings) {
            return internalAddressSpaceMappings(Output.of(internalAddressSpaceMappings));
        }

        /**
         * @param internalAddressSpaceMappings (Deprecated) A list of CIDR Ranges which are used for internal mapping of the VPN Gateway NAT Rule.
         * 
         * @return builder
         * 
         * @deprecated
         * `internal_address_space_mappings` will be removed in favour of the property `internal_mapping` in version 4.0 of the AzureRM Provider.
         * 
         */
        @Deprecated /* `internal_address_space_mappings` will be removed in favour of the property `internal_mapping` in version 4.0 of the AzureRM Provider. */
        public Builder internalAddressSpaceMappings(String... internalAddressSpaceMappings) {
            return internalAddressSpaceMappings(List.of(internalAddressSpaceMappings));
        }

        /**
         * @param internalMappings One or more `internal_mapping` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder internalMappings(@Nullable Output<List<VnpGatewayNatRuleInternalMappingArgs>> internalMappings) {
            $.internalMappings = internalMappings;
            return this;
        }

        /**
         * @param internalMappings One or more `internal_mapping` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder internalMappings(List<VnpGatewayNatRuleInternalMappingArgs> internalMappings) {
            return internalMappings(Output.of(internalMappings));
        }

        /**
         * @param internalMappings One or more `internal_mapping` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder internalMappings(VnpGatewayNatRuleInternalMappingArgs... internalMappings) {
            return internalMappings(List.of(internalMappings));
        }

        /**
         * @param ipConfigurationId The ID of the IP Configuration this VPN Gateway NAT Rule applies to. Possible values are `Instance0` and `Instance1`.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurationId(@Nullable Output<String> ipConfigurationId) {
            $.ipConfigurationId = ipConfigurationId;
            return this;
        }

        /**
         * @param ipConfigurationId The ID of the IP Configuration this VPN Gateway NAT Rule applies to. Possible values are `Instance0` and `Instance1`.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurationId(String ipConfigurationId) {
            return ipConfigurationId(Output.of(ipConfigurationId));
        }

        /**
         * @param mode The source NAT direction of the VPN NAT. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The source NAT direction of the VPN NAT. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name The name which should be used for this VPN Gateway NAT Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this VPN Gateway NAT Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which this VPN Gateway NAT Rule should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which this VPN Gateway NAT Rule should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param type The type of the VPN Gateway NAT Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the VPN Gateway NAT Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vpnGatewayId The ID of the VPN Gateway that this VPN Gateway NAT Rule belongs to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vpnGatewayId(@Nullable Output<String> vpnGatewayId) {
            $.vpnGatewayId = vpnGatewayId;
            return this;
        }

        /**
         * @param vpnGatewayId The ID of the VPN Gateway that this VPN Gateway NAT Rule belongs to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            return vpnGatewayId(Output.of(vpnGatewayId));
        }

        public VnpGatewayNatRuleState build() {
            return $;
        }
    }

}
