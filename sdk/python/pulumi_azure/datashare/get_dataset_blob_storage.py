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
    'GetDatasetBlobStorageResult',
    'AwaitableGetDatasetBlobStorageResult',
    'get_dataset_blob_storage',
    'get_dataset_blob_storage_output',
]

@pulumi.output_type
class GetDatasetBlobStorageResult:
    """
    A collection of values returned by getDatasetBlobStorage.
    """
    def __init__(__self__, container_name=None, data_share_id=None, display_name=None, file_path=None, folder_path=None, id=None, name=None, storage_accounts=None):
        if container_name and not isinstance(container_name, str):
            raise TypeError("Expected argument 'container_name' to be a str")
        pulumi.set(__self__, "container_name", container_name)
        if data_share_id and not isinstance(data_share_id, str):
            raise TypeError("Expected argument 'data_share_id' to be a str")
        pulumi.set(__self__, "data_share_id", data_share_id)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if file_path and not isinstance(file_path, str):
            raise TypeError("Expected argument 'file_path' to be a str")
        pulumi.set(__self__, "file_path", file_path)
        if folder_path and not isinstance(folder_path, str):
            raise TypeError("Expected argument 'folder_path' to be a str")
        pulumi.set(__self__, "folder_path", folder_path)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if storage_accounts and not isinstance(storage_accounts, list):
            raise TypeError("Expected argument 'storage_accounts' to be a list")
        pulumi.set(__self__, "storage_accounts", storage_accounts)

    @property
    @pulumi.getter(name="containerName")
    def container_name(self) -> str:
        """
        The name of the storage account container to be shared with the receiver.
        """
        return pulumi.get(self, "container_name")

    @property
    @pulumi.getter(name="dataShareId")
    def data_share_id(self) -> str:
        return pulumi.get(self, "data_share_id")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        The name of the Data Share Dataset.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="filePath")
    def file_path(self) -> str:
        """
        The path of the file in the storage container to be shared with the receiver.
        """
        return pulumi.get(self, "file_path")

    @property
    @pulumi.getter(name="folderPath")
    def folder_path(self) -> str:
        """
        The folder path of the file in the storage container to be shared with the receiver.
        """
        return pulumi.get(self, "folder_path")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the storage account to be shared with the receiver.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="storageAccounts")
    def storage_accounts(self) -> Sequence['outputs.GetDatasetBlobStorageStorageAccountResult']:
        """
        A `storage_account` block as defined below.
        """
        return pulumi.get(self, "storage_accounts")


class AwaitableGetDatasetBlobStorageResult(GetDatasetBlobStorageResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatasetBlobStorageResult(
            container_name=self.container_name,
            data_share_id=self.data_share_id,
            display_name=self.display_name,
            file_path=self.file_path,
            folder_path=self.folder_path,
            id=self.id,
            name=self.name,
            storage_accounts=self.storage_accounts)


def get_dataset_blob_storage(data_share_id: Optional[str] = None,
                             name: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatasetBlobStorageResult:
    """
    Use this data source to access information about an existing Data Share Blob Storage Dataset.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.datashare.get_dataset_blob_storage(name="example-dsbsds",
        data_share_id="example-share-id")
    pulumi.export("id", example.id)
    ```


    :param str data_share_id: The ID of the Data Share in which this Data Share Blob Storage Dataset should be created.
    :param str name: The name of this Data Share Blob Storage Dataset.
    """
    __args__ = dict()
    __args__['dataShareId'] = data_share_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:datashare/getDatasetBlobStorage:getDatasetBlobStorage', __args__, opts=opts, typ=GetDatasetBlobStorageResult).value

    return AwaitableGetDatasetBlobStorageResult(
        container_name=__ret__.container_name,
        data_share_id=__ret__.data_share_id,
        display_name=__ret__.display_name,
        file_path=__ret__.file_path,
        folder_path=__ret__.folder_path,
        id=__ret__.id,
        name=__ret__.name,
        storage_accounts=__ret__.storage_accounts)


@_utilities.lift_output_func(get_dataset_blob_storage)
def get_dataset_blob_storage_output(data_share_id: Optional[pulumi.Input[str]] = None,
                                    name: Optional[pulumi.Input[str]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDatasetBlobStorageResult]:
    """
    Use this data source to access information about an existing Data Share Blob Storage Dataset.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.datashare.get_dataset_blob_storage(name="example-dsbsds",
        data_share_id="example-share-id")
    pulumi.export("id", example.id)
    ```


    :param str data_share_id: The ID of the Data Share in which this Data Share Blob Storage Dataset should be created.
    :param str name: The name of this Data Share Blob Storage Dataset.
    """
    ...
