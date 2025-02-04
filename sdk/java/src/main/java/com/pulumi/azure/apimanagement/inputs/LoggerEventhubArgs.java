// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LoggerEventhubArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggerEventhubArgs Empty = new LoggerEventhubArgs();

    /**
     * The connection string of an EventHub Namespace.
     * 
     */
    @Import(name="connectionString", required=true)
    private Output<String> connectionString;

    /**
     * @return The connection string of an EventHub Namespace.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }

    /**
     * The name of an EventHub.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of an EventHub.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private LoggerEventhubArgs() {}

    private LoggerEventhubArgs(LoggerEventhubArgs $) {
        this.connectionString = $.connectionString;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggerEventhubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggerEventhubArgs $;

        public Builder() {
            $ = new LoggerEventhubArgs();
        }

        public Builder(LoggerEventhubArgs defaults) {
            $ = new LoggerEventhubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionString The connection string of an EventHub Namespace.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString The connection string of an EventHub Namespace.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param name The name of an EventHub.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of an EventHub.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public LoggerEventhubArgs build() {
            $.connectionString = Objects.requireNonNull($.connectionString, "expected parameter 'connectionString' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
