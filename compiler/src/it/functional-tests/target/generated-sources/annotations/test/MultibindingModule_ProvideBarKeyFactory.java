package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MultibindingModule_ProvideBarKeyFactory implements Factory<String> {
  private final MultibindingModule module;

  public MultibindingModule_ProvideBarKeyFactory(MultibindingModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {  
    String provided = module.provideBarKey();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<String> create(MultibindingModule module) {  
    return new MultibindingModule_ProvideBarKeyFactory(module);
  }
}

