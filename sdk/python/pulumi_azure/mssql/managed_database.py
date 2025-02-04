# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ManagedDatabaseArgs', 'ManagedDatabase']

@pulumi.input_type
class ManagedDatabaseArgs:
    def __init__(__self__, *,
                 managed_instance_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ManagedDatabase resource.
        :param pulumi.Input[str] managed_instance_id: The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Managed Database to create. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "managed_instance_id", managed_instance_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="managedInstanceId")
    def managed_instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "managed_instance_id")

    @managed_instance_id.setter
    def managed_instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "managed_instance_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Managed Database to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ManagedDatabaseState:
    def __init__(__self__, *,
                 managed_instance_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ManagedDatabase resources.
        :param pulumi.Input[str] managed_instance_id: The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Managed Database to create. Changing this forces a new resource to be created.
        """
        if managed_instance_id is not None:
            pulumi.set(__self__, "managed_instance_id", managed_instance_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="managedInstanceId")
    def managed_instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "managed_instance_id")

    @managed_instance_id.setter
    def managed_instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "managed_instance_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Managed Database to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class ManagedDatabase(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 managed_instance_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an Azure SQL Azure Managed Database for a SQL Managed Instance.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_virtual_network = azure.network.VirtualNetwork("exampleVirtualNetwork",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            address_spaces=["10.0.0.0/16"])
        example_subnet = azure.network.Subnet("exampleSubnet",
            resource_group_name=example_resource_group.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.2.0/24"])
        example_managed_instance = azure.mssql.ManagedInstance("exampleManagedInstance",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            license_type="BasePrice",
            sku_name="GP_Gen5",
            storage_size_in_gb=32,
            subnet_id=example_subnet.id,
            vcores=4,
            administrator_login="msadministrator",
            administrator_login_password="thisIsDog11")
        example_managed_database = azure.mssql.ManagedDatabase("exampleManagedDatabase", managed_instance_id=example_managed_instance.id)
        ```

        ## Import

        SQL Managed Databases can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:mssql/managedDatabase:ManagedDatabase example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/managedInstances/myserver/databases/mydatabase
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] managed_instance_id: The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Managed Database to create. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ManagedDatabaseArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Azure SQL Azure Managed Database for a SQL Managed Instance.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_virtual_network = azure.network.VirtualNetwork("exampleVirtualNetwork",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            address_spaces=["10.0.0.0/16"])
        example_subnet = azure.network.Subnet("exampleSubnet",
            resource_group_name=example_resource_group.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.2.0/24"])
        example_managed_instance = azure.mssql.ManagedInstance("exampleManagedInstance",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            license_type="BasePrice",
            sku_name="GP_Gen5",
            storage_size_in_gb=32,
            subnet_id=example_subnet.id,
            vcores=4,
            administrator_login="msadministrator",
            administrator_login_password="thisIsDog11")
        example_managed_database = azure.mssql.ManagedDatabase("exampleManagedDatabase", managed_instance_id=example_managed_instance.id)
        ```

        ## Import

        SQL Managed Databases can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:mssql/managedDatabase:ManagedDatabase example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/managedInstances/myserver/databases/mydatabase
        ```

        :param str resource_name: The name of the resource.
        :param ManagedDatabaseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ManagedDatabaseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 managed_instance_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ManagedDatabaseArgs.__new__(ManagedDatabaseArgs)

            if managed_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'managed_instance_id'")
            __props__.__dict__["managed_instance_id"] = managed_instance_id
            __props__.__dict__["name"] = name
        super(ManagedDatabase, __self__).__init__(
            'azure:mssql/managedDatabase:ManagedDatabase',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            managed_instance_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'ManagedDatabase':
        """
        Get an existing ManagedDatabase resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] managed_instance_id: The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Managed Database to create. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ManagedDatabaseState.__new__(_ManagedDatabaseState)

        __props__.__dict__["managed_instance_id"] = managed_instance_id
        __props__.__dict__["name"] = name
        return ManagedDatabase(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="managedInstanceId")
    def managed_instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "managed_instance_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Managed Database to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

