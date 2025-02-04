// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.VpnSiteO365PolicyTrafficCategory;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnSiteO365Policy {
    /**
     * @return A `traffic_category` block as defined above.
     * 
     */
    private @Nullable VpnSiteO365PolicyTrafficCategory trafficCategory;

    private VpnSiteO365Policy() {}
    /**
     * @return A `traffic_category` block as defined above.
     * 
     */
    public Optional<VpnSiteO365PolicyTrafficCategory> trafficCategory() {
        return Optional.ofNullable(this.trafficCategory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnSiteO365Policy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VpnSiteO365PolicyTrafficCategory trafficCategory;
        public Builder() {}
        public Builder(VpnSiteO365Policy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trafficCategory = defaults.trafficCategory;
        }

        @CustomType.Setter
        public Builder trafficCategory(@Nullable VpnSiteO365PolicyTrafficCategory trafficCategory) {
            this.trafficCategory = trafficCategory;
            return this;
        }
        public VpnSiteO365Policy build() {
            final var o = new VpnSiteO365Policy();
            o.trafficCategory = trafficCategory;
            return o;
        }
    }
}
