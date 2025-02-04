// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation.inputs;

import com.pulumi.azure.automation.inputs.ModuleModuleLinkHashArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModuleModuleLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModuleModuleLinkArgs Empty = new ModuleModuleLinkArgs();

    /**
     * A `hash` block as defined below.
     * 
     */
    @Import(name="hash")
    private @Nullable Output<ModuleModuleLinkHashArgs> hash;

    /**
     * @return A `hash` block as defined below.
     * 
     */
    public Optional<Output<ModuleModuleLinkHashArgs>> hash() {
        return Optional.ofNullable(this.hash);
    }

    /**
     * The URI of the module content (zip or nupkg).
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return The URI of the module content (zip or nupkg).
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private ModuleModuleLinkArgs() {}

    private ModuleModuleLinkArgs(ModuleModuleLinkArgs $) {
        this.hash = $.hash;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModuleModuleLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModuleModuleLinkArgs $;

        public Builder() {
            $ = new ModuleModuleLinkArgs();
        }

        public Builder(ModuleModuleLinkArgs defaults) {
            $ = new ModuleModuleLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hash A `hash` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder hash(@Nullable Output<ModuleModuleLinkHashArgs> hash) {
            $.hash = hash;
            return this;
        }

        /**
         * @param hash A `hash` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder hash(ModuleModuleLinkHashArgs hash) {
            return hash(Output.of(hash));
        }

        /**
         * @param uri The URI of the module content (zip or nupkg).
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The URI of the module content (zip or nupkg).
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public ModuleModuleLinkArgs build() {
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
