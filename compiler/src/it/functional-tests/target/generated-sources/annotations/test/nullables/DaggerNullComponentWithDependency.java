package test.nullables;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerNullComponentWithDependency implements NullComponentWithDependency {
  private Provider<String> stringProvider;
  private Provider<Number> numberProvider;

  private DaggerNullComponentWithDependency(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.stringProvider = new Factory<String>() {
      private final NullComponent nullComponent = builder.nullComponent;
      @Nullable @Override public String get() {
        return nullComponent.string();
      }
    };
    this.numberProvider = new Factory<Number>() {
      private final NullComponent nullComponent = builder.nullComponent;
      @Override public Number get() {
        Number provided = nullComponent.number();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
  }

  @Override
  public String string() {  
    return stringProvider.get();
  }

  @Override
  public Provider<String> stringProvider() {  
    return stringProvider;
  }

  @Override
  public Number number() {  
    return numberProvider.get();
  }

  @Override
  public Provider<Number> numberProvider() {  
    return numberProvider;
  }

  public static final class Builder {
    private NullComponent nullComponent;
  
    private Builder() {  
    }
  
    public NullComponentWithDependency build() {  
      if (nullComponent == null) {
        throw new IllegalStateException("nullComponent must be set");
      }
      return new DaggerNullComponentWithDependency(this);
    }
  
    public Builder nullComponent(NullComponent nullComponent) {  
      if (nullComponent == null) {
        throw new NullPointerException("nullComponent");
      }
      this.nullComponent = nullComponent;
      return this;
    }
  }
}

