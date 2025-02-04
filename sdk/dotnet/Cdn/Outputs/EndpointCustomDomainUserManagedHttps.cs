// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn.Outputs
{

    [OutputType]
    public sealed class EndpointCustomDomainUserManagedHttps
    {
        /// <summary>
        /// The ID of the Key Vault Certificate that contains the HTTPS certificate. This is deprecated in favor of `key_vault_secret_id`.
        /// </summary>
        public readonly string? KeyVaultCertificateId;
        /// <summary>
        /// The ID of the Key Vault Secret that contains the HTTPS certificate.
        /// </summary>
        public readonly string? KeyVaultSecretId;
        /// <summary>
        /// The minimum TLS protocol version that is used for HTTPS. Possible values are `TLS10` (representing TLS 1.0/1.1), `TLS12` (representing TLS 1.2) and `None` (representing no minimums). Defaults to `TLS12`.
        /// </summary>
        public readonly string? TlsVersion;

        [OutputConstructor]
        private EndpointCustomDomainUserManagedHttps(
            string? keyVaultCertificateId,

            string? keyVaultSecretId,

            string? tlsVersion)
        {
            KeyVaultCertificateId = keyVaultCertificateId;
            KeyVaultSecretId = keyVaultSecretId;
            TlsVersion = tlsVersion;
        }
    }
}
