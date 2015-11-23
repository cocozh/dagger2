package test.builder;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class StringModule_StringFactory implements Factory<String> {
  private final StringModule module;

  public StringModule_StringFactory(StringModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {  
    String provided = module.string();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<String> create(StringModule module) {  
    return new StringModule_StringFactory(module);
  }
}

