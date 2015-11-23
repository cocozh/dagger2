package test;

import dagger.internal.Factory;
import java.util.LinkedList;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BoundedGenericModule_ProvideArrayListOfComparableStringFactory implements Factory<LinkedList<Comparable<String>>> {
  private final BoundedGenericModule module;

  public BoundedGenericModule_ProvideArrayListOfComparableStringFactory(BoundedGenericModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public LinkedList<Comparable<String>> get() {  
    LinkedList<Comparable<String>> provided = module.provideArrayListOfComparableString();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<LinkedList<Comparable<String>>> create(BoundedGenericModule module) {  
    return new BoundedGenericModule_ProvideArrayListOfComparableStringFactory(module);
  }
}

