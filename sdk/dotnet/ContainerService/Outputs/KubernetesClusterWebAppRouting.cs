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
    public sealed class KubernetesClusterWebAppRouting
    {
        /// <summary>
        /// Specifies the ID of the DNS Zone in which DNS entries are created for applications deployed to the cluster when Web App Routing is enabled.
        /// </summary>
        public readonly string DnsZoneId;

        [OutputConstructor]
        private KubernetesClusterWebAppRouting(string dnsZoneId)
        {
            DnsZoneId = dnsZoneId;
        }
    }
}
