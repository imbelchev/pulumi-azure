// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MachineLearning
{
    /// <summary>
    /// Manages a Machine Learning Blob Storage DataStore.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// Machine Learning DataStores can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:machinelearning/datastoreBlobstorage:DatastoreBlobstorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.MachineLearningServices/workspaces/mlw1/datastores/datastore1
    /// ```
    /// </summary>
    [AzureResourceType("azure:machinelearning/datastoreBlobstorage:DatastoreBlobstorage")]
    public partial class DatastoreBlobstorage : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The access key of the Storage Account. Conflicts with `shared_access_signature`.
        /// </summary>
        [Output("accountKey")]
        public Output<string?> AccountKey { get; private set; } = null!;

        /// <summary>
        /// Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
        /// </summary>
        [Output("isDefault")]
        public Output<bool?> IsDefault { get; private set; } = null!;

        /// <summary>
        /// The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
        /// </summary>
        [Output("serviceDataAuthIdentity")]
        public Output<string?> ServiceDataAuthIdentity { get; private set; } = null!;

        /// <summary>
        /// The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
        /// </summary>
        [Output("sharedAccessSignature")]
        public Output<string?> SharedAccessSignature { get; private set; } = null!;

        /// <summary>
        /// The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        [Output("storageContainerId")]
        public Output<string> StorageContainerId { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        [Output("workspaceId")]
        public Output<string> WorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a DatastoreBlobstorage resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatastoreBlobstorage(string name, DatastoreBlobstorageArgs args, CustomResourceOptions? options = null)
            : base("azure:machinelearning/datastoreBlobstorage:DatastoreBlobstorage", name, args ?? new DatastoreBlobstorageArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatastoreBlobstorage(string name, Input<string> id, DatastoreBlobstorageState? state = null, CustomResourceOptions? options = null)
            : base("azure:machinelearning/datastoreBlobstorage:DatastoreBlobstorage", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "accountKey",
                    "sharedAccessSignature",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DatastoreBlobstorage resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatastoreBlobstorage Get(string name, Input<string> id, DatastoreBlobstorageState? state = null, CustomResourceOptions? options = null)
        {
            return new DatastoreBlobstorage(name, id, state, options);
        }
    }

    public sealed class DatastoreBlobstorageArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountKey")]
        private Input<string>? _accountKey;

        /// <summary>
        /// The access key of the Storage Account. Conflicts with `shared_access_signature`.
        /// </summary>
        public Input<string>? AccountKey
        {
            get => _accountKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
        /// </summary>
        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        /// <summary>
        /// The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
        /// </summary>
        [Input("serviceDataAuthIdentity")]
        public Input<string>? ServiceDataAuthIdentity { get; set; }

        [Input("sharedAccessSignature")]
        private Input<string>? _sharedAccessSignature;

        /// <summary>
        /// The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
        /// </summary>
        public Input<string>? SharedAccessSignature
        {
            get => _sharedAccessSignature;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sharedAccessSignature = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        [Input("storageContainerId", required: true)]
        public Input<string> StorageContainerId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<string> WorkspaceId { get; set; } = null!;

        public DatastoreBlobstorageArgs()
        {
        }
        public static new DatastoreBlobstorageArgs Empty => new DatastoreBlobstorageArgs();
    }

    public sealed class DatastoreBlobstorageState : global::Pulumi.ResourceArgs
    {
        [Input("accountKey")]
        private Input<string>? _accountKey;

        /// <summary>
        /// The access key of the Storage Account. Conflicts with `shared_access_signature`.
        /// </summary>
        public Input<string>? AccountKey
        {
            get => _accountKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
        /// </summary>
        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        /// <summary>
        /// The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
        /// </summary>
        [Input("serviceDataAuthIdentity")]
        public Input<string>? ServiceDataAuthIdentity { get; set; }

        [Input("sharedAccessSignature")]
        private Input<string>? _sharedAccessSignature;

        /// <summary>
        /// The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
        /// </summary>
        public Input<string>? SharedAccessSignature
        {
            get => _sharedAccessSignature;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sharedAccessSignature = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        [Input("storageContainerId")]
        public Input<string>? StorageContainerId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        public DatastoreBlobstorageState()
        {
        }
        public static new DatastoreBlobstorageState Empty => new DatastoreBlobstorageState();
    }
}
