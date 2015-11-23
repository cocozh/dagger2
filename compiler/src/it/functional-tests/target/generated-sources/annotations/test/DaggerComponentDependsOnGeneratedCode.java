package test;

import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerComponentDependsOnGeneratedCode implements ComponentDependsOnGeneratedCode {
  private Provider<NeedsFactory> needsFactoryProvider;

  private DaggerComponentDependsOnGeneratedCode(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static ComponentDependsOnGeneratedCode create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.needsFactoryProvider = NeedsFactory_Factory.create(NeedsFactory_SomethingFactory_Factory.create());
  }

  @Override
  public NeedsFactory needsFactory() {  
    return needsFactoryProvider.get();
  }

  public static final class Builder {
    private Builder() {  
    }
  
    public ComponentDependsOnGeneratedCode build() {  
      return new DaggerComponentDependsOnGeneratedCode(this);
    }
  }
}

