// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MySql.Inputs
{

    public sealed class FlexibleServerIdentityArgs : global::Pulumi.ResourceArgs
    {
        [Input("identityIds")]
        private InputList<string>? _identityIds;

        /// <summary>
        /// A list of User Assigned Managed Identity IDs to be assigned to this API Management Service. Required if used together with `customer_managed_key` block as defined below.
        /// </summary>
        public InputList<string> IdentityIds
        {
            get => _identityIds ?? (_identityIds = new InputList<string>());
            set => _identityIds = value;
        }

        [Input("principalId")]
        public Input<string>? PrincipalId { get; set; }

        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        /// <summary>
        /// Specifies the type of Managed Service Identity that should be configured on this API Management Service. Should be set to `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public FlexibleServerIdentityArgs()
        {
        }
        public static new FlexibleServerIdentityArgs Empty => new FlexibleServerIdentityArgs();
    }
}
