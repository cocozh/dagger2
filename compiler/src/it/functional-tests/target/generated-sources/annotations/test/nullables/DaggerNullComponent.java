package test.nullables;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerNullComponent implements NullComponent {
  private Provider<String> provideNullableStringProvider;
  private Provider<Number> provideNumberProvider;
  private MembersInjector<NullFoo> nullFooMembersInjector;
  private Provider<NullFoo> nullFooProvider;

  private DaggerNullComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static NullComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideNullableStringProvider = NullModule_ProvideNullableStringFactory.create(builder.nullModule);
    this.provideNumberProvider = NullModule_ProvideNumberFactory.create(builder.nullModule);
    this.nullFooMembersInjector = NullFoo_MembersInjector.create(provideNullableStringProvider, provideNumberProvider);
    this.nullFooProvider = NullFoo_Factory.create(nullFooMembersInjector, provideNullableStringProvider, provideNumberProvider);
  }

  @Override
  public NullFoo nullFoo() {  
    return nullFooProvider.get();
  }

  @Override
  public String string() {  
    return provideNullableStringProvider.get();
  }

  @Override
  public Provider<String> stringProvider() {  
    return provideNullableStringProvider;
  }

  @Override
  public Number number() {  
    return provideNumberProvider.get();
  }

  @Override
  public Provider<Number> numberProvider() {  
    return provideNumberProvider;
  }

  public static final class Builder {
    private NullModule nullModule;
  
    private Builder() {  
    }
  
    public NullComponent build() {  
      if (nullModule == null) {
        this.nullModule = new NullModule();
      }
      return new DaggerNullComponent(this);
    }
  
    public Builder nullModule(NullModule nullModule) {  
      if (nullModule == null) {
        throw new NullPointerException("nullModule");
      }
      this.nullModule = nullModule;
      return this;
    }
  }
}

