package test;

import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.OuterClassBar.NestedComponent;
import test.sub.OtherThing;
import test.sub.OtherThing_Factory;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerOuterClassBar_NestedComponent implements NestedComponent {
  private Provider<OtherThing> otherThingProvider;
  private Provider<Thing> thingProvider;
  private MembersInjector<InjectedThing> injectedThingMembersInjector;
  private Provider<InjectedThing> injectedThingProvider;

  private DaggerOuterClassBar_NestedComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static NestedComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.otherThingProvider = OtherThing_Factory.create(PrimitivesModule_ProvideIntFactory.create());
    this.thingProvider = Thing_Factory.create(otherThingProvider);
    this.injectedThingMembersInjector = InjectedThing_MembersInjector.create(PrimitivesModule_ProvideByteFactory.create(), PrimitivesModule_ProvideCharFactory.create(), PrimitivesModule_ProvideShortFactory.create(), PrimitivesModule_ProvideIntFactory.create(), PrimitivesModule_ProvideLongFactory.create(), PrimitivesModule_ProvideBooleanFactory.create(), PrimitivesModule_ProvideFloatFactory.create(), PrimitivesModule_BoundDoubleFactory.create(), PrimitivesModule_ProvideByteArrayFactory.create(), PrimitivesModule_ProvideCharArrayFactory.create(), PrimitivesModule_ProvideShortArrayFactory.create(), PrimitivesModule_ProvideIntArrayFactory.create(), PrimitivesModule_ProvideLongArrayFactory.create(), PrimitivesModule_ProvideBooleanArrayFactory.create(), PrimitivesModule_ProvideFloatArrayFactory.create(), PrimitivesModule_BoundDoubleArrayFactory.create(), thingProvider, (MembersInjector) MembersInjectors.noOp());
    this.injectedThingProvider = InjectedThing_Factory.create(injectedThingMembersInjector, PrimitivesModule_ProvideByteFactory.create(), PrimitivesModule_ProvideCharFactory.create(), PrimitivesModule_ProvideShortFactory.create(), PrimitivesModule_ProvideIntFactory.create(), PrimitivesModule_ProvideLongFactory.create(), PrimitivesModule_ProvideBooleanFactory.create(), PrimitivesModule_ProvideFloatFactory.create(), PrimitivesModule_BoundDoubleFactory.create(), PrimitivesModule_ProvideByteArrayFactory.create(), PrimitivesModule_ProvideCharArrayFactory.create(), PrimitivesModule_ProvideShortArrayFactory.create(), PrimitivesModule_ProvideIntArrayFactory.create(), PrimitivesModule_ProvideLongArrayFactory.create(), PrimitivesModule_ProvideBooleanArrayFactory.create(), PrimitivesModule_ProvideFloatArrayFactory.create(), PrimitivesModule_BoundDoubleArrayFactory.create(), thingProvider, (MembersInjector) MembersInjectors.noOp());
  }

  @Override
  public InjectedThing injectedThing() {  
    return injectedThingProvider.get();
  }

  public static final class Builder {
    private PrimitivesModule primitivesModule;
  
    private Builder() {  
    }
  
    public NestedComponent build() {  
      if (primitivesModule == null) {
        this.primitivesModule = new PrimitivesModule();
      }
      return new DaggerOuterClassBar_NestedComponent(this);
    }
  
    public Builder primitivesModule(PrimitivesModule primitivesModule) {  
      if (primitivesModule == null) {
        throw new NullPointerException("primitivesModule");
      }
      this.primitivesModule = primitivesModule;
      return this;
    }
  }
}

