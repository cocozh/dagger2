package test.subcomponent.hiding.a;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CommonModuleName_ProvideStringFactory implements Factory<String> {
  private final CommonModuleName module;

  public CommonModuleName_ProvideStringFactory(CommonModuleName module) {  
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

  public static Factory<String> create(CommonModuleName module) {  
    return new CommonModuleName_ProvideStringFactory(module);
  }
}

