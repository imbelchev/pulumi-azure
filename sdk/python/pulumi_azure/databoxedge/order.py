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
from ._inputs import *

__all__ = ['OrderArgs', 'Order']

@pulumi.input_type
class OrderArgs:
    def __init__(__self__, *,
                 contact: pulumi.Input['OrderContactArgs'],
                 device_name: pulumi.Input[str],
                 resource_group_name: pulumi.Input[str],
                 shipment_address: pulumi.Input['OrderShipmentAddressArgs']):
        """
        The set of arguments for constructing a Order resource.
        :param pulumi.Input['OrderContactArgs'] contact: A `contact` block as defined below.
        :param pulumi.Input[str] device_name: The name of the Databox Edge Device this order is for. Changing this forces a new Databox Edge Order to be created.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Databox Edge Order should exist. Changing this forces a new Databox Edge Order to be created.
        :param pulumi.Input['OrderShipmentAddressArgs'] shipment_address: A `shipment_address` block as defined below.
        """
        pulumi.set(__self__, "contact", contact)
        pulumi.set(__self__, "device_name", device_name)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "shipment_address", shipment_address)

    @property
    @pulumi.getter
    def contact(self) -> pulumi.Input['OrderContactArgs']:
        """
        A `contact` block as defined below.
        """
        return pulumi.get(self, "contact")

    @contact.setter
    def contact(self, value: pulumi.Input['OrderContactArgs']):
        pulumi.set(self, "contact", value)

    @property
    @pulumi.getter(name="deviceName")
    def device_name(self) -> pulumi.Input[str]:
        """
        The name of the Databox Edge Device this order is for. Changing this forces a new Databox Edge Order to be created.
        """
        return pulumi.get(self, "device_name")

    @device_name.setter
    def device_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "device_name", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        The name of the Resource Group where the Databox Edge Order should exist. Changing this forces a new Databox Edge Order to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="shipmentAddress")
    def shipment_address(self) -> pulumi.Input['OrderShipmentAddressArgs']:
        """
        A `shipment_address` block as defined below.
        """
        return pulumi.get(self, "shipment_address")

    @shipment_address.setter
    def shipment_address(self, value: pulumi.Input['OrderShipmentAddressArgs']):
        pulumi.set(self, "shipment_address", value)


