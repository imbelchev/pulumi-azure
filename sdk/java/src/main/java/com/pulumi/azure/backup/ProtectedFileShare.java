// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.backup.ProtectedFileShareArgs;
import com.pulumi.azure.backup.inputs.ProtectedFileShareState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an Azure Backup Protected File Share to enable backups for file shares within an Azure Storage Account
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
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.storage.Share;
 * import com.pulumi.azure.storage.ShareArgs;
 * import com.pulumi.azure.backup.ContainerStorageAccount;
 * import com.pulumi.azure.backup.ContainerStorageAccountArgs;
 * import com.pulumi.azure.backup.PolicyFileShare;
 * import com.pulumi.azure.backup.PolicyFileShareArgs;
 * import com.pulumi.azure.backup.inputs.PolicyFileShareBackupArgs;
 * import com.pulumi.azure.backup.inputs.PolicyFileShareRetentionDailyArgs;
 * import com.pulumi.azure.backup.ProtectedFileShare;
 * import com.pulumi.azure.backup.ProtectedFileShareArgs;
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var vault = new Vault(&#34;vault&#34;, VaultArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var sa = new Account(&#34;sa&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleShare = new Share(&#34;exampleShare&#34;, ShareArgs.builder()        
 *             .storageAccountName(sa.name())
 *             .quota(1)
 *             .build());
 * 
 *         var protection_container = new ContainerStorageAccount(&#34;protection-container&#34;, ContainerStorageAccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .recoveryVaultName(vault.name())
 *             .storageAccountId(sa.id())
 *             .build());
 * 
 *         var examplePolicyFileShare = new PolicyFileShare(&#34;examplePolicyFileShare&#34;, PolicyFileShareArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .recoveryVaultName(vault.name())
 *             .backup(PolicyFileShareBackupArgs.builder()
 *                 .frequency(&#34;Daily&#34;)
 *                 .time(&#34;23:00&#34;)
 *                 .build())
 *             .retentionDaily(PolicyFileShareRetentionDailyArgs.builder()
 *                 .count(10)
 *                 .build())
 *             .build());
 * 
 *         var share1 = new ProtectedFileShare(&#34;share1&#34;, ProtectedFileShareArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .recoveryVaultName(vault.name())
 *             .sourceStorageAccountId(protection_container.storageAccountId())
 *             .sourceFileShareName(exampleShare.name())
 *             .backupPolicyId(examplePolicyFileShare.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Azure Backup Protected File Shares can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:backup/protectedFileShare:ProtectedFileShare item1 &#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.RecoveryServices/vaults/example-recovery-vault/backupFabrics/Azure/protectionContainers/StorageContainer;storage;group2;example-storage-account/protectedItems/AzureFileShare;3f6e3108a45793581bcbd1c61c87a3b2ceeb4ff4bc02a95ce9d1022b23722935&#34;
 * ```
 * 
 *  -&gt; **NOTE** The ID requires quoting as there are semicolons. This user unfriendly ID can be found in the Deployments of the used resourcegroup, look for an Deployment which starts with `ConfigureAFSProtection-`, click then `Go to resource`.
 * 
 */
@ResourceType(type="azure:backup/protectedFileShare:ProtectedFileShare")
public class ProtectedFileShare extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the ID of the backup policy to use. The policy must be an Azure File Share backup policy. Other types are not supported.
     * 
     */
    @Export(name="backupPolicyId", type=String.class, parameters={})
    private Output<String> backupPolicyId;

    /**
     * @return Specifies the ID of the backup policy to use. The policy must be an Azure File Share backup policy. Other types are not supported.
     * 
     */
    public Output<String> backupPolicyId() {
        return this.backupPolicyId;
    }
    /**
     * Specifies the name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="recoveryVaultName", type=String.class, parameters={})
    private Output<String> recoveryVaultName;

    /**
     * @return Specifies the name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> recoveryVaultName() {
        return this.recoveryVaultName;
    }
    /**
     * The name of the resource group in which to create the Azure Backup Protected File Share. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Azure Backup Protected File Share. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Specifies the name of the file share to backup. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="sourceFileShareName", type=String.class, parameters={})
    private Output<String> sourceFileShareName;

    /**
     * @return Specifies the name of the file share to backup. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> sourceFileShareName() {
        return this.sourceFileShareName;
    }
    /**
     * Specifies the ID of the storage account of the file share to backup. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="sourceStorageAccountId", type=String.class, parameters={})
    private Output<String> sourceStorageAccountId;

    /**
     * @return Specifies the ID of the storage account of the file share to backup. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> sourceStorageAccountId() {
        return this.sourceStorageAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProtectedFileShare(String name) {
        this(name, ProtectedFileShareArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProtectedFileShare(String name, ProtectedFileShareArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProtectedFileShare(String name, ProtectedFileShareArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:backup/protectedFileShare:ProtectedFileShare", name, args == null ? ProtectedFileShareArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProtectedFileShare(String name, Output<String> id, @Nullable ProtectedFileShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:backup/protectedFileShare:ProtectedFileShare", name, state, makeResourceOptions(options, id));
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
    public static ProtectedFileShare get(String name, Output<String> id, @Nullable ProtectedFileShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProtectedFileShare(name, id, state, options);
    }
}
