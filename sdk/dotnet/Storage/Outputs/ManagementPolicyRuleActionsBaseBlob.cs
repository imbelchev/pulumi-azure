// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Outputs
{

    [OutputType]
    public sealed class ManagementPolicyRuleActionsBaseBlob
    {
        /// <summary>
        /// The age in days after creation to delete the blob. Must be between `0` and `99999`. Defaults to `-1`.
        /// </summary>
        public readonly int? DeleteAfterDaysSinceCreationGreaterThan;
        /// <summary>
        /// The age in days after last access time to delete the blob. Must be between `0` and `99999`. Defaults to `-1`.
        /// </summary>
        public readonly int? DeleteAfterDaysSinceLastAccessTimeGreaterThan;
        /// <summary>
        /// The age in days after last modification to delete the blob. Must be between 0 and 99999. Defaults to `-1`.
        /// </summary>
        public readonly int? DeleteAfterDaysSinceModificationGreaterThan;
        /// <summary>
        /// The age in days after creation to archive storage. Supports blob currently at Hot or Cool tier. Must be between `0` and`99999`. Defaults to `-1`.
        /// </summary>
        public readonly int? TierToArchiveAfterDaysSinceCreationGreaterThan;
        /// <summary>
        /// The age in days after last access time to tier blobs to archive storage. Supports blob currently at Hot or Cool tier. Must be between `0` and`99999`. Defaults to `-1`.
        /// </summary>
        public readonly int? TierToArchiveAfterDaysSinceLastAccessTimeGreaterThan;
        /// <summary>
        /// The age in days after last tier change to the blobs to skip to be archved. Must be between 0 and 99999. Defaults to `-1`.
        /// </summary>
        public readonly int? TierToArchiveAfterDaysSinceLastTierChangeGreaterThan;
        /// <summary>
        /// The age in days after last modification to tier blobs to archive storage. Supports blob currently at Hot or Cool tier. Must be between 0 and 99999. Defaults to `-1`.
        /// </summary>
        public readonly int? TierToArchiveAfterDaysSinceModificationGreaterThan;
        /// <summary>
        /// The age in days after creation to cool storage. Supports blob currently at Hot tier. Must be between `0` and `99999`. Defaults to `-1`.
        /// </summary>
        public readonly int? TierToCoolAfterDaysSinceCreationGreaterThan;
        /// <summary>
        /// The age in days after last access time to tier blobs to cool storage. Supports blob currently at Hot tier. Must be between `0` and `99999`. Defaults to `-1`.
        /// </summary>
        public readonly int? TierToCoolAfterDaysSinceLastAccessTimeGreaterThan;
        /// <summary>
        /// The age in days after last modification to tier blobs to cool storage. Supports blob currently at Hot tier. Must be between 0 and 99999. Defaults to `-1`.
        /// </summary>
        public readonly int? TierToCoolAfterDaysSinceModificationGreaterThan;

        [OutputConstructor]
        private ManagementPolicyRuleActionsBaseBlob(
            int? deleteAfterDaysSinceCreationGreaterThan,

            int? deleteAfterDaysSinceLastAccessTimeGreaterThan,

            int? deleteAfterDaysSinceModificationGreaterThan,

            int? tierToArchiveAfterDaysSinceCreationGreaterThan,

            int? tierToArchiveAfterDaysSinceLastAccessTimeGreaterThan,

            int? tierToArchiveAfterDaysSinceLastTierChangeGreaterThan,

            int? tierToArchiveAfterDaysSinceModificationGreaterThan,

            int? tierToCoolAfterDaysSinceCreationGreaterThan,

            int? tierToCoolAfterDaysSinceLastAccessTimeGreaterThan,

            int? tierToCoolAfterDaysSinceModificationGreaterThan)
        {
            DeleteAfterDaysSinceCreationGreaterThan = deleteAfterDaysSinceCreationGreaterThan;
            DeleteAfterDaysSinceLastAccessTimeGreaterThan = deleteAfterDaysSinceLastAccessTimeGreaterThan;
            DeleteAfterDaysSinceModificationGreaterThan = deleteAfterDaysSinceModificationGreaterThan;
            TierToArchiveAfterDaysSinceCreationGreaterThan = tierToArchiveAfterDaysSinceCreationGreaterThan;
            TierToArchiveAfterDaysSinceLastAccessTimeGreaterThan = tierToArchiveAfterDaysSinceLastAccessTimeGreaterThan;
            TierToArchiveAfterDaysSinceLastTierChangeGreaterThan = tierToArchiveAfterDaysSinceLastTierChangeGreaterThan;
            TierToArchiveAfterDaysSinceModificationGreaterThan = tierToArchiveAfterDaysSinceModificationGreaterThan;
            TierToCoolAfterDaysSinceCreationGreaterThan = tierToCoolAfterDaysSinceCreationGreaterThan;
            TierToCoolAfterDaysSinceLastAccessTimeGreaterThan = tierToCoolAfterDaysSinceLastAccessTimeGreaterThan;
            TierToCoolAfterDaysSinceModificationGreaterThan = tierToCoolAfterDaysSinceModificationGreaterThan;
        }
    }
}
