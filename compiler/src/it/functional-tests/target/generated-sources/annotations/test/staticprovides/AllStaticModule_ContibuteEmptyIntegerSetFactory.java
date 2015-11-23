package test.staticprovides;

import dagger.internal.Factory;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum AllStaticModule_ContibuteEmptyIntegerSetFactory implements Factory<Set<Integer>> {
INSTANCE;

  @Override
  public Set<Integer> get() {  
    Set<Integer> provided = AllStaticModule.contibuteEmptyIntegerSet();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Set<Integer>> create() {  
    return INSTANCE;
  }
}

