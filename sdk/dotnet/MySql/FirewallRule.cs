// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MySql
{
    /// <summary>
    /// Manages a Firewall Rule for a MySQL Server.
    /// 
    /// ## Example Usage
    /// ### Single IP Address)
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleServer = new Azure.MySql.Server("exampleServer", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Version = "5.7",
    ///         SkuName = "GP_Gen5_2",
    ///         SslEnforcementEnabled = true,
    ///     });
    /// 
    ///     var exampleFirewallRule = new Azure.MySql.FirewallRule("exampleFirewallRule", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         ServerName = exampleServer.Name,
    ///         StartIpAddress = "40.112.8.12",
    ///         EndIpAddress = "40.112.8.12",
    ///     });
    /// 
    /// });
    /// ```
    /// ### IP Range)
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleServer = new Azure.MySql.Server("exampleServer");
    /// 
    ///     // ...
    ///     var exampleFirewallRule = new Azure.MySql.FirewallRule("exampleFirewallRule", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         ServerName = exampleServer.Name,
    ///         StartIpAddress = "40.112.0.0",
    ///         EndIpAddress = "40.112.255.255",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Allow Access To Azure Services)
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleServer = new Azure.MySql.Server("exampleServer");
    /// 
    ///     // ...
    ///     var exampleFirewallRule = new Azure.MySql.FirewallRule("exampleFirewallRule", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         ServerName = exampleServer.Name,
    ///         StartIpAddress = "0.0.0.0",
    ///         EndIpAddress = "0.0.0.0",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// MySQL Firewall Rule's can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:mysql/firewallRule:FirewallRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.DBforMySQL/servers/server1/firewallRules/rule1
    /// ```
    /// </summary>
    [AzureResourceType("azure:mysql/firewallRule:FirewallRule")]
    public partial class FirewallRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the End IP Address associated with this Firewall Rule.
        /// </summary>
        [Output("endIpAddress")]
        public Output<string> EndIpAddress { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which the MySQL Server exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the MySQL Server. Changing this forces a new resource to be created.
        /// </summary>
        [Output("serverName")]
        public Output<string> ServerName { get; private set; } = null!;

        /// <summary>
        /// Specifies the Start IP Address associated with this Firewall Rule.
        /// </summary>
        [Output("startIpAddress")]
        public Output<string> StartIpAddress { get; private set; } = null!;


        /// <summary>
        /// Create a FirewallRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FirewallRule(string name, FirewallRuleArgs args, CustomResourceOptions? options = null)
            : base("azure:mysql/firewallRule:FirewallRule", name, args ?? new FirewallRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FirewallRule(string name, Input<string> id, FirewallRuleState? state = null, CustomResourceOptions? options = null)
            : base("azure:mysql/firewallRule:FirewallRule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing FirewallRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FirewallRule Get(string name, Input<string> id, FirewallRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new FirewallRule(name, id, state, options);
        }
    }

    public sealed class FirewallRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the End IP Address associated with this Firewall Rule.
        /// </summary>
        [Input("endIpAddress", required: true)]
        public Input<string> EndIpAddress { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group in which the MySQL Server exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the MySQL Server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("serverName", required: true)]
        public Input<string> ServerName { get; set; } = null!;

        /// <summary>
        /// Specifies the Start IP Address associated with this Firewall Rule.
        /// </summary>
        [Input("startIpAddress", required: true)]
        public Input<string> StartIpAddress { get; set; } = null!;

        public FirewallRuleArgs()
        {
        }
        public static new FirewallRuleArgs Empty => new FirewallRuleArgs();
    }

    public sealed class FirewallRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the End IP Address associated with this Firewall Rule.
        /// </summary>
        [Input("endIpAddress")]
        public Input<string>? EndIpAddress { get; set; }

        /// <summary>
        /// Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group in which the MySQL Server exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// Specifies the name of the MySQL Server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("serverName")]
        public Input<string>? ServerName { get; set; }

        /// <summary>
        /// Specifies the Start IP Address associated with this Firewall Rule.
        /// </summary>
        [Input("startIpAddress")]
        public Input<string>? StartIpAddress { get; set; }

        public FirewallRuleState()
        {
        }
        public static new FirewallRuleState Empty => new FirewallRuleState();
    }
}
