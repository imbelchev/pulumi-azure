// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ServiceFabric.Inputs
{

    public sealed class ClusterReverseProxyCertificateCommonNamesCommonNameGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The common or subject name of the certificate.
        /// </summary>
        [Input("certificateCommonName", required: true)]
        public Input<string> CertificateCommonName { get; set; } = null!;

        /// <summary>
        /// The Issuer Thumbprint of the Certificate.
        /// </summary>
        [Input("certificateIssuerThumbprint")]
        public Input<string>? CertificateIssuerThumbprint { get; set; }

        public ClusterReverseProxyCertificateCommonNamesCommonNameGetArgs()
        {
        }
        public static new ClusterReverseProxyCertificateCommonNamesCommonNameGetArgs Empty => new ClusterReverseProxyCertificateCommonNamesCommonNameGetArgs();
    }
}
