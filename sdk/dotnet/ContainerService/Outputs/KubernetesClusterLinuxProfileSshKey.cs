// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class KubernetesClusterLinuxProfileSshKey
    {
        /// <summary>
        /// The Public SSH Key used to access the cluster.
        /// </summary>
        public readonly string KeyData;

        [OutputConstructor]
        private KubernetesClusterLinuxProfileSshKey(string keyData)
        {
            KeyData = keyData;
        }
    }
}
