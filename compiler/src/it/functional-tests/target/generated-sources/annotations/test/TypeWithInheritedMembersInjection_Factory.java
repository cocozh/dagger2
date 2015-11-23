package test;

import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TypeWithInheritedMembersInjection_Factory implements Factory<TypeWithInheritedMembersInjection> {
  private final MembersInjector<TypeWithInheritedMembersInjection> membersInjector;

  public TypeWithInheritedMembersInjection_Factory(MembersInjector<TypeWithInheritedMembersInjection> membersInjector) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
  }

  @Override
  public TypeWithInheritedMembersInjection get() {  
    TypeWithInheritedMembersInjection instance = new TypeWithInheritedMembersInjection();
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<TypeWithInheritedMembersInjection> create(MembersInjector<TypeWithInheritedMembersInjection> membersInjector) {  
    return new TypeWithInheritedMembersInjection_Factory(membersInjector);
  }
}

