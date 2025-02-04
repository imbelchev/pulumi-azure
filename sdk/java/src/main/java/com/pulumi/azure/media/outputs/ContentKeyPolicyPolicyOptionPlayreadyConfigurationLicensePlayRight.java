// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight {
    /**
     * @return Configures Automatic Gain Control (AGC) and Color Stripe in the license. Must be between 0 and 3 inclusive.
     * 
     */
    private @Nullable Integer agcAndColorStripeRestriction;
    /**
     * @return Configures Unknown output handling settings of the license. Supported values are `Allowed`, `AllowedWithVideoConstriction` or `NotAllowed`.
     * 
     */
    private @Nullable String allowPassingVideoContentToUnknownOutput;
    /**
     * @return Specifies the output protection level for compressed digital audio. Supported values are 100, 150 or 200.
     * 
     */
    private @Nullable Integer analogVideoOpl;
    /**
     * @return Specifies the output protection level for compressed digital audio.Supported values are 100, 150 or 200.
     * 
     */
    private @Nullable Integer compressedDigitalAudioOpl;
    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    private @Nullable Boolean digitalVideoOnlyContentRestriction;
    /**
     * @return The amount of time that the license is valid after the license is first used to play content.
     * 
     */
    private @Nullable String firstPlayExpiration;
    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    private @Nullable Boolean imageConstraintForAnalogComponentVideoRestriction;
    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    private @Nullable Boolean imageConstraintForAnalogComputerMonitorRestriction;
    /**
     * @return Configures the Serial Copy Management System (SCMS) in the license. Must be between 0 and 3 inclusive.
     * 
     */
    private @Nullable Integer scmsRestriction;
    /**
     * @return Specifies the output protection level for uncompressed digital audio. Supported values are 100, 150, 250 or 300.
     * 
     */
    private @Nullable Integer uncompressedDigitalAudioOpl;
    /**
     * @return Specifies the output protection level for uncompressed digital video. Supported values are 100, 150, 250 or 300.
     * 
     */
    private @Nullable Integer uncompressedDigitalVideoOpl;

    private ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight() {}
    /**
     * @return Configures Automatic Gain Control (AGC) and Color Stripe in the license. Must be between 0 and 3 inclusive.
     * 
     */
    public Optional<Integer> agcAndColorStripeRestriction() {
        return Optional.ofNullable(this.agcAndColorStripeRestriction);
    }
    /**
     * @return Configures Unknown output handling settings of the license. Supported values are `Allowed`, `AllowedWithVideoConstriction` or `NotAllowed`.
     * 
     */
    public Optional<String> allowPassingVideoContentToUnknownOutput() {
        return Optional.ofNullable(this.allowPassingVideoContentToUnknownOutput);
    }
    /**
     * @return Specifies the output protection level for compressed digital audio. Supported values are 100, 150 or 200.
     * 
     */
    public Optional<Integer> analogVideoOpl() {
        return Optional.ofNullable(this.analogVideoOpl);
    }
    /**
     * @return Specifies the output protection level for compressed digital audio.Supported values are 100, 150 or 200.
     * 
     */
    public Optional<Integer> compressedDigitalAudioOpl() {
        return Optional.ofNullable(this.compressedDigitalAudioOpl);
    }
    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    public Optional<Boolean> digitalVideoOnlyContentRestriction() {
        return Optional.ofNullable(this.digitalVideoOnlyContentRestriction);
    }
    /**
     * @return The amount of time that the license is valid after the license is first used to play content.
     * 
     */
    public Optional<String> firstPlayExpiration() {
        return Optional.ofNullable(this.firstPlayExpiration);
    }
    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    public Optional<Boolean> imageConstraintForAnalogComponentVideoRestriction() {
        return Optional.ofNullable(this.imageConstraintForAnalogComponentVideoRestriction);
    }
    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    public Optional<Boolean> imageConstraintForAnalogComputerMonitorRestriction() {
        return Optional.ofNullable(this.imageConstraintForAnalogComputerMonitorRestriction);
    }
    /**
     * @return Configures the Serial Copy Management System (SCMS) in the license. Must be between 0 and 3 inclusive.
     * 
     */
    public Optional<Integer> scmsRestriction() {
        return Optional.ofNullable(this.scmsRestriction);
    }
    /**
     * @return Specifies the output protection level for uncompressed digital audio. Supported values are 100, 150, 250 or 300.
     * 
     */
    public Optional<Integer> uncompressedDigitalAudioOpl() {
        return Optional.ofNullable(this.uncompressedDigitalAudioOpl);
    }
    /**
     * @return Specifies the output protection level for uncompressed digital video. Supported values are 100, 150, 250 or 300.
     * 
     */
    public Optional<Integer> uncompressedDigitalVideoOpl() {
        return Optional.ofNullable(this.uncompressedDigitalVideoOpl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer agcAndColorStripeRestriction;
        private @Nullable String allowPassingVideoContentToUnknownOutput;
        private @Nullable Integer analogVideoOpl;
        private @Nullable Integer compressedDigitalAudioOpl;
        private @Nullable Boolean digitalVideoOnlyContentRestriction;
        private @Nullable String firstPlayExpiration;
        private @Nullable Boolean imageConstraintForAnalogComponentVideoRestriction;
        private @Nullable Boolean imageConstraintForAnalogComputerMonitorRestriction;
        private @Nullable Integer scmsRestriction;
        private @Nullable Integer uncompressedDigitalAudioOpl;
        private @Nullable Integer uncompressedDigitalVideoOpl;
        public Builder() {}
        public Builder(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agcAndColorStripeRestriction = defaults.agcAndColorStripeRestriction;
    	      this.allowPassingVideoContentToUnknownOutput = defaults.allowPassingVideoContentToUnknownOutput;
    	      this.analogVideoOpl = defaults.analogVideoOpl;
    	      this.compressedDigitalAudioOpl = defaults.compressedDigitalAudioOpl;
    	      this.digitalVideoOnlyContentRestriction = defaults.digitalVideoOnlyContentRestriction;
    	      this.firstPlayExpiration = defaults.firstPlayExpiration;
    	      this.imageConstraintForAnalogComponentVideoRestriction = defaults.imageConstraintForAnalogComponentVideoRestriction;
    	      this.imageConstraintForAnalogComputerMonitorRestriction = defaults.imageConstraintForAnalogComputerMonitorRestriction;
    	      this.scmsRestriction = defaults.scmsRestriction;
    	      this.uncompressedDigitalAudioOpl = defaults.uncompressedDigitalAudioOpl;
    	      this.uncompressedDigitalVideoOpl = defaults.uncompressedDigitalVideoOpl;
        }

        @CustomType.Setter
        public Builder agcAndColorStripeRestriction(@Nullable Integer agcAndColorStripeRestriction) {
            this.agcAndColorStripeRestriction = agcAndColorStripeRestriction;
            return this;
        }
        @CustomType.Setter
        public Builder allowPassingVideoContentToUnknownOutput(@Nullable String allowPassingVideoContentToUnknownOutput) {
            this.allowPassingVideoContentToUnknownOutput = allowPassingVideoContentToUnknownOutput;
            return this;
        }
        @CustomType.Setter
        public Builder analogVideoOpl(@Nullable Integer analogVideoOpl) {
            this.analogVideoOpl = analogVideoOpl;
            return this;
        }
        @CustomType.Setter
        public Builder compressedDigitalAudioOpl(@Nullable Integer compressedDigitalAudioOpl) {
            this.compressedDigitalAudioOpl = compressedDigitalAudioOpl;
            return this;
        }
        @CustomType.Setter
        public Builder digitalVideoOnlyContentRestriction(@Nullable Boolean digitalVideoOnlyContentRestriction) {
            this.digitalVideoOnlyContentRestriction = digitalVideoOnlyContentRestriction;
            return this;
        }
        @CustomType.Setter
        public Builder firstPlayExpiration(@Nullable String firstPlayExpiration) {
            this.firstPlayExpiration = firstPlayExpiration;
            return this;
        }
        @CustomType.Setter
        public Builder imageConstraintForAnalogComponentVideoRestriction(@Nullable Boolean imageConstraintForAnalogComponentVideoRestriction) {
            this.imageConstraintForAnalogComponentVideoRestriction = imageConstraintForAnalogComponentVideoRestriction;
            return this;
        }
        @CustomType.Setter
        public Builder imageConstraintForAnalogComputerMonitorRestriction(@Nullable Boolean imageConstraintForAnalogComputerMonitorRestriction) {
            this.imageConstraintForAnalogComputerMonitorRestriction = imageConstraintForAnalogComputerMonitorRestriction;
            return this;
        }
        @CustomType.Setter
        public Builder scmsRestriction(@Nullable Integer scmsRestriction) {
            this.scmsRestriction = scmsRestriction;
            return this;
        }
        @CustomType.Setter
        public Builder uncompressedDigitalAudioOpl(@Nullable Integer uncompressedDigitalAudioOpl) {
            this.uncompressedDigitalAudioOpl = uncompressedDigitalAudioOpl;
            return this;
        }
        @CustomType.Setter
        public Builder uncompressedDigitalVideoOpl(@Nullable Integer uncompressedDigitalVideoOpl) {
            this.uncompressedDigitalVideoOpl = uncompressedDigitalVideoOpl;
            return this;
        }
        public ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight build() {
            final var o = new ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight();
            o.agcAndColorStripeRestriction = agcAndColorStripeRestriction;
            o.allowPassingVideoContentToUnknownOutput = allowPassingVideoContentToUnknownOutput;
            o.analogVideoOpl = analogVideoOpl;
            o.compressedDigitalAudioOpl = compressedDigitalAudioOpl;
            o.digitalVideoOnlyContentRestriction = digitalVideoOnlyContentRestriction;
            o.firstPlayExpiration = firstPlayExpiration;
            o.imageConstraintForAnalogComponentVideoRestriction = imageConstraintForAnalogComponentVideoRestriction;
            o.imageConstraintForAnalogComputerMonitorRestriction = imageConstraintForAnalogComputerMonitorRestriction;
            o.scmsRestriction = scmsRestriction;
            o.uncompressedDigitalAudioOpl = uncompressedDigitalAudioOpl;
            o.uncompressedDigitalVideoOpl = uncompressedDigitalVideoOpl;
            return o;
        }
    }
}
