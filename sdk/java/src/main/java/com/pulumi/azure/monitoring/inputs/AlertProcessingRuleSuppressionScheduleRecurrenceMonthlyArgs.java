// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs Empty = new AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs();

    /**
     * Specifies a list of dayOfMonth to recurrence. Possible values are integers between `1` - `31`.
     * 
     */
    @Import(name="daysOfMonths", required=true)
    private Output<List<Integer>> daysOfMonths;

    /**
     * @return Specifies a list of dayOfMonth to recurrence. Possible values are integers between `1` - `31`.
     * 
     */
    public Output<List<Integer>> daysOfMonths() {
        return this.daysOfMonths;
    }

    /**
     * Specifies the recurrence end time (H:M:S).
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return Specifies the recurrence end time (H:M:S).
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * Specifies the recurrence start time (H:M:S).
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Specifies the recurrence start time (H:M:S).
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs() {}

    private AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs(AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs $) {
        this.daysOfMonths = $.daysOfMonths;
        this.endTime = $.endTime;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs $;

        public Builder() {
            $ = new AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs();
        }

        public Builder(AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs defaults) {
            $ = new AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param daysOfMonths Specifies a list of dayOfMonth to recurrence. Possible values are integers between `1` - `31`.
         * 
         * @return builder
         * 
         */
        public Builder daysOfMonths(Output<List<Integer>> daysOfMonths) {
            $.daysOfMonths = daysOfMonths;
            return this;
        }

        /**
         * @param daysOfMonths Specifies a list of dayOfMonth to recurrence. Possible values are integers between `1` - `31`.
         * 
         * @return builder
         * 
         */
        public Builder daysOfMonths(List<Integer> daysOfMonths) {
            return daysOfMonths(Output.of(daysOfMonths));
        }

        /**
         * @param daysOfMonths Specifies a list of dayOfMonth to recurrence. Possible values are integers between `1` - `31`.
         * 
         * @return builder
         * 
         */
        public Builder daysOfMonths(Integer... daysOfMonths) {
            return daysOfMonths(List.of(daysOfMonths));
        }

        /**
         * @param endTime Specifies the recurrence end time (H:M:S).
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime Specifies the recurrence end time (H:M:S).
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param startTime Specifies the recurrence start time (H:M:S).
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Specifies the recurrence start time (H:M:S).
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs build() {
            $.daysOfMonths = Objects.requireNonNull($.daysOfMonths, "expected parameter 'daysOfMonths' to be non-null");
            return $;
        }
    }

}
