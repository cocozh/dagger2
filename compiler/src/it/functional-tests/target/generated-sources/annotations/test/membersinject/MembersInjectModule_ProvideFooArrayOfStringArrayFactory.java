package test.membersinject;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MembersInjectModule_ProvideFooArrayOfStringArrayFactory implements Factory<MembersInjectGenericParent<String[]>[]> {
  private final MembersInjectModule module;

  public MembersInjectModule_ProvideFooArrayOfStringArrayFactory(MembersInjectModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public MembersInjectGenericParent<String[]>[] get() {  
    MembersInjectGenericParent<String[]>[] provided = module.provideFooArrayOfStringArray();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<MembersInjectGenericParent<String[]>[]> create(MembersInjectModule module) {  
    return new MembersInjectModule_ProvideFooArrayOfStringArrayFactory(module);
  }
}

