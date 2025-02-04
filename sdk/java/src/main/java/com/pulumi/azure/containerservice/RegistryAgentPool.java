// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.containerservice.RegistryAgentPoolArgs;
import com.pulumi.azure.containerservice.inputs.RegistryAgentPoolState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Container Registry Agent Pool.
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
 * import com.pulumi.azure.containerservice.Registry;
 * import com.pulumi.azure.containerservice.RegistryArgs;
 * import com.pulumi.azure.containerservice.RegistryAgentPool;
 * import com.pulumi.azure.containerservice.RegistryAgentPoolArgs;
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
 *             .location(&#34;West Europ&#34;)
 *             .build());
 * 
 *         var exampleRegistry = new Registry(&#34;exampleRegistry&#34;, RegistryArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .sku(&#34;Premium&#34;)
 *             .build());
 * 
 *         var exampleRegistryAgentPool = new RegistryAgentPool(&#34;exampleRegistryAgentPool&#34;, RegistryAgentPoolArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .containerRegistryName(exampleRegistry.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Azure Container Registry Agent Pool can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:containerservice/registryAgentPool:RegistryAgentPool example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.ContainerRegistry/registries/registry1/agentPools/agentpool1
 * ```
 * 
 */
@ResourceType(type="azure:containerservice/registryAgentPool:RegistryAgentPool")
public class RegistryAgentPool extends com.pulumi.resources.CustomResource {
    /**
     * Name of Azure Container Registry to create an Agent Pool for. Changing this forces a new Azure Container Registry Agent Pool to be created.
     * 
     */
    @Export(name="containerRegistryName", type=String.class, parameters={})
    private Output<String> containerRegistryName;

    /**
     * @return Name of Azure Container Registry to create an Agent Pool for. Changing this forces a new Azure Container Registry Agent Pool to be created.
     * 
     */
    public Output<String> containerRegistryName() {
        return this.containerRegistryName;
    }
    /**
     * VMSS instance count. Defaults to `1`.
     * 
     */
    @Export(name="instanceCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> instanceCount;

    /**
     * @return VMSS instance count. Defaults to `1`.
     * 
     */
    public Output<Optional<Integer>> instanceCount() {
        return Codegen.optional(this.instanceCount);
    }
    /**
     * The Azure Region where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Azure Container Registry Agent Pool. Changing this forces a new Azure Container Registry Agent Pool to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Azure Container Registry Agent Pool. Changing this forces a new Azure Container Registry Agent Pool to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags which should be assigned to the Azure Container Registry Agent Pool.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Azure Container Registry Agent Pool.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Sets the VM your agent pool will run on. Valid values are: `S1` (2 vCPUs, 3 GiB RAM), `S2` (4 vCPUs, 8 GiB RAM), `S3` (8 vCPUs, 16 GiB RAM) or `I6` (64 vCPUs, 216 GiB RAM, Isolated). Defaults to `S1`. Changing this forces a new Azure Container Registry Agent Pool to be created.
     * 
     */
    @Export(name="tier", type=String.class, parameters={})
    private Output</* @Nullable */ String> tier;

    /**
     * @return Sets the VM your agent pool will run on. Valid values are: `S1` (2 vCPUs, 3 GiB RAM), `S2` (4 vCPUs, 8 GiB RAM), `S3` (8 vCPUs, 16 GiB RAM) or `I6` (64 vCPUs, 216 GiB RAM, Isolated). Defaults to `S1`. Changing this forces a new Azure Container Registry Agent Pool to be created.
     * 
     */
    public Output<Optional<String>> tier() {
        return Codegen.optional(this.tier);
    }
    /**
     * The ID of the Virtual Network Subnet Resource where the agent machines will be running. Changing this forces a new Azure Container Registry Agent Pool to be created.
     * 
     */
    @Export(name="virtualNetworkSubnetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> virtualNetworkSubnetId;

    /**
     * @return The ID of the Virtual Network Subnet Resource where the agent machines will be running. Changing this forces a new Azure Container Registry Agent Pool to be created.
     * 
     */
    public Output<Optional<String>> virtualNetworkSubnetId() {
        return Codegen.optional(this.virtualNetworkSubnetId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegistryAgentPool(String name) {
        this(name, RegistryAgentPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegistryAgentPool(String name, RegistryAgentPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegistryAgentPool(String name, RegistryAgentPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:containerservice/registryAgentPool:RegistryAgentPool", name, args == null ? RegistryAgentPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegistryAgentPool(String name, Output<String> id, @Nullable RegistryAgentPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:containerservice/registryAgentPool:RegistryAgentPool", name, state, makeResourceOptions(options, id));
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
    public static RegistryAgentPool get(String name, Output<String> id, @Nullable RegistryAgentPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegistryAgentPool(name, id, state, options);
    }
}
