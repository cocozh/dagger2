package test.multipackage.foo;

import dagger.internal.Factory;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Foo_Factory<T> implements Factory<Foo<T>> {
  private final Provider<Set<String>> stringsProvider;

  public Foo_Factory(Provider<Set<String>> stringsProvider) {  
    assert stringsProvider != null;
    this.stringsProvider = stringsProvider;
  }

  @Override
  public Foo<T> get() {  
    return new Foo<T>(stringsProvider.get());
  }

  public static <T> Factory<Foo<T>> create(Provider<Set<String>> stringsProvider) {  
    return new Foo_Factory<T>(stringsProvider);
  }
}

