package test.membersinject;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MembersInjectModule_ProvideIntArrayFactory implements Factory<int[]> {
  private final MembersInjectModule module;

  public MembersInjectModule_ProvideIntArrayFactory(MembersInjectModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public int[] get() {  
    int[] provided = module.provideIntArray();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<int[]> create(MembersInjectModule module) {  
    return new MembersInjectModule_ProvideIntArrayFactory(module);
  }
}

