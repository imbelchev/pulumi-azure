// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appplatform.SpringCloudConfigurationServiceArgs;
import com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceState;
import com.pulumi.azure.appplatform.outputs.SpringCloudConfigurationServiceRepository;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Spring Cloud Configuration Service.
 * 
 * &gt; **NOTE:** This resource is applicable only for Spring Cloud Service with enterprise tier.
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
 * import com.pulumi.azure.appplatform.SpringCloudService;
 * import com.pulumi.azure.appplatform.SpringCloudServiceArgs;
 * import com.pulumi.azure.appplatform.SpringCloudConfigurationService;
 * import com.pulumi.azure.appplatform.SpringCloudConfigurationServiceArgs;
 * import com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceRepositoryArgs;
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
 *         var exampleSpringCloudService = new SpringCloudService(&#34;exampleSpringCloudService&#34;, SpringCloudServiceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .skuName(&#34;E0&#34;)
 *             .build());
 * 
 *         var exampleSpringCloudConfigurationService = new SpringCloudConfigurationService(&#34;exampleSpringCloudConfigurationService&#34;, SpringCloudConfigurationServiceArgs.builder()        
 *             .springCloudServiceId(exampleSpringCloudService.id())
 *             .repositories(SpringCloudConfigurationServiceRepositoryArgs.builder()
 *                 .name(&#34;fake&#34;)
 *                 .label(&#34;master&#34;)
 *                 .patterns(&#34;app/dev&#34;)
 *                 .uri(&#34;https://github.com/Azure-Samples/piggymetrics&#34;)
 *                 .searchPaths(                
 *                     &#34;dir1&#34;,
 *                     &#34;dir2&#34;)
 *                 .strictHostKeyChecking(false)
 *                 .username(&#34;adminuser&#34;)
 *                 .password(&#34;H@Sh1CoR3!&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Spring Cloud Configuration Services can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appplatform/springCloudConfigurationService:SpringCloudConfigurationService example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resourceGroup1/providers/Microsoft.AppPlatform/spring/service1/configurationServices/configurationService1
 * ```
 * 
 */
@ResourceType(type="azure:appplatform/springCloudConfigurationService:SpringCloudConfigurationService")
public class SpringCloudConfigurationService extends com.pulumi.resources.CustomResource {
    /**
     * The name which should be used for this Spring Cloud Configuration Service. The only possible value is `default`. Changing this forces a new Spring Cloud Configuration Service to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Spring Cloud Configuration Service. The only possible value is `default`. Changing this forces a new Spring Cloud Configuration Service to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more `repository` blocks as defined below.
     * 
     */
    @Export(name="repositories", type=List.class, parameters={SpringCloudConfigurationServiceRepository.class})
    private Output</* @Nullable */ List<SpringCloudConfigurationServiceRepository>> repositories;

    /**
     * @return One or more `repository` blocks as defined below.
     * 
     */
    public Output<Optional<List<SpringCloudConfigurationServiceRepository>>> repositories() {
        return Codegen.optional(this.repositories);
    }
    /**
     * The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Configuration Service to be created.
     * 
     */
    @Export(name="springCloudServiceId", type=String.class, parameters={})
    private Output<String> springCloudServiceId;

    /**
     * @return The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Configuration Service to be created.
     * 
     */
    public Output<String> springCloudServiceId() {
        return this.springCloudServiceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpringCloudConfigurationService(String name) {
        this(name, SpringCloudConfigurationServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpringCloudConfigurationService(String name, SpringCloudConfigurationServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpringCloudConfigurationService(String name, SpringCloudConfigurationServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudConfigurationService:SpringCloudConfigurationService", name, args == null ? SpringCloudConfigurationServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SpringCloudConfigurationService(String name, Output<String> id, @Nullable SpringCloudConfigurationServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudConfigurationService:SpringCloudConfigurationService", name, state, makeResourceOptions(options, id));
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
    public static SpringCloudConfigurationService get(String name, Output<String> id, @Nullable SpringCloudConfigurationServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpringCloudConfigurationService(name, id, state, options);
    }
}
