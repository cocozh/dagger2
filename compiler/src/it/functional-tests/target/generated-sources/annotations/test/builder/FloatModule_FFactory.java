package test.builder;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class FloatModule_FFactory implements Factory<Float> {
  private final FloatModule module;

  public FloatModule_FFactory(FloatModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Float get() {  
    Float provided = module.f();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Float> create(FloatModule module) {  
    return new FloatModule_FFactory(module);
  }
}

