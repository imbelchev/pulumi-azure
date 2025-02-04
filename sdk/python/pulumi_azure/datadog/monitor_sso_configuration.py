# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MonitorSsoConfigurationArgs', 'MonitorSsoConfiguration']

@pulumi.input_type
class MonitorSsoConfigurationArgs:
    def __init__(__self__, *,
                 datadog_monitor_id: pulumi.Input[str],
                 enterprise_application_id: pulumi.Input[str],
                 single_sign_on_enabled: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MonitorSsoConfiguration resource.
        :param pulumi.Input[str] datadog_monitor_id: The Datadog Monitor Id which should be used for this Datadog Monitor SSO Configuration. Changing this forces a new Datadog Monitor SSO Configuration to be created.
        :param pulumi.Input[str] enterprise_application_id: The application Id to perform SSO operation.
        :param pulumi.Input[str] single_sign_on_enabled: The state of SingleSignOn configuration.
        :param pulumi.Input[str] name: The name of the SingleSignOn configuration. Defaults to `default`.
        """
        pulumi.set(__self__, "datadog_monitor_id", datadog_monitor_id)
        pulumi.set(__self__, "enterprise_application_id", enterprise_application_id)
        pulumi.set(__self__, "single_sign_on_enabled", single_sign_on_enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="datadogMonitorId")
    def datadog_monitor_id(self) -> pulumi.Input[str]:
        """
        The Datadog Monitor Id which should be used for this Datadog Monitor SSO Configuration. Changing this forces a new Datadog Monitor SSO Configuration to be created.
        """
        return pulumi.get(self, "datadog_monitor_id")

    @datadog_monitor_id.setter
    def datadog_monitor_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "datadog_monitor_id", value)

    @property
    @pulumi.getter(name="enterpriseApplicationId")
    def enterprise_application_id(self) -> pulumi.Input[str]:
        """
        The application Id to perform SSO operation.
        """
        return pulumi.get(self, "enterprise_application_id")

    @enterprise_application_id.setter
    def enterprise_application_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "enterprise_application_id", value)

    @property
    @pulumi.getter(name="singleSignOnEnabled")
    def single_sign_on_enabled(self) -> pulumi.Input[str]:
        """
        The state of SingleSignOn configuration.
        """
        return pulumi.get(self, "single_sign_on_enabled")

    @single_sign_on_enabled.setter
    def single_sign_on_enabled(self, value: pulumi.Input[str]):
        pulumi.set(self, "single_sign_on_enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the SingleSignOn configuration. Defaults to `default`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _MonitorSsoConfigurationState:
    def __init__(__self__, *,
                 datadog_monitor_id: Optional[pulumi.Input[str]] = None,
                 enterprise_application_id: Optional[pulumi.Input[str]] = None,
                 login_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 single_sign_on_enabled: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MonitorSsoConfiguration resources.
        :param pulumi.Input[str] datadog_monitor_id: The Datadog Monitor Id which should be used for this Datadog Monitor SSO Configuration. Changing this forces a new Datadog Monitor SSO Configuration to be created.
        :param pulumi.Input[str] enterprise_application_id: The application Id to perform SSO operation.
        :param pulumi.Input[str] login_url: The SingleSignOn URL to login to Datadog org.
        :param pulumi.Input[str] name: The name of the SingleSignOn configuration. Defaults to `default`.
        :param pulumi.Input[str] single_sign_on_enabled: The state of SingleSignOn configuration.
        """
        if datadog_monitor_id is not None:
            pulumi.set(__self__, "datadog_monitor_id", datadog_monitor_id)
        if enterprise_application_id is not None:
            pulumi.set(__self__, "enterprise_application_id", enterprise_application_id)
        if login_url is not None:
            pulumi.set(__self__, "login_url", login_url)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if single_sign_on_enabled is not None:
            pulumi.set(__self__, "single_sign_on_enabled", single_sign_on_enabled)

    @property
    @pulumi.getter(name="datadogMonitorId")
    def datadog_monitor_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Datadog Monitor Id which should be used for this Datadog Monitor SSO Configuration. Changing this forces a new Datadog Monitor SSO Configuration to be created.
        """
        return pulumi.get(self, "datadog_monitor_id")

    @datadog_monitor_id.setter
    def datadog_monitor_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "datadog_monitor_id", value)

    @property
    @pulumi.getter(name="enterpriseApplicationId")
    def enterprise_application_id(self) -> Optional[pulumi.Input[str]]:
        """
        The application Id to perform SSO operation.
        """
        return pulumi.get(self, "enterprise_application_id")

    @enterprise_application_id.setter
    def enterprise_application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "enterprise_application_id", value)

    @property
    @pulumi.getter(name="loginUrl")
    def login_url(self) -> Optional[pulumi.Input[str]]:
        """
        The SingleSignOn URL to login to Datadog org.
        """
        return pulumi.get(self, "login_url")

    @login_url.setter
    def login_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "login_url", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the SingleSignOn configuration. Defaults to `default`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="singleSignOnEnabled")
    def single_sign_on_enabled(self) -> Optional[pulumi.Input[str]]:
        """
        The state of SingleSignOn configuration.
        """
        return pulumi.get(self, "single_sign_on_enabled")

    @single_sign_on_enabled.setter
    def single_sign_on_enabled(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "single_sign_on_enabled", value)


class MonitorSsoConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 datadog_monitor_id: Optional[pulumi.Input[str]] = None,
                 enterprise_application_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 single_sign_on_enabled: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages SingleSignOn on the datadog Monitor.

        ## Example Usage
        ### Enabling SSO on monitor
        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example", location="West US 2")
        test = azure.datadog.MonitorSsoConfiguration("test",
            datadog_monitor_id=azurerm_datadog_monitor["example"]["id"],
            single_sign_on_enabled="Enable",
            enterprise_application_id="XXXX")
        ```

        ## Import

        SingleSignOn on the Datadog Monitor can be imported using the `signle sign on resource id`, e.g.

        ```sh
         $ pulumi import azure:datadog/monitorSsoConfiguration:MonitorSsoConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Datadog/monitors/monitor1/singleSignOnConfigurations/default
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] datadog_monitor_id: The Datadog Monitor Id which should be used for this Datadog Monitor SSO Configuration. Changing this forces a new Datadog Monitor SSO Configuration to be created.
        :param pulumi.Input[str] enterprise_application_id: The application Id to perform SSO operation.
        :param pulumi.Input[str] name: The name of the SingleSignOn configuration. Defaults to `default`.
        :param pulumi.Input[str] single_sign_on_enabled: The state of SingleSignOn configuration.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MonitorSsoConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages SingleSignOn on the datadog Monitor.

        ## Example Usage
        ### Enabling SSO on monitor
        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example", location="West US 2")
        test = azure.datadog.MonitorSsoConfiguration("test",
            datadog_monitor_id=azurerm_datadog_monitor["example"]["id"],
            single_sign_on_enabled="Enable",
            enterprise_application_id="XXXX")
        ```

        ## Import

        SingleSignOn on the Datadog Monitor can be imported using the `signle sign on resource id`, e.g.

        ```sh
         $ pulumi import azure:datadog/monitorSsoConfiguration:MonitorSsoConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Datadog/monitors/monitor1/singleSignOnConfigurations/default
        ```

        :param str resource_name: The name of the resource.
        :param MonitorSsoConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MonitorSsoConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 datadog_monitor_id: Optional[pulumi.Input[str]] = None,
                 enterprise_application_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 single_sign_on_enabled: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MonitorSsoConfigurationArgs.__new__(MonitorSsoConfigurationArgs)

            if datadog_monitor_id is None and not opts.urn:
                raise TypeError("Missing required property 'datadog_monitor_id'")
            __props__.__dict__["datadog_monitor_id"] = datadog_monitor_id
            if enterprise_application_id is None and not opts.urn:
                raise TypeError("Missing required property 'enterprise_application_id'")
            __props__.__dict__["enterprise_application_id"] = enterprise_application_id
            __props__.__dict__["name"] = name
            if single_sign_on_enabled is None and not opts.urn:
                raise TypeError("Missing required property 'single_sign_on_enabled'")
            __props__.__dict__["single_sign_on_enabled"] = single_sign_on_enabled
            __props__.__dict__["login_url"] = None
        super(MonitorSsoConfiguration, __self__).__init__(
            'azure:datadog/monitorSsoConfiguration:MonitorSsoConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            datadog_monitor_id: Optional[pulumi.Input[str]] = None,
            enterprise_application_id: Optional[pulumi.Input[str]] = None,
            login_url: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            single_sign_on_enabled: Optional[pulumi.Input[str]] = None) -> 'MonitorSsoConfiguration':
        """
        Get an existing MonitorSsoConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] datadog_monitor_id: The Datadog Monitor Id which should be used for this Datadog Monitor SSO Configuration. Changing this forces a new Datadog Monitor SSO Configuration to be created.
        :param pulumi.Input[str] enterprise_application_id: The application Id to perform SSO operation.
        :param pulumi.Input[str] login_url: The SingleSignOn URL to login to Datadog org.
        :param pulumi.Input[str] name: The name of the SingleSignOn configuration. Defaults to `default`.
        :param pulumi.Input[str] single_sign_on_enabled: The state of SingleSignOn configuration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MonitorSsoConfigurationState.__new__(_MonitorSsoConfigurationState)

        __props__.__dict__["datadog_monitor_id"] = datadog_monitor_id
        __props__.__dict__["enterprise_application_id"] = enterprise_application_id
        __props__.__dict__["login_url"] = login_url
        __props__.__dict__["name"] = name
        __props__.__dict__["single_sign_on_enabled"] = single_sign_on_enabled
        return MonitorSsoConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="datadogMonitorId")
    def datadog_monitor_id(self) -> pulumi.Output[str]:
        """
        The Datadog Monitor Id which should be used for this Datadog Monitor SSO Configuration. Changing this forces a new Datadog Monitor SSO Configuration to be created.
        """
        return pulumi.get(self, "datadog_monitor_id")

    @property
    @pulumi.getter(name="enterpriseApplicationId")
    def enterprise_application_id(self) -> pulumi.Output[str]:
        """
        The application Id to perform SSO operation.
        """
        return pulumi.get(self, "enterprise_application_id")

    @property
    @pulumi.getter(name="loginUrl")
    def login_url(self) -> pulumi.Output[str]:
        """
        The SingleSignOn URL to login to Datadog org.
        """
        return pulumi.get(self, "login_url")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the SingleSignOn configuration. Defaults to `default`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="singleSignOnEnabled")
    def single_sign_on_enabled(self) -> pulumi.Output[str]:
        """
        The state of SingleSignOn configuration.
        """
        return pulumi.get(self, "single_sign_on_enabled")

