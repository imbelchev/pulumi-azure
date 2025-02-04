// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lighthouse.outputs;

import com.pulumi.azure.lighthouse.outputs.DefinitionEligibleAuthorizationJustInTimeAccessPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DefinitionEligibleAuthorization {
    /**
     * @return A `just_in_time_access_policy` block as defined below.
     * 
     */
    private @Nullable DefinitionEligibleAuthorizationJustInTimeAccessPolicy justInTimeAccessPolicy;
    /**
     * @return The display name of the Azure Active Directory Principal.
     * 
     */
    private @Nullable String principalDisplayName;
    /**
     * @return The Principal ID of the Azure Active Directory.
     * 
     */
    private String principalId;
    /**
     * @return The Principal ID of the Azure built-in role that defines the permissions that the Azure Active Directory will have on the projected scope.
     * 
     */
    private String roleDefinitionId;

    private DefinitionEligibleAuthorization() {}
    /**
     * @return A `just_in_time_access_policy` block as defined below.
     * 
     */
    public Optional<DefinitionEligibleAuthorizationJustInTimeAccessPolicy> justInTimeAccessPolicy() {
        return Optional.ofNullable(this.justInTimeAccessPolicy);
    }
    /**
     * @return The display name of the Azure Active Directory Principal.
     * 
     */
    public Optional<String> principalDisplayName() {
        return Optional.ofNullable(this.principalDisplayName);
    }
    /**
     * @return The Principal ID of the Azure Active Directory.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The Principal ID of the Azure built-in role that defines the permissions that the Azure Active Directory will have on the projected scope.
     * 
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefinitionEligibleAuthorization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DefinitionEligibleAuthorizationJustInTimeAccessPolicy justInTimeAccessPolicy;
        private @Nullable String principalDisplayName;
        private String principalId;
        private String roleDefinitionId;
        public Builder() {}
        public Builder(DefinitionEligibleAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.justInTimeAccessPolicy = defaults.justInTimeAccessPolicy;
    	      this.principalDisplayName = defaults.principalDisplayName;
    	      this.principalId = defaults.principalId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        @CustomType.Setter
        public Builder justInTimeAccessPolicy(@Nullable DefinitionEligibleAuthorizationJustInTimeAccessPolicy justInTimeAccessPolicy) {
            this.justInTimeAccessPolicy = justInTimeAccessPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder principalDisplayName(@Nullable String principalDisplayName) {
            this.principalDisplayName = principalDisplayName;
            return this;
        }
        @CustomType.Setter
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        @CustomType.Setter
        public Builder roleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }
        public DefinitionEligibleAuthorization build() {
            final var o = new DefinitionEligibleAuthorization();
            o.justInTimeAccessPolicy = justInTimeAccessPolicy;
            o.principalDisplayName = principalDisplayName;
            o.principalId = principalId;
            o.roleDefinitionId = roleDefinitionId;
            return o;
        }
    }
}
