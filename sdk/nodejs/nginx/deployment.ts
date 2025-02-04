// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Nginx Deployment.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const examplePublicIp = new azure.network.PublicIp("examplePublicIp", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     allocationMethod: "Static",
 *     sku: "Standard",
 *     tags: {
 *         environment: "Production",
 *     },
 * });
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("exampleVirtualNetwork", {
 *     addressSpaces: ["10.0.0.0/16"],
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleSubnet = new azure.network.Subnet("exampleSubnet", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.2.0/24"],
 *     delegations: [{
 *         name: "delegation",
 *         serviceDelegation: {
 *             name: "NGINX.NGINXPLUS/nginxDeployments",
 *             actions: ["Microsoft.Network/virtualNetworks/subnets/join/action"],
 *         },
 *     }],
 * });
 * const exampleDeployment = new azure.nginx.Deployment("exampleDeployment", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     sku: "publicpreview_Monthly_gmz7xq9ge3py",
 *     location: exampleResourceGroup.location,
 *     managedResourceGroup: "example",
 *     diagnoseSupportEnabled: true,
 *     frontendPublic: {
 *         ipAddresses: [examplePublicIp.id],
 *     },
 *     networkInterfaces: [{
 *         subnetId: exampleSubnet.id,
 *     }],
 *     tags: {
 *         foo: "bar",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Nginx Deployments can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:nginx/deployment:Deployment example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Nginx.NginxPlus/nginxDeployments/dep1
 * ```
 */
export class Deployment extends pulumi.CustomResource {
    /**
     * Get an existing Deployment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeploymentState, opts?: pulumi.CustomResourceOptions): Deployment {
        return new Deployment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:nginx/deployment:Deployment';

    /**
     * Returns true if the given object is an instance of Deployment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Deployment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Deployment.__pulumiType;
    }

    /**
     * Should the diagnosis support be enabled?
     */
    public readonly diagnoseSupportEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * One or more `frontendPrivate` blocks as defined below. Changing this forces a new Nginx Deployment to be created.
     */
    public readonly frontendPrivates!: pulumi.Output<outputs.nginx.DeploymentFrontendPrivate[] | undefined>;
    /**
     * A `frontendPublic` block as defined below. Changing this forces a new Nginx Deployment to be created.
     */
    public readonly frontendPublic!: pulumi.Output<outputs.nginx.DeploymentFrontendPublic | undefined>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.nginx.DeploymentIdentity | undefined>;
    /**
     * Specify the IP Address of this private IP.
     */
    public /*out*/ readonly ipAddress!: pulumi.Output<string>;
    /**
     * The Azure Region where the Nginx Deployment should exist. Changing this forces a new Nginx Deployment to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * One or more `loggingStorageAccount` blocks as defined below.
     */
    public readonly loggingStorageAccounts!: pulumi.Output<outputs.nginx.DeploymentLoggingStorageAccount[] | undefined>;
    /**
     * Specify the managed resource group to deploy VNet injection related network resources. Changing this forces a new Nginx Deployment to be created.
     */
    public readonly managedResourceGroup!: pulumi.Output<string>;
    /**
     * The name which should be used for this Nginx Deployment. Changing this forces a new Nginx Deployment to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * One or more `networkInterface` blocks as defined below. Changing this forces a new Nginx Deployment to be created.
     */
    public readonly networkInterfaces!: pulumi.Output<outputs.nginx.DeploymentNetworkInterface[] | undefined>;
    /**
     * The version of deployed nginx.
     */
    public /*out*/ readonly nginxVersion!: pulumi.Output<string>;
    /**
     * The name of the Resource Group where the Nginx Deployment should exist. Changing this forces a new Nginx Deployment to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Specify the Name of Nginx deployment SKU. The possible value are `publicpreview_Monthly_gmz7xq9ge3py` and `standard_Monthly`.
     */
    public readonly sku!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Nginx Deployment.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a Deployment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeploymentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeploymentArgs | DeploymentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeploymentState | undefined;
            resourceInputs["diagnoseSupportEnabled"] = state ? state.diagnoseSupportEnabled : undefined;
            resourceInputs["frontendPrivates"] = state ? state.frontendPrivates : undefined;
            resourceInputs["frontendPublic"] = state ? state.frontendPublic : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["loggingStorageAccounts"] = state ? state.loggingStorageAccounts : undefined;
            resourceInputs["managedResourceGroup"] = state ? state.managedResourceGroup : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            resourceInputs["nginxVersion"] = state ? state.nginxVersion : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["sku"] = state ? state.sku : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as DeploymentArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.sku === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sku'");
            }
            resourceInputs["diagnoseSupportEnabled"] = args ? args.diagnoseSupportEnabled : undefined;
            resourceInputs["frontendPrivates"] = args ? args.frontendPrivates : undefined;
            resourceInputs["frontendPublic"] = args ? args.frontendPublic : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["loggingStorageAccounts"] = args ? args.loggingStorageAccounts : undefined;
            resourceInputs["managedResourceGroup"] = args ? args.managedResourceGroup : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["sku"] = args ? args.sku : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["ipAddress"] = undefined /*out*/;
            resourceInputs["nginxVersion"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Deployment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Deployment resources.
 */
export interface DeploymentState {
    /**
     * Should the diagnosis support be enabled?
     */
    diagnoseSupportEnabled?: pulumi.Input<boolean>;
    /**
     * One or more `frontendPrivate` blocks as defined below. Changing this forces a new Nginx Deployment to be created.
     */
    frontendPrivates?: pulumi.Input<pulumi.Input<inputs.nginx.DeploymentFrontendPrivate>[]>;
    /**
     * A `frontendPublic` block as defined below. Changing this forces a new Nginx Deployment to be created.
     */
    frontendPublic?: pulumi.Input<inputs.nginx.DeploymentFrontendPublic>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.nginx.DeploymentIdentity>;
    /**
     * Specify the IP Address of this private IP.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * The Azure Region where the Nginx Deployment should exist. Changing this forces a new Nginx Deployment to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * One or more `loggingStorageAccount` blocks as defined below.
     */
    loggingStorageAccounts?: pulumi.Input<pulumi.Input<inputs.nginx.DeploymentLoggingStorageAccount>[]>;
    /**
     * Specify the managed resource group to deploy VNet injection related network resources. Changing this forces a new Nginx Deployment to be created.
     */
    managedResourceGroup?: pulumi.Input<string>;
    /**
     * The name which should be used for this Nginx Deployment. Changing this forces a new Nginx Deployment to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `networkInterface` blocks as defined below. Changing this forces a new Nginx Deployment to be created.
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.nginx.DeploymentNetworkInterface>[]>;
    /**
     * The version of deployed nginx.
     */
    nginxVersion?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Nginx Deployment should exist. Changing this forces a new Nginx Deployment to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * Specify the Name of Nginx deployment SKU. The possible value are `publicpreview_Monthly_gmz7xq9ge3py` and `standard_Monthly`.
     */
    sku?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Nginx Deployment.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Deployment resource.
 */
export interface DeploymentArgs {
    /**
     * Should the diagnosis support be enabled?
     */
    diagnoseSupportEnabled?: pulumi.Input<boolean>;
    /**
     * One or more `frontendPrivate` blocks as defined below. Changing this forces a new Nginx Deployment to be created.
     */
    frontendPrivates?: pulumi.Input<pulumi.Input<inputs.nginx.DeploymentFrontendPrivate>[]>;
    /**
     * A `frontendPublic` block as defined below. Changing this forces a new Nginx Deployment to be created.
     */
    frontendPublic?: pulumi.Input<inputs.nginx.DeploymentFrontendPublic>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.nginx.DeploymentIdentity>;
    /**
     * The Azure Region where the Nginx Deployment should exist. Changing this forces a new Nginx Deployment to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * One or more `loggingStorageAccount` blocks as defined below.
     */
    loggingStorageAccounts?: pulumi.Input<pulumi.Input<inputs.nginx.DeploymentLoggingStorageAccount>[]>;
    /**
     * Specify the managed resource group to deploy VNet injection related network resources. Changing this forces a new Nginx Deployment to be created.
     */
    managedResourceGroup?: pulumi.Input<string>;
    /**
     * The name which should be used for this Nginx Deployment. Changing this forces a new Nginx Deployment to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `networkInterface` blocks as defined below. Changing this forces a new Nginx Deployment to be created.
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.nginx.DeploymentNetworkInterface>[]>;
    /**
     * The name of the Resource Group where the Nginx Deployment should exist. Changing this forces a new Nginx Deployment to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Specify the Name of Nginx deployment SKU. The possible value are `publicpreview_Monthly_gmz7xq9ge3py` and `standard_Monthly`.
     */
    sku: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Nginx Deployment.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
