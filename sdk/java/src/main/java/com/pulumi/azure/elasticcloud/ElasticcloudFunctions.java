// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.elasticcloud;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs;
import com.pulumi.azure.elasticcloud.inputs.GetElasticsearchPlainArgs;
import com.pulumi.azure.elasticcloud.outputs.GetElasticsearchResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ElasticcloudFunctions {
    /**
     * Use this data source to access information about an existing Elasticsearch resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.elasticcloud.ElasticcloudFunctions;
     * import com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs;
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
     *         final var example = ElasticcloudFunctions.getElasticsearch(GetElasticsearchArgs.builder()
     *             .name(&#34;my-elastic-search&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;elasticsearchEndpoint&#34;, example.applyValue(getElasticsearchResult -&gt; getElasticsearchResult.elasticsearchServiceUrl()));
     *         ctx.export(&#34;kibanaEndpoint&#34;, example.applyValue(getElasticsearchResult -&gt; getElasticsearchResult.kibanaServiceUrl()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetElasticsearchResult> getElasticsearch(GetElasticsearchArgs args) {
        return getElasticsearch(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Elasticsearch resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.elasticcloud.ElasticcloudFunctions;
     * import com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs;
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
     *         final var example = ElasticcloudFunctions.getElasticsearch(GetElasticsearchArgs.builder()
     *             .name(&#34;my-elastic-search&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;elasticsearchEndpoint&#34;, example.applyValue(getElasticsearchResult -&gt; getElasticsearchResult.elasticsearchServiceUrl()));
     *         ctx.export(&#34;kibanaEndpoint&#34;, example.applyValue(getElasticsearchResult -&gt; getElasticsearchResult.kibanaServiceUrl()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetElasticsearchResult> getElasticsearchPlain(GetElasticsearchPlainArgs args) {
        return getElasticsearchPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Elasticsearch resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.elasticcloud.ElasticcloudFunctions;
     * import com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs;
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
     *         final var example = ElasticcloudFunctions.getElasticsearch(GetElasticsearchArgs.builder()
     *             .name(&#34;my-elastic-search&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;elasticsearchEndpoint&#34;, example.applyValue(getElasticsearchResult -&gt; getElasticsearchResult.elasticsearchServiceUrl()));
     *         ctx.export(&#34;kibanaEndpoint&#34;, example.applyValue(getElasticsearchResult -&gt; getElasticsearchResult.kibanaServiceUrl()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetElasticsearchResult> getElasticsearch(GetElasticsearchArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:elasticcloud/getElasticsearch:getElasticsearch", TypeShape.of(GetElasticsearchResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Elasticsearch resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.elasticcloud.ElasticcloudFunctions;
     * import com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs;
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
     *         final var example = ElasticcloudFunctions.getElasticsearch(GetElasticsearchArgs.builder()
     *             .name(&#34;my-elastic-search&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;elasticsearchEndpoint&#34;, example.applyValue(getElasticsearchResult -&gt; getElasticsearchResult.elasticsearchServiceUrl()));
     *         ctx.export(&#34;kibanaEndpoint&#34;, example.applyValue(getElasticsearchResult -&gt; getElasticsearchResult.kibanaServiceUrl()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetElasticsearchResult> getElasticsearchPlain(GetElasticsearchPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:elasticcloud/getElasticsearch:getElasticsearch", TypeShape.of(GetElasticsearchResult.class), args, Utilities.withVersion(options));
    }
}
