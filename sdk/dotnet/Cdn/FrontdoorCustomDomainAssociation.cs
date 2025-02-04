// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn
{
    /// <summary>
    /// Manages the association between a Front Door (standard/premium) Custom Domain and one or more Front Door (standard/premium) Routes.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Azure.Cdn.FrontdoorCustomDomainAssociation("example", new()
    ///     {
    ///         CdnFrontdoorCustomDomainId = azurerm_cdn_frontdoor_custom_domain.Contoso.Id,
    ///         CdnFrontdoorRouteIds = new[]
    ///         {
    ///             azurerm_cdn_frontdoor_route.Contoso.Id,
    ///             azurerm_cdn_frontdoor_route.Fabrikam.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Front Door Custom Domain Associations can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:cdn/frontdoorCustomDomainAssociation:FrontdoorCustomDomainAssociation example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/associations/assoc1
    /// ```
    /// </summary>
    [AzureResourceType("azure:cdn/frontdoorCustomDomainAssociation:FrontdoorCustomDomainAssociation")]
    public partial class FrontdoorCustomDomainAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Front Door Custom Domain that should be managed by the association resource. Changing this forces a new association resource to be created.
        /// </summary>
        [Output("cdnFrontdoorCustomDomainId")]
        public Output<string> CdnFrontdoorCustomDomainId { get; private set; } = null!;

        /// <summary>
        /// One or more IDs of the Front Door Route to which the Front Door Custom Domain is associated with.
        /// </summary>
        [Output("cdnFrontdoorRouteIds")]
        public Output<ImmutableArray<string>> CdnFrontdoorRouteIds { get; private set; } = null!;


        /// <summary>
        /// Create a FrontdoorCustomDomainAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FrontdoorCustomDomainAssociation(string name, FrontdoorCustomDomainAssociationArgs args, CustomResourceOptions? options = null)
            : base("azure:cdn/frontdoorCustomDomainAssociation:FrontdoorCustomDomainAssociation", name, args ?? new FrontdoorCustomDomainAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FrontdoorCustomDomainAssociation(string name, Input<string> id, FrontdoorCustomDomainAssociationState? state = null, CustomResourceOptions? options = null)
            : base("azure:cdn/frontdoorCustomDomainAssociation:FrontdoorCustomDomainAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FrontdoorCustomDomainAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FrontdoorCustomDomainAssociation Get(string name, Input<string> id, FrontdoorCustomDomainAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new FrontdoorCustomDomainAssociation(name, id, state, options);
        }
    }

    public sealed class FrontdoorCustomDomainAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Front Door Custom Domain that should be managed by the association resource. Changing this forces a new association resource to be created.
        /// </summary>
        [Input("cdnFrontdoorCustomDomainId", required: true)]
        public Input<string> CdnFrontdoorCustomDomainId { get; set; } = null!;

        [Input("cdnFrontdoorRouteIds", required: true)]
        private InputList<string>? _cdnFrontdoorRouteIds;

        /// <summary>
        /// One or more IDs of the Front Door Route to which the Front Door Custom Domain is associated with.
        /// </summary>
        public InputList<string> CdnFrontdoorRouteIds
        {
            get => _cdnFrontdoorRouteIds ?? (_cdnFrontdoorRouteIds = new InputList<string>());
            set => _cdnFrontdoorRouteIds = value;
        }

        public FrontdoorCustomDomainAssociationArgs()
        {
        }
        public static new FrontdoorCustomDomainAssociationArgs Empty => new FrontdoorCustomDomainAssociationArgs();
    }

    public sealed class FrontdoorCustomDomainAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Front Door Custom Domain that should be managed by the association resource. Changing this forces a new association resource to be created.
        /// </summary>
        [Input("cdnFrontdoorCustomDomainId")]
        public Input<string>? CdnFrontdoorCustomDomainId { get; set; }

        [Input("cdnFrontdoorRouteIds")]
        private InputList<string>? _cdnFrontdoorRouteIds;

        /// <summary>
        /// One or more IDs of the Front Door Route to which the Front Door Custom Domain is associated with.
        /// </summary>
        public InputList<string> CdnFrontdoorRouteIds
        {
            get => _cdnFrontdoorRouteIds ?? (_cdnFrontdoorRouteIds = new InputList<string>());
            set => _cdnFrontdoorRouteIds = value;
        }

        public FrontdoorCustomDomainAssociationState()
        {
        }
        public static new FrontdoorCustomDomainAssociationState Empty => new FrontdoorCustomDomainAssociationState();
    }
}
