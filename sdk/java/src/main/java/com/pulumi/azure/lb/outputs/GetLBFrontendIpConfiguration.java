// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLBFrontendIpConfiguration {
    /**
     * @return The id of the Frontend IP Configuration.
     * 
     */
    private String id;
    /**
     * @return Specifies the name of the Load Balancer.
     * 
     */
    private String name;
    /**
     * @return Private IP Address to assign to the Load Balancer.
     * 
     */
    private String privateIpAddress;
    /**
     * @return The allocation method for the Private IP Address used by this Load Balancer.
     * 
     */
    private String privateIpAddressAllocation;
    /**
     * @return The Private IP Address Version, either `IPv4` or `IPv6`.
     * 
     */
    private String privateIpAddressVersion;
    /**
     * @return The ID of a  Public IP Address which is associated with this Load Balancer.
     * 
     */
    private String publicIpAddressId;
    /**
     * @return The ID of the Subnet which is associated with the IP Configuration.
     * 
     */
    private String subnetId;
    /**
     * @return A list of Availability Zones which the Load Balancer&#39;s IP Addresses should be created in.
     * 
     */
    private List<String> zones;

    private GetLBFrontendIpConfiguration() {}
    /**
     * @return The id of the Frontend IP Configuration.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Specifies the name of the Load Balancer.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Private IP Address to assign to the Load Balancer.
     * 
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * @return The allocation method for the Private IP Address used by this Load Balancer.
     * 
     */
    public String privateIpAddressAllocation() {
        return this.privateIpAddressAllocation;
    }
    /**
     * @return The Private IP Address Version, either `IPv4` or `IPv6`.
     * 
     */
    public String privateIpAddressVersion() {
        return this.privateIpAddressVersion;
    }
    /**
     * @return The ID of a  Public IP Address which is associated with this Load Balancer.
     * 
     */
    public String publicIpAddressId() {
        return this.publicIpAddressId;
    }
    /**
     * @return The ID of the Subnet which is associated with the IP Configuration.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return A list of Availability Zones which the Load Balancer&#39;s IP Addresses should be created in.
     * 
     */
    public List<String> zones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLBFrontendIpConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private String privateIpAddress;
        private String privateIpAddressAllocation;
        private String privateIpAddressVersion;
        private String publicIpAddressId;
        private String subnetId;
        private List<String> zones;
        public Builder() {}
        public Builder(GetLBFrontendIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.privateIpAddressAllocation = defaults.privateIpAddressAllocation;
    	      this.privateIpAddressVersion = defaults.privateIpAddressVersion;
    	      this.publicIpAddressId = defaults.publicIpAddressId;
    	      this.subnetId = defaults.subnetId;
    	      this.zones = defaults.zones;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddressAllocation(String privateIpAddressAllocation) {
            this.privateIpAddressAllocation = Objects.requireNonNull(privateIpAddressAllocation);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddressVersion(String privateIpAddressVersion) {
            this.privateIpAddressVersion = Objects.requireNonNull(privateIpAddressVersion);
            return this;
        }
        @CustomType.Setter
        public Builder publicIpAddressId(String publicIpAddressId) {
            this.publicIpAddressId = Objects.requireNonNull(publicIpAddressId);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        @CustomType.Setter
        public Builder zones(List<String> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }
        public GetLBFrontendIpConfiguration build() {
            final var o = new GetLBFrontendIpConfiguration();
            o.id = id;
            o.name = name;
            o.privateIpAddress = privateIpAddress;
            o.privateIpAddressAllocation = privateIpAddressAllocation;
            o.privateIpAddressVersion = privateIpAddressVersion;
            o.publicIpAddressId = publicIpAddressId;
            o.subnetId = subnetId;
            o.zones = zones;
            return o;
        }
    }
}
