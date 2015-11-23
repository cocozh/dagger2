package test;

import javax.annotation.Generated;
import javax.inject.Provider;
import test.OuterClassFoo.NestedComponent;
import test.sub.OtherThing;
import test.sub.OtherThing_Factory;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerOuterClassFoo_NestedComponent implements NestedComponent {
  private Provider<OtherThing> otherThingProvider;
  private Provider<Thing> thingProvider;

  private DaggerOuterClassFoo_NestedComponent(Builder builder) {  
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
  }

  @Override
  public Thing thing() {  
    return thingProvider.get();
  }

  public static final class Builder {
    private PrimitivesModule primitivesModule;
  
    private Builder() {  
    }
  
    public NestedComponent build() {  
      if (primitivesModule == null) {
        this.primitivesModule = new PrimitivesModule();
      }
      return new DaggerOuterClassFoo_NestedComponent(this);
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

