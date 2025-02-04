// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor.inputs;

import com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleExclusionArgs;
import com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyManagedRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyManagedRuleArgs Empty = new FirewallPolicyManagedRuleArgs();

    /**
     * One or more `exclusion` blocks as defined below.
     * 
     */
    @Import(name="exclusions")
    private @Nullable Output<List<FirewallPolicyManagedRuleExclusionArgs>> exclusions;

    /**
     * @return One or more `exclusion` blocks as defined below.
     * 
     */
    public Optional<Output<List<FirewallPolicyManagedRuleExclusionArgs>>> exclusions() {
        return Optional.ofNullable(this.exclusions);
    }

    /**
     * One or more `override` blocks as defined below.
     * 
     */
    @Import(name="overrides")
    private @Nullable Output<List<FirewallPolicyManagedRuleOverrideArgs>> overrides;

    /**
     * @return One or more `override` blocks as defined below.
     * 
     */
    public Optional<Output<List<FirewallPolicyManagedRuleOverrideArgs>>> overrides() {
        return Optional.ofNullable(this.overrides);
    }

    /**
     * The name of the managed rule to use with this resource.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The name of the managed rule to use with this resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The version on the managed rule to use with this resource.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return The version on the managed rule to use with this resource.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private FirewallPolicyManagedRuleArgs() {}

    private FirewallPolicyManagedRuleArgs(FirewallPolicyManagedRuleArgs $) {
        this.exclusions = $.exclusions;
        this.overrides = $.overrides;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyManagedRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyManagedRuleArgs $;

        public Builder() {
            $ = new FirewallPolicyManagedRuleArgs();
        }

        public Builder(FirewallPolicyManagedRuleArgs defaults) {
            $ = new FirewallPolicyManagedRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exclusions One or more `exclusion` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(@Nullable Output<List<FirewallPolicyManagedRuleExclusionArgs>> exclusions) {
            $.exclusions = exclusions;
            return this;
        }

        /**
         * @param exclusions One or more `exclusion` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(List<FirewallPolicyManagedRuleExclusionArgs> exclusions) {
            return exclusions(Output.of(exclusions));
        }

        /**
         * @param exclusions One or more `exclusion` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(FirewallPolicyManagedRuleExclusionArgs... exclusions) {
            return exclusions(List.of(exclusions));
        }

        /**
         * @param overrides One or more `override` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder overrides(@Nullable Output<List<FirewallPolicyManagedRuleOverrideArgs>> overrides) {
            $.overrides = overrides;
            return this;
        }

        /**
         * @param overrides One or more `override` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder overrides(List<FirewallPolicyManagedRuleOverrideArgs> overrides) {
            return overrides(Output.of(overrides));
        }

        /**
         * @param overrides One or more `override` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder overrides(FirewallPolicyManagedRuleOverrideArgs... overrides) {
            return overrides(List.of(overrides));
        }

        /**
         * @param type The name of the managed rule to use with this resource.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The name of the managed rule to use with this resource.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param version The version on the managed rule to use with this resource.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version on the managed rule to use with this resource.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public FirewallPolicyManagedRuleArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
