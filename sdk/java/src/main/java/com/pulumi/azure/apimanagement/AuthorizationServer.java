// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.AuthorizationServerArgs;
import com.pulumi.azure.apimanagement.inputs.AuthorizationServerState;
import com.pulumi.azure.apimanagement.outputs.AuthorizationServerTokenBodyParameter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Authorization Server within an API Management Service.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.apimanagement.ApimanagementFunctions;
 * import com.pulumi.azure.apimanagement.inputs.GetServiceArgs;
 * import com.pulumi.azure.apimanagement.AuthorizationServer;
 * import com.pulumi.azure.apimanagement.AuthorizationServerArgs;
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
 *         final var exampleService = ApimanagementFunctions.getService(GetServiceArgs.builder()
 *             .name(&#34;search-api&#34;)
 *             .resourceGroupName(&#34;search-service&#34;)
 *             .build());
 * 
 *         var exampleAuthorizationServer = new AuthorizationServer(&#34;exampleAuthorizationServer&#34;, AuthorizationServerArgs.builder()        
 *             .apiManagementName(exampleService.applyValue(getServiceResult -&gt; getServiceResult.name()))
 *             .resourceGroupName(exampleService.applyValue(getServiceResult -&gt; getServiceResult.resourceGroupName()))
 *             .displayName(&#34;Test Server&#34;)
 *             .authorizationEndpoint(&#34;https://example.mydomain.com/client/authorize&#34;)
 *             .clientId(&#34;42424242-4242-4242-4242-424242424242&#34;)
 *             .clientRegistrationEndpoint(&#34;https://example.mydomain.com/client/register&#34;)
 *             .grantTypes(&#34;authorizationCode&#34;)
 *             .authorizationMethods(&#34;GET&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * API Management Authorization Servers can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:apimanagement/authorizationServer:AuthorizationServer example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/authorizationServers/server1
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/authorizationServer:AuthorizationServer")
public class AuthorizationServer extends com.pulumi.resources.CustomResource {
    /**
     * The name of the API Management Service in which this Authorization Server should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="apiManagementName", type=String.class, parameters={})
    private Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service in which this Authorization Server should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * The OAUTH Authorization Endpoint.
     * 
     */
    @Export(name="authorizationEndpoint", type=String.class, parameters={})
    private Output<String> authorizationEndpoint;

    /**
     * @return The OAUTH Authorization Endpoint.
     * 
     */
    public Output<String> authorizationEndpoint() {
        return this.authorizationEndpoint;
    }
    /**
     * The HTTP Verbs supported by the Authorization Endpoint. Possible values are `DELETE`, `GET`, `HEAD`, `OPTIONS`, `PATCH`, `POST`, `PUT` and `TRACE`.
     * 
     */
    @Export(name="authorizationMethods", type=List.class, parameters={String.class})
    private Output<List<String>> authorizationMethods;

    /**
     * @return The HTTP Verbs supported by the Authorization Endpoint. Possible values are `DELETE`, `GET`, `HEAD`, `OPTIONS`, `PATCH`, `POST`, `PUT` and `TRACE`.
     * 
     */
    public Output<List<String>> authorizationMethods() {
        return this.authorizationMethods;
    }
    /**
     * The mechanism by which Access Tokens are passed to the API. Possible values are `authorizationHeader` and `query`.
     * 
     */
    @Export(name="bearerTokenSendingMethods", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> bearerTokenSendingMethods;

    /**
     * @return The mechanism by which Access Tokens are passed to the API. Possible values are `authorizationHeader` and `query`.
     * 
     */
    public Output<Optional<List<String>>> bearerTokenSendingMethods() {
        return Codegen.optional(this.bearerTokenSendingMethods);
    }
    /**
     * The Authentication Methods supported by the Token endpoint of this Authorization Server.. Possible values are `Basic` and `Body`.
     * 
     */
    @Export(name="clientAuthenticationMethods", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> clientAuthenticationMethods;

    /**
     * @return The Authentication Methods supported by the Token endpoint of this Authorization Server.. Possible values are `Basic` and `Body`.
     * 
     */
    public Output<Optional<List<String>>> clientAuthenticationMethods() {
        return Codegen.optional(this.clientAuthenticationMethods);
    }
    /**
     * The Client/App ID registered with this Authorization Server.
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return The Client/App ID registered with this Authorization Server.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * The URI of page where Client/App Registration is performed for this Authorization Server.
     * 
     */
    @Export(name="clientRegistrationEndpoint", type=String.class, parameters={})
    private Output<String> clientRegistrationEndpoint;

    /**
     * @return The URI of page where Client/App Registration is performed for this Authorization Server.
     * 
     */
    public Output<String> clientRegistrationEndpoint() {
        return this.clientRegistrationEndpoint;
    }
    /**
     * The Client/App Secret registered with this Authorization Server.
     * 
     */
    @Export(name="clientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecret;

    /**
     * @return The Client/App Secret registered with this Authorization Server.
     * 
     */
    public Output<Optional<String>> clientSecret() {
        return Codegen.optional(this.clientSecret);
    }
    /**
     * The Default Scope used when requesting an Access Token, specified as a string containing space-delimited values.
     * 
     */
    @Export(name="defaultScope", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultScope;

    /**
     * @return The Default Scope used when requesting an Access Token, specified as a string containing space-delimited values.
     * 
     */
    public Output<Optional<String>> defaultScope() {
        return Codegen.optional(this.defaultScope);
    }
    /**
     * A description of the Authorization Server, which may contain HTML formatting tags.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the Authorization Server, which may contain HTML formatting tags.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The user-friendly name of this Authorization Server.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The user-friendly name of this Authorization Server.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Form of Authorization Grants required when requesting an Access Token. Possible values are `authorizationCode`, `clientCredentials`, `implicit` and `resourceOwnerPassword`.
     * 
     */
    @Export(name="grantTypes", type=List.class, parameters={String.class})
    private Output<List<String>> grantTypes;

    /**
     * @return Form of Authorization Grants required when requesting an Access Token. Possible values are `authorizationCode`, `clientCredentials`, `implicit` and `resourceOwnerPassword`.
     * 
     */
    public Output<List<String>> grantTypes() {
        return this.grantTypes;
    }
    /**
     * The name of this Authorization Server. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of this Authorization Server. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The password associated with the Resource Owner.
     * 
     */
    @Export(name="resourceOwnerPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceOwnerPassword;

    /**
     * @return The password associated with the Resource Owner.
     * 
     */
    public Output<Optional<String>> resourceOwnerPassword() {
        return Codegen.optional(this.resourceOwnerPassword);
    }
    /**
     * The username associated with the Resource Owner.
     * 
     */
    @Export(name="resourceOwnerUsername", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceOwnerUsername;

    /**
     * @return The username associated with the Resource Owner.
     * 
     */
    public Output<Optional<String>> resourceOwnerUsername() {
        return Codegen.optional(this.resourceOwnerUsername);
    }
    /**
     * Does this Authorization Server support State? If this is set to `true` the client may use the state parameter to raise protocol security.
     * 
     */
    @Export(name="supportState", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> supportState;

    /**
     * @return Does this Authorization Server support State? If this is set to `true` the client may use the state parameter to raise protocol security.
     * 
     */
    public Output<Optional<Boolean>> supportState() {
        return Codegen.optional(this.supportState);
    }
    /**
     * A `token_body_parameter` block as defined below.
     * 
     */
    @Export(name="tokenBodyParameters", type=List.class, parameters={AuthorizationServerTokenBodyParameter.class})
    private Output</* @Nullable */ List<AuthorizationServerTokenBodyParameter>> tokenBodyParameters;

    /**
     * @return A `token_body_parameter` block as defined below.
     * 
     */
    public Output<Optional<List<AuthorizationServerTokenBodyParameter>>> tokenBodyParameters() {
        return Codegen.optional(this.tokenBodyParameters);
    }
    /**
     * The OAUTH Token Endpoint.
     * 
     */
    @Export(name="tokenEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> tokenEndpoint;

    /**
     * @return The OAUTH Token Endpoint.
     * 
     */
    public Output<Optional<String>> tokenEndpoint() {
        return Codegen.optional(this.tokenEndpoint);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthorizationServer(String name) {
        this(name, AuthorizationServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthorizationServer(String name, AuthorizationServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthorizationServer(String name, AuthorizationServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/authorizationServer:AuthorizationServer", name, args == null ? AuthorizationServerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthorizationServer(String name, Output<String> id, @Nullable AuthorizationServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/authorizationServer:AuthorizationServer", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "clientSecret",
                "resourceOwnerPassword"
            ))
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
    public static AuthorizationServer get(String name, Output<String> id, @Nullable AuthorizationServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthorizationServer(name, id, state, options);
    }
}
