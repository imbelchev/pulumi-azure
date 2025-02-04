// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fluidrelay

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type ServerIdentity struct {
	// Specifies a list of User Assigned Managed Identity IDs to be assigned to this Fluid Relay Service.
	IdentityIds []string `pulumi:"identityIds"`
	// The Principal ID for the Service Principal associated with the Identity of this Fluid Relay Server.
	PrincipalId *string `pulumi:"principalId"`
	// The Tenant ID for the Service Principal associated with the Identity of this Fluid Relay Server.
	TenantId *string `pulumi:"tenantId"`
	// Specifies the type of Managed Service Identity that should be configured on this Fluid Relay Service. Possible values are `SystemAssigned`,`UserAssigned` and `SystemAssigned, UserAssigned`.
	Type string `pulumi:"type"`
}

// ServerIdentityInput is an input type that accepts ServerIdentityArgs and ServerIdentityOutput values.
// You can construct a concrete instance of `ServerIdentityInput` via:
//
//	ServerIdentityArgs{...}
type ServerIdentityInput interface {
	pulumi.Input

	ToServerIdentityOutput() ServerIdentityOutput
	ToServerIdentityOutputWithContext(context.Context) ServerIdentityOutput
}

type ServerIdentityArgs struct {
	// Specifies a list of User Assigned Managed Identity IDs to be assigned to this Fluid Relay Service.
	IdentityIds pulumi.StringArrayInput `pulumi:"identityIds"`
	// The Principal ID for the Service Principal associated with the Identity of this Fluid Relay Server.
	PrincipalId pulumi.StringPtrInput `pulumi:"principalId"`
	// The Tenant ID for the Service Principal associated with the Identity of this Fluid Relay Server.
	TenantId pulumi.StringPtrInput `pulumi:"tenantId"`
	// Specifies the type of Managed Service Identity that should be configured on this Fluid Relay Service. Possible values are `SystemAssigned`,`UserAssigned` and `SystemAssigned, UserAssigned`.
	Type pulumi.StringInput `pulumi:"type"`
}

func (ServerIdentityArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ServerIdentity)(nil)).Elem()
}

func (i ServerIdentityArgs) ToServerIdentityOutput() ServerIdentityOutput {
	return i.ToServerIdentityOutputWithContext(context.Background())
}

func (i ServerIdentityArgs) ToServerIdentityOutputWithContext(ctx context.Context) ServerIdentityOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerIdentityOutput)
}

func (i ServerIdentityArgs) ToServerIdentityPtrOutput() ServerIdentityPtrOutput {
	return i.ToServerIdentityPtrOutputWithContext(context.Background())
}

func (i ServerIdentityArgs) ToServerIdentityPtrOutputWithContext(ctx context.Context) ServerIdentityPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerIdentityOutput).ToServerIdentityPtrOutputWithContext(ctx)
}

// ServerIdentityPtrInput is an input type that accepts ServerIdentityArgs, ServerIdentityPtr and ServerIdentityPtrOutput values.
// You can construct a concrete instance of `ServerIdentityPtrInput` via:
//
//	        ServerIdentityArgs{...}
//
//	or:
//
//	        nil
type ServerIdentityPtrInput interface {
	pulumi.Input

	ToServerIdentityPtrOutput() ServerIdentityPtrOutput
	ToServerIdentityPtrOutputWithContext(context.Context) ServerIdentityPtrOutput
}

type serverIdentityPtrType ServerIdentityArgs

func ServerIdentityPtr(v *ServerIdentityArgs) ServerIdentityPtrInput {
	return (*serverIdentityPtrType)(v)
}

func (*serverIdentityPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerIdentity)(nil)).Elem()
}

func (i *serverIdentityPtrType) ToServerIdentityPtrOutput() ServerIdentityPtrOutput {
	return i.ToServerIdentityPtrOutputWithContext(context.Background())
}

func (i *serverIdentityPtrType) ToServerIdentityPtrOutputWithContext(ctx context.Context) ServerIdentityPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerIdentityPtrOutput)
}

