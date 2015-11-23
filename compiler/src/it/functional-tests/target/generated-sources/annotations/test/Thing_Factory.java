package test;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.sub.OtherThing;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Thing_Factory implements Factory<Thing> {
  private final Provider<OtherThing> unusedProvider;

  public Thing_Factory(Provider<OtherThing> unusedProvider) {  
    assert unusedProvider != null;
    this.unusedProvider = unusedProvider;
  }

  @Override
  public Thing get() {  
    return new Thing(unusedProvider.get());
  }

  public static Factory<Thing> create(Provider<OtherThing> unusedProvider) {  
    return new Thing_Factory(unusedProvider);
  }
}

