package test.sub;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PackagePrivate_Factory implements Factory<PackagePrivate> {
INSTANCE;

  @Override
  public PackagePrivate get() {  
    return new PackagePrivate();
  }

  public static Factory<PackagePrivate> create() {  
    return INSTANCE;
  }
}

