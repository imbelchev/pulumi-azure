// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cosmosdb.inputs.GetAccountArgs;
import com.pulumi.azure.cosmosdb.inputs.GetAccountPlainArgs;
import com.pulumi.azure.cosmosdb.inputs.GetMongoDatabaseArgs;
import com.pulumi.azure.cosmosdb.inputs.GetMongoDatabasePlainArgs;
import com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsArgs;
import com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsPlainArgs;
import com.pulumi.azure.cosmosdb.inputs.GetSqlDatabaseArgs;
import com.pulumi.azure.cosmosdb.inputs.GetSqlDatabasePlainArgs;
import com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionArgs;
import com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionPlainArgs;
import com.pulumi.azure.cosmosdb.outputs.GetAccountResult;
import com.pulumi.azure.cosmosdb.outputs.GetMongoDatabaseResult;
import com.pulumi.azure.cosmosdb.outputs.GetRestorableDatabaseAccountsResult;
import com.pulumi.azure.cosmosdb.outputs.GetSqlDatabaseResult;
import com.pulumi.azure.cosmosdb.outputs.GetSqlRoleDefinitionResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CosmosdbFunctions {
    /**
     * Use this data source to access information about an existing CosmosDB (formally DocumentDB) Account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetAccountArgs;
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
     *         final var example = CosmosdbFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;tfex-cosmosdb-account&#34;)
     *             .resourceGroupName(&#34;tfex-cosmosdb-account-rg&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;cosmosdbAccountEndpoint&#34;, example.applyValue(getAccountResult -&gt; getAccountResult.endpoint()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing CosmosDB (formally DocumentDB) Account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetAccountArgs;
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
     *         final var example = CosmosdbFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;tfex-cosmosdb-account&#34;)
     *             .resourceGroupName(&#34;tfex-cosmosdb-account-rg&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;cosmosdbAccountEndpoint&#34;, example.applyValue(getAccountResult -&gt; getAccountResult.endpoint()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args) {
        return getAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing CosmosDB (formally DocumentDB) Account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetAccountArgs;
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
     *         final var example = CosmosdbFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;tfex-cosmosdb-account&#34;)
     *             .resourceGroupName(&#34;tfex-cosmosdb-account-rg&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;cosmosdbAccountEndpoint&#34;, example.applyValue(getAccountResult -&gt; getAccountResult.endpoint()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:cosmosdb/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing CosmosDB (formally DocumentDB) Account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetAccountArgs;
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
     *         final var example = CosmosdbFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;tfex-cosmosdb-account&#34;)
     *             .resourceGroupName(&#34;tfex-cosmosdb-account-rg&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;cosmosdbAccountEndpoint&#34;, example.applyValue(getAccountResult -&gt; getAccountResult.endpoint()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:cosmosdb/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Cosmos DB Mongo Database.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetMongoDatabaseArgs;
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
     *         final var example = CosmosdbFunctions.getMongoDatabase(GetMongoDatabaseArgs.builder()
     *             .name(&#34;test-cosmosdb-mongo-db&#34;)
     *             .resourceGroupName(&#34;test-cosmosdb-account-rg&#34;)
     *             .accountName(&#34;test-cosmosdb-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getMongoDatabaseResult -&gt; getMongoDatabaseResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetMongoDatabaseResult> getMongoDatabase(GetMongoDatabaseArgs args) {
        return getMongoDatabase(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Cosmos DB Mongo Database.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetMongoDatabaseArgs;
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
     *         final var example = CosmosdbFunctions.getMongoDatabase(GetMongoDatabaseArgs.builder()
     *             .name(&#34;test-cosmosdb-mongo-db&#34;)
     *             .resourceGroupName(&#34;test-cosmosdb-account-rg&#34;)
     *             .accountName(&#34;test-cosmosdb-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getMongoDatabaseResult -&gt; getMongoDatabaseResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetMongoDatabaseResult> getMongoDatabasePlain(GetMongoDatabasePlainArgs args) {
        return getMongoDatabasePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Cosmos DB Mongo Database.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetMongoDatabaseArgs;
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
     *         final var example = CosmosdbFunctions.getMongoDatabase(GetMongoDatabaseArgs.builder()
     *             .name(&#34;test-cosmosdb-mongo-db&#34;)
     *             .resourceGroupName(&#34;test-cosmosdb-account-rg&#34;)
     *             .accountName(&#34;test-cosmosdb-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getMongoDatabaseResult -&gt; getMongoDatabaseResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetMongoDatabaseResult> getMongoDatabase(GetMongoDatabaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:cosmosdb/getMongoDatabase:getMongoDatabase", TypeShape.of(GetMongoDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Cosmos DB Mongo Database.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetMongoDatabaseArgs;
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
     *         final var example = CosmosdbFunctions.getMongoDatabase(GetMongoDatabaseArgs.builder()
     *             .name(&#34;test-cosmosdb-mongo-db&#34;)
     *             .resourceGroupName(&#34;test-cosmosdb-account-rg&#34;)
     *             .accountName(&#34;test-cosmosdb-account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getMongoDatabaseResult -&gt; getMongoDatabaseResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetMongoDatabaseResult> getMongoDatabasePlain(GetMongoDatabasePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:cosmosdb/getMongoDatabase:getMongoDatabase", TypeShape.of(GetMongoDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about Cosmos DB Restorable Database Accounts.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsArgs;
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
     *         final var example = CosmosdbFunctions.getRestorableDatabaseAccounts(GetRestorableDatabaseAccountsArgs.builder()
     *             .name(&#34;example-ca&#34;)
     *             .location(&#34;West Europe&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getRestorableDatabaseAccountsResult -&gt; getRestorableDatabaseAccountsResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetRestorableDatabaseAccountsResult> getRestorableDatabaseAccounts(GetRestorableDatabaseAccountsArgs args) {
        return getRestorableDatabaseAccounts(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about Cosmos DB Restorable Database Accounts.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsArgs;
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
     *         final var example = CosmosdbFunctions.getRestorableDatabaseAccounts(GetRestorableDatabaseAccountsArgs.builder()
     *             .name(&#34;example-ca&#34;)
     *             .location(&#34;West Europe&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getRestorableDatabaseAccountsResult -&gt; getRestorableDatabaseAccountsResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRestorableDatabaseAccountsResult> getRestorableDatabaseAccountsPlain(GetRestorableDatabaseAccountsPlainArgs args) {
        return getRestorableDatabaseAccountsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about Cosmos DB Restorable Database Accounts.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsArgs;
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
     *         final var example = CosmosdbFunctions.getRestorableDatabaseAccounts(GetRestorableDatabaseAccountsArgs.builder()
     *             .name(&#34;example-ca&#34;)
     *             .location(&#34;West Europe&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getRestorableDatabaseAccountsResult -&gt; getRestorableDatabaseAccountsResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetRestorableDatabaseAccountsResult> getRestorableDatabaseAccounts(GetRestorableDatabaseAccountsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:cosmosdb/getRestorableDatabaseAccounts:getRestorableDatabaseAccounts", TypeShape.of(GetRestorableDatabaseAccountsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about Cosmos DB Restorable Database Accounts.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetRestorableDatabaseAccountsArgs;
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
     *         final var example = CosmosdbFunctions.getRestorableDatabaseAccounts(GetRestorableDatabaseAccountsArgs.builder()
     *             .name(&#34;example-ca&#34;)
     *             .location(&#34;West Europe&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getRestorableDatabaseAccountsResult -&gt; getRestorableDatabaseAccountsResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRestorableDatabaseAccountsResult> getRestorableDatabaseAccountsPlain(GetRestorableDatabaseAccountsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:cosmosdb/getRestorableDatabaseAccounts:getRestorableDatabaseAccounts", TypeShape.of(GetRestorableDatabaseAccountsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing CosmosDB SQL Database.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetSqlDatabaseArgs;
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
     *         final var example = CosmosdbFunctions.getSqlDatabase(GetSqlDatabaseArgs.builder()
     *             .accountName(&#34;tfex-cosmosdb-sql-database-account-name&#34;)
     *             .name(&#34;tfex-cosmosdb-sql-database&#34;)
     *             .resourceGroupName(&#34;tfex-cosmosdb-sql-database-rg&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSqlDatabaseResult> getSqlDatabase(GetSqlDatabaseArgs args) {
        return getSqlDatabase(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing CosmosDB SQL Database.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetSqlDatabaseArgs;
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
     *         final var example = CosmosdbFunctions.getSqlDatabase(GetSqlDatabaseArgs.builder()
     *             .accountName(&#34;tfex-cosmosdb-sql-database-account-name&#34;)
     *             .name(&#34;tfex-cosmosdb-sql-database&#34;)
     *             .resourceGroupName(&#34;tfex-cosmosdb-sql-database-rg&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSqlDatabaseResult> getSqlDatabasePlain(GetSqlDatabasePlainArgs args) {
        return getSqlDatabasePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing CosmosDB SQL Database.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetSqlDatabaseArgs;
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
     *         final var example = CosmosdbFunctions.getSqlDatabase(GetSqlDatabaseArgs.builder()
     *             .accountName(&#34;tfex-cosmosdb-sql-database-account-name&#34;)
     *             .name(&#34;tfex-cosmosdb-sql-database&#34;)
     *             .resourceGroupName(&#34;tfex-cosmosdb-sql-database-rg&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSqlDatabaseResult> getSqlDatabase(GetSqlDatabaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:cosmosdb/getSqlDatabase:getSqlDatabase", TypeShape.of(GetSqlDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing CosmosDB SQL Database.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetSqlDatabaseArgs;
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
     *         final var example = CosmosdbFunctions.getSqlDatabase(GetSqlDatabaseArgs.builder()
     *             .accountName(&#34;tfex-cosmosdb-sql-database-account-name&#34;)
     *             .name(&#34;tfex-cosmosdb-sql-database&#34;)
     *             .resourceGroupName(&#34;tfex-cosmosdb-sql-database-rg&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSqlDatabaseResult> getSqlDatabasePlain(GetSqlDatabasePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:cosmosdb/getSqlDatabase:getSqlDatabase", TypeShape.of(GetSqlDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Cosmos DB SQL Role Definition.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionArgs;
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
     *         final var example = CosmosdbFunctions.getSqlRoleDefinition(GetSqlRoleDefinitionArgs.builder()
     *             .accountName(&#34;tfex-cosmosdb-sql-role-definition-account-name&#34;)
     *             .resourceGroupName(&#34;tfex-cosmosdb-sql-role-definition-rg&#34;)
     *             .roleDefinitionId(&#34;00000000-0000-0000-0000-000000000000&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSqlRoleDefinitionResult> getSqlRoleDefinition(GetSqlRoleDefinitionArgs args) {
        return getSqlRoleDefinition(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Cosmos DB SQL Role Definition.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionArgs;
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
     *         final var example = CosmosdbFunctions.getSqlRoleDefinition(GetSqlRoleDefinitionArgs.builder()
     *             .accountName(&#34;tfex-cosmosdb-sql-role-definition-account-name&#34;)
     *             .resourceGroupName(&#34;tfex-cosmosdb-sql-role-definition-rg&#34;)
     *             .roleDefinitionId(&#34;00000000-0000-0000-0000-000000000000&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSqlRoleDefinitionResult> getSqlRoleDefinitionPlain(GetSqlRoleDefinitionPlainArgs args) {
        return getSqlRoleDefinitionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Cosmos DB SQL Role Definition.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionArgs;
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
     *         final var example = CosmosdbFunctions.getSqlRoleDefinition(GetSqlRoleDefinitionArgs.builder()
     *             .accountName(&#34;tfex-cosmosdb-sql-role-definition-account-name&#34;)
     *             .resourceGroupName(&#34;tfex-cosmosdb-sql-role-definition-rg&#34;)
     *             .roleDefinitionId(&#34;00000000-0000-0000-0000-000000000000&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSqlRoleDefinitionResult> getSqlRoleDefinition(GetSqlRoleDefinitionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:cosmosdb/getSqlRoleDefinition:getSqlRoleDefinition", TypeShape.of(GetSqlRoleDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Cosmos DB SQL Role Definition.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
     * import com.pulumi.azure.cosmosdb.inputs.GetSqlRoleDefinitionArgs;
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
     *         final var example = CosmosdbFunctions.getSqlRoleDefinition(GetSqlRoleDefinitionArgs.builder()
     *             .accountName(&#34;tfex-cosmosdb-sql-role-definition-account-name&#34;)
     *             .resourceGroupName(&#34;tfex-cosmosdb-sql-role-definition-rg&#34;)
     *             .roleDefinitionId(&#34;00000000-0000-0000-0000-000000000000&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSqlRoleDefinitionResult> getSqlRoleDefinitionPlain(GetSqlRoleDefinitionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:cosmosdb/getSqlRoleDefinition:getSqlRoleDefinition", TypeShape.of(GetSqlRoleDefinitionResult.class), args, Utilities.withVersion(options));
    }
}
