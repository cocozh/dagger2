package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MultibindingModule_ValueFor100IntFactory implements Factory<String> {
  private final MultibindingModule module;

  public MultibindingModule_ValueFor100IntFactory(MultibindingModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {  
    String provided = module.valueFor100Int();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<String> create(MultibindingModule module) {  
    return new MultibindingModule_ValueFor100IntFactory(module);
  }
}

