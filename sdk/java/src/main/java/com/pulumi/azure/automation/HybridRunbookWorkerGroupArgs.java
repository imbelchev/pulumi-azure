// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HybridRunbookWorkerGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final HybridRunbookWorkerGroupArgs Empty = new HybridRunbookWorkerGroupArgs();

    /**
     * The name of the Automation Account in which the Runbook Worker Group is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    /**
     * @return The name of the Automation Account in which the Runbook Worker Group is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The name of resource type `azure.automation.Credential` to use for hybrid worker.
     * 
     */
    @Import(name="credentialName")
    private @Nullable Output<String> credentialName;

    /**
     * @return The name of resource type `azure.automation.Credential` to use for hybrid worker.
     * 
     */
    public Optional<Output<String>> credentialName() {
        return Optional.ofNullable(this.credentialName);
    }

    /**
     * The name which should be used for this Automation Account Runbook Worker Group. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Automation Account Runbook Worker Group. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private HybridRunbookWorkerGroupArgs() {}

    private HybridRunbookWorkerGroupArgs(HybridRunbookWorkerGroupArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.credentialName = $.credentialName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HybridRunbookWorkerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HybridRunbookWorkerGroupArgs $;

        public Builder() {
            $ = new HybridRunbookWorkerGroupArgs();
        }

        public Builder(HybridRunbookWorkerGroupArgs defaults) {
            $ = new HybridRunbookWorkerGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the Automation Account in which the Runbook Worker Group is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the Automation Account in which the Runbook Worker Group is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param credentialName The name of resource type `azure.automation.Credential` to use for hybrid worker.
         * 
         * @return builder
         * 
         */
        public Builder credentialName(@Nullable Output<String> credentialName) {
            $.credentialName = credentialName;
            return this;
        }

        /**
         * @param credentialName The name of resource type `azure.automation.Credential` to use for hybrid worker.
         * 
         * @return builder
         * 
         */
        public Builder credentialName(String credentialName) {
            return credentialName(Output.of(credentialName));
        }

        /**
         * @param name The name which should be used for this Automation Account Runbook Worker Group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Automation Account Runbook Worker Group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public HybridRunbookWorkerGroupArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
