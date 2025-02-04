// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class StreamingPolicyCommonEncryptionCencGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `default_content_key` block as defined below. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        [Input("defaultContentKey")]
        public Input<Inputs.StreamingPolicyCommonEncryptionCencDefaultContentKeyGetArgs>? DefaultContentKey { get; set; }

        /// <summary>
        /// A `drm_playready` block as defined below. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        [Input("drmPlayready")]
        public Input<Inputs.StreamingPolicyCommonEncryptionCencDrmPlayreadyGetArgs>? DrmPlayready { get; set; }

        /// <summary>
        /// Template for the URL of the custom service delivering licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template supports replaceable tokens that the service will update at runtime with the value specific to the request. The currently supported token values are `{AlternativeMediaId}`, which is replaced with the value of `StreamingLocatorId.AlternativeMediaId`, and `{ContentKeyId}`, which is replaced with the value of identifier of the key being requested. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        [Input("drmWidevineCustomLicenseAcquisitionUrlTemplate")]
        public Input<string>? DrmWidevineCustomLicenseAcquisitionUrlTemplate { get; set; }

        /// <summary>
        /// A `enabled_protocols` block as defined below. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        [Input("enabledProtocols")]
        public Input<Inputs.StreamingPolicyCommonEncryptionCencEnabledProtocolsGetArgs>? EnabledProtocols { get; set; }

        public StreamingPolicyCommonEncryptionCencGetArgs()
        {
        }
        public static new StreamingPolicyCommonEncryptionCencGetArgs Empty => new StreamingPolicyCommonEncryptionCencGetArgs();
    }
}
