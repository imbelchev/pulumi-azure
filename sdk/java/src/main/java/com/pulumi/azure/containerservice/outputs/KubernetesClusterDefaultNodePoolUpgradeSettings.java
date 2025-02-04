// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KubernetesClusterDefaultNodePoolUpgradeSettings {
    /**
     * @return The maximum number or percentage of nodes which will be added to the Node Pool size during an upgrade.
     * 
     */
    private String maxSurge;

    private KubernetesClusterDefaultNodePoolUpgradeSettings() {}
    /**
     * @return The maximum number or percentage of nodes which will be added to the Node Pool size during an upgrade.
     * 
     */
    public String maxSurge() {
        return this.maxSurge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterDefaultNodePoolUpgradeSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String maxSurge;
        public Builder() {}
        public Builder(KubernetesClusterDefaultNodePoolUpgradeSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
        }

        @CustomType.Setter
        public Builder maxSurge(String maxSurge) {
            this.maxSurge = Objects.requireNonNull(maxSurge);
            return this;
        }
        public KubernetesClusterDefaultNodePoolUpgradeSettings build() {
            final var o = new KubernetesClusterDefaultNodePoolUpgradeSettings();
            o.maxSurge = maxSurge;
            return o;
        }
    }
}
