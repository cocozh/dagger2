package test.staticprovides;

import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum AllStaticModule_ContributeStringFactory implements Factory<Set<String>> {
INSTANCE;

  @Override
  public Set<String> get() {  
    return Collections.<String>singleton(AllStaticModule.contributeString());
  }

  public static Factory<Set<String>> create() {  
    return INSTANCE;
  }
}

