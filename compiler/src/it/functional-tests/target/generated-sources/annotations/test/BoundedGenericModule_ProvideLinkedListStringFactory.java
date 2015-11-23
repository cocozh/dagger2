package test;

import dagger.internal.Factory;
import java.util.LinkedList;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BoundedGenericModule_ProvideLinkedListStringFactory implements Factory<LinkedList<String>> {
  private final BoundedGenericModule module;

  public BoundedGenericModule_ProvideLinkedListStringFactory(BoundedGenericModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public LinkedList<String> get() {  
    LinkedList<String> provided = module.provideLinkedListString();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<LinkedList<String>> create(BoundedGenericModule module) {  
    return new BoundedGenericModule_ProvideLinkedListStringFactory(module);
  }
}

