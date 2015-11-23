package test.subcomponent.repeat;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class RepeatedModule_ProvideStringFactory implements Factory<String> {
  private final RepeatedModule module;

  public RepeatedModule_ProvideStringFactory(RepeatedModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {  
    String provided = module.provideString();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<String> create(RepeatedModule module) {  
    return new RepeatedModule_ProvideStringFactory(module);
  }
}

