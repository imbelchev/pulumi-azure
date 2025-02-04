# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetFrontdoorOriginGroupResult',
    'AwaitableGetFrontdoorOriginGroupResult',
    'get_frontdoor_origin_group',
    'get_frontdoor_origin_group_output',
]

@pulumi.output_type
class GetFrontdoorOriginGroupResult:
    """
    A collection of values returned by getFrontdoorOriginGroup.
    """
    def __init__(__self__, cdn_frontdoor_profile_id=None, health_probes=None, id=None, load_balancings=None, name=None, profile_name=None, resource_group_name=None, restore_traffic_time_to_healed_or_new_endpoint_in_minutes=None, session_affinity_enabled=None):
        if cdn_frontdoor_profile_id and not isinstance(cdn_frontdoor_profile_id, str):
            raise TypeError("Expected argument 'cdn_frontdoor_profile_id' to be a str")
        pulumi.set(__self__, "cdn_frontdoor_profile_id", cdn_frontdoor_profile_id)
        if health_probes and not isinstance(health_probes, list):
            raise TypeError("Expected argument 'health_probes' to be a list")
        pulumi.set(__self__, "health_probes", health_probes)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if load_balancings and not isinstance(load_balancings, list):
            raise TypeError("Expected argument 'load_balancings' to be a list")
        pulumi.set(__self__, "load_balancings", load_balancings)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if profile_name and not isinstance(profile_name, str):
            raise TypeError("Expected argument 'profile_name' to be a str")
        pulumi.set(__self__, "profile_name", profile_name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if restore_traffic_time_to_healed_or_new_endpoint_in_minutes and not isinstance(restore_traffic_time_to_healed_or_new_endpoint_in_minutes, int):
            raise TypeError("Expected argument 'restore_traffic_time_to_healed_or_new_endpoint_in_minutes' to be a int")
        pulumi.set(__self__, "restore_traffic_time_to_healed_or_new_endpoint_in_minutes", restore_traffic_time_to_healed_or_new_endpoint_in_minutes)
        if session_affinity_enabled and not isinstance(session_affinity_enabled, bool):
            raise TypeError("Expected argument 'session_affinity_enabled' to be a bool")
        pulumi.set(__self__, "session_affinity_enabled", session_affinity_enabled)

    @property
    @pulumi.getter(name="cdnFrontdoorProfileId")
    def cdn_frontdoor_profile_id(self) -> str:
        """
        Specifies the ID of the Front Door Profile within which this Front Door Origin Group exists.
        """
        return pulumi.get(self, "cdn_frontdoor_profile_id")

    @property
    @pulumi.getter(name="healthProbes")
    def health_probes(self) -> Sequence['outputs.GetFrontdoorOriginGroupHealthProbeResult']:
        """
        A `health_probe` block as defined below.
        """
        return pulumi.get(self, "health_probes")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="loadBalancings")
    def load_balancings(self) -> Sequence['outputs.GetFrontdoorOriginGroupLoadBalancingResult']:
        """
        A `load_balancing` block as defined below.
        """
        return pulumi.get(self, "load_balancings")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="profileName")
    def profile_name(self) -> str:
        return pulumi.get(self, "profile_name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="restoreTrafficTimeToHealedOrNewEndpointInMinutes")
    def restore_traffic_time_to_healed_or_new_endpoint_in_minutes(self) -> int:
        return pulumi.get(self, "restore_traffic_time_to_healed_or_new_endpoint_in_minutes")

    @property
    @pulumi.getter(name="sessionAffinityEnabled")
    def session_affinity_enabled(self) -> bool:
        """
        Specifies whether session affinity is enabled on this host.
        """
        return pulumi.get(self, "session_affinity_enabled")


class AwaitableGetFrontdoorOriginGroupResult(GetFrontdoorOriginGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFrontdoorOriginGroupResult(
            cdn_frontdoor_profile_id=self.cdn_frontdoor_profile_id,
            health_probes=self.health_probes,
            id=self.id,
            load_balancings=self.load_balancings,
            name=self.name,
            profile_name=self.profile_name,
            resource_group_name=self.resource_group_name,
            restore_traffic_time_to_healed_or_new_endpoint_in_minutes=self.restore_traffic_time_to_healed_or_new_endpoint_in_minutes,
            session_affinity_enabled=self.session_affinity_enabled)


def get_frontdoor_origin_group(name: Optional[str] = None,
                               profile_name: Optional[str] = None,
                               resource_group_name: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFrontdoorOriginGroupResult:
    """
    Use this data source to access information about an existing Front Door (standard/premium) Origin Group.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.cdn.get_frontdoor_origin_group(name="example-origin-group",
        profile_name="example-profile",
        resource_group_name="example-resources")
    ```


    :param str name: Specifies the name of the Front Door Origin Group.
    :param str profile_name: The name of the Front Door Profile within which Front Door Origin Group exists.
    :param str resource_group_name: The name of the Resource Group where the Front Door Profile exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['profileName'] = profile_name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:cdn/getFrontdoorOriginGroup:getFrontdoorOriginGroup', __args__, opts=opts, typ=GetFrontdoorOriginGroupResult).value

    return AwaitableGetFrontdoorOriginGroupResult(
        cdn_frontdoor_profile_id=__ret__.cdn_frontdoor_profile_id,
        health_probes=__ret__.health_probes,
        id=__ret__.id,
        load_balancings=__ret__.load_balancings,
        name=__ret__.name,
        profile_name=__ret__.profile_name,
        resource_group_name=__ret__.resource_group_name,
        restore_traffic_time_to_healed_or_new_endpoint_in_minutes=__ret__.restore_traffic_time_to_healed_or_new_endpoint_in_minutes,
        session_affinity_enabled=__ret__.session_affinity_enabled)


@_utilities.lift_output_func(get_frontdoor_origin_group)
def get_frontdoor_origin_group_output(name: Optional[pulumi.Input[str]] = None,
                                      profile_name: Optional[pulumi.Input[str]] = None,
                                      resource_group_name: Optional[pulumi.Input[str]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFrontdoorOriginGroupResult]:
    """
    Use this data source to access information about an existing Front Door (standard/premium) Origin Group.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.cdn.get_frontdoor_origin_group(name="example-origin-group",
        profile_name="example-profile",
        resource_group_name="example-resources")
    ```


    :param str name: Specifies the name of the Front Door Origin Group.
    :param str profile_name: The name of the Front Door Profile within which Front Door Origin Group exists.
    :param str resource_group_name: The name of the Resource Group where the Front Door Profile exists.
    """
    ...
