package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DependedModule_ProvideGreetingFactory implements Factory<String> {
  private final DependedModule module;

  public DependedModule_ProvideGreetingFactory(DependedModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {  
    String provided = module.provideGreeting();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<String> create(DependedModule module) {  
    return new DependedModule_ProvideGreetingFactory(module);
  }
}

