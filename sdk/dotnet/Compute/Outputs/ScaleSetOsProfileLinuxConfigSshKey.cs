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
    public sealed class ScaleSetOsProfileLinuxConfigSshKey
    {
        /// <summary>
        /// The Public SSH Key which should be written to the `path` defined above.
        /// </summary>
        public readonly string? KeyData;
        /// <summary>
        /// The path of the destination file on the virtual machine
        /// </summary>
        public readonly string Path;

        [OutputConstructor]
        private ScaleSetOsProfileLinuxConfigSshKey(
            string? keyData,

            string path)
        {
            KeyData = keyData;
            Path = path;
        }
    }
}
