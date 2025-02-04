// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hpc.outputs;

import com.pulumi.azure.hpc.outputs.CacheDirectoryLdapBind;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CacheDirectoryLdap {
    /**
     * @return The base distinguished name (DN) for the LDAP domain.
     * 
     */
    private String baseDn;
    /**
     * @return A `bind` block as defined above.
     * 
     */
    private @Nullable CacheDirectoryLdapBind bind;
    /**
     * @return The URI of the CA certificate to validate the LDAP secure connection.
     * 
     */
    private @Nullable String certificateValidationUri;
    /**
     * @return Whether the certificate should be automatically downloaded. This can be set to `true` only when `certificate_validation_uri` is provided.
     * 
     */
    private @Nullable Boolean downloadCertificateAutomatically;
    /**
     * @return Whether the LDAP connection should be encrypted?
     * 
     */
    private @Nullable Boolean encrypted;
    /**
     * @return The FQDN or IP address of the LDAP server.
     * 
     */
    private String server;

    private CacheDirectoryLdap() {}
    /**
     * @return The base distinguished name (DN) for the LDAP domain.
     * 
     */
    public String baseDn() {
        return this.baseDn;
    }
    /**
     * @return A `bind` block as defined above.
     * 
     */
    public Optional<CacheDirectoryLdapBind> bind() {
        return Optional.ofNullable(this.bind);
    }
    /**
     * @return The URI of the CA certificate to validate the LDAP secure connection.
     * 
     */
    public Optional<String> certificateValidationUri() {
        return Optional.ofNullable(this.certificateValidationUri);
    }
    /**
     * @return Whether the certificate should be automatically downloaded. This can be set to `true` only when `certificate_validation_uri` is provided.
     * 
     */
    public Optional<Boolean> downloadCertificateAutomatically() {
        return Optional.ofNullable(this.downloadCertificateAutomatically);
    }
    /**
     * @return Whether the LDAP connection should be encrypted?
     * 
     */
    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * @return The FQDN or IP address of the LDAP server.
     * 
     */
    public String server() {
        return this.server;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheDirectoryLdap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String baseDn;
        private @Nullable CacheDirectoryLdapBind bind;
        private @Nullable String certificateValidationUri;
        private @Nullable Boolean downloadCertificateAutomatically;
        private @Nullable Boolean encrypted;
        private String server;
        public Builder() {}
        public Builder(CacheDirectoryLdap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseDn = defaults.baseDn;
    	      this.bind = defaults.bind;
    	      this.certificateValidationUri = defaults.certificateValidationUri;
    	      this.downloadCertificateAutomatically = defaults.downloadCertificateAutomatically;
    	      this.encrypted = defaults.encrypted;
    	      this.server = defaults.server;
        }

        @CustomType.Setter
        public Builder baseDn(String baseDn) {
            this.baseDn = Objects.requireNonNull(baseDn);
            return this;
        }
        @CustomType.Setter
        public Builder bind(@Nullable CacheDirectoryLdapBind bind) {
            this.bind = bind;
            return this;
        }
        @CustomType.Setter
        public Builder certificateValidationUri(@Nullable String certificateValidationUri) {
            this.certificateValidationUri = certificateValidationUri;
            return this;
        }
        @CustomType.Setter
        public Builder downloadCertificateAutomatically(@Nullable Boolean downloadCertificateAutomatically) {
            this.downloadCertificateAutomatically = downloadCertificateAutomatically;
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        @CustomType.Setter
        public Builder server(String server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }
        public CacheDirectoryLdap build() {
            final var o = new CacheDirectoryLdap();
            o.baseDn = baseDn;
            o.bind = bind;
            o.certificateValidationUri = certificateValidationUri;
            o.downloadCertificateAutomatically = downloadCertificateAutomatically;
            o.encrypted = encrypted;
            o.server = server;
            return o;
        }
    }
}
