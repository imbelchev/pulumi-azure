// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.eventhub.NamespaceSchemaGroupArgs;
import com.pulumi.azure.eventhub.inputs.NamespaceSchemaGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.eventhub.EventHubNamespace;
 * import com.pulumi.azure.eventhub.EventHubNamespaceArgs;
 * import com.pulumi.azure.eventhub.NamespaceSchemaGroup;
 * import com.pulumi.azure.eventhub.NamespaceSchemaGroupArgs;
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
 *         var testEventHubNamespace = new EventHubNamespace(&#34;testEventHubNamespace&#34;, EventHubNamespaceArgs.builder()        
 *             .location(azurerm_resource_group.test().location())
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var testNamespaceSchemaGroup = new NamespaceSchemaGroup(&#34;testNamespaceSchemaGroup&#34;, NamespaceSchemaGroupArgs.builder()        
 *             .namespaceId(testEventHubNamespace.id())
 *             .schemaCompatibility(&#34;Forward&#34;)
 *             .schemaType(&#34;Avro&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Schema Group for a EventHub Namespace can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:eventhub/namespaceSchemaGroup:NamespaceSchemaGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.EventHub/namespaces/namespace1/schemaGroups/group1
 * ```
 * 
 */
@ResourceType(type="azure:eventhub/namespaceSchemaGroup:NamespaceSchemaGroup")
public class NamespaceSchemaGroup extends com.pulumi.resources.CustomResource {
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="namespaceId", type=String.class, parameters={})
    private Output<String> namespaceId;

    /**
     * @return The ID of the EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }
    /**
     * The compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="schemaCompatibility", type=String.class, parameters={})
    private Output<String> schemaCompatibility;

    /**
     * @return The compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> schemaCompatibility() {
        return this.schemaCompatibility;
    }
    /**
     * The Type of this schema group. Possible values are `Avro`, `Unknown`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="schemaType", type=String.class, parameters={})
    private Output<String> schemaType;

    /**
     * @return The Type of this schema group. Possible values are `Avro`, `Unknown`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> schemaType() {
        return this.schemaType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamespaceSchemaGroup(String name) {
        this(name, NamespaceSchemaGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamespaceSchemaGroup(String name, NamespaceSchemaGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceSchemaGroup(String name, NamespaceSchemaGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/namespaceSchemaGroup:NamespaceSchemaGroup", name, args == null ? NamespaceSchemaGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamespaceSchemaGroup(String name, Output<String> id, @Nullable NamespaceSchemaGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/namespaceSchemaGroup:NamespaceSchemaGroup", name, state, makeResourceOptions(options, id));
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
    public static NamespaceSchemaGroup get(String name, Output<String> id, @Nullable NamespaceSchemaGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceSchemaGroup(name, id, state, options);
    }
}
