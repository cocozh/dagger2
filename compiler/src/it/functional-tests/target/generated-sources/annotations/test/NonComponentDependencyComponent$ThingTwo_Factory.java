package test;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.NonComponentDependencyComponent.ThingComponent;
import test.NonComponentDependencyComponent.ThingTwo;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class NonComponentDependencyComponent$ThingTwo_Factory implements Factory<ThingTwo> {
  private final Provider<Thing> thingProvider;
  private final Provider<NonComponentDependencyComponent> nonComponentDependencyComponentProvider;
  private final Provider<ThingComponent> thingComponentProvider;

  public NonComponentDependencyComponent$ThingTwo_Factory(Provider<Thing> thingProvider, Provider<NonComponentDependencyComponent> nonComponentDependencyComponentProvider, Provider<ThingComponent> thingComponentProvider) {  
    assert thingProvider != null;
    this.thingProvider = thingProvider;
    assert nonComponentDependencyComponentProvider != null;
    this.nonComponentDependencyComponentProvider = nonComponentDependencyComponentProvider;
    assert thingComponentProvider != null;
    this.thingComponentProvider = thingComponentProvider;
  }

  @Override
  public ThingTwo get() {  
    return new ThingTwo(thingProvider.get(), nonComponentDependencyComponentProvider.get(), thingComponentProvider.get());
  }

  public static Factory<ThingTwo> create(Provider<Thing> thingProvider, Provider<NonComponentDependencyComponent> nonComponentDependencyComponentProvider, Provider<ThingComponent> thingComponentProvider) {  
    return new NonComponentDependencyComponent$ThingTwo_Factory(thingProvider, nonComponentDependencyComponentProvider, thingComponentProvider);
  }
}

