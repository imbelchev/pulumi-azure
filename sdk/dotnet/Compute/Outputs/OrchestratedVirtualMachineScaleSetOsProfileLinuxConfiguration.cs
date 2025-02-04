// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Outputs
{

    [OutputType]
    public sealed class OrchestratedVirtualMachineScaleSetOsProfileLinuxConfiguration
    {
        /// <summary>
        /// The Password which should be used for the local-administrator on this Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? AdminPassword;
        /// <summary>
        /// A `admin_ssh_key` block as documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationAdminSshKey> AdminSshKeys;
        /// <summary>
        /// The username of the local administrator on each Orchestrated Virtual Machine Scale Set instance. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string AdminUsername;
        /// <summary>
        /// The prefix which should be used for the name of the Virtual Machines in this Scale Set. If unspecified this defaults to the value for the name field. If the value of the name field is not a valid `computer_name_prefix`, then you must specify `computer_name_prefix`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? ComputerNamePrefix;
        /// <summary>
        /// When an `admin_password` is specified `disable_password_authentication` must be set to `false`. Defaults to `true`.
        /// </summary>
        public readonly bool? DisablePasswordAuthentication;
        /// <summary>
        /// Specifies the mode of VM Guest Patching for the virtual machines that are associated to the Orchestrated Virtual Machine Scale Set. Possible values are `AutomaticByPlatform` or `ImageDefault`. Defaults to `ImageDefault`.
        /// </summary>
        public readonly string? PatchAssessmentMode;
        /// <summary>
        /// Specifies the mode of in-guest patching of this Windows Virtual Machine. Possible values are `ImageDefault` or `AutomaticByPlatform`. Defaults to `ImageDefault`. For more information on patch modes please see the [product documentation](https://docs.microsoft.com/azure/virtual-machines/automatic-vm-guest-patching#patch-orchestration-modes).
        /// </summary>
        public readonly string? PatchMode;
        /// <summary>
        /// Should the Azure VM Agent be provisioned on each Virtual Machine in the Scale Set? Defaults to `true`. Changing this value forces a new resource to be created.
        /// </summary>
        public readonly bool? ProvisionVmAgent;
        /// <summary>
        /// One or more `secret` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret> Secrets;

        [OutputConstructor]
        private OrchestratedVirtualMachineScaleSetOsProfileLinuxConfiguration(
            string? adminPassword,

            ImmutableArray<Outputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationAdminSshKey> adminSshKeys,

            string adminUsername,

            string? computerNamePrefix,

            bool? disablePasswordAuthentication,

            string? patchAssessmentMode,

            string? patchMode,

            bool? provisionVmAgent,

            ImmutableArray<Outputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret> secrets)
        {
            AdminPassword = adminPassword;
            AdminSshKeys = adminSshKeys;
            AdminUsername = adminUsername;
            ComputerNamePrefix = computerNamePrefix;
            DisablePasswordAuthentication = disablePasswordAuthentication;
            PatchAssessmentMode = patchAssessmentMode;
            PatchMode = patchMode;
            ProvisionVmAgent = provisionVmAgent;
            Secrets = secrets;
        }
    }
}
