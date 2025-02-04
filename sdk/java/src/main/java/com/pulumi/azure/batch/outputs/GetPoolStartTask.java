// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.azure.batch.outputs.GetPoolStartTaskContainer;
import com.pulumi.azure.batch.outputs.GetPoolStartTaskResourceFile;
import com.pulumi.azure.batch.outputs.GetPoolStartTaskUserIdentity;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetPoolStartTask {
    /**
     * @return The command line executed by the start task.
     * 
     */
    private String commandLine;
    /**
     * @return A map of strings (key,value) that represents the environment variables to set in the start task.
     * 
     */
    private @Nullable Map<String,String> commonEnvironmentProperties;
    /**
     * @return The settings for the container under which the start task runs.
     * 
     */
    private List<GetPoolStartTaskContainer> containers;
    /**
     * @return One or more `resource_file` blocks that describe the files to be downloaded to a compute node.
     * 
     */
    private List<GetPoolStartTaskResourceFile> resourceFiles;
    /**
     * @return The number of retry count
     * 
     */
    private Integer taskRetryMaximum;
    /**
     * @return A `user_identity` block that describes the user identity under which the start task runs.
     * 
     */
    private List<GetPoolStartTaskUserIdentity> userIdentities;
    /**
     * @return A flag that indicates if the Batch pool should wait for the start task to be completed.
     * 
     */
    private Boolean waitForSuccess;

    private GetPoolStartTask() {}
    /**
     * @return The command line executed by the start task.
     * 
     */
    public String commandLine() {
        return this.commandLine;
    }
    /**
     * @return A map of strings (key,value) that represents the environment variables to set in the start task.
     * 
     */
    public Map<String,String> commonEnvironmentProperties() {
        return this.commonEnvironmentProperties == null ? Map.of() : this.commonEnvironmentProperties;
    }
    /**
     * @return The settings for the container under which the start task runs.
     * 
     */
    public List<GetPoolStartTaskContainer> containers() {
        return this.containers;
    }
    /**
     * @return One or more `resource_file` blocks that describe the files to be downloaded to a compute node.
     * 
     */
    public List<GetPoolStartTaskResourceFile> resourceFiles() {
        return this.resourceFiles;
    }
    /**
     * @return The number of retry count
     * 
     */
    public Integer taskRetryMaximum() {
        return this.taskRetryMaximum;
    }
    /**
     * @return A `user_identity` block that describes the user identity under which the start task runs.
     * 
     */
    public List<GetPoolStartTaskUserIdentity> userIdentities() {
        return this.userIdentities;
    }
    /**
     * @return A flag that indicates if the Batch pool should wait for the start task to be completed.
     * 
     */
    public Boolean waitForSuccess() {
        return this.waitForSuccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolStartTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String commandLine;
        private @Nullable Map<String,String> commonEnvironmentProperties;
        private List<GetPoolStartTaskContainer> containers;
        private List<GetPoolStartTaskResourceFile> resourceFiles;
        private Integer taskRetryMaximum;
        private List<GetPoolStartTaskUserIdentity> userIdentities;
        private Boolean waitForSuccess;
        public Builder() {}
        public Builder(GetPoolStartTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandLine = defaults.commandLine;
    	      this.commonEnvironmentProperties = defaults.commonEnvironmentProperties;
    	      this.containers = defaults.containers;
    	      this.resourceFiles = defaults.resourceFiles;
    	      this.taskRetryMaximum = defaults.taskRetryMaximum;
    	      this.userIdentities = defaults.userIdentities;
    	      this.waitForSuccess = defaults.waitForSuccess;
        }

        @CustomType.Setter
        public Builder commandLine(String commandLine) {
            this.commandLine = Objects.requireNonNull(commandLine);
            return this;
        }
        @CustomType.Setter
        public Builder commonEnvironmentProperties(@Nullable Map<String,String> commonEnvironmentProperties) {
            this.commonEnvironmentProperties = commonEnvironmentProperties;
            return this;
        }
        @CustomType.Setter
        public Builder containers(List<GetPoolStartTaskContainer> containers) {
            this.containers = Objects.requireNonNull(containers);
            return this;
        }
        public Builder containers(GetPoolStartTaskContainer... containers) {
            return containers(List.of(containers));
        }
        @CustomType.Setter
        public Builder resourceFiles(List<GetPoolStartTaskResourceFile> resourceFiles) {
            this.resourceFiles = Objects.requireNonNull(resourceFiles);
            return this;
        }
        public Builder resourceFiles(GetPoolStartTaskResourceFile... resourceFiles) {
            return resourceFiles(List.of(resourceFiles));
        }
        @CustomType.Setter
        public Builder taskRetryMaximum(Integer taskRetryMaximum) {
            this.taskRetryMaximum = Objects.requireNonNull(taskRetryMaximum);
            return this;
        }
        @CustomType.Setter
        public Builder userIdentities(List<GetPoolStartTaskUserIdentity> userIdentities) {
            this.userIdentities = Objects.requireNonNull(userIdentities);
            return this;
        }
        public Builder userIdentities(GetPoolStartTaskUserIdentity... userIdentities) {
            return userIdentities(List.of(userIdentities));
        }
        @CustomType.Setter
        public Builder waitForSuccess(Boolean waitForSuccess) {
            this.waitForSuccess = Objects.requireNonNull(waitForSuccess);
            return this;
        }
        public GetPoolStartTask build() {
            final var o = new GetPoolStartTask();
            o.commandLine = commandLine;
            o.commonEnvironmentProperties = commonEnvironmentProperties;
            o.containers = containers;
            o.resourceFiles = resourceFiles;
            o.taskRetryMaximum = taskRetryMaximum;
            o.userIdentities = userIdentities;
            o.waitForSuccess = waitForSuccess;
            return o;
        }
    }
}