type ServerIdentityOutput struct{ *pulumi.OutputState }

func (ServerIdentityOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ServerIdentity)(nil)).Elem()
}

func (o ServerIdentityOutput) ToServerIdentityOutput() ServerIdentityOutput {
	return o
}

func (o ServerIdentityOutput) ToServerIdentityOutputWithContext(ctx context.Context) ServerIdentityOutput {
	return o
}

func (o ServerIdentityOutput) ToServerIdentityPtrOutput() ServerIdentityPtrOutput {
	return o.ToServerIdentityPtrOutputWithContext(context.Background())
}

func (o ServerIdentityOutput) ToServerIdentityPtrOutputWithContext(ctx context.Context) ServerIdentityPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ServerIdentity) *ServerIdentity {
		return &v
	}).(ServerIdentityPtrOutput)
}

// Specifies a list of User Assigned Managed Identity IDs to be assigned to this Fluid Relay Service.
func (o ServerIdentityOutput) IdentityIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v ServerIdentity) []string { return v.IdentityIds }).(pulumi.StringArrayOutput)
}

// The Principal ID for the Service Principal associated with the Identity of this Fluid Relay Server.
func (o ServerIdentityOutput) PrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ServerIdentity) *string { return v.PrincipalId }).(pulumi.StringPtrOutput)
}

// The Tenant ID for the Service Principal associated with the Identity of this Fluid Relay Server.
func (o ServerIdentityOutput) TenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ServerIdentity) *string { return v.TenantId }).(pulumi.StringPtrOutput)
}

// Specifies the type of Managed Service Identity that should be configured on this Fluid Relay Service. Possible values are `SystemAssigned`,`UserAssigned` and `SystemAssigned, UserAssigned`.
func (o ServerIdentityOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v ServerIdentity) string { return v.Type }).(pulumi.StringOutput)
}

type ServerIdentityPtrOutput struct{ *pulumi.OutputState }

func (ServerIdentityPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerIdentity)(nil)).Elem()
}

func (o ServerIdentityPtrOutput) ToServerIdentityPtrOutput() ServerIdentityPtrOutput {
	return o
}

func (o ServerIdentityPtrOutput) ToServerIdentityPtrOutputWithContext(ctx context.Context) ServerIdentityPtrOutput {
	return o
}

func (o ServerIdentityPtrOutput) Elem() ServerIdentityOutput {
	return o.ApplyT(func(v *ServerIdentity) ServerIdentity {
		if v != nil {
			return *v
		}
		var ret ServerIdentity
		return ret
	}).(ServerIdentityOutput)
}

// Specifies a list of User Assigned Managed Identity IDs to be assigned to this Fluid Relay Service.
func (o ServerIdentityPtrOutput) IdentityIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServerIdentity) []string {
		if v == nil {
			return nil
		}
		return v.IdentityIds
	}).(pulumi.StringArrayOutput)
}

// The Principal ID for the Service Principal associated with the Identity of this Fluid Relay Server.
func (o ServerIdentityPtrOutput) PrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerIdentity) *string {
		if v == nil {
			return nil
		}
		return v.PrincipalId
	}).(pulumi.StringPtrOutput)
}

// The Tenant ID for the Service Principal associated with the Identity of this Fluid Relay Server.
func (o ServerIdentityPtrOutput) TenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerIdentity) *string {
		if v == nil {
			return nil
		}
		return v.TenantId
	}).(pulumi.StringPtrOutput)
}

// Specifies the type of Managed Service Identity that should be configured on this Fluid Relay Service. Possible values are `SystemAssigned`,`UserAssigned` and `SystemAssigned, UserAssigned`.
func (o ServerIdentityPtrOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerIdentity) *string {
		if v == nil {
			return nil
		}
		return &v.Type
	}).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServerIdentityInput)(nil)).Elem(), ServerIdentityArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerIdentityPtrInput)(nil)).Elem(), ServerIdentityArgs{})
	pulumi.RegisterOutputType(ServerIdentityOutput{})
	pulumi.RegisterOutputType(ServerIdentityPtrOutput{})
}
