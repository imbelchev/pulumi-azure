// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.azure.containerservice.outputs.KubernetesClusterKeyVaultSecretsProviderSecretIdentity;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterKeyVaultSecretsProvider {
    /**
     * @return An `secret_identity` block is exported. The exported attributes are defined below.
     * 
     */
    private @Nullable List<KubernetesClusterKeyVaultSecretsProviderSecretIdentity> secretIdentities;
    /**
     * @return Is secret rotation enabled?
     * 
     */
    private @Nullable Boolean secretRotationEnabled;
    /**
     * @return The interval to poll for secret rotation. This attribute is only set when `secret_rotation` is true and defaults to `2m`.
     * 
     */
    private @Nullable String secretRotationInterval;

    private KubernetesClusterKeyVaultSecretsProvider() {}
    /**
     * @return An `secret_identity` block is exported. The exported attributes are defined below.
     * 
     */
    public List<KubernetesClusterKeyVaultSecretsProviderSecretIdentity> secretIdentities() {
        return this.secretIdentities == null ? List.of() : this.secretIdentities;
    }
    /**
     * @return Is secret rotation enabled?
     * 
     */
    public Optional<Boolean> secretRotationEnabled() {
        return Optional.ofNullable(this.secretRotationEnabled);
    }
    /**
     * @return The interval to poll for secret rotation. This attribute is only set when `secret_rotation` is true and defaults to `2m`.
     * 
     */
    public Optional<String> secretRotationInterval() {
        return Optional.ofNullable(this.secretRotationInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterKeyVaultSecretsProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<KubernetesClusterKeyVaultSecretsProviderSecretIdentity> secretIdentities;
        private @Nullable Boolean secretRotationEnabled;
        private @Nullable String secretRotationInterval;
        public Builder() {}
        public Builder(KubernetesClusterKeyVaultSecretsProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretIdentities = defaults.secretIdentities;
    	      this.secretRotationEnabled = defaults.secretRotationEnabled;
    	      this.secretRotationInterval = defaults.secretRotationInterval;
        }

        @CustomType.Setter
        public Builder secretIdentities(@Nullable List<KubernetesClusterKeyVaultSecretsProviderSecretIdentity> secretIdentities) {
            this.secretIdentities = secretIdentities;
            return this;
        }
        public Builder secretIdentities(KubernetesClusterKeyVaultSecretsProviderSecretIdentity... secretIdentities) {
            return secretIdentities(List.of(secretIdentities));
        }
        @CustomType.Setter
        public Builder secretRotationEnabled(@Nullable Boolean secretRotationEnabled) {
            this.secretRotationEnabled = secretRotationEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder secretRotationInterval(@Nullable String secretRotationInterval) {
            this.secretRotationInterval = secretRotationInterval;
            return this;
        }
        public KubernetesClusterKeyVaultSecretsProvider build() {
            final var o = new KubernetesClusterKeyVaultSecretsProvider();
            o.secretIdentities = secretIdentities;
            o.secretRotationEnabled = secretRotationEnabled;
            o.secretRotationInterval = secretRotationInterval;
            return o;
        }
    }
}
