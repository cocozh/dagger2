package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@SuppressWarnings("rawtypes")
@Generated("dagger.internal.codegen.ComponentProcessor")
public enum GenericNoDeps_Factory implements Factory<GenericNoDeps> {
INSTANCE;

  @Override
  public GenericNoDeps get() {  
    return new GenericNoDeps();
  }

  @SuppressWarnings("unchecked")
  public static <T> Factory<GenericNoDeps<T>> create() {  
    return (Factory) INSTANCE;
  }
}

