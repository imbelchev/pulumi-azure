// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.siterecovery.ReplicationPolicyArgs;
import com.pulumi.azure.siterecovery.inputs.ReplicationPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Azure Site Recovery replication policy within a recovery vault. Replication policies define the frequency at which recovery points are created and how long they are stored.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.recoveryservices.Vault;
 * import com.pulumi.azure.recoveryservices.VaultArgs;
 * import com.pulumi.azure.siterecovery.ReplicationPolicy;
 * import com.pulumi.azure.siterecovery.ReplicationPolicyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ResourceGroup(&#34;example&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;East US&#34;)
 *             .build());
 * 
 *         var vault = new Vault(&#34;vault&#34;, VaultArgs.builder()        
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var policy = new ReplicationPolicy(&#34;policy&#34;, ReplicationPolicyArgs.builder()        
 *             .resourceGroupName(example.name())
 *             .recoveryVaultName(vault.name())
 *             .recoveryPointRetentionInMinutes(24 * 60)
 *             .applicationConsistentSnapshotFrequencyInMinutes(4 * 60)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Site Recovery Replication Policies can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:siterecovery/replicationPolicy:ReplicationPolicy mypolicy /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationPolicies/policy-name
 * ```
 * 
 */
@ResourceType(type="azure:siterecovery/replicationPolicy:ReplicationPolicy")
public class ReplicationPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the frequency(in minutes) at which to create application consistent recovery points.
     * 
     */
    @Export(name="applicationConsistentSnapshotFrequencyInMinutes", type=Integer.class, parameters={})
    private Output<Integer> applicationConsistentSnapshotFrequencyInMinutes;

    /**
     * @return Specifies the frequency(in minutes) at which to create application consistent recovery points.
     * 
     */
    public Output<Integer> applicationConsistentSnapshotFrequencyInMinutes() {
        return this.applicationConsistentSnapshotFrequencyInMinutes;
    }
    /**
     * The name of the replication policy. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the replication policy. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The duration in minutes for which the recovery points need to be stored.
     * 
     */
    @Export(name="recoveryPointRetentionInMinutes", type=Integer.class, parameters={})
    private Output<Integer> recoveryPointRetentionInMinutes;

    /**
     * @return The duration in minutes for which the recovery points need to be stored.
     * 
     */
    public Output<Integer> recoveryPointRetentionInMinutes() {
        return this.recoveryPointRetentionInMinutes;
    }
    /**
     * The name of the vault that should be updated. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="recoveryVaultName", type=String.class, parameters={})
    private Output<String> recoveryVaultName;

    /**
     * @return The name of the vault that should be updated. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> recoveryVaultName() {
        return this.recoveryVaultName;
    }
    /**
     * Name of the resource group where the vault that should be updated is located. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group where the vault that should be updated is located. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationPolicy(String name) {
        this(name, ReplicationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationPolicy(String name, ReplicationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationPolicy(String name, ReplicationPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/replicationPolicy:ReplicationPolicy", name, args == null ? ReplicationPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReplicationPolicy(String name, Output<String> id, @Nullable ReplicationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/replicationPolicy:ReplicationPolicy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ReplicationPolicy get(String name, Output<String> id, @Nullable ReplicationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationPolicy(name, id, state, options);
    }
}
