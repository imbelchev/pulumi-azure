// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterLinuxProfileSshKey;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKubernetesClusterLinuxProfile {
    /**
     * @return The username associated with the administrator account of the Windows VMs.
     * 
     */
    private String adminUsername;
    /**
     * @return An `ssh_key` block as defined below.
     * 
     */
    private List<GetKubernetesClusterLinuxProfileSshKey> sshKeys;

    private GetKubernetesClusterLinuxProfile() {}
    /**
     * @return The username associated with the administrator account of the Windows VMs.
     * 
     */
    public String adminUsername() {
        return this.adminUsername;
    }
    /**
     * @return An `ssh_key` block as defined below.
     * 
     */
    public List<GetKubernetesClusterLinuxProfileSshKey> sshKeys() {
        return this.sshKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClusterLinuxProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String adminUsername;
        private List<GetKubernetesClusterLinuxProfileSshKey> sshKeys;
        public Builder() {}
        public Builder(GetKubernetesClusterLinuxProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUsername = defaults.adminUsername;
    	      this.sshKeys = defaults.sshKeys;
        }

        @CustomType.Setter
        public Builder adminUsername(String adminUsername) {
            this.adminUsername = Objects.requireNonNull(adminUsername);
            return this;
        }
        @CustomType.Setter
        public Builder sshKeys(List<GetKubernetesClusterLinuxProfileSshKey> sshKeys) {
            this.sshKeys = Objects.requireNonNull(sshKeys);
            return this;
        }
        public Builder sshKeys(GetKubernetesClusterLinuxProfileSshKey... sshKeys) {
            return sshKeys(List.of(sshKeys));
        }
        public GetKubernetesClusterLinuxProfile build() {
            final var o = new GetKubernetesClusterLinuxProfile();
            o.adminUsername = adminUsername;
            o.sshKeys = sshKeys;
            return o;
        }
    }
}
