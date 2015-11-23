package test.sub;

import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ContributionsModule_ContributeAnIntFactory implements Factory<Set<Integer>> {
  private final ContributionsModule module;
  private final Provider<Double> doubleDependencyProvider;

  public ContributionsModule_ContributeAnIntFactory(ContributionsModule module, Provider<Double> doubleDependencyProvider) {  
    assert module != null;
    this.module = module;
    assert doubleDependencyProvider != null;
    this.doubleDependencyProvider = doubleDependencyProvider;
  }

  @Override
  public Set<Integer> get() {  
    return Collections.<Integer>singleton(module.contributeAnInt(doubleDependencyProvider.get()));
  }

  public static Factory<Set<Integer>> create(ContributionsModule module, Provider<Double> doubleDependencyProvider) {  
    return new ContributionsModule_ContributeAnIntFactory(module, doubleDependencyProvider);
  }
}

