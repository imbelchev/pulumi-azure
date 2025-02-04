// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.config.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeaturesKeyVault {
    private @Nullable Boolean purgeSoftDeleteOnDestroy;
    private @Nullable Boolean purgeSoftDeletedCertificatesOnDestroy;
    private @Nullable Boolean purgeSoftDeletedHardwareSecurityModulesOnDestroy;
    private @Nullable Boolean purgeSoftDeletedKeysOnDestroy;
    private @Nullable Boolean purgeSoftDeletedSecretsOnDestroy;
    private @Nullable Boolean recoverSoftDeletedCertificates;
    private @Nullable Boolean recoverSoftDeletedKeyVaults;
    private @Nullable Boolean recoverSoftDeletedKeys;
    private @Nullable Boolean recoverSoftDeletedSecrets;

    private FeaturesKeyVault() {}
    public Optional<Boolean> purgeSoftDeleteOnDestroy() {
        return Optional.ofNullable(this.purgeSoftDeleteOnDestroy);
    }
    public Optional<Boolean> purgeSoftDeletedCertificatesOnDestroy() {
        return Optional.ofNullable(this.purgeSoftDeletedCertificatesOnDestroy);
    }
    public Optional<Boolean> purgeSoftDeletedHardwareSecurityModulesOnDestroy() {
        return Optional.ofNullable(this.purgeSoftDeletedHardwareSecurityModulesOnDestroy);
    }
    public Optional<Boolean> purgeSoftDeletedKeysOnDestroy() {
        return Optional.ofNullable(this.purgeSoftDeletedKeysOnDestroy);
    }
    public Optional<Boolean> purgeSoftDeletedSecretsOnDestroy() {
        return Optional.ofNullable(this.purgeSoftDeletedSecretsOnDestroy);
    }
    public Optional<Boolean> recoverSoftDeletedCertificates() {
        return Optional.ofNullable(this.recoverSoftDeletedCertificates);
    }
    public Optional<Boolean> recoverSoftDeletedKeyVaults() {
        return Optional.ofNullable(this.recoverSoftDeletedKeyVaults);
    }
    public Optional<Boolean> recoverSoftDeletedKeys() {
        return Optional.ofNullable(this.recoverSoftDeletedKeys);
    }
    public Optional<Boolean> recoverSoftDeletedSecrets() {
        return Optional.ofNullable(this.recoverSoftDeletedSecrets);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeaturesKeyVault defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean purgeSoftDeleteOnDestroy;
        private @Nullable Boolean purgeSoftDeletedCertificatesOnDestroy;
        private @Nullable Boolean purgeSoftDeletedHardwareSecurityModulesOnDestroy;
        private @Nullable Boolean purgeSoftDeletedKeysOnDestroy;
        private @Nullable Boolean purgeSoftDeletedSecretsOnDestroy;
        private @Nullable Boolean recoverSoftDeletedCertificates;
        private @Nullable Boolean recoverSoftDeletedKeyVaults;
        private @Nullable Boolean recoverSoftDeletedKeys;
        private @Nullable Boolean recoverSoftDeletedSecrets;
        public Builder() {}
        public Builder(FeaturesKeyVault defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.purgeSoftDeleteOnDestroy = defaults.purgeSoftDeleteOnDestroy;
    	      this.purgeSoftDeletedCertificatesOnDestroy = defaults.purgeSoftDeletedCertificatesOnDestroy;
    	      this.purgeSoftDeletedHardwareSecurityModulesOnDestroy = defaults.purgeSoftDeletedHardwareSecurityModulesOnDestroy;
    	      this.purgeSoftDeletedKeysOnDestroy = defaults.purgeSoftDeletedKeysOnDestroy;
    	      this.purgeSoftDeletedSecretsOnDestroy = defaults.purgeSoftDeletedSecretsOnDestroy;
    	      this.recoverSoftDeletedCertificates = defaults.recoverSoftDeletedCertificates;
    	      this.recoverSoftDeletedKeyVaults = defaults.recoverSoftDeletedKeyVaults;
    	      this.recoverSoftDeletedKeys = defaults.recoverSoftDeletedKeys;
    	      this.recoverSoftDeletedSecrets = defaults.recoverSoftDeletedSecrets;
        }

        @CustomType.Setter
        public Builder purgeSoftDeleteOnDestroy(@Nullable Boolean purgeSoftDeleteOnDestroy) {
            this.purgeSoftDeleteOnDestroy = purgeSoftDeleteOnDestroy;
            return this;
        }
        @CustomType.Setter
        public Builder purgeSoftDeletedCertificatesOnDestroy(@Nullable Boolean purgeSoftDeletedCertificatesOnDestroy) {
            this.purgeSoftDeletedCertificatesOnDestroy = purgeSoftDeletedCertificatesOnDestroy;
            return this;
        }
        @CustomType.Setter
        public Builder purgeSoftDeletedHardwareSecurityModulesOnDestroy(@Nullable Boolean purgeSoftDeletedHardwareSecurityModulesOnDestroy) {
            this.purgeSoftDeletedHardwareSecurityModulesOnDestroy = purgeSoftDeletedHardwareSecurityModulesOnDestroy;
            return this;
        }
        @CustomType.Setter
        public Builder purgeSoftDeletedKeysOnDestroy(@Nullable Boolean purgeSoftDeletedKeysOnDestroy) {
            this.purgeSoftDeletedKeysOnDestroy = purgeSoftDeletedKeysOnDestroy;
            return this;
        }
        @CustomType.Setter
        public Builder purgeSoftDeletedSecretsOnDestroy(@Nullable Boolean purgeSoftDeletedSecretsOnDestroy) {
            this.purgeSoftDeletedSecretsOnDestroy = purgeSoftDeletedSecretsOnDestroy;
            return this;
        }
        @CustomType.Setter
        public Builder recoverSoftDeletedCertificates(@Nullable Boolean recoverSoftDeletedCertificates) {
            this.recoverSoftDeletedCertificates = recoverSoftDeletedCertificates;
            return this;
        }
        @CustomType.Setter
        public Builder recoverSoftDeletedKeyVaults(@Nullable Boolean recoverSoftDeletedKeyVaults) {
            this.recoverSoftDeletedKeyVaults = recoverSoftDeletedKeyVaults;
            return this;
        }
        @CustomType.Setter
        public Builder recoverSoftDeletedKeys(@Nullable Boolean recoverSoftDeletedKeys) {
            this.recoverSoftDeletedKeys = recoverSoftDeletedKeys;
            return this;
        }
        @CustomType.Setter
        public Builder recoverSoftDeletedSecrets(@Nullable Boolean recoverSoftDeletedSecrets) {
            this.recoverSoftDeletedSecrets = recoverSoftDeletedSecrets;
            return this;
        }
        public FeaturesKeyVault build() {
            final var o = new FeaturesKeyVault();
            o.purgeSoftDeleteOnDestroy = purgeSoftDeleteOnDestroy;
            o.purgeSoftDeletedCertificatesOnDestroy = purgeSoftDeletedCertificatesOnDestroy;
            o.purgeSoftDeletedHardwareSecurityModulesOnDestroy = purgeSoftDeletedHardwareSecurityModulesOnDestroy;
            o.purgeSoftDeletedKeysOnDestroy = purgeSoftDeletedKeysOnDestroy;
            o.purgeSoftDeletedSecretsOnDestroy = purgeSoftDeletedSecretsOnDestroy;
            o.recoverSoftDeletedCertificates = recoverSoftDeletedCertificates;
            o.recoverSoftDeletedKeyVaults = recoverSoftDeletedKeyVaults;
            o.recoverSoftDeletedKeys = recoverSoftDeletedKeys;
            o.recoverSoftDeletedSecrets = recoverSoftDeletedSecrets;
            return o;
        }
    }
}
