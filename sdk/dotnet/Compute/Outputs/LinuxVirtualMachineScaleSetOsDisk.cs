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
    public sealed class LinuxVirtualMachineScaleSetOsDisk
    {
        /// <summary>
        /// The Type of Caching which should be used for the Internal OS Disk. Possible values are `None`, `ReadOnly` and `ReadWrite`.
        /// </summary>
        public readonly string Caching;
        /// <summary>
        /// A `diff_disk_settings` block as defined above. Changing this forces a new resource to be created.
        /// </summary>
        public readonly Outputs.LinuxVirtualMachineScaleSetOsDiskDiffDiskSettings? DiffDiskSettings;
        /// <summary>
        /// The ID of the Disk Encryption Set which should be used to encrypt this OS Disk. Conflicts with `secure_vm_disk_encryption_set_id`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? DiskEncryptionSetId;
        /// <summary>
        /// The Size of the Internal OS Disk in GB, if you wish to vary from the size used in the image this Virtual Machine Scale Set is sourced from.
        /// </summary>
        public readonly int? DiskSizeGb;
        /// <summary>
        /// The ID of the Disk Encryption Set which should be used to Encrypt the OS Disk when the Virtual Machine Scale Set is Confidential VMSS. Conflicts with `disk_encryption_set_id`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? SecureVmDiskEncryptionSetId;
        /// <summary>
        /// Encryption Type when the Virtual Machine Scale Set is Confidential VMSS. Possible values are `VMGuestStateOnly` and `DiskWithVMGuestState`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? SecurityEncryptionType;
        /// <summary>
        /// The Type of Storage Account which should back this the Internal OS Disk. Possible values include `Standard_LRS`, `StandardSSD_LRS`, `StandardSSD_ZRS`, `Premium_LRS` and `Premium_ZRS`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string StorageAccountType;
        /// <summary>
        /// Should Write Accelerator be Enabled for this OS Disk? Defaults to `false`.
        /// </summary>
        public readonly bool? WriteAcceleratorEnabled;

        [OutputConstructor]
        private LinuxVirtualMachineScaleSetOsDisk(
            string caching,

            Outputs.LinuxVirtualMachineScaleSetOsDiskDiffDiskSettings? diffDiskSettings,

            string? diskEncryptionSetId,

            int? diskSizeGb,

            string? secureVmDiskEncryptionSetId,

            string? securityEncryptionType,

            string storageAccountType,

            bool? writeAcceleratorEnabled)
        {
            Caching = caching;
            DiffDiskSettings = diffDiskSettings;
            DiskEncryptionSetId = diskEncryptionSetId;
            DiskSizeGb = diskSizeGb;
            SecureVmDiskEncryptionSetId = secureVmDiskEncryptionSetId;
            SecurityEncryptionType = securityEncryptionType;
            StorageAccountType = storageAccountType;
            WriteAcceleratorEnabled = writeAcceleratorEnabled;
        }
    }
}
