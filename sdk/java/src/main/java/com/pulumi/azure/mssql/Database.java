// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mssql.DatabaseArgs;
import com.pulumi.azure.mssql.inputs.DatabaseState;
import com.pulumi.azure.mssql.outputs.DatabaseImport;
import com.pulumi.azure.mssql.outputs.DatabaseLongTermRetentionPolicy;
import com.pulumi.azure.mssql.outputs.DatabaseShortTermRetentionPolicy;
import com.pulumi.azure.mssql.outputs.DatabaseThreatDetectionPolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a MS SQL Database.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.mssql.Server;
 * import com.pulumi.azure.mssql.ServerArgs;
 * import com.pulumi.azure.mssql.Database;
 * import com.pulumi.azure.mssql.DatabaseArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleServer = new Server(&#34;exampleServer&#34;, ServerArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .version(&#34;12.0&#34;)
 *             .administratorLogin(&#34;4dm1n157r470r&#34;)
 *             .administratorLoginPassword(&#34;4-v3ry-53cr37-p455w0rd&#34;)
 *             .build());
 * 
 *         var test = new Database(&#34;test&#34;, DatabaseArgs.builder()        
 *             .serverId(exampleServer.id())
 *             .collation(&#34;SQL_Latin1_General_CP1_CI_AS&#34;)
 *             .licenseType(&#34;LicenseIncluded&#34;)
 *             .maxSizeGb(4)
 *             .readScale(true)
 *             .skuName(&#34;S0&#34;)
 *             .zoneRedundant(true)
 *             .tags(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * SQL Database can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:mssql/database:Database example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Sql/servers/server1/databases/example1
 * ```
 * 
 */
@ResourceType(type="azure:mssql/database:Database")
public class Database extends com.pulumi.resources.CustomResource {
    /**
     * Time in minutes after which database is automatically paused. A value of `-1` means that automatic pause is disabled. This property is only settable for General Purpose Serverless databases.
     * 
     */
    @Export(name="autoPauseDelayInMinutes", type=Integer.class, parameters={})
    private Output<Integer> autoPauseDelayInMinutes;

    /**
     * @return Time in minutes after which database is automatically paused. A value of `-1` means that automatic pause is disabled. This property is only settable for General Purpose Serverless databases.
     * 
     */
    public Output<Integer> autoPauseDelayInMinutes() {
        return this.autoPauseDelayInMinutes;
    }
    /**
     * Specifies the collation of the database. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="collation", type=String.class, parameters={})
    private Output<String> collation;

    /**
     * @return Specifies the collation of the database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> collation() {
        return this.collation;
    }
    /**
     * The create mode of the database. Possible values are `Copy`, `Default`, `OnlineSecondary`, `PointInTimeRestore`, `Recovery`, `Restore`, `RestoreExternalBackup`, `RestoreExternalBackupSecondary`, `RestoreLongTermRetentionBackup` and `Secondary`. Mutually exclusive with `import`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="createMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> createMode;

    /**
     * @return The create mode of the database. Possible values are `Copy`, `Default`, `OnlineSecondary`, `PointInTimeRestore`, `Recovery`, `Restore`, `RestoreExternalBackup`, `RestoreExternalBackupSecondary`, `RestoreLongTermRetentionBackup` and `Secondary`. Mutually exclusive with `import`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> createMode() {
        return Codegen.optional(this.createMode);
    }
    /**
     * The ID of the source database from which to create the new database. This should only be used for databases with `create_mode` values that use another database as reference. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="creationSourceDatabaseId", type=String.class, parameters={})
    private Output<String> creationSourceDatabaseId;

    /**
     * @return The ID of the source database from which to create the new database. This should only be used for databases with `create_mode` values that use another database as reference. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> creationSourceDatabaseId() {
        return this.creationSourceDatabaseId;
    }
    /**
     * Specifies the ID of the elastic pool containing this database.
     * 
     */
    @Export(name="elasticPoolId", type=String.class, parameters={})
    private Output</* @Nullable */ String> elasticPoolId;

    /**
     * @return Specifies the ID of the elastic pool containing this database.
     * 
     */
    public Output<Optional<String>> elasticPoolId() {
        return Codegen.optional(this.elasticPoolId);
    }
    /**
     * A boolean that specifies if the Geo Backup Policy is enabled. Defaults to `true`.
     * 
     */
    @Export(name="geoBackupEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> geoBackupEnabled;

    /**
     * @return A boolean that specifies if the Geo Backup Policy is enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> geoBackupEnabled() {
        return Codegen.optional(this.geoBackupEnabled);
    }
    /**
     * A Database Import block as documented below. Mutually exclusive with `create_mode`.
     * 
     */
    @Export(name="import", type=DatabaseImport.class, parameters={})
    private Output</* @Nullable */ DatabaseImport> import_;

    /**
     * @return A Database Import block as documented below. Mutually exclusive with `create_mode`.
     * 
     */
    public Output<Optional<DatabaseImport>> import_() {
        return Codegen.optional(this.import_);
    }
    /**
     * A boolean that specifies if this is a ledger database. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="ledgerEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> ledgerEnabled;

    /**
     * @return A boolean that specifies if this is a ledger database. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Boolean> ledgerEnabled() {
        return this.ledgerEnabled;
    }
    /**
     * Specifies the license type applied to this database. Possible values are `LicenseIncluded` and `BasePrice`.
     * 
     */
    @Export(name="licenseType", type=String.class, parameters={})
    private Output<String> licenseType;

    /**
     * @return Specifies the license type applied to this database. Possible values are `LicenseIncluded` and `BasePrice`.
     * 
     */
    public Output<String> licenseType() {
        return this.licenseType;
    }
    /**
     * A `long_term_retention_policy` block as defined below.
     * 
     */
    @Export(name="longTermRetentionPolicy", type=DatabaseLongTermRetentionPolicy.class, parameters={})
    private Output<DatabaseLongTermRetentionPolicy> longTermRetentionPolicy;

    /**
     * @return A `long_term_retention_policy` block as defined below.
     * 
     */
    public Output<DatabaseLongTermRetentionPolicy> longTermRetentionPolicy() {
        return this.longTermRetentionPolicy;
    }
    /**
     * The name of the Public Maintenance Configuration window to apply to the database. Valid values include `SQL_Default`, `SQL_EastUS_DB_1`, `SQL_EastUS2_DB_1`, `SQL_SoutheastAsia_DB_1`, `SQL_AustraliaEast_DB_1`, `SQL_NorthEurope_DB_1`, `SQL_SouthCentralUS_DB_1`, `SQL_WestUS2_DB_1`, `SQL_UKSouth_DB_1`, `SQL_WestEurope_DB_1`, `SQL_EastUS_DB_2`, `SQL_EastUS2_DB_2`, `SQL_WestUS2_DB_2`, `SQL_SoutheastAsia_DB_2`, `SQL_AustraliaEast_DB_2`, `SQL_NorthEurope_DB_2`, `SQL_SouthCentralUS_DB_2`, `SQL_UKSouth_DB_2`, `SQL_WestEurope_DB_2`, `SQL_AustraliaSoutheast_DB_1`, `SQL_BrazilSouth_DB_1`, `SQL_CanadaCentral_DB_1`, `SQL_CanadaEast_DB_1`, `SQL_CentralUS_DB_1`, `SQL_EastAsia_DB_1`, `SQL_FranceCentral_DB_1`, `SQL_GermanyWestCentral_DB_1`, `SQL_CentralIndia_DB_1`, `SQL_SouthIndia_DB_1`, `SQL_JapanEast_DB_1`, `SQL_JapanWest_DB_1`, `SQL_NorthCentralUS_DB_1`, `SQL_UKWest_DB_1`, `SQL_WestUS_DB_1`, `SQL_AustraliaSoutheast_DB_2`, `SQL_BrazilSouth_DB_2`, `SQL_CanadaCentral_DB_2`, `SQL_CanadaEast_DB_2`, `SQL_CentralUS_DB_2`, `SQL_EastAsia_DB_2`, `SQL_FranceCentral_DB_2`, `SQL_GermanyWestCentral_DB_2`, `SQL_CentralIndia_DB_2`, `SQL_SouthIndia_DB_2`, `SQL_JapanEast_DB_2`, `SQL_JapanWest_DB_2`, `SQL_NorthCentralUS_DB_2`, `SQL_UKWest_DB_2`, `SQL_WestUS_DB_2`, `SQL_WestCentralUS_DB_1`, `SQL_FranceSouth_DB_1`, `SQL_WestCentralUS_DB_2`, `SQL_FranceSouth_DB_2`, `SQL_SwitzerlandNorth_DB_1`, `SQL_SwitzerlandNorth_DB_2`, `SQL_BrazilSoutheast_DB_1`, `SQL_UAENorth_DB_1`, `SQL_BrazilSoutheast_DB_2`, `SQL_UAENorth_DB_2`. Defaults to `SQL_Default`.
     * 
     */
    @Export(name="maintenanceConfigurationName", type=String.class, parameters={})
    private Output<String> maintenanceConfigurationName;

    /**
     * @return The name of the Public Maintenance Configuration window to apply to the database. Valid values include `SQL_Default`, `SQL_EastUS_DB_1`, `SQL_EastUS2_DB_1`, `SQL_SoutheastAsia_DB_1`, `SQL_AustraliaEast_DB_1`, `SQL_NorthEurope_DB_1`, `SQL_SouthCentralUS_DB_1`, `SQL_WestUS2_DB_1`, `SQL_UKSouth_DB_1`, `SQL_WestEurope_DB_1`, `SQL_EastUS_DB_2`, `SQL_EastUS2_DB_2`, `SQL_WestUS2_DB_2`, `SQL_SoutheastAsia_DB_2`, `SQL_AustraliaEast_DB_2`, `SQL_NorthEurope_DB_2`, `SQL_SouthCentralUS_DB_2`, `SQL_UKSouth_DB_2`, `SQL_WestEurope_DB_2`, `SQL_AustraliaSoutheast_DB_1`, `SQL_BrazilSouth_DB_1`, `SQL_CanadaCentral_DB_1`, `SQL_CanadaEast_DB_1`, `SQL_CentralUS_DB_1`, `SQL_EastAsia_DB_1`, `SQL_FranceCentral_DB_1`, `SQL_GermanyWestCentral_DB_1`, `SQL_CentralIndia_DB_1`, `SQL_SouthIndia_DB_1`, `SQL_JapanEast_DB_1`, `SQL_JapanWest_DB_1`, `SQL_NorthCentralUS_DB_1`, `SQL_UKWest_DB_1`, `SQL_WestUS_DB_1`, `SQL_AustraliaSoutheast_DB_2`, `SQL_BrazilSouth_DB_2`, `SQL_CanadaCentral_DB_2`, `SQL_CanadaEast_DB_2`, `SQL_CentralUS_DB_2`, `SQL_EastAsia_DB_2`, `SQL_FranceCentral_DB_2`, `SQL_GermanyWestCentral_DB_2`, `SQL_CentralIndia_DB_2`, `SQL_SouthIndia_DB_2`, `SQL_JapanEast_DB_2`, `SQL_JapanWest_DB_2`, `SQL_NorthCentralUS_DB_2`, `SQL_UKWest_DB_2`, `SQL_WestUS_DB_2`, `SQL_WestCentralUS_DB_1`, `SQL_FranceSouth_DB_1`, `SQL_WestCentralUS_DB_2`, `SQL_FranceSouth_DB_2`, `SQL_SwitzerlandNorth_DB_1`, `SQL_SwitzerlandNorth_DB_2`, `SQL_BrazilSoutheast_DB_1`, `SQL_UAENorth_DB_1`, `SQL_BrazilSoutheast_DB_2`, `SQL_UAENorth_DB_2`. Defaults to `SQL_Default`.
     * 
     */
    public Output<String> maintenanceConfigurationName() {
        return this.maintenanceConfigurationName;
    }
    /**
     * The max size of the database in gigabytes.
     * 
     */
    @Export(name="maxSizeGb", type=Integer.class, parameters={})
    private Output<Integer> maxSizeGb;

    /**
     * @return The max size of the database in gigabytes.
     * 
     */
    public Output<Integer> maxSizeGb() {
        return this.maxSizeGb;
    }
    /**
     * Minimal capacity that database will always have allocated, if not paused. This property is only settable for General Purpose Serverless databases.
     * 
     */
    @Export(name="minCapacity", type=Double.class, parameters={})
    private Output<Double> minCapacity;

    /**
     * @return Minimal capacity that database will always have allocated, if not paused. This property is only settable for General Purpose Serverless databases.
     * 
     */
    public Output<Double> minCapacity() {
        return this.minCapacity;
    }
    /**
     * The name of the MS SQL Database. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the MS SQL Database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The number of readonly secondary replicas associated with the database to which readonly application intent connections may be routed. This property is only settable for Hyperscale edition databases.
     * 
     */
    @Export(name="readReplicaCount", type=Integer.class, parameters={})
    private Output<Integer> readReplicaCount;

    /**
     * @return The number of readonly secondary replicas associated with the database to which readonly application intent connections may be routed. This property is only settable for Hyperscale edition databases.
     * 
     */
    public Output<Integer> readReplicaCount() {
        return this.readReplicaCount;
    }
    /**
     * If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica. This property is only settable for Premium and Business Critical databases.
     * 
     */
    @Export(name="readScale", type=Boolean.class, parameters={})
    private Output<Boolean> readScale;

    /**
     * @return If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica. This property is only settable for Premium and Business Critical databases.
     * 
     */
    public Output<Boolean> readScale() {
        return this.readScale;
    }
    /**
     * The ID of the database to be recovered. This property is only applicable when the `create_mode` is `Recovery`.
     * 
     */
    @Export(name="recoverDatabaseId", type=String.class, parameters={})
    private Output</* @Nullable */ String> recoverDatabaseId;

    /**
     * @return The ID of the database to be recovered. This property is only applicable when the `create_mode` is `Recovery`.
     * 
     */
    public Output<Optional<String>> recoverDatabaseId() {
        return Codegen.optional(this.recoverDatabaseId);
    }
    /**
     * The ID of the database to be restored. This property is only applicable when the `create_mode` is `Restore`.
     * 
     */
    @Export(name="restoreDroppedDatabaseId", type=String.class, parameters={})
    private Output</* @Nullable */ String> restoreDroppedDatabaseId;

    /**
     * @return The ID of the database to be restored. This property is only applicable when the `create_mode` is `Restore`.
     * 
     */
    public Output<Optional<String>> restoreDroppedDatabaseId() {
        return Codegen.optional(this.restoreDroppedDatabaseId);
    }
    /**
     * Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database. This property is only settable for `create_mode`= `PointInTimeRestore` databases.
     * 
     */
    @Export(name="restorePointInTime", type=String.class, parameters={})
    private Output<String> restorePointInTime;

    /**
     * @return Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database. This property is only settable for `create_mode`= `PointInTimeRestore` databases.
     * 
     */
    public Output<String> restorePointInTime() {
        return this.restorePointInTime;
    }
    /**
     * Specifies the name of the sample schema to apply when creating this database. Possible value is `AdventureWorksLT`.
     * 
     */
    @Export(name="sampleName", type=String.class, parameters={})
    private Output<String> sampleName;

    /**
     * @return Specifies the name of the sample schema to apply when creating this database. Possible value is `AdventureWorksLT`.
     * 
     */
    public Output<String> sampleName() {
        return this.sampleName;
    }
    /**
     * The id of the MS SQL Server on which to create the database. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="serverId", type=String.class, parameters={})
    private Output<String> serverId;

    /**
     * @return The id of the MS SQL Server on which to create the database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }
    /**
     * A `short_term_retention_policy` block as defined below.
     * 
     */
    @Export(name="shortTermRetentionPolicy", type=DatabaseShortTermRetentionPolicy.class, parameters={})
    private Output<DatabaseShortTermRetentionPolicy> shortTermRetentionPolicy;

    /**
     * @return A `short_term_retention_policy` block as defined below.
     * 
     */
    public Output<DatabaseShortTermRetentionPolicy> shortTermRetentionPolicy() {
        return this.shortTermRetentionPolicy;
    }
    /**
     * Specifies the name of the SKU used by the database. For example, `GP_S_Gen5_2`,`HS_Gen4_1`,`BC_Gen5_2`, `ElasticPool`, `Basic`,`S0`, `P2` ,`DW100c`, `DS100`. Changing this from the HyperScale service tier to another service tier will create a new resource.
     * 
     */
    @Export(name="skuName", type=String.class, parameters={})
    private Output<String> skuName;

    /**
     * @return Specifies the name of the SKU used by the database. For example, `GP_S_Gen5_2`,`HS_Gen4_1`,`BC_Gen5_2`, `ElasticPool`, `Basic`,`S0`, `P2` ,`DW100c`, `DS100`. Changing this from the HyperScale service tier to another service tier will create a new resource.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * Specifies the storage account type used to store backups for this database. Possible values are `Geo`, `Local` and `Zone`. The default value is `Geo`.
     * 
     */
    @Export(name="storageAccountType", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountType;

    /**
     * @return Specifies the storage account type used to store backups for this database. Possible values are `Geo`, `Local` and `Zone`. The default value is `Geo`.
     * 
     */
    public Output<Optional<String>> storageAccountType() {
        return Codegen.optional(this.storageAccountType);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Threat detection policy configuration. The `threat_detection_policy` block supports fields documented below.
     * 
     */
    @Export(name="threatDetectionPolicy", type=DatabaseThreatDetectionPolicy.class, parameters={})
    private Output<DatabaseThreatDetectionPolicy> threatDetectionPolicy;

    /**
     * @return Threat detection policy configuration. The `threat_detection_policy` block supports fields documented below.
     * 
     */
    public Output<DatabaseThreatDetectionPolicy> threatDetectionPolicy() {
        return this.threatDetectionPolicy;
    }
    /**
     * If set to true, Transparent Data Encryption will be enabled on the database. Defaults to `true`.
     * 
     */
    @Export(name="transparentDataEncryptionEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> transparentDataEncryptionEnabled;

    /**
     * @return If set to true, Transparent Data Encryption will be enabled on the database. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> transparentDataEncryptionEnabled() {
        return Codegen.optional(this.transparentDataEncryptionEnabled);
    }
    /**
     * Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones. This property is only settable for Premium and Business Critical databases.
     * 
     */
    @Export(name="zoneRedundant", type=Boolean.class, parameters={})
    private Output<Boolean> zoneRedundant;

    /**
     * @return Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones. This property is only settable for Premium and Business Critical databases.
     * 
     */
    public Output<Boolean> zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/database:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Database(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/database:Database", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Database get(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, state, options);
    }
}
