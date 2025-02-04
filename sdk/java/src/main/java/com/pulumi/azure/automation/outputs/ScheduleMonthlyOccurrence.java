// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScheduleMonthlyOccurrence {
    /**
     * @return Day of the occurrence. Must be one of `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, `Sunday`.
     * 
     */
    private String day;
    /**
     * @return Occurrence of the week within the month. Must be between `1` and `5`. `-1` for last week within the month.
     * 
     */
    private Integer occurrence;

    private ScheduleMonthlyOccurrence() {}
    /**
     * @return Day of the occurrence. Must be one of `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, `Sunday`.
     * 
     */
    public String day() {
        return this.day;
    }
    /**
     * @return Occurrence of the week within the month. Must be between `1` and `5`. `-1` for last week within the month.
     * 
     */
    public Integer occurrence() {
        return this.occurrence;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleMonthlyOccurrence defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String day;
        private Integer occurrence;
        public Builder() {}
        public Builder(ScheduleMonthlyOccurrence defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.occurrence = defaults.occurrence;
        }

        @CustomType.Setter
        public Builder day(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        @CustomType.Setter
        public Builder occurrence(Integer occurrence) {
            this.occurrence = Objects.requireNonNull(occurrence);
            return this;
        }
        public ScheduleMonthlyOccurrence build() {
            final var o = new ScheduleMonthlyOccurrence();
            o.day = day;
            o.occurrence = occurrence;
            return o;
        }
    }
}
