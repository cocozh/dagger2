package test.builder.subcomponent;

import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerSubComponent implements SubComponent {
  private Provider<String> providesStringProvider;

  private DaggerSubComponent(Builder builder) {  
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

  public static final class Builder {
    private ModuleWithParameter moduleWithParameter;
  
    private Builder() {  
    }
  
    public SubComponent build() {  
      if (moduleWithParameter == null) {
        throw new IllegalStateException("moduleWithParameter must be set");
      }
      return new DaggerSubComponent(this);
    }
  
    public Builder moduleWithParameter(ModuleWithParameter moduleWithParameter) {  
      if (moduleWithParameter == null) {
        throw new NullPointerException("moduleWithParameter");
      }
      this.moduleWithParameter = moduleWithParameter;
      return this;
    }
  }
}

