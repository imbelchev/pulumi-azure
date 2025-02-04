// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cognitive;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cognitive.DeploymentArgs;
import com.pulumi.azure.cognitive.inputs.DeploymentState;
import com.pulumi.azure.cognitive.outputs.DeploymentModel;
import com.pulumi.azure.cognitive.outputs.DeploymentScale;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Cognitive Services Account Deployment.
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
 * import com.pulumi.azure.cognitive.Account;
 * import com.pulumi.azure.cognitive.AccountArgs;
 * import com.pulumi.azure.cognitive.Deployment;
 * import com.pulumi.azure.cognitive.DeploymentArgs;
 * import com.pulumi.azure.cognitive.inputs.DeploymentModelArgs;
 * import com.pulumi.azure.cognitive.inputs.DeploymentScaleArgs;
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
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .kind(&#34;OpenAI&#34;)
 *             .skuName(&#34;S0&#34;)
 *             .build());
 * 
 *         var exampleDeployment = new Deployment(&#34;exampleDeployment&#34;, DeploymentArgs.builder()        
 *             .cognitiveAccountId(exampleAccount.id())
 *             .model(DeploymentModelArgs.builder()
 *                 .format(&#34;OpenAI&#34;)
 *                 .name(&#34;text-curie-001&#34;)
 *                 .version(&#34;1&#34;)
 *                 .build())
 *             .scale(DeploymentScaleArgs.builder()
 *                 .type(&#34;Standard&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cognitive Services Account Deployment can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:cognitive/deployment:Deployment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.CognitiveServices/accounts/account1/deployments/deployment1
 * ```
 * 
 */
@ResourceType(type="azure:cognitive/deployment:Deployment")
public class Deployment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Cognitive Services Account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="cognitiveAccountId", type=String.class, parameters={})
    private Output<String> cognitiveAccountId;

    /**
     * @return The ID of the Cognitive Services Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> cognitiveAccountId() {
        return this.cognitiveAccountId;
    }
    /**
     * A `model` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="model", type=DeploymentModel.class, parameters={})
    private Output<DeploymentModel> model;

    /**
     * @return A `model` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<DeploymentModel> model() {
        return this.model;
    }
    /**
     * The name of the Cognitive Services Account Deployment. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Cognitive Services Account Deployment. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of RAI policy. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="raiPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> raiPolicyName;

    /**
     * @return The name of RAI policy. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> raiPolicyName() {
        return Codegen.optional(this.raiPolicyName);
    }
    /**
     * A `scale` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="scale", type=DeploymentScale.class, parameters={})
    private Output<DeploymentScale> scale;

    /**
     * @return A `scale` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<DeploymentScale> scale() {
        return this.scale;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, DeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cognitive/deployment:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cognitive/deployment:Deployment", name, state, makeResourceOptions(options, id));
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
    public static Deployment get(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, state, options);
    }
}
