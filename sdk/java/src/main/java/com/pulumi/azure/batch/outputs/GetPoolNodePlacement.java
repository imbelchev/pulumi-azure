// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPoolNodePlacement {
    /**
     * @return The placement policy for allocating nodes in the pool.
     * 
     */
    private String policy;

    private GetPoolNodePlacement() {}
    /**
     * @return The placement policy for allocating nodes in the pool.
     * 
     */
    public String policy() {
        return this.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolNodePlacement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String policy;
        public Builder() {}
        public Builder(GetPoolNodePlacement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
        }

        @CustomType.Setter
        public Builder policy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public GetPoolNodePlacement build() {
            final var o = new GetPoolNodePlacement();
            o.policy = policy;
            return o;
        }
    }
}
