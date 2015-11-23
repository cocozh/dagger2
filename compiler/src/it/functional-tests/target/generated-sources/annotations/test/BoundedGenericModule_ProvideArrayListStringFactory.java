package test;

import dagger.internal.Factory;
import java.util.ArrayList;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BoundedGenericModule_ProvideArrayListStringFactory implements Factory<ArrayList<String>> {
  private final BoundedGenericModule module;

  public BoundedGenericModule_ProvideArrayListStringFactory(BoundedGenericModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public ArrayList<String> get() {  
    ArrayList<String> provided = module.provideArrayListString();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<ArrayList<String>> create(BoundedGenericModule module) {  
    return new BoundedGenericModule_ProvideArrayListStringFactory(module);
  }
}

