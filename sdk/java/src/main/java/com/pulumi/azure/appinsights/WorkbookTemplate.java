// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appinsights;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appinsights.WorkbookTemplateArgs;
import com.pulumi.azure.appinsights.inputs.WorkbookTemplateState;
import com.pulumi.azure.appinsights.outputs.WorkbookTemplateGallery;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Application Insights Workbook Template.
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
 * import com.pulumi.azure.appinsights.WorkbookTemplate;
 * import com.pulumi.azure.appinsights.WorkbookTemplateArgs;
 * import com.pulumi.azure.appinsights.inputs.WorkbookTemplateGalleryArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var exampleWorkbookTemplate = new WorkbookTemplate(&#34;exampleWorkbookTemplate&#34;, WorkbookTemplateArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(&#34;West Europe&#34;)
 *             .author(&#34;test author&#34;)
 *             .priority(1)
 *             .galleries(WorkbookTemplateGalleryArgs.builder()
 *                 .category(&#34;workbook&#34;)
 *                 .name(&#34;test&#34;)
 *                 .order(100)
 *                 .resourceType(&#34;microsoft.insights/components&#34;)
 *                 .type(&#34;tsg&#34;)
 *                 .build())
 *             .templateData(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;version&#34;, &#34;Notebook/1.0&#34;),
 *                     jsonProperty(&#34;items&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;type&#34;, 1),
 *                         jsonProperty(&#34;content&#34;, jsonObject(
 *                             jsonProperty(&#34;json&#34;, &#34;&#34;&#34;
 * ## New workbook
 * ---
 * 
 * Welcome to your new workbook.                            &#34;&#34;&#34;)
 *                         )),
 *                         jsonProperty(&#34;name&#34;, &#34;text - 2&#34;)
 *                     ))),
 *                     jsonProperty(&#34;styleSettings&#34;, jsonObject(
 * 
 *                     )),
 *                     jsonProperty(&#34;$schema&#34;, &#34;https://github.com/Microsoft/Application-Insights-Workbooks/blob/master/schema/workbook.json&#34;)
 *                 )))
 *             .localized(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;ar&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;galleries&#34;, jsonArray(jsonObject(
 *                             jsonProperty(&#34;name&#34;, &#34;test&#34;),
 *                             jsonProperty(&#34;category&#34;, &#34;Failures&#34;),
 *                             jsonProperty(&#34;type&#34;, &#34;tsg&#34;),
 *                             jsonProperty(&#34;resourceType&#34;, &#34;microsoft.insights/components&#34;),
 *                             jsonProperty(&#34;order&#34;, 100)
 *                         ))),
 *                         jsonProperty(&#34;templateData&#34;, jsonObject(
 *                             jsonProperty(&#34;version&#34;, &#34;Notebook/1.0&#34;),
 *                             jsonProperty(&#34;items&#34;, jsonArray(jsonObject(
 *                                 jsonProperty(&#34;type&#34;, 1),
 *                                 jsonProperty(&#34;content&#34;, jsonObject(
 *                                     jsonProperty(&#34;json&#34;, &#34;&#34;&#34;
 * ## New workbook
 * ---
 * 
 * Welcome to your new workbook.                                    &#34;&#34;&#34;)
 *                                 )),
 *                                 jsonProperty(&#34;name&#34;, &#34;text - 2&#34;)
 *                             ))),
 *                             jsonProperty(&#34;styleSettings&#34;, jsonObject(
 * 
 *                             )),
 *                             jsonProperty(&#34;$schema&#34;, &#34;https://github.com/Microsoft/Application-Insights-Workbooks/blob/master/schema/workbook.json&#34;)
 *                         ))
 *                     )))
 *                 )))
 *             .tags(Map.of(&#34;key&#34;, &#34;value&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Application Insights Workbook Template can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appinsights/workbookTemplate:WorkbookTemplate example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Insights/workbookTemplates/resource1
 * ```
 * 
 */
@ResourceType(type="azure:appinsights/workbookTemplate:WorkbookTemplate")
public class WorkbookTemplate extends com.pulumi.resources.CustomResource {
    /**
     * Information about the author of the workbook template.
     * 
     */
    @Export(name="author", type=String.class, parameters={})
    private Output</* @Nullable */ String> author;

    /**
     * @return Information about the author of the workbook template.
     * 
     */
    public Output<Optional<String>> author() {
        return Codegen.optional(this.author);
    }
    /**
     * A `galleries` block as defined below.
     * 
     */
    @Export(name="galleries", type=List.class, parameters={WorkbookTemplateGallery.class})
    private Output<List<WorkbookTemplateGallery>> galleries;

    /**
     * @return A `galleries` block as defined below.
     * 
     */
    public Output<List<WorkbookTemplateGallery>> galleries() {
        return this.galleries;
    }
    /**
     * Key value pairs of localized gallery. Each key is the locale code of languages supported by the Azure portal.
     * 
     */
    @Export(name="localized", type=String.class, parameters={})
    private Output</* @Nullable */ String> localized;

    /**
     * @return Key value pairs of localized gallery. Each key is the locale code of languages supported by the Azure portal.
     * 
     */
    public Output<Optional<String>> localized() {
        return Codegen.optional(this.localized);
    }
    /**
     * Specifies the Azure Region where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the Azure Region where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name which should be used for this Application Insights Workbook Template. Changing this forces a new Application Insights Workbook Template to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name which should be used for this Application Insights Workbook Template. Changing this forces a new Application Insights Workbook Template to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode. Defaults to `0`.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode. Defaults to `0`.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * Specifies the name of the Resource Group where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Application Insights Workbook Template should exist. Changing this forces a new Application Insights Workbook Template to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags which should be assigned to the Application Insights Workbook Template.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Application Insights Workbook Template.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Valid JSON object containing workbook template payload.
     * 
     */
    @Export(name="templateData", type=String.class, parameters={})
    private Output<String> templateData;

    /**
     * @return Valid JSON object containing workbook template payload.
     * 
     */
    public Output<String> templateData() {
        return this.templateData;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkbookTemplate(String name) {
        this(name, WorkbookTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkbookTemplate(String name, WorkbookTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkbookTemplate(String name, WorkbookTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appinsights/workbookTemplate:WorkbookTemplate", name, args == null ? WorkbookTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkbookTemplate(String name, Output<String> id, @Nullable WorkbookTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appinsights/workbookTemplate:WorkbookTemplate", name, state, makeResourceOptions(options, id));
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
    public static WorkbookTemplate get(String name, Output<String> id, @Nullable WorkbookTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkbookTemplate(name, id, state, options);
    }
}
