package test.builder.subcomponent;

import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerRootComponent implements RootComponent {
  private Provider<String> providesStringProvider;

  private DaggerRootComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.providesStringProvider = ModuleWithParameter_ProvidesStringFactory.create(builder.moduleWithParameter);
  }

  @Override
  public String string() {  
    return providesStringProvider.get();
  }

  @Override
  public SubComponent newSubComponent() {  
    return new SubComponentImpl();
  }

  public static final class Builder {
    private ModuleWithParameter moduleWithParameter;
  
    private Builder() {  
    }
  
    public RootComponent build() {  
      if (moduleWithParameter == null) {
        throw new IllegalStateException("moduleWithParameter must be set");
      }
      return new DaggerRootComponent(this);
    }
  
    public Builder moduleWithParameter(ModuleWithParameter moduleWithParameter) {  
      if (moduleWithParameter == null) {
        throw new NullPointerException("moduleWithParameter");
      }
      this.moduleWithParameter = moduleWithParameter;
      return this;
    }
  }

  private final class SubComponentImpl implements SubComponent {
    private SubComponentImpl() {  
      initialize();
    }
  
    private void initialize() {  
    }
  
    @Override
    public String string() {  
      return DaggerRootComponent.this.providesStringProvider.get();
    }
  }
}

