// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cdn.FrontdoorSecurityPolicyArgs;
import com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicyState;
import com.pulumi.azure.cdn.outputs.FrontdoorSecurityPolicySecurityPolicies;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Front Door (standard/premium) Security Policy.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.cdn.FrontdoorProfile;
 * import com.pulumi.azure.cdn.FrontdoorProfileArgs;
 * import com.pulumi.azure.cdn.FrontdoorFirewallPolicy;
 * import com.pulumi.azure.cdn.FrontdoorFirewallPolicyArgs;
 * import com.pulumi.azure.cdn.inputs.FrontdoorFirewallPolicyCustomRuleArgs;
 * import com.pulumi.azure.cdn.FrontdoorSecurityPolicy;
 * import com.pulumi.azure.cdn.FrontdoorSecurityPolicyArgs;
 * import com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesArgs;
 * import com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallArgs;
 * import com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationArgs;
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
 *         var exampleFrontdoorProfile = new FrontdoorProfile(&#34;exampleFrontdoorProfile&#34;, FrontdoorProfileArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleFrontdoorFirewallPolicy = new FrontdoorFirewallPolicy(&#34;exampleFrontdoorFirewallPolicy&#34;, FrontdoorFirewallPolicyArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .skuName(exampleFrontdoorProfile.skuName())
 *             .enabled(true)
 *             .mode(&#34;Prevention&#34;)
 *             .redirectUrl(&#34;https://www.contoso.com&#34;)
 *             .customBlockResponseStatusCode(403)
 *             .customBlockResponseBody(&#34;PGh0bWw+CjxoZWFkZXI+PHRpdGxlPkhlbGxvPC90aXRsZT48L2hlYWRlcj4KPGJvZHk+CkhlbGxvIHdvcmxkCjwvYm9keT4KPC9odG1sPg==&#34;)
 *             .customRules(FrontdoorFirewallPolicyCustomRuleArgs.builder()
 *                 .name(&#34;Rule1&#34;)
 *                 .enabled(true)
 *                 .priority(1)
 *                 .rateLimitDurationInMinutes(1)
 *                 .rateLimitThreshold(10)
 *                 .type(&#34;MatchRule&#34;)
 *                 .action(&#34;Block&#34;)
 *                 .matchConditions(FrontdoorFirewallPolicyCustomRuleMatchConditionArgs.builder()
 *                     .matchVariable(&#34;RemoteAddr&#34;)
 *                     .operator(&#34;IPMatch&#34;)
 *                     .negationCondition(false)
 *                     .matchValues(                    
 *                         &#34;192.168.1.0/24&#34;,
 *                         &#34;10.0.1.0/24&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleFrontdoorSecurityPolicy = new FrontdoorSecurityPolicy(&#34;exampleFrontdoorSecurityPolicy&#34;, FrontdoorSecurityPolicyArgs.builder()        
 *             .cdnFrontdoorProfileId(exampleFrontdoorProfile.id())
 *             .securityPolicies(FrontdoorSecurityPolicySecurityPoliciesArgs.builder()
 *                 .firewall(FrontdoorSecurityPolicySecurityPoliciesFirewallArgs.builder()
 *                     .cdnFrontdoorFirewallPolicyId(exampleFrontdoorFirewallPolicy.id())
 *                     .association(FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationArgs.builder()
 *                         .domains(FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationDomainArgs.builder()
 *                             .cdnFrontdoorDomainId(azurerm_cdn_frontdoor_custom_domain.domain1().id())
 *                             .build())
 *                         .patternsToMatch(&#34;/*&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Front Door Security Policies can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/securityPolicies/policy1
 * ```
 * 
 */
@ResourceType(type="azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy")
public class FrontdoorSecurityPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
     * 
     */
    @Export(name="cdnFrontdoorProfileId", type=String.class, parameters={})
    private Output<String> cdnFrontdoorProfileId;

    /**
     * @return The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
     * 
     */
    public Output<String> cdnFrontdoorProfileId() {
        return this.cdnFrontdoorProfileId;
    }
    /**
     * The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An `security_policies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
     * 
     */
    @Export(name="securityPolicies", type=FrontdoorSecurityPolicySecurityPolicies.class, parameters={})
    private Output<FrontdoorSecurityPolicySecurityPolicies> securityPolicies;

    /**
     * @return An `security_policies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
     * 
     */
    public Output<FrontdoorSecurityPolicySecurityPolicies> securityPolicies() {
        return this.securityPolicies;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FrontdoorSecurityPolicy(String name) {
        this(name, FrontdoorSecurityPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FrontdoorSecurityPolicy(String name, FrontdoorSecurityPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FrontdoorSecurityPolicy(String name, FrontdoorSecurityPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy", name, args == null ? FrontdoorSecurityPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FrontdoorSecurityPolicy(String name, Output<String> id, @Nullable FrontdoorSecurityPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy", name, state, makeResourceOptions(options, id));
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
    public static FrontdoorSecurityPolicy get(String name, Output<String> id, @Nullable FrontdoorSecurityPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FrontdoorSecurityPolicy(name, id, state, options);
    }
}
