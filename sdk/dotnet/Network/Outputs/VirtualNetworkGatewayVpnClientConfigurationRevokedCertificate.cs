// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class VirtualNetworkGatewayVpnClientConfigurationRevokedCertificate
    {
        /// <summary>
        /// Specifies the name of the certificate resource.
        /// </summary>
        public readonly string Name;
        public readonly string Thumbprint;

        [OutputConstructor]
        private VirtualNetworkGatewayVpnClientConfigurationRevokedCertificate(
            string name,

            string thumbprint)
        {
            Name = name;
            Thumbprint = thumbprint;
        }
    }
}
