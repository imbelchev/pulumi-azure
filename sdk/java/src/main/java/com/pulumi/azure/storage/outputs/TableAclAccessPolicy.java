// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TableAclAccessPolicy {
    /**
     * @return The ISO8061 UTC time at which this Access Policy should be valid until.
     * 
     */
    private String expiry;
    /**
     * @return The permissions which should associated with this Shared Identifier.
     * 
     */
    private String permissions;
    /**
     * @return The ISO8061 UTC time at which this Access Policy should be valid from.
     * 
     */
    private String start;

    private TableAclAccessPolicy() {}
    /**
     * @return The ISO8061 UTC time at which this Access Policy should be valid until.
     * 
     */
    public String expiry() {
        return this.expiry;
    }
    /**
     * @return The permissions which should associated with this Shared Identifier.
     * 
     */
    public String permissions() {
        return this.permissions;
    }
    /**
     * @return The ISO8061 UTC time at which this Access Policy should be valid from.
     * 
     */
    public String start() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableAclAccessPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expiry;
        private String permissions;
        private String start;
        public Builder() {}
        public Builder(TableAclAccessPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiry = defaults.expiry;
    	      this.permissions = defaults.permissions;
    	      this.start = defaults.start;
        }

        @CustomType.Setter
        public Builder expiry(String expiry) {
            this.expiry = Objects.requireNonNull(expiry);
            return this;
        }
        @CustomType.Setter
        public Builder permissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        @CustomType.Setter
        public Builder start(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public TableAclAccessPolicy build() {
            final var o = new TableAclAccessPolicy();
            o.expiry = expiry;
            o.permissions = permissions;
            o.start = start;
            return o;
        }
    }
}
