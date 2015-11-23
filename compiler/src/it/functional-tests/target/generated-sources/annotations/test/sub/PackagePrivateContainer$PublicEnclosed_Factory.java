package test.sub;

import dagger.internal.Factory;
import javax.annotation.Generated;
import test.sub.PackagePrivateContainer.PublicEnclosed;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PackagePrivateContainer$PublicEnclosed_Factory implements Factory<PublicEnclosed> {
INSTANCE;

  @Override
  public PublicEnclosed get() {  
    return new PublicEnclosed();
  }

  public static Factory<PublicEnclosed> create() {  
    return INSTANCE;
  }
}

