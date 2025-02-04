// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.config.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeaturesLogAnalyticsWorkspace {
    private @Nullable Boolean permanentlyDeleteOnDestroy;

    private FeaturesLogAnalyticsWorkspace() {}
    public Optional<Boolean> permanentlyDeleteOnDestroy() {
        return Optional.ofNullable(this.permanentlyDeleteOnDestroy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeaturesLogAnalyticsWorkspace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean permanentlyDeleteOnDestroy;
        public Builder() {}
        public Builder(FeaturesLogAnalyticsWorkspace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permanentlyDeleteOnDestroy = defaults.permanentlyDeleteOnDestroy;
        }

        @CustomType.Setter
        public Builder permanentlyDeleteOnDestroy(@Nullable Boolean permanentlyDeleteOnDestroy) {
            this.permanentlyDeleteOnDestroy = permanentlyDeleteOnDestroy;
            return this;
        }
        public FeaturesLogAnalyticsWorkspace build() {
            final var o = new FeaturesLogAnalyticsWorkspace();
            o.permanentlyDeleteOnDestroy = permanentlyDeleteOnDestroy;
            return o;
        }
    }
}
