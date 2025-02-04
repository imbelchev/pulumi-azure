// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.azure.containerservice.outputs.KubernetesClusterLinuxProfileSshKey;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KubernetesClusterLinuxProfile {
    /**
     * @return The Admin Username for the Cluster. Changing this forces a new resource to be created.
     * 
     */
    private String adminUsername;
    /**
     * @return An `ssh_key` block. Only one is currently allowed. Changing this will update the key on all node pools. More information can be found in [the documentation](https://learn.microsoft.com/en-us/azure/aks/node-access#update-ssh-key-on-an-existing-aks-cluster-preview).
     * 
     */
    private KubernetesClusterLinuxProfileSshKey sshKey;

    private KubernetesClusterLinuxProfile() {}
    /**
     * @return The Admin Username for the Cluster. Changing this forces a new resource to be created.
     * 
     */
    public String adminUsername() {
        return this.adminUsername;
    }
    /**
     * @return An `ssh_key` block. Only one is currently allowed. Changing this will update the key on all node pools. More information can be found in [the documentation](https://learn.microsoft.com/en-us/azure/aks/node-access#update-ssh-key-on-an-existing-aks-cluster-preview).
     * 
     */
    public KubernetesClusterLinuxProfileSshKey sshKey() {
        return this.sshKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterLinuxProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String adminUsername;
        private KubernetesClusterLinuxProfileSshKey sshKey;
        public Builder() {}
        public Builder(KubernetesClusterLinuxProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUsername = defaults.adminUsername;
    	      this.sshKey = defaults.sshKey;
        }

        @CustomType.Setter
        public Builder adminUsername(String adminUsername) {
            this.adminUsername = Objects.requireNonNull(adminUsername);
            return this;
        }
        @CustomType.Setter
        public Builder sshKey(KubernetesClusterLinuxProfileSshKey sshKey) {
            this.sshKey = Objects.requireNonNull(sshKey);
            return this;
        }
        public KubernetesClusterLinuxProfile build() {
            final var o = new KubernetesClusterLinuxProfile();
            o.adminUsername = adminUsername;
            o.sshKey = sshKey;
            return o;
        }
    }
}
