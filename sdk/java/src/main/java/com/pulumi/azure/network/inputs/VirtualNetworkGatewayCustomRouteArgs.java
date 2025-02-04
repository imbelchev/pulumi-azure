// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkGatewayCustomRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayCustomRouteArgs Empty = new VirtualNetworkGatewayCustomRouteArgs();

    /**
     * A list of address blocks reserved for this virtual network in CIDR notation as defined below.
     * 
     */
    @Import(name="addressPrefixes")
    private @Nullable Output<List<String>> addressPrefixes;

    /**
     * @return A list of address blocks reserved for this virtual network in CIDR notation as defined below.
     * 
     */
    public Optional<Output<List<String>>> addressPrefixes() {
        return Optional.ofNullable(this.addressPrefixes);
    }

    private VirtualNetworkGatewayCustomRouteArgs() {}

    private VirtualNetworkGatewayCustomRouteArgs(VirtualNetworkGatewayCustomRouteArgs $) {
        this.addressPrefixes = $.addressPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkGatewayCustomRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkGatewayCustomRouteArgs $;

        public Builder() {
            $ = new VirtualNetworkGatewayCustomRouteArgs();
        }

        public Builder(VirtualNetworkGatewayCustomRouteArgs defaults) {
            $ = new VirtualNetworkGatewayCustomRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefixes A list of address blocks reserved for this virtual network in CIDR notation as defined below.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(@Nullable Output<List<String>> addressPrefixes) {
            $.addressPrefixes = addressPrefixes;
            return this;
        }

        /**
         * @param addressPrefixes A list of address blocks reserved for this virtual network in CIDR notation as defined below.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(List<String> addressPrefixes) {
            return addressPrefixes(Output.of(addressPrefixes));
        }

        /**
         * @param addressPrefixes A list of address blocks reserved for this virtual network in CIDR notation as defined below.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }

        public VirtualNetworkGatewayCustomRouteArgs build() {
            return $;
        }
    }

}
