// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.GetVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress {
    /**
     * @return The domain name label for the DNS settings.
     * 
     */
    private String domainNameLabel;
    /**
     * @return The idle timeout in minutes.
     * 
     */
    private Integer idleTimeoutInMinutes;
    /**
     * @return A list of `ip_tag` blocks as defined below.
     * 
     */
    private List<GetVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags;
    /**
     * @return The name of this Virtual Machine Scale Set.
     * 
     */
    private String name;
    /**
     * @return The ID of the public IP prefix.
     * 
     */
    private String publicIpPrefixId;
    /**
     * @return The Internet Protocol Version of the public IP address.
     * 
     */
    private String version;

    private GetVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress() {}
    /**
     * @return The domain name label for the DNS settings.
     * 
     */
    public String domainNameLabel() {
        return this.domainNameLabel;
    }
    /**
     * @return The idle timeout in minutes.
     * 
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }
    /**
     * @return A list of `ip_tag` blocks as defined below.
     * 
     */
    public List<GetVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags() {
        return this.ipTags;
    }
    /**
     * @return The name of this Virtual Machine Scale Set.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the public IP prefix.
     * 
     */
    public String publicIpPrefixId() {
        return this.publicIpPrefixId;
    }
    /**
     * @return The Internet Protocol Version of the public IP address.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String domainNameLabel;
        private Integer idleTimeoutInMinutes;
        private List<GetVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags;
        private String name;
        private String publicIpPrefixId;
        private String version;
        public Builder() {}
        public Builder(GetVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainNameLabel = defaults.domainNameLabel;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.ipTags = defaults.ipTags;
    	      this.name = defaults.name;
    	      this.publicIpPrefixId = defaults.publicIpPrefixId;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder domainNameLabel(String domainNameLabel) {
            this.domainNameLabel = Objects.requireNonNull(domainNameLabel);
            return this;
        }
        @CustomType.Setter
        public Builder idleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = Objects.requireNonNull(idleTimeoutInMinutes);
            return this;
        }
        @CustomType.Setter
        public Builder ipTags(List<GetVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags) {
            this.ipTags = Objects.requireNonNull(ipTags);
            return this;
        }
        public Builder ipTags(GetVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag... ipTags) {
            return ipTags(List.of(ipTags));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder publicIpPrefixId(String publicIpPrefixId) {
            this.publicIpPrefixId = Objects.requireNonNull(publicIpPrefixId);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress build() {
            final var o = new GetVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress();
            o.domainNameLabel = domainNameLabel;
            o.idleTimeoutInMinutes = idleTimeoutInMinutes;
            o.ipTags = ipTags;
            o.name = name;
            o.publicIpPrefixId = publicIpPrefixId;
            o.version = version;
            return o;
        }
    }
}
