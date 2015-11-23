package test.membersinject;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MembersInjectModule_ProvideStringArrayFactory implements Factory<String[]> {
  private final MembersInjectModule module;

  public MembersInjectModule_ProvideStringArrayFactory(MembersInjectModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public String[] get() {  
    String[] provided = module.provideStringArray();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<String[]> create(MembersInjectModule module) {  
    return new MembersInjectModule_ProvideStringArrayFactory(module);
  }
}

