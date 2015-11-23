package test;

import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GenericChild_Factory<T> implements Factory<GenericChild<T>> {
  private final MembersInjector<GenericChild<T>> membersInjector;

  public GenericChild_Factory(MembersInjector<GenericChild<T>> membersInjector) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
  }

  @Override
  public GenericChild<T> get() {  
    GenericChild<T> instance = new GenericChild<T>();
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static <T> Factory<GenericChild<T>> create(MembersInjector<GenericChild<T>> membersInjector) {  
    return new GenericChild_Factory<T>(membersInjector);
  }
}

