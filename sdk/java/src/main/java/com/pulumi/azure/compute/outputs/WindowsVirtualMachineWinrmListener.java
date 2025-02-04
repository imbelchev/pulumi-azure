// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsVirtualMachineWinrmListener {
    /**
     * @return The Secret URL of a Key Vault Certificate, which must be specified when `protocol` is set to `Https`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String certificateUrl;
    /**
     * @return Specifies the protocol of listener. Possible values are `Http` or `Https`. Changing this forces a new resource to be created.
     * 
     */
    private String protocol;

    private WindowsVirtualMachineWinrmListener() {}
    /**
     * @return The Secret URL of a Key Vault Certificate, which must be specified when `protocol` is set to `Https`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> certificateUrl() {
        return Optional.ofNullable(this.certificateUrl);
    }
    /**
     * @return Specifies the protocol of listener. Possible values are `Http` or `Https`. Changing this forces a new resource to be created.
     * 
     */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsVirtualMachineWinrmListener defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificateUrl;
        private String protocol;
        public Builder() {}
        public Builder(WindowsVirtualMachineWinrmListener defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateUrl = defaults.certificateUrl;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder certificateUrl(@Nullable String certificateUrl) {
            this.certificateUrl = certificateUrl;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public WindowsVirtualMachineWinrmListener build() {
            final var o = new WindowsVirtualMachineWinrmListener();
            o.certificateUrl = certificateUrl;
            o.protocol = protocol;
            return o;
        }
    }
}
