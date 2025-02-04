// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.LinuxWebAppSlotBackupSchedule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxWebAppSlotBackup {
    /**
     * @return Should this backup job be enabled? Defaults to `true`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The name which should be used for this Backup.
     * 
     */
    private String name;
    /**
     * @return An `schedule` block as defined below.
     * 
     */
    private LinuxWebAppSlotBackupSchedule schedule;
    /**
     * @return The SAS URL to the container.
     * 
     */
    private String storageAccountUrl;

    private LinuxWebAppSlotBackup() {}
    /**
     * @return Should this backup job be enabled? Defaults to `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The name which should be used for this Backup.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return An `schedule` block as defined below.
     * 
     */
    public LinuxWebAppSlotBackupSchedule schedule() {
        return this.schedule;
    }
    /**
     * @return The SAS URL to the container.
     * 
     */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxWebAppSlotBackup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private String name;
        private LinuxWebAppSlotBackupSchedule schedule;
        private String storageAccountUrl;
        public Builder() {}
        public Builder(LinuxWebAppSlotBackup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder schedule(LinuxWebAppSlotBackupSchedule schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountUrl(String storageAccountUrl) {
            this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
            return this;
        }
        public LinuxWebAppSlotBackup build() {
            final var o = new LinuxWebAppSlotBackup();
            o.enabled = enabled;
            o.name = name;
            o.schedule = schedule;
            o.storageAccountUrl = storageAccountUrl;
            return o;
        }
    }
}
