// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class RegistryNetworkRuleSetGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The behaviour for requests matching no rules. Either `Allow` or `Deny`. Defaults to `Allow`
        /// </summary>
        [Input("defaultAction")]
        public Input<string>? DefaultAction { get; set; }

        [Input("ipRules")]
        private InputList<Inputs.RegistryNetworkRuleSetIpRuleGetArgs>? _ipRules;

        /// <summary>
        /// One or more `ip_rule` blocks as defined below.
        /// </summary>
        public InputList<Inputs.RegistryNetworkRuleSetIpRuleGetArgs> IpRules
        {
            get => _ipRules ?? (_ipRules = new InputList<Inputs.RegistryNetworkRuleSetIpRuleGetArgs>());
            set => _ipRules = value;
        }

        [Input("virtualNetworks")]
        private InputList<Inputs.RegistryNetworkRuleSetVirtualNetworkGetArgs>? _virtualNetworks;

        /// <summary>
        /// One or more `virtual_network` blocks as defined below.
        /// </summary>
        public InputList<Inputs.RegistryNetworkRuleSetVirtualNetworkGetArgs> VirtualNetworks
        {
            get => _virtualNetworks ?? (_virtualNetworks = new InputList<Inputs.RegistryNetworkRuleSetVirtualNetworkGetArgs>());
            set => _virtualNetworks = value;
        }

        public RegistryNetworkRuleSetGetArgs()
        {
        }
        public static new RegistryNetworkRuleSetGetArgs Empty => new RegistryNetworkRuleSetGetArgs();
    }
}
