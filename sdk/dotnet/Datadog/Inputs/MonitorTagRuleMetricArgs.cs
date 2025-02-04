// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Datadog.Inputs
{

    public sealed class MonitorTagRuleMetricArgs : global::Pulumi.ResourceArgs
    {
        [Input("filters")]
        private InputList<Inputs.MonitorTagRuleMetricFilterArgs>? _filters;

        /// <summary>
        /// A `filter` block as defined below.
        /// </summary>
        public InputList<Inputs.MonitorTagRuleMetricFilterArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.MonitorTagRuleMetricFilterArgs>());
            set => _filters = value;
        }

        public MonitorTagRuleMetricArgs()
        {
        }
        public static new MonitorTagRuleMetricArgs Empty => new MonitorTagRuleMetricArgs();
    }
}
