// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class StreamingEndpointAccessControlArgs : global::Pulumi.ResourceArgs
    {
        [Input("akamaiSignatureHeaderAuthenticationKeys")]
        private InputList<Inputs.StreamingEndpointAccessControlAkamaiSignatureHeaderAuthenticationKeyArgs>? _akamaiSignatureHeaderAuthenticationKeys;

        /// <summary>
        /// One or more `akamai_signature_header_authentication_key` blocks as defined below.
        /// </summary>
        public InputList<Inputs.StreamingEndpointAccessControlAkamaiSignatureHeaderAuthenticationKeyArgs> AkamaiSignatureHeaderAuthenticationKeys
        {
            get => _akamaiSignatureHeaderAuthenticationKeys ?? (_akamaiSignatureHeaderAuthenticationKeys = new InputList<Inputs.StreamingEndpointAccessControlAkamaiSignatureHeaderAuthenticationKeyArgs>());
            set => _akamaiSignatureHeaderAuthenticationKeys = value;
        }

        [Input("ipAllows")]
        private InputList<Inputs.StreamingEndpointAccessControlIpAllowArgs>? _ipAllows;

        /// <summary>
        /// A `ip` block as defined below.
        /// </summary>
        public InputList<Inputs.StreamingEndpointAccessControlIpAllowArgs> IpAllows
        {
            get => _ipAllows ?? (_ipAllows = new InputList<Inputs.StreamingEndpointAccessControlIpAllowArgs>());
            set => _ipAllows = value;
        }

        public StreamingEndpointAccessControlArgs()
        {
        }
        public static new StreamingEndpointAccessControlArgs Empty => new StreamingEndpointAccessControlArgs();
    }
}
