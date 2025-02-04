// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWindowsWebAppSiteConfigVirtualApplicationVirtualDirectory {
    /**
     * @return The path on disk to the Virtual Directory
     * 
     */
    private String physicalPath;
    /**
     * @return The Virtual Path of the Virtual Directory.
     * 
     */
    private String virtualPath;

    private GetWindowsWebAppSiteConfigVirtualApplicationVirtualDirectory() {}
    /**
     * @return The path on disk to the Virtual Directory
     * 
     */
    public String physicalPath() {
        return this.physicalPath;
    }
    /**
     * @return The Virtual Path of the Virtual Directory.
     * 
     */
    public String virtualPath() {
        return this.virtualPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsWebAppSiteConfigVirtualApplicationVirtualDirectory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String physicalPath;
        private String virtualPath;
        public Builder() {}
        public Builder(GetWindowsWebAppSiteConfigVirtualApplicationVirtualDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.physicalPath = defaults.physicalPath;
    	      this.virtualPath = defaults.virtualPath;
        }

        @CustomType.Setter
        public Builder physicalPath(String physicalPath) {
            this.physicalPath = Objects.requireNonNull(physicalPath);
            return this;
        }
        @CustomType.Setter
        public Builder virtualPath(String virtualPath) {
            this.virtualPath = Objects.requireNonNull(virtualPath);
            return this;
        }
        public GetWindowsWebAppSiteConfigVirtualApplicationVirtualDirectory build() {
            final var o = new GetWindowsWebAppSiteConfigVirtualApplicationVirtualDirectory();
            o.physicalPath = physicalPath;
            o.virtualPath = virtualPath;
            return o;
        }
    }
}
