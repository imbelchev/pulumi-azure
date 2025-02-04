// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.batch.PoolArgs;
import com.pulumi.azure.batch.inputs.PoolState;
import com.pulumi.azure.batch.outputs.PoolAutoScale;
import com.pulumi.azure.batch.outputs.PoolCertificate;
import com.pulumi.azure.batch.outputs.PoolContainerConfiguration;
import com.pulumi.azure.batch.outputs.PoolDataDisk;
import com.pulumi.azure.batch.outputs.PoolDiskEncryption;
import com.pulumi.azure.batch.outputs.PoolExtension;
import com.pulumi.azure.batch.outputs.PoolFixedScale;
import com.pulumi.azure.batch.outputs.PoolIdentity;
import com.pulumi.azure.batch.outputs.PoolMount;
import com.pulumi.azure.batch.outputs.PoolNetworkConfiguration;
import com.pulumi.azure.batch.outputs.PoolNodePlacement;
import com.pulumi.azure.batch.outputs.PoolStartTask;
import com.pulumi.azure.batch.outputs.PoolStorageImageReference;
import com.pulumi.azure.batch.outputs.PoolTaskSchedulingPolicy;
import com.pulumi.azure.batch.outputs.PoolUserAccount;
import com.pulumi.azure.batch.outputs.PoolWindow;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Batch pool.
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
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.batch.Account;
 * import com.pulumi.azure.batch.AccountArgs;
 * import com.pulumi.azure.batch.Certificate;
 * import com.pulumi.azure.batch.CertificateArgs;
 * import com.pulumi.azure.batch.Pool;
 * import com.pulumi.azure.batch.PoolArgs;
 * import com.pulumi.azure.batch.inputs.PoolAutoScaleArgs;
 * import com.pulumi.azure.batch.inputs.PoolStorageImageReferenceArgs;
 * import com.pulumi.azure.batch.inputs.PoolContainerConfigurationArgs;
 * import com.pulumi.azure.batch.inputs.PoolStartTaskArgs;
 * import com.pulumi.azure.batch.inputs.PoolStartTaskUserIdentityArgs;
 * import com.pulumi.azure.batch.inputs.PoolStartTaskUserIdentityAutoUserArgs;
 * import com.pulumi.azure.batch.inputs.PoolCertificateArgs;
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleBatch_accountAccount = new Account(&#34;exampleBatch/accountAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .poolAllocationMode(&#34;BatchService&#34;)
 *             .storageAccountId(exampleAccount.id())
 *             .tags(Map.of(&#34;env&#34;, &#34;test&#34;))
 *             .build());
 * 
 *         var exampleCertificate = new Certificate(&#34;exampleCertificate&#34;, CertificateArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .accountName(exampleBatch / accountAccount.name())
 *             .certificate(Base64.getEncoder().encodeToString(Files.readAllBytes(Paths.get(&#34;certificate.cer&#34;))))
 *             .format(&#34;Cer&#34;)
 *             .thumbprint(&#34;312d31a79fa0cef49c00f769afc2b73e9f4edf34&#34;)
 *             .thumbprintAlgorithm(&#34;SHA1&#34;)
 *             .build());
 * 
 *         var examplePool = new Pool(&#34;examplePool&#34;, PoolArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .accountName(exampleBatch / accountAccount.name())
 *             .displayName(&#34;Test Acc Pool Auto&#34;)
 *             .vmSize(&#34;Standard_A1&#34;)
 *             .nodeAgentSkuId(&#34;batch.node.ubuntu 20.04&#34;)
 *             .autoScale(PoolAutoScaleArgs.builder()
 *                 .evaluationInterval(&#34;PT15M&#34;)
 *                 .formula(&#34;&#34;&#34;
 *       startingNumberOfVMs = 1;
 *       maxNumberofVMs = 25;
 *       pendingTaskSamplePercent = $PendingTasks.GetSamplePercent(180 * TimeInterval_Second);
 *       pendingTaskSamples = pendingTaskSamplePercent &lt; 70 ? startingNumberOfVMs : avg($PendingTasks.GetSample(180 *   TimeInterval_Second));
 *       $TargetDedicatedNodes=min(maxNumberofVMs, pendingTaskSamples);
 *                 &#34;&#34;&#34;)
 *                 .build())
 *             .storageImageReference(PoolStorageImageReferenceArgs.builder()
 *                 .publisher(&#34;microsoft-azure-batch&#34;)
 *                 .offer(&#34;ubuntu-server-container&#34;)
 *                 .sku(&#34;20-04-lts&#34;)
 *                 .version(&#34;latest&#34;)
 *                 .build())
 *             .containerConfiguration(PoolContainerConfigurationArgs.builder()
 *                 .type(&#34;DockerCompatible&#34;)
 *                 .containerRegistries(PoolContainerConfigurationContainerRegistryArgs.builder()
 *                     .registryServer(&#34;docker.io&#34;)
 *                     .userName(&#34;login&#34;)
 *                     .password(&#34;apassword&#34;)
 *                     .build())
 *                 .build())
 *             .startTask(PoolStartTaskArgs.builder()
 *                 .commandLine(&#34;echo &#39;Hello World from $env&#39;&#34;)
 *                 .taskRetryMaximum(1)
 *                 .waitForSuccess(true)
 *                 .commonEnvironmentProperties(Map.of(&#34;env&#34;, &#34;TEST&#34;))
 *                 .userIdentity(PoolStartTaskUserIdentityArgs.builder()
 *                     .autoUser(PoolStartTaskUserIdentityAutoUserArgs.builder()
 *                         .elevationLevel(&#34;NonAdmin&#34;)
 *                         .scope(&#34;Task&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .certificates(PoolCertificateArgs.builder()
 *                 .id(exampleCertificate.id())
 *                 .storeLocation(&#34;CurrentUser&#34;)
 *                 .visibilities(&#34;StartTask&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Batch Pools can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:batch/pool:Pool example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup1/providers/Microsoft.Batch/batchAccounts/myBatchAccount1/pools/myBatchPool1
 * ```
 * 
 */
@ResourceType(type="azure:batch/pool:Pool")
public class Pool extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the name of the Batch account in which the pool will be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="accountName", type=String.class, parameters={})
    private Output<String> accountName;

    /**
     * @return Specifies the name of the Batch account in which the pool will be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }
    /**
     * A `auto_scale` block that describes the scale settings when using auto scale as defined below.
     * 
     */
    @Export(name="autoScale", type=PoolAutoScale.class, parameters={})
    private Output</* @Nullable */ PoolAutoScale> autoScale;

    /**
     * @return A `auto_scale` block that describes the scale settings when using auto scale as defined below.
     * 
     */
    public Output<Optional<PoolAutoScale>> autoScale() {
        return Codegen.optional(this.autoScale);
    }
    /**
     * One or more `certificate` blocks that describe the certificates to be installed on each compute node in the pool as defined below.
     * 
     */
    @Export(name="certificates", type=List.class, parameters={PoolCertificate.class})
    private Output</* @Nullable */ List<PoolCertificate>> certificates;

    /**
     * @return One or more `certificate` blocks that describe the certificates to be installed on each compute node in the pool as defined below.
     * 
     */
    public Output<Optional<List<PoolCertificate>>> certificates() {
        return Codegen.optional(this.certificates);
    }
    /**
     * The container configuration used in the pool&#39;s VMs.
     * 
     */
    @Export(name="containerConfiguration", type=PoolContainerConfiguration.class, parameters={})
    private Output</* @Nullable */ PoolContainerConfiguration> containerConfiguration;

    /**
     * @return The container configuration used in the pool&#39;s VMs.
     * 
     */
    public Output<Optional<PoolContainerConfiguration>> containerConfiguration() {
        return Codegen.optional(this.containerConfiguration);
    }
    /**
     * A `data_disks` block describes the data disk settings as defined below.
     * 
     */
    @Export(name="dataDisks", type=List.class, parameters={PoolDataDisk.class})
    private Output</* @Nullable */ List<PoolDataDisk>> dataDisks;

    /**
     * @return A `data_disks` block describes the data disk settings as defined below.
     * 
     */
    public Output<Optional<List<PoolDataDisk>>> dataDisks() {
        return Codegen.optional(this.dataDisks);
    }
    /**
     * A `disk_encryption` block, as defined below, describes the disk encryption configuration applied on compute nodes in the pool. Disk encryption configuration is not supported on Linux pool created with Virtual Machine Image or Shared Image Gallery Image.
     * 
     */
    @Export(name="diskEncryptions", type=List.class, parameters={PoolDiskEncryption.class})
    private Output</* @Nullable */ List<PoolDiskEncryption>> diskEncryptions;

    /**
     * @return A `disk_encryption` block, as defined below, describes the disk encryption configuration applied on compute nodes in the pool. Disk encryption configuration is not supported on Linux pool created with Virtual Machine Image or Shared Image Gallery Image.
     * 
     */
    public Output<Optional<List<PoolDiskEncryption>>> diskEncryptions() {
        return Codegen.optional(this.diskEncryptions);
    }
    /**
     * Specifies the display name of the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Specifies the display name of the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * An `extensions` block as defined below.
     * 
     */
    @Export(name="extensions", type=List.class, parameters={PoolExtension.class})
    private Output</* @Nullable */ List<PoolExtension>> extensions;

    /**
     * @return An `extensions` block as defined below.
     * 
     */
    public Output<Optional<List<PoolExtension>>> extensions() {
        return Codegen.optional(this.extensions);
    }
    /**
     * A `fixed_scale` block that describes the scale settings when using fixed scale as defined below.
     * 
     */
    @Export(name="fixedScale", type=PoolFixedScale.class, parameters={})
    private Output</* @Nullable */ PoolFixedScale> fixedScale;

    /**
     * @return A `fixed_scale` block that describes the scale settings when using fixed scale as defined below.
     * 
     */
    public Output<Optional<PoolFixedScale>> fixedScale() {
        return Codegen.optional(this.fixedScale);
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=PoolIdentity.class, parameters={})
    private Output</* @Nullable */ PoolIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<PoolIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Whether the pool permits direct communication between nodes. This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance of the requested number of nodes to be allocated in the pool. If not specified, this value defaults to `Disabled`. Values allowed are `Disabled` and `Enabled`.
     * 
     */
    @Export(name="interNodeCommunication", type=String.class, parameters={})
    private Output</* @Nullable */ String> interNodeCommunication;

    /**
     * @return Whether the pool permits direct communication between nodes. This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance of the requested number of nodes to be allocated in the pool. If not specified, this value defaults to `Disabled`. Values allowed are `Disabled` and `Enabled`.
     * 
     */
    public Output<Optional<String>> interNodeCommunication() {
        return Codegen.optional(this.interNodeCommunication);
    }
    /**
     * The type of on-premises license to be used when deploying the operating system. This only applies to images that contain the Windows operating system, and should only be used when you hold valid on-premises licenses for the nodes which will be deployed. If omitted, no on-premises licensing discount is applied. Values are: &#34;Windows_Server&#34; - The on-premises license is for Windows Server. &#34;Windows_Client&#34; - The on-premises license is for Windows Client.
     * 
     */
    @Export(name="licenseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseType;

    /**
     * @return The type of on-premises license to be used when deploying the operating system. This only applies to images that contain the Windows operating system, and should only be used when you hold valid on-premises licenses for the nodes which will be deployed. If omitted, no on-premises licensing discount is applied. Values are: &#34;Windows_Server&#34; - The on-premises license is for Windows Server. &#34;Windows_Client&#34; - The on-premises license is for Windows Client.
     * 
     */
    public Output<Optional<String>> licenseType() {
        return Codegen.optional(this.licenseType);
    }
    /**
     * Specifies the maximum number of tasks that can run concurrently on a single compute node in the pool. Defaults to `1`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="maxTasksPerNode", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxTasksPerNode;

    /**
     * @return Specifies the maximum number of tasks that can run concurrently on a single compute node in the pool. Defaults to `1`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> maxTasksPerNode() {
        return Codegen.optional(this.maxTasksPerNode);
    }
    /**
     * A map of custom batch pool metadata.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return A map of custom batch pool metadata.
     * 
     */
    public Output<Optional<Map<String,String>>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * A `mount` block defined as below.
     * 
     */
    @Export(name="mounts", type=List.class, parameters={PoolMount.class})
    private Output</* @Nullable */ List<PoolMount>> mounts;

    /**
     * @return A `mount` block defined as below.
     * 
     */
    public Output<Optional<List<PoolMount>>> mounts() {
        return Codegen.optional(this.mounts);
    }
    /**
     * Specifies the name of the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `network_configuration` block that describes the network configurations for the Batch pool as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="networkConfiguration", type=PoolNetworkConfiguration.class, parameters={})
    private Output</* @Nullable */ PoolNetworkConfiguration> networkConfiguration;

    /**
     * @return A `network_configuration` block that describes the network configurations for the Batch pool as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<PoolNetworkConfiguration>> networkConfiguration() {
        return Codegen.optional(this.networkConfiguration);
    }
    /**
     * Specifies the SKU of the node agents that will be created in the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="nodeAgentSkuId", type=String.class, parameters={})
    private Output<String> nodeAgentSkuId;

    /**
     * @return Specifies the SKU of the node agents that will be created in the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> nodeAgentSkuId() {
        return this.nodeAgentSkuId;
    }
    /**
     * A `node_placement` block that describes the placement policy for allocating nodes in the pool as defined below.
     * 
     */
    @Export(name="nodePlacements", type=List.class, parameters={PoolNodePlacement.class})
    private Output</* @Nullable */ List<PoolNodePlacement>> nodePlacements;

    /**
     * @return A `node_placement` block that describes the placement policy for allocating nodes in the pool as defined below.
     * 
     */
    public Output<Optional<List<PoolNodePlacement>>> nodePlacements() {
        return Codegen.optional(this.nodePlacements);
    }
    /**
     * Specifies the ephemeral disk placement for operating system disk for all VMs in the pool. This property can be used by user in the request to choose which location the operating system should be in. e.g., cache disk space for Ephemeral OS disk provisioning. For more information on Ephemeral OS disk size requirements, please refer to Ephemeral OS disk size requirements for Windows VMs at &lt;https://docs.microsoft.com/en-us/azure/virtual-machines/windows/ephemeral-os-disks#size-requirements&gt; and Linux VMs at &lt;https://docs.microsoft.com/en-us/azure/virtual-machines/linux/ephemeral-os-disks#size-requirements&gt;. The only possible value is `CacheDisk`.
     * 
     */
    @Export(name="osDiskPlacement", type=String.class, parameters={})
    private Output</* @Nullable */ String> osDiskPlacement;

    /**
     * @return Specifies the ephemeral disk placement for operating system disk for all VMs in the pool. This property can be used by user in the request to choose which location the operating system should be in. e.g., cache disk space for Ephemeral OS disk provisioning. For more information on Ephemeral OS disk size requirements, please refer to Ephemeral OS disk size requirements for Windows VMs at &lt;https://docs.microsoft.com/en-us/azure/virtual-machines/windows/ephemeral-os-disks#size-requirements&gt; and Linux VMs at &lt;https://docs.microsoft.com/en-us/azure/virtual-machines/linux/ephemeral-os-disks#size-requirements&gt;. The only possible value is `CacheDisk`.
     * 
     */
    public Output<Optional<String>> osDiskPlacement() {
        return Codegen.optional(this.osDiskPlacement);
    }
    /**
     * The name of the resource group in which to create the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A `start_task` block that describes the start task settings for the Batch pool as defined below.
     * 
     */
    @Export(name="startTask", type=PoolStartTask.class, parameters={})
    private Output</* @Nullable */ PoolStartTask> startTask;

    /**
     * @return A `start_task` block that describes the start task settings for the Batch pool as defined below.
     * 
     */
    public Output<Optional<PoolStartTask>> startTask() {
        return Codegen.optional(this.startTask);
    }
    @Export(name="stopPendingResizeOperation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> stopPendingResizeOperation;

    public Output<Optional<Boolean>> stopPendingResizeOperation() {
        return Codegen.optional(this.stopPendingResizeOperation);
    }
    /**
     * A `storage_image_reference` for the virtual machines that will compose the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageImageReference", type=PoolStorageImageReference.class, parameters={})
    private Output<PoolStorageImageReference> storageImageReference;

    /**
     * @return A `storage_image_reference` for the virtual machines that will compose the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<PoolStorageImageReference> storageImageReference() {
        return this.storageImageReference;
    }
    /**
     * A `task_scheduling_policy` block that describes how tasks are distributed across compute nodes in a pool. If not specified, the default is spread as defined below.
     * 
     */
    @Export(name="taskSchedulingPolicies", type=List.class, parameters={PoolTaskSchedulingPolicy.class})
    private Output<List<PoolTaskSchedulingPolicy>> taskSchedulingPolicies;

    /**
     * @return A `task_scheduling_policy` block that describes how tasks are distributed across compute nodes in a pool. If not specified, the default is spread as defined below.
     * 
     */
    public Output<List<PoolTaskSchedulingPolicy>> taskSchedulingPolicies() {
        return this.taskSchedulingPolicies;
    }
    /**
     * A `user_accounts` block that describes the list of user accounts to be created on each node in the pool as defined below.
     * 
     */
    @Export(name="userAccounts", type=List.class, parameters={PoolUserAccount.class})
    private Output</* @Nullable */ List<PoolUserAccount>> userAccounts;

    /**
     * @return A `user_accounts` block that describes the list of user accounts to be created on each node in the pool as defined below.
     * 
     */
    public Output<Optional<List<PoolUserAccount>>> userAccounts() {
        return Codegen.optional(this.userAccounts);
    }
    /**
     * Specifies the size of the VM created in the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="vmSize", type=String.class, parameters={})
    private Output<String> vmSize;

    /**
     * @return Specifies the size of the VM created in the Batch pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> vmSize() {
        return this.vmSize;
    }
    /**
     * A `windows` block that describes the Windows configuration in the pool as defined below.
     * 
     */
    @Export(name="windows", type=List.class, parameters={PoolWindow.class})
    private Output</* @Nullable */ List<PoolWindow>> windows;

    /**
     * @return A `windows` block that describes the Windows configuration in the pool as defined below.
     * 
     */
    public Output<Optional<List<PoolWindow>>> windows() {
        return Codegen.optional(this.windows);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pool(String name) {
        this(name, PoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pool(String name, PoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pool(String name, PoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:batch/pool:Pool", name, args == null ? PoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pool(String name, Output<String> id, @Nullable PoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:batch/pool:Pool", name, state, makeResourceOptions(options, id));
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
    public static Pool get(String name, Output<String> id, @Nullable PoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Pool(name, id, state, options);
    }
}
