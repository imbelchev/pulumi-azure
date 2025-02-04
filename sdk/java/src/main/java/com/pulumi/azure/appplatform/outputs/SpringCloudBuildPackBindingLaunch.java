// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SpringCloudBuildPackBindingLaunch {
    /**
     * @return Specifies a map of non-sensitive properties for launchProperties.
     * 
     */
    private @Nullable Map<String,String> properties;
    /**
     * @return Specifies a map of sensitive properties for launchProperties.
     * 
     */
    private @Nullable Map<String,String> secrets;

    private SpringCloudBuildPackBindingLaunch() {}
    /**
     * @return Specifies a map of non-sensitive properties for launchProperties.
     * 
     */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * @return Specifies a map of sensitive properties for launchProperties.
     * 
     */
    public Map<String,String> secrets() {
        return this.secrets == null ? Map.of() : this.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpringCloudBuildPackBindingLaunch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> properties;
        private @Nullable Map<String,String> secrets;
        public Builder() {}
        public Builder(SpringCloudBuildPackBindingLaunch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.secrets = defaults.secrets;
        }

        @CustomType.Setter
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        @CustomType.Setter
        public Builder secrets(@Nullable Map<String,String> secrets) {
            this.secrets = secrets;
            return this;
        }
        public SpringCloudBuildPackBindingLaunch build() {
            final var o = new SpringCloudBuildPackBindingLaunch();
            o.properties = properties;
            o.secrets = secrets;
            return o;
        }
    }
}
