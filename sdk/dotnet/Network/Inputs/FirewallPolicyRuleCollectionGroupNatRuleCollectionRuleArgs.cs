// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The destination IP address (including CIDR).
        /// </summary>
        [Input("destinationAddress")]
        public Input<string>? DestinationAddress { get; set; }

        /// <summary>
        /// Specifies a list of destination ports.
        /// </summary>
        [Input("destinationPorts")]
        public Input<string>? DestinationPorts { get; set; }

        /// <summary>
        /// The name which should be used for this Firewall Policy Rule Collection Group. Changing this forces a new Firewall Policy Rule Collection Group to be created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("protocols", required: true)]
        private InputList<string>? _protocols;

        /// <summary>
        /// One or more `protocols` blocks as defined below. Not required when specifying `destination_fqdn_tags`, but required when specifying `destination_fqdns`.
        /// </summary>
        public InputList<string> Protocols
        {
            get => _protocols ?? (_protocols = new InputList<string>());
            set => _protocols = value;
        }

        [Input("sourceAddresses")]
        private InputList<string>? _sourceAddresses;

        /// <summary>
        /// Specifies a list of source IP addresses (including CIDR and `*`).
        /// </summary>
        public InputList<string> SourceAddresses
        {
            get => _sourceAddresses ?? (_sourceAddresses = new InputList<string>());
            set => _sourceAddresses = value;
        }

        [Input("sourceIpGroups")]
        private InputList<string>? _sourceIpGroups;

        /// <summary>
        /// Specifies a list of source IP groups.
        /// </summary>
        public InputList<string> SourceIpGroups
        {
            get => _sourceIpGroups ?? (_sourceIpGroups = new InputList<string>());
            set => _sourceIpGroups = value;
        }

        /// <summary>
        /// Specifies the translated address.
        /// </summary>
        [Input("translatedAddress")]
        public Input<string>? TranslatedAddress { get; set; }

        /// <summary>
        /// Specifies the translated FQDN.
        /// </summary>
        [Input("translatedFqdn")]
        public Input<string>? TranslatedFqdn { get; set; }

        /// <summary>
        /// Specifies the translated port.
        /// </summary>
        [Input("translatedPort", required: true)]
        public Input<int> TranslatedPort { get; set; } = null!;

        public FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs()
        {
        }
        public static new FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs Empty => new FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs();
    }
}
