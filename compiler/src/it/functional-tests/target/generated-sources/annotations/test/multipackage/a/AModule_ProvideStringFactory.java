package test.multipackage.a;

import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AModule_ProvideStringFactory implements Factory<Set<String>> {
  private final AModule module;

  public AModule_ProvideStringFactory(AModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Set<String> get() {  
    return Collections.<String>singleton(module.provideString());
  }

  public static Factory<Set<String>> create(AModule module) {  
    return new AModule_ProvideStringFactory(module);
  }
}

