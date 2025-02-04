// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PoolStartTaskContainerRegistry {
    /**
     * @return The password to log into the registry server. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String password;
    /**
     * @return The container registry URL. The default is &#34;docker.io&#34;. Changing this forces a new resource to be created.
     * 
     */
    private String registryServer;
    /**
     * @return An identity reference from pool&#39;s user assigned managed identity list.
     * 
     */
    private @Nullable String userAssignedIdentityId;
    /**
     * @return The username to be used by the Batch pool start task.
     * 
     */
    private @Nullable String userName;

    private PoolStartTaskContainerRegistry() {}
    /**
     * @return The password to log into the registry server. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return The container registry URL. The default is &#34;docker.io&#34;. Changing this forces a new resource to be created.
     * 
     */
    public String registryServer() {
        return this.registryServer;
    }
    /**
     * @return An identity reference from pool&#39;s user assigned managed identity list.
     * 
     */
    public Optional<String> userAssignedIdentityId() {
        return Optional.ofNullable(this.userAssignedIdentityId);
    }
    /**
     * @return The username to be used by the Batch pool start task.
     * 
     */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoolStartTaskContainerRegistry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String password;
        private String registryServer;
        private @Nullable String userAssignedIdentityId;
        private @Nullable String userName;
        public Builder() {}
        public Builder(PoolStartTaskContainerRegistry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.registryServer = defaults.registryServer;
    	      this.userAssignedIdentityId = defaults.userAssignedIdentityId;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder registryServer(String registryServer) {
            this.registryServer = Objects.requireNonNull(registryServer);
            return this;
        }
        @CustomType.Setter
        public Builder userAssignedIdentityId(@Nullable String userAssignedIdentityId) {
            this.userAssignedIdentityId = userAssignedIdentityId;
            return this;
        }
        @CustomType.Setter
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        public PoolStartTaskContainerRegistry build() {
            final var o = new PoolStartTaskContainerRegistry();
            o.password = password;
            o.registryServer = registryServer;
            o.userAssignedIdentityId = userAssignedIdentityId;
            o.userName = userName;
            return o;
        }
    }
}
