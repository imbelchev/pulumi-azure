// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.privatedns.TxtRecordArgs;
import com.pulumi.azure.privatedns.inputs.TxtRecordState;
import com.pulumi.azure.privatedns.outputs.TxtRecordRecord;
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
 * Enables you to manage DNS TXT Records within Azure Private DNS.
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
 * import com.pulumi.azure.privatedns.Zone;
 * import com.pulumi.azure.privatedns.ZoneArgs;
 * import com.pulumi.azure.privatedns.TxtRecord;
 * import com.pulumi.azure.privatedns.TxtRecordArgs;
 * import com.pulumi.azure.privatedns.inputs.TxtRecordRecordArgs;
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
 *         var exampleZone = new Zone(&#34;exampleZone&#34;, ZoneArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleTxtRecord = new TxtRecord(&#34;exampleTxtRecord&#34;, TxtRecordArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .zoneName(exampleZone.name())
 *             .ttl(300)
 *             .records(TxtRecordRecordArgs.builder()
 *                 .value(&#34;v=spf1 mx ~all&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Private DNS TXT Records can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:privatedns/txtRecord:TxtRecord test /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/privateDnsZones/contoso.com/TXT/test
 * ```
 * 
 */
@ResourceType(type="azure:privatedns/txtRecord:TxtRecord")
public class TxtRecord extends com.pulumi.resources.CustomResource {
    /**
     * The FQDN of the DNS TXT Record.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return The FQDN of the DNS TXT Record.
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * The name of the DNS TXT Record. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the DNS TXT Record. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more `record` blocks as defined below.
     * 
     */
    @Export(name="records", type=List.class, parameters={TxtRecordRecord.class})
    private Output<List<TxtRecordRecord>> records;

    /**
     * @return One or more `record` blocks as defined below.
     * 
     */
    public Output<List<TxtRecordRecord>> records() {
        return this.records;
    }
    /**
     * Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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
     * The Time To Live (TTL) of the DNS record in seconds.
     * 
     */
    @Export(name="ttl", type=Integer.class, parameters={})
    private Output<Integer> ttl;

    /**
     * @return The Time To Live (TTL) of the DNS record in seconds.
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }
    /**
     * Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="zoneName", type=String.class, parameters={})
    private Output<String> zoneName;

    /**
     * @return Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> zoneName() {
        return this.zoneName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TxtRecord(String name) {
        this(name, TxtRecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TxtRecord(String name, TxtRecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TxtRecord(String name, TxtRecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:privatedns/txtRecord:TxtRecord", name, args == null ? TxtRecordArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TxtRecord(String name, Output<String> id, @Nullable TxtRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:privatedns/txtRecord:TxtRecord", name, state, makeResourceOptions(options, id));
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
    public static TxtRecord get(String name, Output<String> id, @Nullable TxtRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TxtRecord(name, id, state, options);
    }
}
