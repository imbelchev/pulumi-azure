// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media
{
    /// <summary>
    /// Manages a Transform.
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
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("exampleAccount", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "GRS",
    ///     });
    /// 
    ///     var exampleServiceAccount = new Azure.Media.ServiceAccount("exampleServiceAccount", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         StorageAccounts = new[]
    ///         {
    ///             new Azure.Media.Inputs.ServiceAccountStorageAccountArgs
    ///             {
    ///                 Id = exampleAccount.Id,
    ///                 IsPrimary = true,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleTransform = new Azure.Media.Transform("exampleTransform", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         MediaServicesAccountName = exampleServiceAccount.Name,
    ///         Description = "My transform description",
    ///         Outputs = new[]
    ///         {
    ///             new Azure.Media.Inputs.TransformOutputArgs
    ///             {
    ///                 RelativePriority = "Normal",
    ///                 OnErrorAction = "ContinueJob",
    ///                 BuiltinPreset = new Azure.Media.Inputs.TransformOutputBuiltinPresetArgs
    ///                 {
    ///                     PresetName = "AACGoodQualityAudio",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With Multiple Outputs
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
    ///     var exampleAccount = new Azure.Storage.Account("exampleAccount", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "GRS",
    ///     });
    /// 
    ///     var exampleServiceAccount = new Azure.Media.ServiceAccount("exampleServiceAccount", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         StorageAccounts = new[]
    ///         {
    ///             new Azure.Media.Inputs.ServiceAccountStorageAccountArgs
    ///             {
    ///                 Id = exampleAccount.Id,
    ///                 IsPrimary = true,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleTransform = new Azure.Media.Transform("exampleTransform", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         MediaServicesAccountName = exampleServiceAccount.Name,
    ///         Description = "My transform description",
    ///         Outputs = new[]
    ///         {
    ///             new Azure.Media.Inputs.TransformOutputArgs
    ///             {
    ///                 RelativePriority = "Normal",
    ///                 OnErrorAction = "ContinueJob",
    ///                 BuiltinPreset = new Azure.Media.Inputs.TransformOutputBuiltinPresetArgs
    ///                 {
    ///                     PresetName = "AACGoodQualityAudio",
    ///                 },
    ///             },
    ///             new Azure.Media.Inputs.TransformOutputArgs
    ///             {
    ///                 RelativePriority = "Low",
    ///                 OnErrorAction = "ContinueJob",
    ///                 AudioAnalyzerPreset = new Azure.Media.Inputs.TransformOutputAudioAnalyzerPresetArgs
    ///                 {
    ///                     AudioLanguage = "en-US",
    ///                     AudioAnalysisMode = "Basic",
    ///                 },
    ///             },
    ///             new Azure.Media.Inputs.TransformOutputArgs
    ///             {
    ///                 RelativePriority = "Low",
    ///                 OnErrorAction = "StopProcessingJob",
    ///                 FaceDetectorPreset = new Azure.Media.Inputs.TransformOutputFaceDetectorPresetArgs
    ///                 {
    ///                     AnalysisResolution = "StandardDefinition",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Transforms can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:media/transform:Transform example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Media/mediaServices/media1/transforms/transform1
    /// ```
    /// </summary>
    [AzureResourceType("azure:media/transform:Transform")]
    public partial class Transform : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An optional verbose description of the Transform.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The Media Services account name. Changing this forces a new Transform to be created.
        /// </summary>
        [Output("mediaServicesAccountName")]
        public Output<string> MediaServicesAccountName { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Transform. Changing this forces a new Transform to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// One or more `output` blocks as defined below. At least one `output` must be defined.
        /// </summary>
        [Output("outputs")]
        public Output<ImmutableArray<Outputs.TransformOutput>> Outputs { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Transform should exist. Changing this forces a new Transform to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;


        /// <summary>
        /// Create a Transform resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Transform(string name, TransformArgs args, CustomResourceOptions? options = null)
            : base("azure:media/transform:Transform", name, args ?? new TransformArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Transform(string name, Input<string> id, TransformState? state = null, CustomResourceOptions? options = null)
            : base("azure:media/transform:Transform", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Transform resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Transform Get(string name, Input<string> id, TransformState? state = null, CustomResourceOptions? options = null)
        {
            return new Transform(name, id, state, options);
        }
    }

    public sealed class TransformArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional verbose description of the Transform.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Media Services account name. Changing this forces a new Transform to be created.
        /// </summary>
        [Input("mediaServicesAccountName", required: true)]
        public Input<string> MediaServicesAccountName { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Transform. Changing this forces a new Transform to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("outputs")]
        private InputList<Inputs.TransformOutputArgs>? _outputs;

        /// <summary>
        /// One or more `output` blocks as defined below. At least one `output` must be defined.
        /// </summary>
        public InputList<Inputs.TransformOutputArgs> Outputs
        {
            get => _outputs ?? (_outputs = new InputList<Inputs.TransformOutputArgs>());
            set => _outputs = value;
        }

        /// <summary>
        /// The name of the Resource Group where the Transform should exist. Changing this forces a new Transform to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public TransformArgs()
        {
        }
        public static new TransformArgs Empty => new TransformArgs();
    }

    public sealed class TransformState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional verbose description of the Transform.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Media Services account name. Changing this forces a new Transform to be created.
        /// </summary>
        [Input("mediaServicesAccountName")]
        public Input<string>? MediaServicesAccountName { get; set; }

        /// <summary>
        /// The name which should be used for this Transform. Changing this forces a new Transform to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("outputs")]
        private InputList<Inputs.TransformOutputGetArgs>? _outputs;

        /// <summary>
        /// One or more `output` blocks as defined below. At least one `output` must be defined.
        /// </summary>
        public InputList<Inputs.TransformOutputGetArgs> Outputs
        {
            get => _outputs ?? (_outputs = new InputList<Inputs.TransformOutputGetArgs>());
            set => _outputs = value;
        }

        /// <summary>
        /// The name of the Resource Group where the Transform should exist. Changing this forces a new Transform to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        public TransformState()
        {
        }
        public static new TransformState Empty => new TransformState();
    }
}
