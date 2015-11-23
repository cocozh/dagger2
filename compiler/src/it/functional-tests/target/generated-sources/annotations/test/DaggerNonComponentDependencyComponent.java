package test;

import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.NonComponentDependencyComponent.ThingComponent;
import test.NonComponentDependencyComponent.ThingTwo;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerNonComponentDependencyComponent implements NonComponentDependencyComponent {
  private Provider<Thing> thingProvider;
  private Provider<NonComponentDependencyComponent> nonComponentDependencyComponentProvider;
  private Provider<ThingComponent> thingComponentProvider;
  private Provider<ThingTwo> thingTwoProvider;

  private DaggerNonComponentDependencyComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.thingProvider = new Factory<Thing>() {
      private final ThingComponent thingComponent = builder.thingComponent;
      @Override public Thing get() {
        Thing provided = thingComponent.thing();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.nonComponentDependencyComponentProvider = InstanceFactory.<NonComponentDependencyComponent>create(this);
    this.thingComponentProvider = InstanceFactory.<ThingComponent>create(builder.thingComponent);
    this.thingTwoProvider = NonComponentDependencyComponent$ThingTwo_Factory.create(thingProvider, nonComponentDependencyComponentProvider, thingComponentProvider);
  }

  @Override
  public ThingTwo thingTwo() {  
    return thingTwoProvider.get();
  }

  public static final class Builder {
    private ThingComponent thingComponent;
  
    private Builder() {  
    }
  
    public NonComponentDependencyComponent build() {  
      if (thingComponent == null) {
        throw new IllegalStateException("thingComponent must be set");
      }
      return new DaggerNonComponentDependencyComponent(this);
    }
  
    public Builder thingComponent(ThingComponent thingComponent) {  
      if (thingComponent == null) {
        throw new NullPointerException("thingComponent");
      }
      this.thingComponent = thingComponent;
      return this;
    }
  }
}

