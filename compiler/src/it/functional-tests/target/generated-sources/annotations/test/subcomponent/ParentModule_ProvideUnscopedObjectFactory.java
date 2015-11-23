package test.subcomponent;

import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ParentModule_ProvideUnscopedObjectFactory implements Factory<Set<Object>> {
  private final ParentModule module;

  public ParentModule_ProvideUnscopedObjectFactory(ParentModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Set<Object> get() {  
    return Collections.<Object>singleton(module.provideUnscopedObject());
  }

  public static Factory<Set<Object>> create(ParentModule module) {  
    return new ParentModule_ProvideUnscopedObjectFactory(module);
  }
}

