// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.iot.TimeSeriesInsightsStandardEnvironmentArgs;
import com.pulumi.azure.iot.inputs.TimeSeriesInsightsStandardEnvironmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure IoT Time Series Insights Standard Environment.
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
 * import com.pulumi.azure.iot.TimeSeriesInsightsStandardEnvironment;
 * import com.pulumi.azure.iot.TimeSeriesInsightsStandardEnvironmentArgs;
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
 *         var exampleTimeSeriesInsightsStandardEnvironment = new TimeSeriesInsightsStandardEnvironment(&#34;exampleTimeSeriesInsightsStandardEnvironment&#34;, TimeSeriesInsightsStandardEnvironmentArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .skuName(&#34;S1_1&#34;)
 *             .dataRetentionTime(&#34;P30D&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Azure IoT Time Series Insights Standard Environment can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:iot/timeSeriesInsightsStandardEnvironment:TimeSeriesInsightsStandardEnvironment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.TimeSeriesInsights/environments/example
 * ```
 * 
 */
@ResourceType(type="azure:iot/timeSeriesInsightsStandardEnvironment:TimeSeriesInsightsStandardEnvironment")
public class TimeSeriesInsightsStandardEnvironment extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the ISO8601 timespan specifying the minimum number of days the environment&#39;s events will be available for query. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="dataRetentionTime", type=String.class, parameters={})
    private Output<String> dataRetentionTime;

    /**
     * @return Specifies the ISO8601 timespan specifying the minimum number of days the environment&#39;s events will be available for query. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> dataRetentionTime() {
        return this.dataRetentionTime;
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the Azure IoT Time Series Insights Standard Environment. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Azure IoT Time Series Insights Standard Environment. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the event property which will be used to partition data. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="partitionKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> partitionKey;

    /**
     * @return The name of the event property which will be used to partition data. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> partitionKey() {
        return Codegen.optional(this.partitionKey);
    }
    /**
     * The name of the resource group in which to create the Azure IoT Time Series Insights Standard Environment. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Azure IoT Time Series Insights Standard Environment. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Specifies the SKU Name for this IoT Time Series Insights Standard Environment. It is string consisting of two parts separated by an underscore(\_).The first part is the `name`, valid values include: `S1` and `S2`. The second part is the `capacity` (e.g. the number of deployed units of the `sku`), which must be a positive `integer` (e.g. `S1_1`). Possible values are `S1_1`, `S1_2`, `S1_3`, `S1_4`, `S1_5`, `S1_6`, `S1_7`, `S1_8`, `S1_9`, `S1_10`, `S2_1`, `S2_2`, `S2_3`, `S2_4`, `S2_5`, `S2_6`, `S2_7`, `S2_8`, `S2_9` and `S2_10`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="skuName", type=String.class, parameters={})
    private Output<String> skuName;

    /**
     * @return Specifies the SKU Name for this IoT Time Series Insights Standard Environment. It is string consisting of two parts separated by an underscore(\_).The first part is the `name`, valid values include: `S1` and `S2`. The second part is the `capacity` (e.g. the number of deployed units of the `sku`), which must be a positive `integer` (e.g. `S1_1`). Possible values are `S1_1`, `S1_2`, `S1_3`, `S1_4`, `S1_5`, `S1_6`, `S1_7`, `S1_8`, `S1_9`, `S1_10`, `S2_1`, `S2_2`, `S2_3`, `S2_4`, `S2_5`, `S2_6`, `S2_7`, `S2_8`, `S2_9` and `S2_10`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * Specifies the behaviour the IoT Time Series Insights service should take when the environment&#39;s capacity has been exceeded. Valid values include `PauseIngress` and `PurgeOldData`. Defaults to `PurgeOldData`.
     * 
     */
    @Export(name="storageLimitExceededBehavior", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageLimitExceededBehavior;

    /**
     * @return Specifies the behaviour the IoT Time Series Insights service should take when the environment&#39;s capacity has been exceeded. Valid values include `PauseIngress` and `PurgeOldData`. Defaults to `PurgeOldData`.
     * 
     */
    public Output<Optional<String>> storageLimitExceededBehavior() {
        return Codegen.optional(this.storageLimitExceededBehavior);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TimeSeriesInsightsStandardEnvironment(String name) {
        this(name, TimeSeriesInsightsStandardEnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TimeSeriesInsightsStandardEnvironment(String name, TimeSeriesInsightsStandardEnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TimeSeriesInsightsStandardEnvironment(String name, TimeSeriesInsightsStandardEnvironmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/timeSeriesInsightsStandardEnvironment:TimeSeriesInsightsStandardEnvironment", name, args == null ? TimeSeriesInsightsStandardEnvironmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TimeSeriesInsightsStandardEnvironment(String name, Output<String> id, @Nullable TimeSeriesInsightsStandardEnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/timeSeriesInsightsStandardEnvironment:TimeSeriesInsightsStandardEnvironment", name, state, makeResourceOptions(options, id));
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
    public static TimeSeriesInsightsStandardEnvironment get(String name, Output<String> id, @Nullable TimeSeriesInsightsStandardEnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TimeSeriesInsightsStandardEnvironment(name, id, state, options);
    }
}
