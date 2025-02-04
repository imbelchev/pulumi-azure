// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.waf.outputs;

import com.pulumi.azure.waf.outputs.PolicyCustomRuleMatchCondition;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyCustomRule {
    /**
     * @return Type of action. Possible values are `Allow`, `Block` and `Log`.
     * 
     */
    private String action;
    /**
     * @return One or more `match_conditions` blocks as defined below.
     * 
     */
    private List<PolicyCustomRuleMatchCondition> matchConditions;
    /**
     * @return Gets name of the resource that is unique within a policy. This name can be used to access the resource.
     * 
     */
    private @Nullable String name;
    /**
     * @return Describes priority of the rule. Rules with a lower value will be evaluated before rules with a higher value.
     * 
     */
    private Integer priority;
    /**
     * @return Describes the type of rule. Possible values are `MatchRule` and `Invalid`.
     * 
     */
    private String ruleType;

    private PolicyCustomRule() {}
    /**
     * @return Type of action. Possible values are `Allow`, `Block` and `Log`.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return One or more `match_conditions` blocks as defined below.
     * 
     */
    public List<PolicyCustomRuleMatchCondition> matchConditions() {
        return this.matchConditions;
    }
    /**
     * @return Gets name of the resource that is unique within a policy. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Describes priority of the rule. Rules with a lower value will be evaluated before rules with a higher value.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Describes the type of rule. Possible values are `MatchRule` and `Invalid`.
     * 
     */
    public String ruleType() {
        return this.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyCustomRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private List<PolicyCustomRuleMatchCondition> matchConditions;
        private @Nullable String name;
        private Integer priority;
        private String ruleType;
        public Builder() {}
        public Builder(PolicyCustomRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.matchConditions = defaults.matchConditions;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleType = defaults.ruleType;
        }

        @CustomType.Setter
        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        @CustomType.Setter
        public Builder matchConditions(List<PolicyCustomRuleMatchCondition> matchConditions) {
            this.matchConditions = Objects.requireNonNull(matchConditions);
            return this;
        }
        public Builder matchConditions(PolicyCustomRuleMatchCondition... matchConditions) {
            return matchConditions(List.of(matchConditions));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public PolicyCustomRule build() {
            final var o = new PolicyCustomRule();
            o.action = action;
            o.matchConditions = matchConditions;
            o.name = name;
            o.priority = priority;
            o.ruleType = ruleType;
            return o;
        }
    }
}
