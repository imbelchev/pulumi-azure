// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datadog;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datadog.MonitorArgs;
import com.pulumi.azure.datadog.inputs.MonitorState;
import com.pulumi.azure.datadog.outputs.MonitorDatadogOrganization;
import com.pulumi.azure.datadog.outputs.MonitorIdentity;
import com.pulumi.azure.datadog.outputs.MonitorUser;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a datadog Monitor.
 * 
 * ## Example Usage
 * ### Monitor creation with linking to Datadog organization
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.datadog.Monitor;
 * import com.pulumi.azure.datadog.MonitorArgs;
 * import com.pulumi.azure.datadog.inputs.MonitorDatadogOrganizationArgs;
 * import com.pulumi.azure.datadog.inputs.MonitorUserArgs;
 * import com.pulumi.azure.datadog.inputs.MonitorIdentityArgs;
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
 *             .location(&#34;West US 2&#34;)
 *             .build());
 * 
 *         var exampleMonitor = new Monitor(&#34;exampleMonitor&#34;, MonitorArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .datadogOrganization(MonitorDatadogOrganizationArgs.builder()
 *                 .apiKey(&#34;XXXX&#34;)
 *                 .applicationKey(&#34;XXXX&#34;)
 *                 .build())
 *             .user(MonitorUserArgs.builder()
 *                 .name(&#34;Example&#34;)
 *                 .email(&#34;abc@xyz.com&#34;)
 *                 .build())
 *             .skuName(&#34;Linked&#34;)
 *             .identity(MonitorIdentityArgs.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Role Assignment
 * 
 * To enable metrics flow, perform role assignment on the identity created above. `Monitoring reader(43d0d8ad-25c7-4714-9337-8ba259a9fe05)` role is required .
 * 
 * ### Role assignment on the monitor created
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.core.inputs.GetSubscriptionArgs;
 * import com.pulumi.azure.authorization.AuthorizationFunctions;
 * import com.pulumi.azure.authorization.inputs.GetRoleDefinitionArgs;
 * import com.pulumi.azure.authorization.Assignment;
 * import com.pulumi.azure.authorization.AssignmentArgs;
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
 *         final var primary = CoreFunctions.getSubscription();
 * 
 *         final var monitoringReader = AuthorizationFunctions.getRoleDefinition(GetRoleDefinitionArgs.builder()
 *             .name(&#34;Monitoring Reader&#34;)
 *             .build());
 * 
 *         var example = new Assignment(&#34;example&#34;, AssignmentArgs.builder()        
 *             .scope(primary.applyValue(getSubscriptionResult -&gt; getSubscriptionResult.id()))
 *             .roleDefinitionId(monitoringReader.applyValue(getRoleDefinitionResult -&gt; getRoleDefinitionResult.roleDefinitionId()))
 *             .principalId(azurerm_datadog_monitor.example().identity()[0].principal_id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Datadog Monitors can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datadog/monitor:Monitor example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Datadog/monitors/monitor1
 * ```
 * 
 */
@ResourceType(type="azure:datadog/monitor:Monitor")
public class Monitor extends com.pulumi.resources.CustomResource {
    /**
     * A `datadog_organization` block as defined below.
     * 
     */
    @Export(name="datadogOrganization", type=MonitorDatadogOrganization.class, parameters={})
    private Output<MonitorDatadogOrganization> datadogOrganization;

    /**
     * @return A `datadog_organization` block as defined below.
     * 
     */
    public Output<MonitorDatadogOrganization> datadogOrganization() {
        return this.datadogOrganization;
    }
    /**
     * A `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=MonitorIdentity.class, parameters={})
    private Output</* @Nullable */ MonitorIdentity> identity;

    /**
     * @return A `identity` block as defined below.
     * 
     */
    public Output<Optional<MonitorIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The Azure Region where the Datadog Monitor should exist. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Datadog Monitor should exist. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
     * 
     */
    @Export(name="marketplaceSubscriptionStatus", type=String.class, parameters={})
    private Output<String> marketplaceSubscriptionStatus;

    /**
     * @return Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
     * 
     */
    public Output<String> marketplaceSubscriptionStatus() {
        return this.marketplaceSubscriptionStatus;
    }
    /**
     * Is monitoring enabled? Defaults to`true`.
     * 
     */
    @Export(name="monitoringEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> monitoringEnabled;

    /**
     * @return Is monitoring enabled? Defaults to`true`.
     * 
     */
    public Output<Optional<Boolean>> monitoringEnabled() {
        return Codegen.optional(this.monitoringEnabled);
    }
    /**
     * The name of the user that will be associated with the Datadog Monitor. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the user that will be associated with the Datadog Monitor. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Datadog Monitor should exist. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Datadog Monitor should exist. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The name which should be used for this sku.
     * 
     */
    @Export(name="skuName", type=String.class, parameters={})
    private Output<String> skuName;

    /**
     * @return The name which should be used for this sku.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * A mapping of tags which should be assigned to the Datadog Monitor.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Datadog Monitor.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A `user` block as defined below.
     * 
     */
    @Export(name="user", type=MonitorUser.class, parameters={})
    private Output<MonitorUser> user;

    /**
     * @return A `user` block as defined below.
     * 
     */
    public Output<MonitorUser> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Monitor(String name) {
        this(name, MonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Monitor(String name, MonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Monitor(String name, MonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datadog/monitor:Monitor", name, args == null ? MonitorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Monitor(String name, Output<String> id, @Nullable MonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datadog/monitor:Monitor", name, state, makeResourceOptions(options, id));
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
    public static Monitor get(String name, Output<String> id, @Nullable MonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Monitor(name, id, state, options);
    }
}
