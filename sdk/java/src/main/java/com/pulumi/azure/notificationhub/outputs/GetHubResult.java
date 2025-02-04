// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.notificationhub.outputs;

import com.pulumi.azure.notificationhub.outputs.GetHubApnsCredential;
import com.pulumi.azure.notificationhub.outputs.GetHubGcmCredential;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetHubResult {
    /**
     * @return A `apns_credential` block as defined below.
     * 
     */
    private List<GetHubApnsCredential> apnsCredentials;
    /**
     * @return A `gcm_credential` block as defined below.
     * 
     */
    private List<GetHubGcmCredential> gcmCredentials;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Azure Region in which this Notification Hub exists.
     * 
     */
    private String location;
    private String name;
    private String namespaceName;
    private String resourceGroupName;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private Map<String,String> tags;

    private GetHubResult() {}
    /**
     * @return A `apns_credential` block as defined below.
     * 
     */
    public List<GetHubApnsCredential> apnsCredentials() {
        return this.apnsCredentials;
    }
    /**
     * @return A `gcm_credential` block as defined below.
     * 
     */
    public List<GetHubGcmCredential> gcmCredentials() {
        return this.gcmCredentials;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region in which this Notification Hub exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String namespaceName() {
        return this.namespaceName;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHubResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetHubApnsCredential> apnsCredentials;
        private List<GetHubGcmCredential> gcmCredentials;
        private String id;
        private String location;
        private String name;
        private String namespaceName;
        private String resourceGroupName;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetHubResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apnsCredentials = defaults.apnsCredentials;
    	      this.gcmCredentials = defaults.gcmCredentials;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder apnsCredentials(List<GetHubApnsCredential> apnsCredentials) {
            this.apnsCredentials = Objects.requireNonNull(apnsCredentials);
            return this;
        }
        public Builder apnsCredentials(GetHubApnsCredential... apnsCredentials) {
            return apnsCredentials(List.of(apnsCredentials));
        }
        @CustomType.Setter
        public Builder gcmCredentials(List<GetHubGcmCredential> gcmCredentials) {
            this.gcmCredentials = Objects.requireNonNull(gcmCredentials);
            return this;
        }
        public Builder gcmCredentials(GetHubGcmCredential... gcmCredentials) {
            return gcmCredentials(List.of(gcmCredentials));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetHubResult build() {
            final var o = new GetHubResult();
            o.apnsCredentials = apnsCredentials;
            o.gcmCredentials = gcmCredentials;
            o.id = id;
            o.location = location;
            o.name = name;
            o.namespaceName = namespaceName;
            o.resourceGroupName = resourceGroupName;
            o.tags = tags;
            return o;
        }
    }
}
