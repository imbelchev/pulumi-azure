// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterUpgradePolicyHealthPolicy {
    /**
     * @return Specifies the maximum tolerated percentage of applications that can have aggregated health state of error. If the upgrade exceeds this percentage, the cluster is unhealthy. Defaults to `0`.
     * 
     */
    private @Nullable Integer maxUnhealthyApplicationsPercent;
    /**
     * @return Specifies the maximum tolerated percentage of nodes that can have aggregated health states of error. If an upgrade exceeds this percentage, the cluster is unhealthy. Defaults to `0`.
     * 
     */
    private @Nullable Integer maxUnhealthyNodesPercent;

    private ClusterUpgradePolicyHealthPolicy() {}
    /**
     * @return Specifies the maximum tolerated percentage of applications that can have aggregated health state of error. If the upgrade exceeds this percentage, the cluster is unhealthy. Defaults to `0`.
     * 
     */
    public Optional<Integer> maxUnhealthyApplicationsPercent() {
        return Optional.ofNullable(this.maxUnhealthyApplicationsPercent);
    }
    /**
     * @return Specifies the maximum tolerated percentage of nodes that can have aggregated health states of error. If an upgrade exceeds this percentage, the cluster is unhealthy. Defaults to `0`.
     * 
     */
    public Optional<Integer> maxUnhealthyNodesPercent() {
        return Optional.ofNullable(this.maxUnhealthyNodesPercent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterUpgradePolicyHealthPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxUnhealthyApplicationsPercent;
        private @Nullable Integer maxUnhealthyNodesPercent;
        public Builder() {}
        public Builder(ClusterUpgradePolicyHealthPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnhealthyApplicationsPercent = defaults.maxUnhealthyApplicationsPercent;
    	      this.maxUnhealthyNodesPercent = defaults.maxUnhealthyNodesPercent;
        }

        @CustomType.Setter
        public Builder maxUnhealthyApplicationsPercent(@Nullable Integer maxUnhealthyApplicationsPercent) {
            this.maxUnhealthyApplicationsPercent = maxUnhealthyApplicationsPercent;
            return this;
        }
        @CustomType.Setter
        public Builder maxUnhealthyNodesPercent(@Nullable Integer maxUnhealthyNodesPercent) {
            this.maxUnhealthyNodesPercent = maxUnhealthyNodesPercent;
            return this;
        }
        public ClusterUpgradePolicyHealthPolicy build() {
            final var o = new ClusterUpgradePolicyHealthPolicy();
            o.maxUnhealthyApplicationsPercent = maxUnhealthyApplicationsPercent;
            o.maxUnhealthyNodesPercent = maxUnhealthyNodesPercent;
            return o;
        }
    }
}
