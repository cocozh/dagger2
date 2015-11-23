package test.multipackage.c;

import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CModule_ProvideStringFactory implements Factory<Set<String>> {
  private final CModule module;

  public CModule_ProvideStringFactory(CModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Set<String> get() {  
    return Collections.<String>singleton(module.provideString());
  }

  public static Factory<Set<String>> create(CModule module) {  
    return new CModule_ProvideStringFactory(module);
  }
}

