// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessConnectorIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessConnectorIdentityArgs Empty = new AccessConnectorIdentityArgs();

    /**
     * The object id of an existing principal. If not specified, a new system-assigned managed identity is created.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The object id of an existing principal. If not specified, a new system-assigned managed identity is created.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The tenant id in which the principal resides.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The tenant id in which the principal resides.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * The type of identity to use for this Access Connector. `SystemAssigned` is the only possible value.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of identity to use for this Access Connector. `SystemAssigned` is the only possible value.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AccessConnectorIdentityArgs() {}

    private AccessConnectorIdentityArgs(AccessConnectorIdentityArgs $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessConnectorIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessConnectorIdentityArgs $;

        public Builder() {
            $ = new AccessConnectorIdentityArgs();
        }

        public Builder(AccessConnectorIdentityArgs defaults) {
            $ = new AccessConnectorIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId The object id of an existing principal. If not specified, a new system-assigned managed identity is created.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The object id of an existing principal. If not specified, a new system-assigned managed identity is created.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param tenantId The tenant id in which the principal resides.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The tenant id in which the principal resides.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type The type of identity to use for this Access Connector. `SystemAssigned` is the only possible value.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of identity to use for this Access Connector. `SystemAssigned` is the only possible value.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AccessConnectorIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
