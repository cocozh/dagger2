package test.sub;

import javax.annotation.Generated;
import javax.inject.Provider;
import test.Generic;
import test.Generic2;
import test.sub.PackagePrivateContainer.PublicEnclosed;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerGenericComponent_PackageProxy {
  public Provider<Generic2<PackagePrivate>> generic2Provider;
  public Provider<Generic2<PublicEnclosed>> generic2Provider1;
  public Provider<Generic<PackagePrivate>> genericProvider;
  public Provider<Generic<PublicEnclosed>> genericProvider1;
}

