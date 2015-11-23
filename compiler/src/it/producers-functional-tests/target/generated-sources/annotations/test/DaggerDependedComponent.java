package test;

import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerDependedComponent implements DependedComponent {
  private Provider<String> provideGreetingProvider;

  private DaggerDependedComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static DependedComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideGreetingProvider = DependedModule_ProvideGreetingFactory.create(builder.dependedModule);
  }

  @Override
  public String getGreeting() {  
    return provideGreetingProvider.get();
  }

  public static final class Builder {
    private DependedModule dependedModule;
  
    private Builder() {  
    }
  
    public DependedComponent build() {  
      if (dependedModule == null) {
        this.dependedModule = new DependedModule();
      }
      return new DaggerDependedComponent(this);
    }
  
    public Builder dependedModule(DependedModule dependedModule) {  
      if (dependedModule == null) {
        throw new NullPointerException("dependedModule");
      }
      this.dependedModule = dependedModule;
      return this;
    }
  }
}

