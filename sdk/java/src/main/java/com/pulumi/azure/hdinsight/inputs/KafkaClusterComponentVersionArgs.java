// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class KafkaClusterComponentVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaClusterComponentVersionArgs Empty = new KafkaClusterComponentVersionArgs();

    /**
     * The version of Kafka which should be used for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="kafka", required=true)
    private Output<String> kafka;

    /**
     * @return The version of Kafka which should be used for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> kafka() {
        return this.kafka;
    }

    private KafkaClusterComponentVersionArgs() {}

    private KafkaClusterComponentVersionArgs(KafkaClusterComponentVersionArgs $) {
        this.kafka = $.kafka;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaClusterComponentVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaClusterComponentVersionArgs $;

        public Builder() {
            $ = new KafkaClusterComponentVersionArgs();
        }

        public Builder(KafkaClusterComponentVersionArgs defaults) {
            $ = new KafkaClusterComponentVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kafka The version of Kafka which should be used for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kafka(Output<String> kafka) {
            $.kafka = kafka;
            return this;
        }

        /**
         * @param kafka The version of Kafka which should be used for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kafka(String kafka) {
            return kafka(Output.of(kafka));
        }

        public KafkaClusterComponentVersionArgs build() {
            $.kafka = Objects.requireNonNull($.kafka, "expected parameter 'kafka' to be non-null");
            return $;
        }
    }

}
