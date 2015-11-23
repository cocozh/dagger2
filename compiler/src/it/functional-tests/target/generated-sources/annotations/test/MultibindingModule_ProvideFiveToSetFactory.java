package test;

import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MultibindingModule_ProvideFiveToSetFactory implements Factory<Set<Integer>> {
  private final MultibindingModule module;

  public MultibindingModule_ProvideFiveToSetFactory(MultibindingModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Set<Integer> get() {  
    return Collections.<Integer>singleton(module.provideFiveToSet());
  }

  public static Factory<Set<Integer>> create(MultibindingModule module) {  
    return new MultibindingModule_ProvideFiveToSetFactory(module);
  }
}

