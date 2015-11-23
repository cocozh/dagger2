package test.subcomponent.hiding.b;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CommonModuleName_ProvideStringFactory implements Factory<Integer> {
  private final CommonModuleName module;

  public CommonModuleName_ProvideStringFactory(CommonModuleName module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Integer get() {  
    Integer provided = module.provideString();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Integer> create(CommonModuleName module) {  
    return new CommonModuleName_ProvideStringFactory(module);
  }
}

