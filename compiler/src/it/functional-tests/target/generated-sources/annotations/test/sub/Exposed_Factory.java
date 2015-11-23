package test.sub;

import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.Generic;
import test.sub.PackagePrivateContainer.PublicEnclosed;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Exposed_Factory implements Factory<Exposed> {
  private final MembersInjector<Exposed> membersInjector;
  private final Provider<Generic<PackagePrivate>> gppProvider;
  private final Provider<Generic<PublicEnclosed>> gppcProvider;

  public Exposed_Factory(MembersInjector<Exposed> membersInjector, Provider<Generic<PackagePrivate>> gppProvider, Provider<Generic<PublicEnclosed>> gppcProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert gppProvider != null;
    this.gppProvider = gppProvider;
    assert gppcProvider != null;
    this.gppcProvider = gppcProvider;
  }

  @Override
  public Exposed get() {  
    Exposed instance = new Exposed(gppProvider.get(), gppcProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<Exposed> create(MembersInjector<Exposed> membersInjector, Provider<Generic<PackagePrivate>> gppProvider, Provider<Generic<PublicEnclosed>> gppcProvider) {  
    return new Exposed_Factory(membersInjector, gppProvider, gppcProvider);
  }
}

