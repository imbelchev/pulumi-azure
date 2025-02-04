// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.kusto.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class ClusterOptimizedAutoScaleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterOptimizedAutoScaleArgs Empty = new ClusterOptimizedAutoScaleArgs();

    /**
     * The maximum number of allowed instances. Must between `0` and `1000`.
     * 
     */
    @Import(name="maximumInstances", required=true)
    private Output<Integer> maximumInstances;

    /**
     * @return The maximum number of allowed instances. Must between `0` and `1000`.
     * 
     */
    public Output<Integer> maximumInstances() {
        return this.maximumInstances;
    }

    /**
     * The minimum number of allowed instances. Must between `0` and `1000`.
     * 
     */
    @Import(name="minimumInstances", required=true)
    private Output<Integer> minimumInstances;

    /**
     * @return The minimum number of allowed instances. Must between `0` and `1000`.
     * 
     */
    public Output<Integer> minimumInstances() {
        return this.minimumInstances;
    }

    private ClusterOptimizedAutoScaleArgs() {}

    private ClusterOptimizedAutoScaleArgs(ClusterOptimizedAutoScaleArgs $) {
        this.maximumInstances = $.maximumInstances;
        this.minimumInstances = $.minimumInstances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterOptimizedAutoScaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterOptimizedAutoScaleArgs $;

        public Builder() {
            $ = new ClusterOptimizedAutoScaleArgs();
        }

        public Builder(ClusterOptimizedAutoScaleArgs defaults) {
            $ = new ClusterOptimizedAutoScaleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maximumInstances The maximum number of allowed instances. Must between `0` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder maximumInstances(Output<Integer> maximumInstances) {
            $.maximumInstances = maximumInstances;
            return this;
        }

        /**
         * @param maximumInstances The maximum number of allowed instances. Must between `0` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder maximumInstances(Integer maximumInstances) {
            return maximumInstances(Output.of(maximumInstances));
        }

        /**
         * @param minimumInstances The minimum number of allowed instances. Must between `0` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder minimumInstances(Output<Integer> minimumInstances) {
            $.minimumInstances = minimumInstances;
            return this;
        }

        /**
         * @param minimumInstances The minimum number of allowed instances. Must between `0` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder minimumInstances(Integer minimumInstances) {
            return minimumInstances(Output.of(minimumInstances));
        }

        public ClusterOptimizedAutoScaleArgs build() {
            $.maximumInstances = Objects.requireNonNull($.maximumInstances, "expected parameter 'maximumInstances' to be non-null");
            $.minimumInstances = Objects.requireNonNull($.minimumInstances, "expected parameter 'minimumInstances' to be non-null");
            return $;
        }
    }

}
