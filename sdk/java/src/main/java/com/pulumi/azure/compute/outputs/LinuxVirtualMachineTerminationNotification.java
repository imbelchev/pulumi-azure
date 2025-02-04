// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxVirtualMachineTerminationNotification {
    /**
     * @return Should the termination notification be enabled on this Virtual Machine?
     * 
     */
    private Boolean enabled;
    /**
     * @return Length of time (in minutes, between `5` and `15`) a notification to be sent to the VM on the instance metadata server till the VM gets deleted. The time duration should be specified in ISO 8601 format. Defaults to `PT5M`.
     * 
     */
    private @Nullable String timeout;

    private LinuxVirtualMachineTerminationNotification() {}
    /**
     * @return Should the termination notification be enabled on this Virtual Machine?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Length of time (in minutes, between `5` and `15`) a notification to be sent to the VM on the instance metadata server till the VM gets deleted. The time duration should be specified in ISO 8601 format. Defaults to `PT5M`.
     * 
     */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxVirtualMachineTerminationNotification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable String timeout;
        public Builder() {}
        public Builder(LinuxVirtualMachineTerminationNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }
        public LinuxVirtualMachineTerminationNotification build() {
            final var o = new LinuxVirtualMachineTerminationNotification();
            o.enabled = enabled;
            o.timeout = timeout;
            return o;
        }
    }
}
