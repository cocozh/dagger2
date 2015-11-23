package test.sub;

import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class PublicSubclass_Factory implements Factory<PublicSubclass> {
  private final MembersInjector<PublicSubclass> membersInjector;
  private final Provider<PackagePrivate> ppProvider;

  public PublicSubclass_Factory(MembersInjector<PublicSubclass> membersInjector, Provider<PackagePrivate> ppProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert ppProvider != null;
    this.ppProvider = ppProvider;
  }

  @Override
  public PublicSubclass get() {  
    PublicSubclass instance = new PublicSubclass(ppProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<PublicSubclass> create(MembersInjector<PublicSubclass> membersInjector, Provider<PackagePrivate> ppProvider) {  
    return new PublicSubclass_Factory(membersInjector, ppProvider);
  }
}

