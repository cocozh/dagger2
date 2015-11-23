package test.builder.subcomponent;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ModuleWithParameter_ProvidesStringFactory implements Factory<String> {
  private final ModuleWithParameter module;

  public ModuleWithParameter_ProvidesStringFactory(ModuleWithParameter module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {  
    String provided = module.providesString();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<String> create(ModuleWithParameter module) {  
    return new ModuleWithParameter_ProvidesStringFactory(module);
  }
}

