// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnapshotResult {
    private String accountName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Azure Region where the NetApp Snapshot exists.
     * 
     */
    private String location;
    private String name;
    private String poolName;
    private String resourceGroupName;
    private String volumeName;

    private GetSnapshotResult() {}
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region where the NetApp Snapshot exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String poolName() {
        return this.poolName;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public String volumeName() {
        return this.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountName;
        private String id;
        private String location;
        private String name;
        private String poolName;
        private String resourceGroupName;
        private String volumeName;
        public Builder() {}
        public Builder(GetSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.poolName = defaults.poolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.volumeName = defaults.volumeName;
        }

        @CustomType.Setter
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder poolName(String poolName) {
            this.poolName = Objects.requireNonNull(poolName);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder volumeName(String volumeName) {
            this.volumeName = Objects.requireNonNull(volumeName);
            return this;
        }
        public GetSnapshotResult build() {
            final var o = new GetSnapshotResult();
            o.accountName = accountName;
            o.id = id;
            o.location = location;
            o.name = name;
            o.poolName = poolName;
            o.resourceGroupName = resourceGroupName;
            o.volumeName = volumeName;
            return o;
        }
    }
}
