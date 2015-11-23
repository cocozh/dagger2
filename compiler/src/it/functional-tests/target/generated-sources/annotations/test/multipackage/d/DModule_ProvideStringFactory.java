package test.multipackage.d;

import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DModule_ProvideStringFactory implements Factory<Set<String>> {
  private final DModule module;

  public DModule_ProvideStringFactory(DModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Set<String> get() {  
    return Collections.<String>singleton(module.provideString());
  }

  public static Factory<Set<String>> create(DModule module) {  
    return new DModule_ProvideStringFactory(module);
  }
}

