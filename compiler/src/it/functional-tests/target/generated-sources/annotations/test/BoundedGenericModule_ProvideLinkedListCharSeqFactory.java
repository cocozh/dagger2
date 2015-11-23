package test;

import dagger.internal.Factory;
import java.util.LinkedList;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BoundedGenericModule_ProvideLinkedListCharSeqFactory implements Factory<LinkedList<CharSequence>> {
  private final BoundedGenericModule module;

  public BoundedGenericModule_ProvideLinkedListCharSeqFactory(BoundedGenericModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public LinkedList<CharSequence> get() {  
    LinkedList<CharSequence> provided = module.provideLinkedListCharSeq();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<LinkedList<CharSequence>> create(BoundedGenericModule module) {  
    return new BoundedGenericModule_ProvideLinkedListCharSeqFactory(module);
  }
}

