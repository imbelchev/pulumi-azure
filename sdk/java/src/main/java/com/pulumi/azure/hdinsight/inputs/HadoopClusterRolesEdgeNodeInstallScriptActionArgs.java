// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HadoopClusterRolesEdgeNodeInstallScriptActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HadoopClusterRolesEdgeNodeInstallScriptActionArgs Empty = new HadoopClusterRolesEdgeNodeInstallScriptActionArgs();

    /**
     * The name of the install script action.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the install script action.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The parameters for the script.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<String> parameters;

    /**
     * @return The parameters for the script.
     * 
     */
    public Optional<Output<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The URI pointing to the script to run during the installation of the edge node.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return The URI pointing to the script to run during the installation of the edge node.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private HadoopClusterRolesEdgeNodeInstallScriptActionArgs() {}

    private HadoopClusterRolesEdgeNodeInstallScriptActionArgs(HadoopClusterRolesEdgeNodeInstallScriptActionArgs $) {
        this.name = $.name;
        this.parameters = $.parameters;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HadoopClusterRolesEdgeNodeInstallScriptActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HadoopClusterRolesEdgeNodeInstallScriptActionArgs $;

        public Builder() {
            $ = new HadoopClusterRolesEdgeNodeInstallScriptActionArgs();
        }

        public Builder(HadoopClusterRolesEdgeNodeInstallScriptActionArgs defaults) {
            $ = new HadoopClusterRolesEdgeNodeInstallScriptActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the install script action.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the install script action.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters The parameters for the script.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The parameters for the script.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param uri The URI pointing to the script to run during the installation of the edge node.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The URI pointing to the script to run during the installation of the edge node.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public HadoopClusterRolesEdgeNodeInstallScriptActionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
