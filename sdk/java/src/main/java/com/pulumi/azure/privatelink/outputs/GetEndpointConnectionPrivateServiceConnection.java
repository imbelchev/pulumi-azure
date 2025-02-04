// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatelink.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEndpointConnectionPrivateServiceConnection {
    /**
     * @return Specifies the Name of the private endpoint.
     * 
     */
    private String name;
    /**
     * @return The private IP address associated with the private endpoint, note that you will have a private IP address assigned to the private endpoint even if the connection request was `Rejected`.
     * 
     */
    private String privateIpAddress;
    /**
     * @return Possible values are as follows:
     * Value | Meaning
     * -- | --
     * `Auto-Approved` | The remote resource owner has added you to the `Auto-Approved` RBAC permission list for the remote resource, all private endpoint connection requests will be automatically `Approved`.
     * `Deleted state` | The resource owner has `Rejected` the private endpoint connection request and has removed your private endpoint request from the remote resource.
     * `request/response message` | If you submitted a manual private endpoint connection request, while in the `Pending` status the `request_response` will display the same text from your `request_message` in the `private_service_connection` block above. If the private endpoint connection request was `Rejected` by the owner of the remote resource, the text for the rejection will be displayed as the `request_response` text, if the private endpoint connection request was `Approved` by the owner of the remote resource, the text for the approval will be displayed as the `request_response` text
     * 
     */
    private String requestResponse;
    /**
     * @return The current status of the private endpoint request, possible values will be `Pending`, `Approved`, `Rejected`, or `Disconnected`.
     * 
     */
    private String status;

    private GetEndpointConnectionPrivateServiceConnection() {}
    /**
     * @return Specifies the Name of the private endpoint.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The private IP address associated with the private endpoint, note that you will have a private IP address assigned to the private endpoint even if the connection request was `Rejected`.
     * 
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * @return Possible values are as follows:
     * Value | Meaning
     * -- | --
     * `Auto-Approved` | The remote resource owner has added you to the `Auto-Approved` RBAC permission list for the remote resource, all private endpoint connection requests will be automatically `Approved`.
     * `Deleted state` | The resource owner has `Rejected` the private endpoint connection request and has removed your private endpoint request from the remote resource.
     * `request/response message` | If you submitted a manual private endpoint connection request, while in the `Pending` status the `request_response` will display the same text from your `request_message` in the `private_service_connection` block above. If the private endpoint connection request was `Rejected` by the owner of the remote resource, the text for the rejection will be displayed as the `request_response` text, if the private endpoint connection request was `Approved` by the owner of the remote resource, the text for the approval will be displayed as the `request_response` text
     * 
     */
    public String requestResponse() {
        return this.requestResponse;
    }
    /**
     * @return The current status of the private endpoint request, possible values will be `Pending`, `Approved`, `Rejected`, or `Disconnected`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointConnectionPrivateServiceConnection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String privateIpAddress;
        private String requestResponse;
        private String status;
        public Builder() {}
        public Builder(GetEndpointConnectionPrivateServiceConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.requestResponse = defaults.requestResponse;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder requestResponse(String requestResponse) {
            this.requestResponse = Objects.requireNonNull(requestResponse);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetEndpointConnectionPrivateServiceConnection build() {
            final var o = new GetEndpointConnectionPrivateServiceConnection();
            o.name = name;
            o.privateIpAddress = privateIpAddress;
            o.requestResponse = requestResponse;
            o.status = status;
            return o;
        }
    }
}
