package test.sub;

import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ContributionsModule_ContributeAnotherIntFactory implements Factory<Set<Integer>> {
  private final ContributionsModule module;

  public ContributionsModule_ContributeAnotherIntFactory(ContributionsModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Set<Integer> get() {  
    return Collections.<Integer>singleton(module.contributeAnotherInt());
  }

  public static Factory<Set<Integer>> create(ContributionsModule module) {  
    return new ContributionsModule_ContributeAnotherIntFactory(module);
  }
}

