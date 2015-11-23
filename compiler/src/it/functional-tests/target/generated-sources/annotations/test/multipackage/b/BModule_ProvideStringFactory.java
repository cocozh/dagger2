package test.multipackage.b;

import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BModule_ProvideStringFactory implements Factory<Set<String>> {
  private final BModule module;

  public BModule_ProvideStringFactory(BModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Set<String> get() {  
    return Collections.<String>singleton(module.provideString());
  }

  public static Factory<Set<String>> create(BModule module) {  
    return new BModule_ProvideStringFactory(module);
  }
}

