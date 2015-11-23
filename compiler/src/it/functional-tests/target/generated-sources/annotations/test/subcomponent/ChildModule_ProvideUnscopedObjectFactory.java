package test.subcomponent;

import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ChildModule_ProvideUnscopedObjectFactory implements Factory<Set<Object>> {
  private final ChildModule module;

  public ChildModule_ProvideUnscopedObjectFactory(ChildModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Set<Object> get() {  
    return Collections.<Object>singleton(module.provideUnscopedObject());
  }

  public static Factory<Set<Object>> create(ChildModule module) {  
    return new ChildModule_ProvideUnscopedObjectFactory(module);
  }
}

