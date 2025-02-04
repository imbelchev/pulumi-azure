// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LoadTest.Inputs
{

    public sealed class LoadTestIdentityGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("principalId")]
        public Input<string>? PrincipalId { get; set; }

        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public LoadTestIdentityGetArgs()
        {
        }
        public static new LoadTestIdentityGetArgs Empty => new LoadTestIdentityGetArgs();
    }
}
