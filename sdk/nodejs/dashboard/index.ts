// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { Azurerm_portal_dashboardArgs, Azurerm_portal_dashboardResult, Azurerm_portal_dashboardOutputArgs } from "./azurerm_portal_dashboard";
export const azurerm_portal_dashboard: typeof import("./azurerm_portal_dashboard").azurerm_portal_dashboard = null as any;
export const azurerm_portal_dashboardOutput: typeof import("./azurerm_portal_dashboard").azurerm_portal_dashboardOutput = null as any;
utilities.lazyLoad(exports, ["azurerm_portal_dashboard","azurerm_portal_dashboardOutput"], () => require("./azurerm_portal_dashboard"));

export { DashboardArgs, DashboardState } from "./dashboard";
export type Dashboard = import("./dashboard").Dashboard;
export const Dashboard: typeof import("./dashboard").Dashboard = null as any;
utilities.lazyLoad(exports, ["Dashboard"], () => require("./dashboard"));

export { GrafanaArgs, GrafanaState } from "./grafana";
export type Grafana = import("./grafana").Grafana;
export const Grafana: typeof import("./grafana").Grafana = null as any;
utilities.lazyLoad(exports, ["Grafana"], () => require("./grafana"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:dashboard/dashboard:Dashboard":
                return new Dashboard(name, <any>undefined, { urn })
            case "azure:dashboard/grafana:Grafana":
                return new Grafana(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "dashboard/dashboard", _module)
pulumi.runtime.registerResourceModule("azure", "dashboard/grafana", _module)
