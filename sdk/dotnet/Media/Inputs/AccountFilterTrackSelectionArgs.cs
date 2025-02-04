// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class AccountFilterTrackSelectionArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions", required: true)]
        private InputList<Inputs.AccountFilterTrackSelectionConditionArgs>? _conditions;

        /// <summary>
        /// One or more `condition` blocks as defined above.
        /// </summary>
        public InputList<Inputs.AccountFilterTrackSelectionConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.AccountFilterTrackSelectionConditionArgs>());
            set => _conditions = value;
        }

        public AccountFilterTrackSelectionArgs()
        {
        }
        public static new AccountFilterTrackSelectionArgs Empty => new AccountFilterTrackSelectionArgs();
    }
}
