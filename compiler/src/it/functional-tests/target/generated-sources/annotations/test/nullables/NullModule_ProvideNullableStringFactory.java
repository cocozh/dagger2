package test.nullables;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class NullModule_ProvideNullableStringFactory implements Factory<String> {
  private final NullModule module;

  public NullModule_ProvideNullableStringFactory(NullModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  @Nullable
  public String get() {  
    return module.provideNullableString();
  }

  public static Factory<String> create(NullModule module) {  
    return new NullModule_ProvideNullableStringFactory(module);
  }
}

