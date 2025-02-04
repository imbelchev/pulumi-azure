// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.GalleryApplicationVersionArgs;
import com.pulumi.azure.compute.inputs.GalleryApplicationVersionState;
import com.pulumi.azure.compute.outputs.GalleryApplicationVersionManageAction;
import com.pulumi.azure.compute.outputs.GalleryApplicationVersionSource;
import com.pulumi.azure.compute.outputs.GalleryApplicationVersionTargetRegion;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Gallery Application Version.
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
 * import com.pulumi.azure.compute.SharedImageGallery;
 * import com.pulumi.azure.compute.SharedImageGalleryArgs;
 * import com.pulumi.azure.compute.GalleryApplication;
 * import com.pulumi.azure.compute.GalleryApplicationArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.storage.Container;
 * import com.pulumi.azure.storage.ContainerArgs;
 * import com.pulumi.azure.storage.Blob;
 * import com.pulumi.azure.storage.BlobArgs;
 * import com.pulumi.azure.compute.GalleryApplicationVersion;
 * import com.pulumi.azure.compute.GalleryApplicationVersionArgs;
 * import com.pulumi.azure.compute.inputs.GalleryApplicationVersionManageActionArgs;
 * import com.pulumi.azure.compute.inputs.GalleryApplicationVersionSourceArgs;
 * import com.pulumi.azure.compute.inputs.GalleryApplicationVersionTargetRegionArgs;
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
 *         var exampleSharedImageGallery = new SharedImageGallery(&#34;exampleSharedImageGallery&#34;, SharedImageGalleryArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .build());
 * 
 *         var exampleGalleryApplication = new GalleryApplication(&#34;exampleGalleryApplication&#34;, GalleryApplicationArgs.builder()        
 *             .galleryId(exampleSharedImageGallery.id())
 *             .location(exampleResourceGroup.location())
 *             .supportedOsType(&#34;Linux&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleContainer = new Container(&#34;exampleContainer&#34;, ContainerArgs.builder()        
 *             .storageAccountName(exampleAccount.name())
 *             .containerAccessType(&#34;blob&#34;)
 *             .build());
 * 
 *         var exampleBlob = new Blob(&#34;exampleBlob&#34;, BlobArgs.builder()        
 *             .storageAccountName(exampleAccount.name())
 *             .storageContainerName(exampleContainer.name())
 *             .type(&#34;Block&#34;)
 *             .sourceContent(&#34;[scripts file content]&#34;)
 *             .build());
 * 
 *         var exampleGalleryApplicationVersion = new GalleryApplicationVersion(&#34;exampleGalleryApplicationVersion&#34;, GalleryApplicationVersionArgs.builder()        
 *             .galleryApplicationId(exampleGalleryApplication.id())
 *             .location(exampleGalleryApplication.location())
 *             .manageAction(GalleryApplicationVersionManageActionArgs.builder()
 *                 .install(&#34;[install command]&#34;)
 *                 .remove(&#34;[remove command]&#34;)
 *                 .build())
 *             .source(GalleryApplicationVersionSourceArgs.builder()
 *                 .mediaLink(exampleBlob.id())
 *                 .build())
 *             .targetRegions(GalleryApplicationVersionTargetRegionArgs.builder()
 *                 .name(exampleGalleryApplication.location())
 *                 .regionalReplicaCount(1)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Gallery Application Versions can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/galleryApplicationVersion:GalleryApplicationVersion example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Compute/galleries/gallery1/applications/galleryApplication1/versions/galleryApplicationVersion1
 * ```
 * 
 */
@ResourceType(type="azure:compute/galleryApplicationVersion:GalleryApplicationVersion")
public class GalleryApplicationVersion extends com.pulumi.resources.CustomResource {
    /**
     * Should the Gallery Application reports health. Defaults to `false`.
     * 
     */
    @Export(name="enableHealthCheck", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableHealthCheck;

    /**
     * @return Should the Gallery Application reports health. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enableHealthCheck() {
        return Codegen.optional(this.enableHealthCheck);
    }
    /**
     * The end of life date in RFC3339 format of the Gallery Application Version.
     * 
     */
    @Export(name="endOfLifeDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> endOfLifeDate;

    /**
     * @return The end of life date in RFC3339 format of the Gallery Application Version.
     * 
     */
    public Output<Optional<String>> endOfLifeDate() {
        return Codegen.optional(this.endOfLifeDate);
    }
    /**
     * Should the Gallery Application Version be excluded from the `latest` filter? If set to `true` this Gallery Application Version won&#39;t be returned for the `latest` version. Defaults to `false`.
     * 
     */
    @Export(name="excludeFromLatest", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> excludeFromLatest;

    /**
     * @return Should the Gallery Application Version be excluded from the `latest` filter? If set to `true` this Gallery Application Version won&#39;t be returned for the `latest` version. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> excludeFromLatest() {
        return Codegen.optional(this.excludeFromLatest);
    }
    /**
     * The ID of the Gallery Application. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="galleryApplicationId", type=String.class, parameters={})
    private Output<String> galleryApplicationId;

    /**
     * @return The ID of the Gallery Application. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> galleryApplicationId() {
        return this.galleryApplicationId;
    }
    /**
     * The Azure Region where the Gallery Application Version exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Gallery Application Version exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A `manage_action` block as defined below.
     * 
     */
    @Export(name="manageAction", type=GalleryApplicationVersionManageAction.class, parameters={})
    private Output<GalleryApplicationVersionManageAction> manageAction;

    /**
     * @return A `manage_action` block as defined below.
     * 
     */
    public Output<GalleryApplicationVersionManageAction> manageAction() {
        return this.manageAction;
    }
    /**
     * The version name of the Gallery Application Version, such as `1.0.0`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The version name of the Gallery Application Version, such as `1.0.0`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `source` block as defined below.
     * 
     */
    @Export(name="source", type=GalleryApplicationVersionSource.class, parameters={})
    private Output<GalleryApplicationVersionSource> source;

    /**
     * @return A `source` block as defined below.
     * 
     */
    public Output<GalleryApplicationVersionSource> source() {
        return this.source;
    }
    /**
     * A mapping of tags to assign to the Gallery Application Version.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Gallery Application Version.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * One or more `target_region` blocks as defined below.
     * 
     */
    @Export(name="targetRegions", type=List.class, parameters={GalleryApplicationVersionTargetRegion.class})
    private Output<List<GalleryApplicationVersionTargetRegion>> targetRegions;

    /**
     * @return One or more `target_region` blocks as defined below.
     * 
     */
    public Output<List<GalleryApplicationVersionTargetRegion>> targetRegions() {
        return this.targetRegions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GalleryApplicationVersion(String name) {
        this(name, GalleryApplicationVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GalleryApplicationVersion(String name, GalleryApplicationVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GalleryApplicationVersion(String name, GalleryApplicationVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/galleryApplicationVersion:GalleryApplicationVersion", name, args == null ? GalleryApplicationVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GalleryApplicationVersion(String name, Output<String> id, @Nullable GalleryApplicationVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/galleryApplicationVersion:GalleryApplicationVersion", name, state, makeResourceOptions(options, id));
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
    public static GalleryApplicationVersion get(String name, Output<String> id, @Nullable GalleryApplicationVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GalleryApplicationVersion(name, id, state, options);
    }
}
