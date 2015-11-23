package test;

import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerSingletonGenericComponent implements SingletonGenericComponent {
  private Provider<ScopedGeneric<A>> scopedGenericProvider;
  private Provider<ScopedGeneric<B>> scopedGenericProvider1;

  private DaggerSingletonGenericComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static SingletonGenericComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.scopedGenericProvider = ScopedProvider.create(ScopedGeneric_Factory.create(A_Factory.create()));
    this.scopedGenericProvider1 = ScopedProvider.create(ScopedGeneric_Factory.create(B_Factory.create()));
  }

  @Override
  public ScopedGeneric<A> scopedGenericA() {  
    return scopedGenericProvider.get();
  }

  @Override
  public ScopedGeneric<B> scopedGenericB() {  
    return scopedGenericProvider1.get();
  }

  public static final class Builder {
    private Builder() {  
    }
  
    public SingletonGenericComponent build() {  
      return new DaggerSingletonGenericComponent(this);
    }
  }
}

