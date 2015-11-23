package test.subcomponent;

import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GrandchildModule_ProvideUnscopedObjectFactory implements Factory<Set<Object>> {
  private final GrandchildModule module;

  public GrandchildModule_ProvideUnscopedObjectFactory(GrandchildModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Set<Object> get() {  
    return Collections.<Object>singleton(module.provideUnscopedObject());
  }

  public static Factory<Set<Object>> create(GrandchildModule module) {  
    return new GrandchildModule_ProvideUnscopedObjectFactory(module);
  }
}

