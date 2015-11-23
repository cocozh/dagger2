package test;

import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GenericParent_Factory<X, Y> implements Factory<GenericParent<X, Y>> {
  private final MembersInjector<GenericParent<X, Y>> membersInjector;

  public GenericParent_Factory(MembersInjector<GenericParent<X, Y>> membersInjector) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
  }

  @Override
  public GenericParent<X, Y> get() {  
    GenericParent<X, Y> instance = new GenericParent<X, Y>();
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static <X, Y> Factory<GenericParent<X, Y>> create(MembersInjector<GenericParent<X, Y>> membersInjector) {  
    return new GenericParent_Factory<X, Y>(membersInjector);
  }
}

