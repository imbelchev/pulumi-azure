// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AccountArgs, AccountState } from "./account";
export type Account = import("./account").Account;
export const Account: typeof import("./account").Account = null as any;
utilities.lazyLoad(exports, ["Account"], () => require("./account"));

export { GetAccountArgs, GetAccountResult, GetAccountOutputArgs } from "./getAccount";
export const getAccount: typeof import("./getAccount").getAccount = null as any;
export const getAccountOutput: typeof import("./getAccount").getAccountOutput = null as any;
utilities.lazyLoad(exports, ["getAccount","getAccountOutput"], () => require("./getAccount"));

export { GetPoolArgs, GetPoolResult, GetPoolOutputArgs } from "./getPool";
export const getPool: typeof import("./getPool").getPool = null as any;
export const getPoolOutput: typeof import("./getPool").getPoolOutput = null as any;
utilities.lazyLoad(exports, ["getPool","getPoolOutput"], () => require("./getPool"));

export { GetSnapshotArgs, GetSnapshotResult, GetSnapshotOutputArgs } from "./getSnapshot";
export const getSnapshot: typeof import("./getSnapshot").getSnapshot = null as any;
export const getSnapshotOutput: typeof import("./getSnapshot").getSnapshotOutput = null as any;
utilities.lazyLoad(exports, ["getSnapshot","getSnapshotOutput"], () => require("./getSnapshot"));

export { GetSnapshotPolicyArgs, GetSnapshotPolicyResult, GetSnapshotPolicyOutputArgs } from "./getSnapshotPolicy";
export const getSnapshotPolicy: typeof import("./getSnapshotPolicy").getSnapshotPolicy = null as any;
export const getSnapshotPolicyOutput: typeof import("./getSnapshotPolicy").getSnapshotPolicyOutput = null as any;
utilities.lazyLoad(exports, ["getSnapshotPolicy","getSnapshotPolicyOutput"], () => require("./getSnapshotPolicy"));

export { GetVolumeArgs, GetVolumeResult, GetVolumeOutputArgs } from "./getVolume";
export const getVolume: typeof import("./getVolume").getVolume = null as any;
export const getVolumeOutput: typeof import("./getVolume").getVolumeOutput = null as any;
utilities.lazyLoad(exports, ["getVolume","getVolumeOutput"], () => require("./getVolume"));

export { PoolArgs, PoolState } from "./pool";
export type Pool = import("./pool").Pool;
export const Pool: typeof import("./pool").Pool = null as any;
utilities.lazyLoad(exports, ["Pool"], () => require("./pool"));

export { SnapshotArgs, SnapshotState } from "./snapshot";
export type Snapshot = import("./snapshot").Snapshot;
export const Snapshot: typeof import("./snapshot").Snapshot = null as any;
utilities.lazyLoad(exports, ["Snapshot"], () => require("./snapshot"));

export { SnapshotPolicyArgs, SnapshotPolicyState } from "./snapshotPolicy";
export type SnapshotPolicy = import("./snapshotPolicy").SnapshotPolicy;
export const SnapshotPolicy: typeof import("./snapshotPolicy").SnapshotPolicy = null as any;
utilities.lazyLoad(exports, ["SnapshotPolicy"], () => require("./snapshotPolicy"));

export { VolumeArgs, VolumeState } from "./volume";
export type Volume = import("./volume").Volume;
export const Volume: typeof import("./volume").Volume = null as any;
utilities.lazyLoad(exports, ["Volume"], () => require("./volume"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:netapp/account:Account":
                return new Account(name, <any>undefined, { urn })
            case "azure:netapp/pool:Pool":
                return new Pool(name, <any>undefined, { urn })
            case "azure:netapp/snapshot:Snapshot":
                return new Snapshot(name, <any>undefined, { urn })
            case "azure:netapp/snapshotPolicy:SnapshotPolicy":
                return new SnapshotPolicy(name, <any>undefined, { urn })
            case "azure:netapp/volume:Volume":
                return new Volume(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "netapp/account", _module)
pulumi.runtime.registerResourceModule("azure", "netapp/pool", _module)
pulumi.runtime.registerResourceModule("azure", "netapp/snapshot", _module)
pulumi.runtime.registerResourceModule("azure", "netapp/snapshotPolicy", _module)
pulumi.runtime.registerResourceModule("azure", "netapp/volume", _module)
