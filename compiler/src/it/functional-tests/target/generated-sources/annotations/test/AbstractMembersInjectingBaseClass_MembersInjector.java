package test;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbstractMembersInjectingBaseClass_MembersInjector implements MembersInjector<AbstractMembersInjectingBaseClass> {
  private final Provider<Thing> thingProvider;

  public AbstractMembersInjectingBaseClass_MembersInjector(Provider<Thing> thingProvider) {  
    assert thingProvider != null;
    this.thingProvider = thingProvider;
  }

  @Override
  public void injectMembers(AbstractMembersInjectingBaseClass instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.thing = thingProvider.get();
  }

  public static MembersInjector<AbstractMembersInjectingBaseClass> create(Provider<Thing> thingProvider) {  
      return new AbstractMembersInjectingBaseClass_MembersInjector(thingProvider);
  }
}

