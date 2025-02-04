// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class ApplicationGatewaySslCertificate
    {
        /// <summary>
        /// PFX certificate. Required if `key_vault_secret_id` is not set.
        /// </summary>
        public readonly string? Data;
        /// <summary>
        /// The ID of the Rewrite Rule Set
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Secret Id of (base-64 encoded unencrypted pfx) `Secret` or `Certificate` object stored in Azure KeyVault. You need to enable soft delete for keyvault to use this feature. Required if `data` is not set.
        /// </summary>
        public readonly string? KeyVaultSecretId;
        /// <summary>
        /// The Name of the SSL certificate that is unique within this Application Gateway
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Password for the pfx file specified in data. Required if `data` is set.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// The Public Certificate Data associated with the SSL Certificate.
        /// </summary>
        public readonly string? PublicCertData;

        [OutputConstructor]
        private ApplicationGatewaySslCertificate(
            string? data,

            string? id,

            string? keyVaultSecretId,

            string name,

            string? password,

            string? publicCertData)
        {
            Data = data;
            Id = id;
            KeyVaultSecretId = keyVaultSecretId;
            Name = name;
            Password = password;
            PublicCertData = publicCertData;
        }
    }
}
