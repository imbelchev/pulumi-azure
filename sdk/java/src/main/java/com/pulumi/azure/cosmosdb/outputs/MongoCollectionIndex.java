// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MongoCollectionIndex {
    /**
     * @return Specifies the list of user settable keys for each Cosmos DB Mongo Collection.
     * 
     */
    private List<String> keys;
    /**
     * @return Is the index unique or not? Defaults to `false`.
     * 
     */
    private @Nullable Boolean unique;

    private MongoCollectionIndex() {}
    /**
     * @return Specifies the list of user settable keys for each Cosmos DB Mongo Collection.
     * 
     */
    public List<String> keys() {
        return this.keys;
    }
    /**
     * @return Is the index unique or not? Defaults to `false`.
     * 
     */
    public Optional<Boolean> unique() {
        return Optional.ofNullable(this.unique);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoCollectionIndex defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> keys;
        private @Nullable Boolean unique;
        public Builder() {}
        public Builder(MongoCollectionIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keys = defaults.keys;
    	      this.unique = defaults.unique;
        }

        @CustomType.Setter
        public Builder keys(List<String> keys) {
            this.keys = Objects.requireNonNull(keys);
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }
        @CustomType.Setter
        public Builder unique(@Nullable Boolean unique) {
            this.unique = unique;
            return this;
        }
        public MongoCollectionIndex build() {
            final var o = new MongoCollectionIndex();
            o.keys = keys;
            o.unique = unique;
            return o;
        }
    }
}
