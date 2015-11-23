package test.sub;

import dagger.internal.Factory;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ContributionsModule_ContributeSomeIntsFactory implements Factory<Set<Integer>> {
  private final ContributionsModule module;

  public ContributionsModule_ContributeSomeIntsFactory(ContributionsModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Set<Integer> get() {  
    Set<Integer> provided = module.contributeSomeInts();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Set<Integer>> create(ContributionsModule module) {  
    return new ContributionsModule_ContributeSomeIntsFactory(module);
  }
}

