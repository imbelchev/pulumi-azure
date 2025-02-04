// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderFeaturesCognitiveAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderFeaturesCognitiveAccountArgs Empty = new ProviderFeaturesCognitiveAccountArgs();

    @Import(name="purgeSoftDeleteOnDestroy")
    private @Nullable Output<Boolean> purgeSoftDeleteOnDestroy;

    public Optional<Output<Boolean>> purgeSoftDeleteOnDestroy() {
        return Optional.ofNullable(this.purgeSoftDeleteOnDestroy);
    }

    private ProviderFeaturesCognitiveAccountArgs() {}

    private ProviderFeaturesCognitiveAccountArgs(ProviderFeaturesCognitiveAccountArgs $) {
        this.purgeSoftDeleteOnDestroy = $.purgeSoftDeleteOnDestroy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderFeaturesCognitiveAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderFeaturesCognitiveAccountArgs $;

        public Builder() {
            $ = new ProviderFeaturesCognitiveAccountArgs();
        }

        public Builder(ProviderFeaturesCognitiveAccountArgs defaults) {
            $ = new ProviderFeaturesCognitiveAccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder purgeSoftDeleteOnDestroy(@Nullable Output<Boolean> purgeSoftDeleteOnDestroy) {
            $.purgeSoftDeleteOnDestroy = purgeSoftDeleteOnDestroy;
            return this;
        }

        public Builder purgeSoftDeleteOnDestroy(Boolean purgeSoftDeleteOnDestroy) {
            return purgeSoftDeleteOnDestroy(Output.of(purgeSoftDeleteOnDestroy));
        }

        public ProviderFeaturesCognitiveAccountArgs build() {
            return $;
        }
    }

}
