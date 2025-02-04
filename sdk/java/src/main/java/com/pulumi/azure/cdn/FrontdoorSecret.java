// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cdn.FrontdoorSecretArgs;
import com.pulumi.azure.cdn.inputs.FrontdoorSecretState;
import com.pulumi.azure.cdn.outputs.FrontdoorSecretSecret;
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
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azuread.AzureadFunctions;
 * import com.pulumi.azuread.inputs.GetServicePrincipalArgs;
 * import com.pulumi.azure.keyvault.KeyVault;
 * import com.pulumi.azure.keyvault.KeyVaultArgs;
 * import com.pulumi.azure.keyvault.inputs.KeyVaultNetworkAclsArgs;
 * import com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs;
 * import com.pulumi.azure.keyvault.Certificate;
 * import com.pulumi.azure.keyvault.CertificateArgs;
 * import com.pulumi.azure.keyvault.inputs.CertificateCertificateArgs;
 * import com.pulumi.azure.cdn.FrontdoorSecret;
 * import com.pulumi.azure.cdn.FrontdoorSecretArgs;
 * import com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs;
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
 *         final var current = CoreFunctions.getClientConfig();
 * 
 *         final var frontdoor = AzureadFunctions.getServicePrincipal(GetServicePrincipalArgs.builder()
 *             .displayName(&#34;Microsoft.Azure.Cdn&#34;)
 *             .build());
 * 
 *         var exampleKeyVault = new KeyVault(&#34;exampleKeyVault&#34;, KeyVaultArgs.builder()        
 *             .location(azurerm_resource_group.example().location())
 *             .resourceGroupName(azurerm_resource_group.example().name())
 *             .tenantId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *             .skuName(&#34;premium&#34;)
 *             .softDeleteRetentionDays(7)
 *             .networkAcls(KeyVaultNetworkAclsArgs.builder()
 *                 .defaultAction(&#34;Deny&#34;)
 *                 .bypass(&#34;AzureServices&#34;)
 *                 .ipRules(&#34;10.0.0.0/24&#34;)
 *                 .build())
 *             .accessPolicies(            
 *                 KeyVaultAccessPolicyArgs.builder()
 *                     .tenantId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *                     .objectId(frontdoor.applyValue(getServicePrincipalResult -&gt; getServicePrincipalResult.objectId()))
 *                     .secretPermissions(&#34;Get&#34;)
 *                     .build(),
 *                 KeyVaultAccessPolicyArgs.builder()
 *                     .tenantId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *                     .objectId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.objectId()))
 *                     .certificatePermissions(                    
 *                         &#34;Get&#34;,
 *                         &#34;Import&#34;,
 *                         &#34;Delete&#34;,
 *                         &#34;Purge&#34;)
 *                     .secretPermissions(&#34;Get&#34;)
 *                     .build())
 *             .build());
 * 
 *         var exampleCertificate = new Certificate(&#34;exampleCertificate&#34;, CertificateArgs.builder()        
 *             .keyVaultId(azurerm_key_vault.test().id())
 *             .certificate(CertificateCertificateArgs.builder()
 *                 .contents(Base64.getEncoder().encodeToString(Files.readAllBytes(Paths.get(&#34;my-certificate.pfx&#34;))))
 *                 .build())
 *             .build());
 * 
 *         var exampleFrontdoorSecret = new FrontdoorSecret(&#34;exampleFrontdoorSecret&#34;, FrontdoorSecretArgs.builder()        
 *             .cdnFrontdoorProfileId(azurerm_cdn_frontdoor_profile.test().id())
 *             .secret(FrontdoorSecretSecretArgs.builder()
 *                 .customerCertificates(FrontdoorSecretSecretCustomerCertificateArgs.builder()
 *                     .keyVaultCertificateId(azurerm_key_vault_certificate.test().id())
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
 * Front Door Secrets can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:cdn/frontdoorSecret:FrontdoorSecret example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/secrets/secrets1
 * ```
 * 
 */
@ResourceType(type="azure:cdn/frontdoorSecret:FrontdoorSecret")
public class FrontdoorSecret extends com.pulumi.resources.CustomResource {
    /**
     * The Resource ID of the Front Door Profile. Changing this forces a new Front Door Secret to be created.
     * 
     */
    @Export(name="cdnFrontdoorProfileId", type=String.class, parameters={})
    private Output<String> cdnFrontdoorProfileId;

    /**
     * @return The Resource ID of the Front Door Profile. Changing this forces a new Front Door Secret to be created.
     * 
     */
    public Output<String> cdnFrontdoorProfileId() {
        return this.cdnFrontdoorProfileId;
    }
    /**
     * The name of the Front Door Profile containing this Front Door Secret.
     * 
     */
    @Export(name="cdnFrontdoorProfileName", type=String.class, parameters={})
    private Output<String> cdnFrontdoorProfileName;

    /**
     * @return The name of the Front Door Profile containing this Front Door Secret.
     * 
     */
    public Output<String> cdnFrontdoorProfileName() {
        return this.cdnFrontdoorProfileName;
    }
    /**
     * The name which should be used for this Front Door Secret. Possible values must start with a letter or a number, only contain letters, numbers and hyphens and have a length of between 2 and 260 characters. Changing this forces a new Front Door Secret to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Front Door Secret. Possible values must start with a letter or a number, only contain letters, numbers and hyphens and have a length of between 2 and 260 characters. Changing this forces a new Front Door Secret to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
     * 
     */
    @Export(name="secret", type=FrontdoorSecretSecret.class, parameters={})
    private Output<FrontdoorSecretSecret> secret;

    /**
     * @return A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
     * 
     */
    public Output<FrontdoorSecretSecret> secret() {
        return this.secret;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FrontdoorSecret(String name) {
        this(name, FrontdoorSecretArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FrontdoorSecret(String name, FrontdoorSecretArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FrontdoorSecret(String name, FrontdoorSecretArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cdn/frontdoorSecret:FrontdoorSecret", name, args == null ? FrontdoorSecretArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FrontdoorSecret(String name, Output<String> id, @Nullable FrontdoorSecretState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cdn/frontdoorSecret:FrontdoorSecret", name, state, makeResourceOptions(options, id));
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
    public static FrontdoorSecret get(String name, Output<String> id, @Nullable FrontdoorSecretState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FrontdoorSecret(name, id, state, options);
    }
}
