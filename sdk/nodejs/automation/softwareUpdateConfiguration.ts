// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages an Automation Software Update Configuraion.
 *
 * ## Import
 *
 * Automations Software Update Configuration can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:automation/softwareUpdateConfiguration:SoftwareUpdateConfiguration example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/softwareUpdateConfigurations/suc1
 * ```
 */
export class SoftwareUpdateConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing SoftwareUpdateConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SoftwareUpdateConfigurationState, opts?: pulumi.CustomResourceOptions): SoftwareUpdateConfiguration {
        return new SoftwareUpdateConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:automation/softwareUpdateConfiguration:SoftwareUpdateConfiguration';

    /**
     * Returns true if the given object is an instance of SoftwareUpdateConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SoftwareUpdateConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SoftwareUpdateConfiguration.__pulumiType;
    }

    /**
     * The ID of Automation Account to manage this Source Control. Changing this forces a new Automation Source Control to be created.
     */
    public readonly automationAccountId!: pulumi.Output<string>;
    /**
     * Maximum time allowed for the software update configuration run. using format `PT[n]H[n]M[n]S` as per ISO8601.
     */
    public readonly duration!: pulumi.Output<string | undefined>;
    /**
     * The Error code when failed.
     */
    public /*out*/ readonly errorCode!: pulumi.Output<string>;
    /**
     * The Error message indicating why the operation failed.
     */
    public /*out*/ readonly errorMeesage!: pulumi.Output<string>;
    /**
     * One or more `linux` blocks as defined below.
     */
    public readonly linuxes!: pulumi.Output<outputs.automation.SoftwareUpdateConfigurationLinux[] | undefined>;
    /**
     * The name which should be used for this Automation. Changing this forces a new Automation to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies a list of names of non-azure machines for the software update configuration.
     */
    public readonly nonAzureComputerNames!: pulumi.Output<string[] | undefined>;
    /**
     * The Operating system of target machines. Possible values are `Windows` and `Linux`.
     */
    public readonly operatingSystem!: pulumi.Output<string>;
    /**
     * One or more `postTask` blocks as defined below.
     */
    public readonly postTasks!: pulumi.Output<outputs.automation.SoftwareUpdateConfigurationPostTask[] | undefined>;
    /**
     * One or more `preTask` blocks as defined below.
     */
    public readonly preTasks!: pulumi.Output<outputs.automation.SoftwareUpdateConfigurationPreTask[] | undefined>;
    /**
     * One or more `schedule` blocks as defined below.
     */
    public readonly schedules!: pulumi.Output<outputs.automation.SoftwareUpdateConfigurationSchedule[] | undefined>;
    /**
     * One or more `target` blocks as defined below.
     */
    public readonly target!: pulumi.Output<outputs.automation.SoftwareUpdateConfigurationTarget | undefined>;
    /**
     * Specifies a list of azure resource Ids of azure virtual machines.
     */
    public readonly virtualMachineIds!: pulumi.Output<string[] | undefined>;
    /**
     * One or more `windows` blocks as defined below.
     */
    public readonly windows!: pulumi.Output<outputs.automation.SoftwareUpdateConfigurationWindows | undefined>;

    /**
     * Create a SoftwareUpdateConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SoftwareUpdateConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SoftwareUpdateConfigurationArgs | SoftwareUpdateConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SoftwareUpdateConfigurationState | undefined;
            resourceInputs["automationAccountId"] = state ? state.automationAccountId : undefined;
            resourceInputs["duration"] = state ? state.duration : undefined;
            resourceInputs["errorCode"] = state ? state.errorCode : undefined;
            resourceInputs["errorMeesage"] = state ? state.errorMeesage : undefined;
            resourceInputs["linuxes"] = state ? state.linuxes : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nonAzureComputerNames"] = state ? state.nonAzureComputerNames : undefined;
            resourceInputs["operatingSystem"] = state ? state.operatingSystem : undefined;
            resourceInputs["postTasks"] = state ? state.postTasks : undefined;
            resourceInputs["preTasks"] = state ? state.preTasks : undefined;
            resourceInputs["schedules"] = state ? state.schedules : undefined;
            resourceInputs["target"] = state ? state.target : undefined;
            resourceInputs["virtualMachineIds"] = state ? state.virtualMachineIds : undefined;
            resourceInputs["windows"] = state ? state.windows : undefined;
        } else {
            const args = argsOrState as SoftwareUpdateConfigurationArgs | undefined;
            if ((!args || args.automationAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'automationAccountId'");
            }
            if ((!args || args.operatingSystem === undefined) && !opts.urn) {
                throw new Error("Missing required property 'operatingSystem'");
            }
            resourceInputs["automationAccountId"] = args ? args.automationAccountId : undefined;
            resourceInputs["duration"] = args ? args.duration : undefined;
            resourceInputs["linuxes"] = args ? args.linuxes : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nonAzureComputerNames"] = args ? args.nonAzureComputerNames : undefined;
            resourceInputs["operatingSystem"] = args ? args.operatingSystem : undefined;
            resourceInputs["postTasks"] = args ? args.postTasks : undefined;
            resourceInputs["preTasks"] = args ? args.preTasks : undefined;
            resourceInputs["schedules"] = args ? args.schedules : undefined;
            resourceInputs["target"] = args ? args.target : undefined;
            resourceInputs["virtualMachineIds"] = args ? args.virtualMachineIds : undefined;
            resourceInputs["windows"] = args ? args.windows : undefined;
            resourceInputs["errorCode"] = undefined /*out*/;
            resourceInputs["errorMeesage"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SoftwareUpdateConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SoftwareUpdateConfiguration resources.
 */
export interface SoftwareUpdateConfigurationState {
    /**
     * The ID of Automation Account to manage this Source Control. Changing this forces a new Automation Source Control to be created.
     */
    automationAccountId?: pulumi.Input<string>;
    /**
     * Maximum time allowed for the software update configuration run. using format `PT[n]H[n]M[n]S` as per ISO8601.
     */
    duration?: pulumi.Input<string>;
    /**
     * The Error code when failed.
     */
    errorCode?: pulumi.Input<string>;
    /**
     * The Error message indicating why the operation failed.
     */
    errorMeesage?: pulumi.Input<string>;
    /**
     * One or more `linux` blocks as defined below.
     */
    linuxes?: pulumi.Input<pulumi.Input<inputs.automation.SoftwareUpdateConfigurationLinux>[]>;
    /**
     * The name which should be used for this Automation. Changing this forces a new Automation to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies a list of names of non-azure machines for the software update configuration.
     */
    nonAzureComputerNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Operating system of target machines. Possible values are `Windows` and `Linux`.
     */
    operatingSystem?: pulumi.Input<string>;
    /**
     * One or more `postTask` blocks as defined below.
     */
    postTasks?: pulumi.Input<pulumi.Input<inputs.automation.SoftwareUpdateConfigurationPostTask>[]>;
    /**
     * One or more `preTask` blocks as defined below.
     */
    preTasks?: pulumi.Input<pulumi.Input<inputs.automation.SoftwareUpdateConfigurationPreTask>[]>;
    /**
     * One or more `schedule` blocks as defined below.
     */
    schedules?: pulumi.Input<pulumi.Input<inputs.automation.SoftwareUpdateConfigurationSchedule>[]>;
    /**
     * One or more `target` blocks as defined below.
     */
    target?: pulumi.Input<inputs.automation.SoftwareUpdateConfigurationTarget>;
    /**
     * Specifies a list of azure resource Ids of azure virtual machines.
     */
    virtualMachineIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more `windows` blocks as defined below.
     */
    windows?: pulumi.Input<inputs.automation.SoftwareUpdateConfigurationWindows>;
}

/**
 * The set of arguments for constructing a SoftwareUpdateConfiguration resource.
 */
export interface SoftwareUpdateConfigurationArgs {
    /**
     * The ID of Automation Account to manage this Source Control. Changing this forces a new Automation Source Control to be created.
     */
    automationAccountId: pulumi.Input<string>;
    /**
     * Maximum time allowed for the software update configuration run. using format `PT[n]H[n]M[n]S` as per ISO8601.
     */
    duration?: pulumi.Input<string>;
    /**
     * One or more `linux` blocks as defined below.
     */
    linuxes?: pulumi.Input<pulumi.Input<inputs.automation.SoftwareUpdateConfigurationLinux>[]>;
    /**
     * The name which should be used for this Automation. Changing this forces a new Automation to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies a list of names of non-azure machines for the software update configuration.
     */
    nonAzureComputerNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Operating system of target machines. Possible values are `Windows` and `Linux`.
     */
    operatingSystem: pulumi.Input<string>;
    /**
     * One or more `postTask` blocks as defined below.
     */
    postTasks?: pulumi.Input<pulumi.Input<inputs.automation.SoftwareUpdateConfigurationPostTask>[]>;
    /**
     * One or more `preTask` blocks as defined below.
     */
    preTasks?: pulumi.Input<pulumi.Input<inputs.automation.SoftwareUpdateConfigurationPreTask>[]>;
    /**
     * One or more `schedule` blocks as defined below.
     */
    schedules?: pulumi.Input<pulumi.Input<inputs.automation.SoftwareUpdateConfigurationSchedule>[]>;
    /**
     * One or more `target` blocks as defined below.
     */
    target?: pulumi.Input<inputs.automation.SoftwareUpdateConfigurationTarget>;
    /**
     * Specifies a list of azure resource Ids of azure virtual machines.
     */
    virtualMachineIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more `windows` blocks as defined below.
     */
    windows?: pulumi.Input<inputs.automation.SoftwareUpdateConfigurationWindows>;
}
