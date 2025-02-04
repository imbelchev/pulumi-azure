// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hpc.inputs;

import com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyAccessRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class CacheDefaultAccessPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheDefaultAccessPolicyArgs Empty = new CacheDefaultAccessPolicyArgs();

    /**
     * One to three `access_rule` blocks as defined above.
     * 
     */
    @Import(name="accessRules", required=true)
    private Output<List<CacheDefaultAccessPolicyAccessRuleArgs>> accessRules;

    /**
     * @return One to three `access_rule` blocks as defined above.
     * 
     */
    public Output<List<CacheDefaultAccessPolicyAccessRuleArgs>> accessRules() {
        return this.accessRules;
    }

    private CacheDefaultAccessPolicyArgs() {}

    private CacheDefaultAccessPolicyArgs(CacheDefaultAccessPolicyArgs $) {
        this.accessRules = $.accessRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheDefaultAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheDefaultAccessPolicyArgs $;

        public Builder() {
            $ = new CacheDefaultAccessPolicyArgs();
        }

        public Builder(CacheDefaultAccessPolicyArgs defaults) {
            $ = new CacheDefaultAccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessRules One to three `access_rule` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder accessRules(Output<List<CacheDefaultAccessPolicyAccessRuleArgs>> accessRules) {
            $.accessRules = accessRules;
            return this;
        }

        /**
         * @param accessRules One to three `access_rule` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder accessRules(List<CacheDefaultAccessPolicyAccessRuleArgs> accessRules) {
            return accessRules(Output.of(accessRules));
        }

        /**
         * @param accessRules One to three `access_rule` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder accessRules(CacheDefaultAccessPolicyAccessRuleArgs... accessRules) {
            return accessRules(List.of(accessRules));
        }

        public CacheDefaultAccessPolicyArgs build() {
            $.accessRules = Objects.requireNonNull($.accessRules, "expected parameter 'accessRules' to be non-null");
            return $;
        }
    }

}
