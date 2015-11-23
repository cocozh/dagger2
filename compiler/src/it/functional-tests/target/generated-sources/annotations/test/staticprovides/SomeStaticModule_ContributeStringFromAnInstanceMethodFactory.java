package test.staticprovides;

import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SomeStaticModule_ContributeStringFromAnInstanceMethodFactory implements Factory<Set<String>> {
  private final SomeStaticModule module;

  public SomeStaticModule_ContributeStringFromAnInstanceMethodFactory(SomeStaticModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Set<String> get() {  
    return Collections.<String>singleton(module.contributeStringFromAnInstanceMethod());
  }

  public static Factory<Set<String>> create(SomeStaticModule module) {  
    return new SomeStaticModule_ContributeStringFromAnInstanceMethodFactory(module);
  }
}

