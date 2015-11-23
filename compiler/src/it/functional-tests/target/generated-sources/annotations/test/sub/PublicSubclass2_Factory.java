package test.sub;

import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.sub.PackagePrivateContainer.PublicEnclosed;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class PublicSubclass2_Factory implements Factory<PublicSubclass2> {
  private final MembersInjector<PublicSubclass2> membersInjector;
  private final Provider<PublicEnclosed> ppProvider;

  public PublicSubclass2_Factory(MembersInjector<PublicSubclass2> membersInjector, Provider<PublicEnclosed> ppProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert ppProvider != null;
    this.ppProvider = ppProvider;
  }

  @Override
  public PublicSubclass2 get() {  
    PublicSubclass2 instance = new PublicSubclass2(ppProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<PublicSubclass2> create(MembersInjector<PublicSubclass2> membersInjector, Provider<PublicEnclosed> ppProvider) {  
    return new PublicSubclass2_Factory(membersInjector, ppProvider);
  }
}

