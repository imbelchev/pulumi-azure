// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lab;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.lab.ScheduleArgs;
import com.pulumi.azure.lab.inputs.ScheduleState;
import com.pulumi.azure.lab.outputs.ScheduleRecurrence;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Lab Service Schedule.
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
 * import com.pulumi.azure.lab.Lab;
 * import com.pulumi.azure.lab.LabArgs;
 * import com.pulumi.azure.lab.inputs.LabSecurityArgs;
 * import com.pulumi.azure.lab.inputs.LabVirtualMachineArgs;
 * import com.pulumi.azure.lab.inputs.LabVirtualMachineAdminUserArgs;
 * import com.pulumi.azure.lab.inputs.LabVirtualMachineImageReferenceArgs;
 * import com.pulumi.azure.lab.inputs.LabVirtualMachineSkuArgs;
 * import com.pulumi.azure.lab.Schedule;
 * import com.pulumi.azure.lab.ScheduleArgs;
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
 *         var exampleLab = new Lab(&#34;exampleLab&#34;, LabArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .title(&#34;Test Title&#34;)
 *             .security(LabSecurityArgs.builder()
 *                 .openAccessEnabled(false)
 *                 .build())
 *             .virtualMachine(LabVirtualMachineArgs.builder()
 *                 .adminUser(LabVirtualMachineAdminUserArgs.builder()
 *                     .username(&#34;testadmin&#34;)
 *                     .password(&#34;Password1234!&#34;)
 *                     .build())
 *                 .imageReference(LabVirtualMachineImageReferenceArgs.builder()
 *                     .offer(&#34;0001-com-ubuntu-server-focal&#34;)
 *                     .publisher(&#34;canonical&#34;)
 *                     .sku(&#34;20_04-lts&#34;)
 *                     .version(&#34;latest&#34;)
 *                     .build())
 *                 .sku(LabVirtualMachineSkuArgs.builder()
 *                     .name(&#34;Classic_Fsv2_2_4GB_128_S_SSD&#34;)
 *                     .capacity(1)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleSchedule = new Schedule(&#34;exampleSchedule&#34;, ScheduleArgs.builder()        
 *             .labId(exampleLab.id())
 *             .stopTime(&#34;2022-11-28T00:00:00Z&#34;)
 *             .timeZone(&#34;America/Los_Angeles&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Lab Service Schedules can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:lab/schedule:Schedule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.LabServices/labs/lab1/schedules/schedule1
 * ```
 * 
 */
@ResourceType(type="azure:lab/schedule:Schedule")
public class Schedule extends com.pulumi.resources.CustomResource {
    /**
     * The resource ID of the Lab Service Schedule. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="labId", type=String.class, parameters={})
    private Output<String> labId;

    /**
     * @return The resource ID of the Lab Service Schedule. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> labId() {
        return this.labId;
    }
    /**
     * The name which should be used for this Lab Service Schedule. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Lab Service Schedule. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The notes for the Schedule.
     * 
     */
    @Export(name="notes", type=String.class, parameters={})
    private Output</* @Nullable */ String> notes;

    /**
     * @return The notes for the Schedule.
     * 
     */
    public Output<Optional<String>> notes() {
        return Codegen.optional(this.notes);
    }
    /**
     * A `recurrence` block as defined below.
     * 
     */
    @Export(name="recurrence", type=ScheduleRecurrence.class, parameters={})
    private Output</* @Nullable */ ScheduleRecurrence> recurrence;

    /**
     * @return A `recurrence` block as defined below.
     * 
     */
    public Output<Optional<ScheduleRecurrence>> recurrence() {
        return Codegen.optional(this.recurrence);
    }
    /**
     * When Lab User Virtual Machines will be started in RFC-3339 format.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> startTime;

    /**
     * @return When Lab User Virtual Machines will be started in RFC-3339 format.
     * 
     */
    public Output<Optional<String>> startTime() {
        return Codegen.optional(this.startTime);
    }
    /**
     * When Lab User Virtual Machines will be stopped in RFC-3339 format.
     * 
     */
    @Export(name="stopTime", type=String.class, parameters={})
    private Output<String> stopTime;

    /**
     * @return When Lab User Virtual Machines will be stopped in RFC-3339 format.
     * 
     */
    public Output<String> stopTime() {
        return this.stopTime;
    }
    /**
     * The IANA Time Zone ID for the Schedule.
     * 
     */
    @Export(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return The IANA Time Zone ID for the Schedule.
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schedule(String name) {
        this(name, ScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schedule(String name, ScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schedule(String name, ScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:lab/schedule:Schedule", name, args == null ? ScheduleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Schedule(String name, Output<String> id, @Nullable ScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:lab/schedule:Schedule", name, state, makeResourceOptions(options, id));
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
    public static Schedule get(String name, Output<String> id, @Nullable ScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Schedule(name, id, state, options);
    }
}
