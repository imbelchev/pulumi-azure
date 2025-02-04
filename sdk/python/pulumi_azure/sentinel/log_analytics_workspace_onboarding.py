# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['LogAnalyticsWorkspaceOnboardingArgs', 'LogAnalyticsWorkspaceOnboarding']

@pulumi.input_type
class LogAnalyticsWorkspaceOnboardingArgs:
    def __init__(__self__, *,
                 resource_group_name: pulumi.Input[str],
                 workspace_name: pulumi.Input[str],
                 customer_managed_key_enabled: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a LogAnalyticsWorkspaceOnboarding resource.
        :param pulumi.Input[str] resource_group_name: Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
        :param pulumi.Input[str] workspace_name: Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again.
        :param pulumi.Input[bool] customer_managed_key_enabled: Specifies if the Workspace is using Customer managed key. Defaults to `false`.
        """
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "workspace_name", workspace_name)
        if customer_managed_key_enabled is not None:
            pulumi.set(__self__, "customer_managed_key_enabled", customer_managed_key_enabled)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="workspaceName")
    def workspace_name(self) -> pulumi.Input[str]:
        """
        Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again.
        """
        return pulumi.get(self, "workspace_name")

    @workspace_name.setter
    def workspace_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "workspace_name", value)

    @property
    @pulumi.getter(name="customerManagedKeyEnabled")
    def customer_managed_key_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies if the Workspace is using Customer managed key. Defaults to `false`.
        """
        return pulumi.get(self, "customer_managed_key_enabled")

    @customer_managed_key_enabled.setter
    def customer_managed_key_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "customer_managed_key_enabled", value)


@pulumi.input_type
class _LogAnalyticsWorkspaceOnboardingState:
    def __init__(__self__, *,
                 customer_managed_key_enabled: Optional[pulumi.Input[bool]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 workspace_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LogAnalyticsWorkspaceOnboarding resources.
        :param pulumi.Input[bool] customer_managed_key_enabled: Specifies if the Workspace is using Customer managed key. Defaults to `false`.
        :param pulumi.Input[str] resource_group_name: Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
        :param pulumi.Input[str] workspace_name: Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again.
        """
        if customer_managed_key_enabled is not None:
            pulumi.set(__self__, "customer_managed_key_enabled", customer_managed_key_enabled)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if workspace_name is not None:
            pulumi.set(__self__, "workspace_name", workspace_name)

    @property
    @pulumi.getter(name="customerManagedKeyEnabled")
    def customer_managed_key_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies if the Workspace is using Customer managed key. Defaults to `false`.
        """
        return pulumi.get(self, "customer_managed_key_enabled")

    @customer_managed_key_enabled.setter
    def customer_managed_key_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "customer_managed_key_enabled", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="workspaceName")
    def workspace_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again.
        """
        return pulumi.get(self, "workspace_name")

    @workspace_name.setter
    def workspace_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workspace_name", value)


class LogAnalyticsWorkspaceOnboarding(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 customer_managed_key_enabled: Optional[pulumi.Input[bool]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 workspace_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Security Insights Sentinel Onboarding.

        ## Import

        Security Insights Sentinel Onboarding States can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:sentinel/logAnalyticsWorkspaceOnboarding:LogAnalyticsWorkspaceOnboarding example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/onboardingStates/defaults
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] customer_managed_key_enabled: Specifies if the Workspace is using Customer managed key. Defaults to `false`.
        :param pulumi.Input[str] resource_group_name: Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
        :param pulumi.Input[str] workspace_name: Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LogAnalyticsWorkspaceOnboardingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Security Insights Sentinel Onboarding.

        ## Import

        Security Insights Sentinel Onboarding States can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:sentinel/logAnalyticsWorkspaceOnboarding:LogAnalyticsWorkspaceOnboarding example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/onboardingStates/defaults
        ```

        :param str resource_name: The name of the resource.
        :param LogAnalyticsWorkspaceOnboardingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LogAnalyticsWorkspaceOnboardingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 customer_managed_key_enabled: Optional[pulumi.Input[bool]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 workspace_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LogAnalyticsWorkspaceOnboardingArgs.__new__(LogAnalyticsWorkspaceOnboardingArgs)

            __props__.__dict__["customer_managed_key_enabled"] = customer_managed_key_enabled
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            if workspace_name is None and not opts.urn:
                raise TypeError("Missing required property 'workspace_name'")
            __props__.__dict__["workspace_name"] = workspace_name
        super(LogAnalyticsWorkspaceOnboarding, __self__).__init__(
            'azure:sentinel/logAnalyticsWorkspaceOnboarding:LogAnalyticsWorkspaceOnboarding',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            customer_managed_key_enabled: Optional[pulumi.Input[bool]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            workspace_name: Optional[pulumi.Input[str]] = None) -> 'LogAnalyticsWorkspaceOnboarding':
        """
        Get an existing LogAnalyticsWorkspaceOnboarding resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] customer_managed_key_enabled: Specifies if the Workspace is using Customer managed key. Defaults to `false`.
        :param pulumi.Input[str] resource_group_name: Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
        :param pulumi.Input[str] workspace_name: Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LogAnalyticsWorkspaceOnboardingState.__new__(_LogAnalyticsWorkspaceOnboardingState)

        __props__.__dict__["customer_managed_key_enabled"] = customer_managed_key_enabled
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["workspace_name"] = workspace_name
        return LogAnalyticsWorkspaceOnboarding(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="customerManagedKeyEnabled")
    def customer_managed_key_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies if the Workspace is using Customer managed key. Defaults to `false`.
        """
        return pulumi.get(self, "customer_managed_key_enabled")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="workspaceName")
    def workspace_name(self) -> pulumi.Output[str]:
        """
        Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again.
        """
        return pulumi.get(self, "workspace_name")

