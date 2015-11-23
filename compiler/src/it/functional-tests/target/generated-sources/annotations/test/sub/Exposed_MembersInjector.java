package test.sub;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.Generic2;
import test.sub.PackagePrivateContainer.PublicEnclosed;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Exposed_MembersInjector implements MembersInjector<Exposed> {
  private final Provider<Generic2<PackagePrivate>> gpp2Provider;
  private final Provider<Generic2<PublicEnclosed>> gppc2Provider;

  public Exposed_MembersInjector(Provider<Generic2<PackagePrivate>> gpp2Provider, Provider<Generic2<PublicEnclosed>> gppc2Provider) {  
    assert gpp2Provider != null;
    this.gpp2Provider = gpp2Provider;
    assert gppc2Provider != null;
    this.gppc2Provider = gppc2Provider;
  }

  @Override
  public void injectMembers(Exposed instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.gpp2 = gpp2Provider.get();
    instance.gppc2 = gppc2Provider.get();
  }

  public static MembersInjector<Exposed> create(Provider<Generic2<PackagePrivate>> gpp2Provider, Provider<Generic2<PublicEnclosed>> gppc2Provider) {  
      return new Exposed_MembersInjector(gpp2Provider, gppc2Provider);
  }
}

