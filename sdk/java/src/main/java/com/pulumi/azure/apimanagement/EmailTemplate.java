// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.EmailTemplateArgs;
import com.pulumi.azure.apimanagement.inputs.EmailTemplateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a API Management Email Template.
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
 * import com.pulumi.azure.apimanagement.Service;
 * import com.pulumi.azure.apimanagement.ServiceArgs;
 * import com.pulumi.azure.apimanagement.EmailTemplate;
 * import com.pulumi.azure.apimanagement.EmailTemplateArgs;
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
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .publisherName(&#34;My Company&#34;)
 *             .publisherEmail(&#34;company@terraform.io&#34;)
 *             .skuName(&#34;Developer_1&#34;)
 *             .build());
 * 
 *         var exampleEmailTemplate = new EmailTemplate(&#34;exampleEmailTemplate&#34;, EmailTemplateArgs.builder()        
 *             .templateName(&#34;ConfirmSignUpIdentityDefault&#34;)
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .apiManagementName(exampleService.name())
 *             .subject(&#34;Customized confirmation email for your new $OrganizationName API account&#34;)
 *             .body(&#34;&#34;&#34;
 * &lt;!DOCTYPE html &gt;
 * &lt;html&gt;
 * &lt;head&gt;
 *   &lt;meta charset=&#34;UTF-8&#34; /&gt;
 *   &lt;title&gt;Customized Letter Title&lt;/title&gt;
 * &lt;/head&gt;
 * &lt;body&gt;
 *   &lt;p style=&#34;font-size:12pt;font-family:&#39;Segoe UI&#39;&#34;&gt;Dear $DevFirstName $DevLastName,&lt;/p&gt;
 * &lt;/body&gt;
 * &lt;/html&gt;
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * API Management Email Templates can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:apimanagement/emailTemplate:EmailTemplate example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/instance1/templates/template1
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/emailTemplate:EmailTemplate")
public class EmailTemplate extends com.pulumi.resources.CustomResource {
    /**
     * The name of the API Management Service in which the Email Template should exist. Changing this forces a new API Management Email Template to be created.
     * 
     */
    @Export(name="apiManagementName", type=String.class, parameters={})
    private Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service in which the Email Template should exist. Changing this forces a new API Management Email Template to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * The body of the Email. Its format has to be a well-formed HTML document.
     * 
     */
    @Export(name="body", type=String.class, parameters={})
    private Output<String> body;

    /**
     * @return The body of the Email. Its format has to be a well-formed HTML document.
     * 
     */
    public Output<String> body() {
        return this.body;
    }
    /**
     * The description of the Email Template.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the Email Template.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The name of the Resource Group where the API Management Email Template should exist. Changing this forces a new API Management Email Template to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the API Management Email Template should exist. Changing this forces a new API Management Email Template to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The subject of the Email.
     * 
     */
    @Export(name="subject", type=String.class, parameters={})
    private Output<String> subject;

    /**
     * @return The subject of the Email.
     * 
     */
    public Output<String> subject() {
        return this.subject;
    }
    /**
     * The name of the Email Template. Possible values are `AccountClosedDeveloper`, `ApplicationApprovedNotificationMessage`, `ConfirmSignUpIdentityDefault`, `EmailChangeIdentityDefault`, `InviteUserNotificationMessage`, `NewCommentNotificationMessage`, `NewDeveloperNotificationMessage`, `NewIssueNotificationMessage`, `PasswordResetByAdminNotificationMessage`, `PasswordResetIdentityDefault`, `PurchaseDeveloperNotificationMessage`, `QuotaLimitApproachingDeveloperNotificationMessage`, `RejectDeveloperNotificationMessage`, `RequestDeveloperNotificationMessage`. Changing this forces a new API Management Email Template to be created.
     * 
     */
    @Export(name="templateName", type=String.class, parameters={})
    private Output<String> templateName;

    /**
     * @return The name of the Email Template. Possible values are `AccountClosedDeveloper`, `ApplicationApprovedNotificationMessage`, `ConfirmSignUpIdentityDefault`, `EmailChangeIdentityDefault`, `InviteUserNotificationMessage`, `NewCommentNotificationMessage`, `NewDeveloperNotificationMessage`, `NewIssueNotificationMessage`, `PasswordResetByAdminNotificationMessage`, `PasswordResetIdentityDefault`, `PurchaseDeveloperNotificationMessage`, `QuotaLimitApproachingDeveloperNotificationMessage`, `RejectDeveloperNotificationMessage`, `RequestDeveloperNotificationMessage`. Changing this forces a new API Management Email Template to be created.
     * 
     */
    public Output<String> templateName() {
        return this.templateName;
    }
    /**
     * The title of the Email Template.
     * 
     */
    @Export(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return The title of the Email Template.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EmailTemplate(String name) {
        this(name, EmailTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailTemplate(String name, EmailTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailTemplate(String name, EmailTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/emailTemplate:EmailTemplate", name, args == null ? EmailTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EmailTemplate(String name, Output<String> id, @Nullable EmailTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/emailTemplate:EmailTemplate", name, state, makeResourceOptions(options, id));
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
    public static EmailTemplate get(String name, Output<String> id, @Nullable EmailTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EmailTemplate(name, id, state, options);
    }
}
