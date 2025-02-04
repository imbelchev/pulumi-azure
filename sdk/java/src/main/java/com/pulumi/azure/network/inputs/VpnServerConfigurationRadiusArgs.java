// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusClientRootCertificateArgs;
import com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusServerArgs;
import com.pulumi.azure.network.inputs.VpnServerConfigurationRadiusServerRootCertificateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpnServerConfigurationRadiusArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnServerConfigurationRadiusArgs Empty = new VpnServerConfigurationRadiusArgs();

    /**
     * One or more `client_root_certificate` blocks as defined above.
     * 
     */
    @Import(name="clientRootCertificates")
    private @Nullable Output<List<VpnServerConfigurationRadiusClientRootCertificateArgs>> clientRootCertificates;

    /**
     * @return One or more `client_root_certificate` blocks as defined above.
     * 
     */
    public Optional<Output<List<VpnServerConfigurationRadiusClientRootCertificateArgs>>> clientRootCertificates() {
        return Optional.ofNullable(this.clientRootCertificates);
    }

    /**
     * One or more `server_root_certificate` blocks as defined below.
     * 
     */
    @Import(name="serverRootCertificates")
    private @Nullable Output<List<VpnServerConfigurationRadiusServerRootCertificateArgs>> serverRootCertificates;

    /**
     * @return One or more `server_root_certificate` blocks as defined below.
     * 
     */
    public Optional<Output<List<VpnServerConfigurationRadiusServerRootCertificateArgs>>> serverRootCertificates() {
        return Optional.ofNullable(this.serverRootCertificates);
    }

    /**
     * One or more `server` blocks as defined below.
     * 
     */
    @Import(name="servers")
    private @Nullable Output<List<VpnServerConfigurationRadiusServerArgs>> servers;

    /**
     * @return One or more `server` blocks as defined below.
     * 
     */
    public Optional<Output<List<VpnServerConfigurationRadiusServerArgs>>> servers() {
        return Optional.ofNullable(this.servers);
    }

    private VpnServerConfigurationRadiusArgs() {}

    private VpnServerConfigurationRadiusArgs(VpnServerConfigurationRadiusArgs $) {
        this.clientRootCertificates = $.clientRootCertificates;
        this.serverRootCertificates = $.serverRootCertificates;
        this.servers = $.servers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnServerConfigurationRadiusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnServerConfigurationRadiusArgs $;

        public Builder() {
            $ = new VpnServerConfigurationRadiusArgs();
        }

        public Builder(VpnServerConfigurationRadiusArgs defaults) {
            $ = new VpnServerConfigurationRadiusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientRootCertificates One or more `client_root_certificate` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder clientRootCertificates(@Nullable Output<List<VpnServerConfigurationRadiusClientRootCertificateArgs>> clientRootCertificates) {
            $.clientRootCertificates = clientRootCertificates;
            return this;
        }

        /**
         * @param clientRootCertificates One or more `client_root_certificate` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder clientRootCertificates(List<VpnServerConfigurationRadiusClientRootCertificateArgs> clientRootCertificates) {
            return clientRootCertificates(Output.of(clientRootCertificates));
        }

        /**
         * @param clientRootCertificates One or more `client_root_certificate` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder clientRootCertificates(VpnServerConfigurationRadiusClientRootCertificateArgs... clientRootCertificates) {
            return clientRootCertificates(List.of(clientRootCertificates));
        }

        /**
         * @param serverRootCertificates One or more `server_root_certificate` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder serverRootCertificates(@Nullable Output<List<VpnServerConfigurationRadiusServerRootCertificateArgs>> serverRootCertificates) {
            $.serverRootCertificates = serverRootCertificates;
            return this;
        }

        /**
         * @param serverRootCertificates One or more `server_root_certificate` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder serverRootCertificates(List<VpnServerConfigurationRadiusServerRootCertificateArgs> serverRootCertificates) {
            return serverRootCertificates(Output.of(serverRootCertificates));
        }

        /**
         * @param serverRootCertificates One or more `server_root_certificate` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder serverRootCertificates(VpnServerConfigurationRadiusServerRootCertificateArgs... serverRootCertificates) {
            return serverRootCertificates(List.of(serverRootCertificates));
        }

        /**
         * @param servers One or more `server` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder servers(@Nullable Output<List<VpnServerConfigurationRadiusServerArgs>> servers) {
            $.servers = servers;
            return this;
        }

        /**
         * @param servers One or more `server` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder servers(List<VpnServerConfigurationRadiusServerArgs> servers) {
            return servers(Output.of(servers));
        }

        /**
         * @param servers One or more `server` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder servers(VpnServerConfigurationRadiusServerArgs... servers) {
            return servers(List.of(servers));
        }

        public VpnServerConfigurationRadiusArgs build() {
            return $;
        }
    }

}
