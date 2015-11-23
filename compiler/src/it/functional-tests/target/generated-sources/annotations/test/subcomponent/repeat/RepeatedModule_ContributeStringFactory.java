package test.subcomponent.repeat;

import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class RepeatedModule_ContributeStringFactory implements Factory<Set<String>> {
  private final RepeatedModule module;

  public RepeatedModule_ContributeStringFactory(RepeatedModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Set<String> get() {  
    return Collections.<String>singleton(module.contributeString());
  }

  public static Factory<Set<String>> create(RepeatedModule module) {  
    return new RepeatedModule_ContributeStringFactory(module);
  }
}