@pulumi.input_type
class _OrderState:
    def __init__(__self__, *,
                 contact: Optional[pulumi.Input['OrderContactArgs']] = None,
                 device_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 return_trackings: Optional[pulumi.Input[Sequence[pulumi.Input['OrderReturnTrackingArgs']]]] = None,
                 serial_number: Optional[pulumi.Input[str]] = None,
                 shipment_address: Optional[pulumi.Input['OrderShipmentAddressArgs']] = None,
                 shipment_histories: Optional[pulumi.Input[Sequence[pulumi.Input['OrderShipmentHistoryArgs']]]] = None,
                 shipment_trackings: Optional[pulumi.Input[Sequence[pulumi.Input['OrderShipmentTrackingArgs']]]] = None,
                 statuses: Optional[pulumi.Input[Sequence[pulumi.Input['OrderStatusArgs']]]] = None):
        """
        Input properties used for looking up and filtering Order resources.
        :param pulumi.Input['OrderContactArgs'] contact: A `contact` block as defined below.
        :param pulumi.Input[str] device_name: The name of the Databox Edge Device this order is for. Changing this forces a new Databox Edge Order to be created.
        :param pulumi.Input[str] name: The contact person name. Changing this forces a new Databox Edge Order to be created.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Databox Edge Order should exist. Changing this forces a new Databox Edge Order to be created.
        :param pulumi.Input[Sequence[pulumi.Input['OrderReturnTrackingArgs']]] return_trackings: Tracking information for the package returned from the customer whether it has an original or a replacement device. A `return_tracking` block as defined below.
        :param pulumi.Input[str] serial_number: Serial number of the device being tracked.
        :param pulumi.Input['OrderShipmentAddressArgs'] shipment_address: A `shipment_address` block as defined below.
        :param pulumi.Input[Sequence[pulumi.Input['OrderShipmentHistoryArgs']]] shipment_histories: List of status changes in the order. A `shipment_history` block as defined below.
        :param pulumi.Input[Sequence[pulumi.Input['OrderShipmentTrackingArgs']]] shipment_trackings: Tracking information for the package delivered to the customer whether it has an original or a replacement device. A `shipment_tracking` block as defined below.
        :param pulumi.Input[Sequence[pulumi.Input['OrderStatusArgs']]] statuses: The current status of the order. A `status` block as defined below.
        """
        if contact is not None:
            pulumi.set(__self__, "contact", contact)
        if device_name is not None:
            pulumi.set(__self__, "device_name", device_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if return_trackings is not None:
            pulumi.set(__self__, "return_trackings", return_trackings)
        if serial_number is not None:
            pulumi.set(__self__, "serial_number", serial_number)
        if shipment_address is not None:
            pulumi.set(__self__, "shipment_address", shipment_address)
        if shipment_histories is not None:
            pulumi.set(__self__, "shipment_histories", shipment_histories)
        if shipment_trackings is not None:
            pulumi.set(__self__, "shipment_trackings", shipment_trackings)
        if statuses is not None:
            pulumi.set(__self__, "statuses", statuses)

    @property
    @pulumi.getter
    def contact(self) -> Optional[pulumi.Input['OrderContactArgs']]:
        """
        A `contact` block as defined below.
        """
        return pulumi.get(self, "contact")

    @contact.setter
    def contact(self, value: Optional[pulumi.Input['OrderContactArgs']]):
        pulumi.set(self, "contact", value)

    @property
    @pulumi.getter(name="deviceName")
    def device_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Databox Edge Device this order is for. Changing this forces a new Databox Edge Order to be created.
        """
        return pulumi.get(self, "device_name")

    @device_name.setter
    def device_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The contact person name. Changing this forces a new Databox Edge Order to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Resource Group where the Databox Edge Order should exist. Changing this forces a new Databox Edge Order to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="returnTrackings")
    def return_trackings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OrderReturnTrackingArgs']]]]:
        """
        Tracking information for the package returned from the customer whether it has an original or a replacement device. A `return_tracking` block as defined below.
        """
        return pulumi.get(self, "return_trackings")

    @return_trackings.setter
    def return_trackings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OrderReturnTrackingArgs']]]]):
        pulumi.set(self, "return_trackings", value)

    @property
    @pulumi.getter(name="serialNumber")
    def serial_number(self) -> Optional[pulumi.Input[str]]:
        """
        Serial number of the device being tracked.
        """
        return pulumi.get(self, "serial_number")

    @serial_number.setter
    def serial_number(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "serial_number", value)

    @property
    @pulumi.getter(name="shipmentAddress")
    def shipment_address(self) -> Optional[pulumi.Input['OrderShipmentAddressArgs']]:
        """
        A `shipment_address` block as defined below.
        """
        return pulumi.get(self, "shipment_address")

    @shipment_address.setter
    def shipment_address(self, value: Optional[pulumi.Input['OrderShipmentAddressArgs']]):
        pulumi.set(self, "shipment_address", value)

    @property
    @pulumi.getter(name="shipmentHistories")
    def shipment_histories(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OrderShipmentHistoryArgs']]]]:
        """
        List of status changes in the order. A `shipment_history` block as defined below.
        """
        return pulumi.get(self, "shipment_histories")

    @shipment_histories.setter
    def shipment_histories(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OrderShipmentHistoryArgs']]]]):
        pulumi.set(self, "shipment_histories", value)

    @property
    @pulumi.getter(name="shipmentTrackings")
    def shipment_trackings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OrderShipmentTrackingArgs']]]]:
        """
        Tracking information for the package delivered to the customer whether it has an original or a replacement device. A `shipment_tracking` block as defined below.
        """
        return pulumi.get(self, "shipment_trackings")

    @shipment_trackings.setter
    def shipment_trackings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OrderShipmentTrackingArgs']]]]):
        pulumi.set(self, "shipment_trackings", value)

    @property
    @pulumi.getter
    def statuses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OrderStatusArgs']]]]:
        """
        The current status of the order. A `status` block as defined below.
        """
        return pulumi.get(self, "statuses")

    @statuses.setter
    def statuses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OrderStatusArgs']]]]):
        pulumi.set(self, "statuses", value)


class Order(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact: Optional[pulumi.Input[pulumi.InputType['OrderContactArgs']]] = None,
                 device_name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 shipment_address: Optional[pulumi.Input[pulumi.InputType['OrderShipmentAddressArgs']]] = None,
                 __props__=None):
        """
        Manages a Databox Edge Order.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_device = azure.databoxedge.Device("exampleDevice",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            sku_name="EdgeP_Base-Standard")
        example_order = azure.databoxedge.Order("exampleOrder",
            resource_group_name=example_resource_group.name,
            device_name=example_device.name,
            contact=azure.databoxedge.OrderContactArgs(
                name="TerraForm Test",
                emails=["creator4983@FlynnsArcade.com"],
                company_name="Flynn's Arcade",
                phone_number="(800) 555-1234",
            ),
            shipment_address=azure.databoxedge.OrderShipmentAddressArgs(
                addresses=["One Microsoft Way"],
                city="Redmond",
                postal_code="98052",
                state="WA",
                country="United States",
            ))
        ```

        ## Import

        Databox Edge Orders can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:databoxedge/order:Order example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/device1/orders/default
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['OrderContactArgs']] contact: A `contact` block as defined below.
        :param pulumi.Input[str] device_name: The name of the Databox Edge Device this order is for. Changing this forces a new Databox Edge Order to be created.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Databox Edge Order should exist. Changing this forces a new Databox Edge Order to be created.
        :param pulumi.Input[pulumi.InputType['OrderShipmentAddressArgs']] shipment_address: A `shipment_address` block as defined below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Databox Edge Order.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_device = azure.databoxedge.Device("exampleDevice",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            sku_name="EdgeP_Base-Standard")
        example_order = azure.databoxedge.Order("exampleOrder",
            resource_group_name=example_resource_group.name,
            device_name=example_device.name,
            contact=azure.databoxedge.OrderContactArgs(
                name="TerraForm Test",
                emails=["creator4983@FlynnsArcade.com"],
                company_name="Flynn's Arcade",
                phone_number="(800) 555-1234",
            ),
            shipment_address=azure.databoxedge.OrderShipmentAddressArgs(
                addresses=["One Microsoft Way"],
                city="Redmond",
                postal_code="98052",
                state="WA",
                country="United States",
            ))
        ```

        ## Import

        Databox Edge Orders can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:databoxedge/order:Order example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/device1/orders/default
        ```

        :param str resource_name: The name of the resource.
        :param OrderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact: Optional[pulumi.Input[pulumi.InputType['OrderContactArgs']]] = None,
                 device_name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 shipment_address: Optional[pulumi.Input[pulumi.InputType['OrderShipmentAddressArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrderArgs.__new__(OrderArgs)

            if contact is None and not opts.urn:
                raise TypeError("Missing required property 'contact'")
            __props__.__dict__["contact"] = contact
            if device_name is None and not opts.urn:
                raise TypeError("Missing required property 'device_name'")
            __props__.__dict__["device_name"] = device_name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            if shipment_address is None and not opts.urn:
                raise TypeError("Missing required property 'shipment_address'")
            __props__.__dict__["shipment_address"] = shipment_address
            __props__.__dict__["name"] = None
            __props__.__dict__["return_trackings"] = None
            __props__.__dict__["serial_number"] = None
            __props__.__dict__["shipment_histories"] = None
            __props__.__dict__["shipment_trackings"] = None
            __props__.__dict__["statuses"] = None
        super(Order, __self__).__init__(
            'azure:databoxedge/order:Order',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            contact: Optional[pulumi.Input[pulumi.InputType['OrderContactArgs']]] = None,
            device_name: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            return_trackings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OrderReturnTrackingArgs']]]]] = None,
            serial_number: Optional[pulumi.Input[str]] = None,
            shipment_address: Optional[pulumi.Input[pulumi.InputType['OrderShipmentAddressArgs']]] = None,
            shipment_histories: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OrderShipmentHistoryArgs']]]]] = None,
            shipment_trackings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OrderShipmentTrackingArgs']]]]] = None,
            statuses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OrderStatusArgs']]]]] = None) -> 'Order':
        """
        Get an existing Order resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['OrderContactArgs']] contact: A `contact` block as defined below.
        :param pulumi.Input[str] device_name: The name of the Databox Edge Device this order is for. Changing this forces a new Databox Edge Order to be created.
        :param pulumi.Input[str] name: The contact person name. Changing this forces a new Databox Edge Order to be created.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Databox Edge Order should exist. Changing this forces a new Databox Edge Order to be created.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OrderReturnTrackingArgs']]]] return_trackings: Tracking information for the package returned from the customer whether it has an original or a replacement device. A `return_tracking` block as defined below.
        :param pulumi.Input[str] serial_number: Serial number of the device being tracked.
        :param pulumi.Input[pulumi.InputType['OrderShipmentAddressArgs']] shipment_address: A `shipment_address` block as defined below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OrderShipmentHistoryArgs']]]] shipment_histories: List of status changes in the order. A `shipment_history` block as defined below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OrderShipmentTrackingArgs']]]] shipment_trackings: Tracking information for the package delivered to the customer whether it has an original or a replacement device. A `shipment_tracking` block as defined below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OrderStatusArgs']]]] statuses: The current status of the order. A `status` block as defined below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrderState.__new__(_OrderState)

        __props__.__dict__["contact"] = contact
        __props__.__dict__["device_name"] = device_name
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["return_trackings"] = return_trackings
        __props__.__dict__["serial_number"] = serial_number
        __props__.__dict__["shipment_address"] = shipment_address
        __props__.__dict__["shipment_histories"] = shipment_histories
        __props__.__dict__["shipment_trackings"] = shipment_trackings
        __props__.__dict__["statuses"] = statuses
        return Order(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def contact(self) -> pulumi.Output['outputs.OrderContact']:
        """
        A `contact` block as defined below.
        """
        return pulumi.get(self, "contact")

    @property
    @pulumi.getter(name="deviceName")
    def device_name(self) -> pulumi.Output[str]:
        """
        The name of the Databox Edge Device this order is for. Changing this forces a new Databox Edge Order to be created.
        """
        return pulumi.get(self, "device_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The contact person name. Changing this forces a new Databox Edge Order to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        The name of the Resource Group where the Databox Edge Order should exist. Changing this forces a new Databox Edge Order to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="returnTrackings")
    def return_trackings(self) -> pulumi.Output[Sequence['outputs.OrderReturnTracking']]:
        """
        Tracking information for the package returned from the customer whether it has an original or a replacement device. A `return_tracking` block as defined below.
        """
        return pulumi.get(self, "return_trackings")

    @property
    @pulumi.getter(name="serialNumber")
    def serial_number(self) -> pulumi.Output[str]:
        """
        Serial number of the device being tracked.
        """
        return pulumi.get(self, "serial_number")

    @property
    @pulumi.getter(name="shipmentAddress")
    def shipment_address(self) -> pulumi.Output['outputs.OrderShipmentAddress']:
        """
        A `shipment_address` block as defined below.
        """
        return pulumi.get(self, "shipment_address")

    @property
    @pulumi.getter(name="shipmentHistories")
    def shipment_histories(self) -> pulumi.Output[Sequence['outputs.OrderShipmentHistory']]:
        """
        List of status changes in the order. A `shipment_history` block as defined below.
        """
        return pulumi.get(self, "shipment_histories")

    @property
    @pulumi.getter(name="shipmentTrackings")
    def shipment_trackings(self) -> pulumi.Output[Sequence['outputs.OrderShipmentTracking']]:
        """
        Tracking information for the package delivered to the customer whether it has an original or a replacement device. A `shipment_tracking` block as defined below.
        """
        return pulumi.get(self, "shipment_trackings")

    @property
    @pulumi.getter
    def statuses(self) -> pulumi.Output[Sequence['outputs.OrderStatus']]:
        """
        The current status of the order. A `status` block as defined below.
        """
        return pulumi.get(self, "statuses")

