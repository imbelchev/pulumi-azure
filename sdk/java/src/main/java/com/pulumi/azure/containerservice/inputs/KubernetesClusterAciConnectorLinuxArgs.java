// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class KubernetesClusterAciConnectorLinuxArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterAciConnectorLinuxArgs Empty = new KubernetesClusterAciConnectorLinuxArgs();

    /**
     * The subnet name for the virtual nodes to run.
     * 
     */
    @Import(name="subnetName", required=true)
    private Output<String> subnetName;

    /**
     * @return The subnet name for the virtual nodes to run.
     * 
     */
    public Output<String> subnetName() {
        return this.subnetName;
    }

    private KubernetesClusterAciConnectorLinuxArgs() {}

    private KubernetesClusterAciConnectorLinuxArgs(KubernetesClusterAciConnectorLinuxArgs $) {
        this.subnetName = $.subnetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterAciConnectorLinuxArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterAciConnectorLinuxArgs $;

        public Builder() {
            $ = new KubernetesClusterAciConnectorLinuxArgs();
        }

        public Builder(KubernetesClusterAciConnectorLinuxArgs defaults) {
            $ = new KubernetesClusterAciConnectorLinuxArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param subnetName The subnet name for the virtual nodes to run.
         * 
         * @return builder
         * 
         */
        public Builder subnetName(Output<String> subnetName) {
            $.subnetName = subnetName;
            return this;
        }

        /**
         * @param subnetName The subnet name for the virtual nodes to run.
         * 
         * @return builder
         * 
         */
        public Builder subnetName(String subnetName) {
            return subnetName(Output.of(subnetName));
        }

        public KubernetesClusterAciConnectorLinuxArgs build() {
            $.subnetName = Objects.requireNonNull($.subnetName, "expected parameter 'subnetName' to be non-null");
            return $;
        }
    }

}
