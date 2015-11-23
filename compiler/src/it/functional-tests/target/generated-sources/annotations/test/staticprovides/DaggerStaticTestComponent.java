package test.staticprovides;

import dagger.internal.SetFactory;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerStaticTestComponent implements StaticTestComponent {
  private Provider<Set<String>> setOfStringContribution1Provider;
  private Provider<Set<String>> setOfStringContribution2Provider;
  private Provider<Set<String>> setOfStringContribution3Provider;
  private Provider<Set<String>> setOfStringProvider;
  private Provider<Set<Integer>> setOfIntegerContribution1Provider;
  private Provider<Set<Integer>> setOfIntegerProvider;

  private DaggerStaticTestComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static StaticTestComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.setOfStringContribution1Provider = AllStaticModule_ContributeStringFactory.create();
    this.setOfStringContribution2Provider = SomeStaticModule_ContributeStringFromAStaticMethodFactory.create();
    this.setOfStringContribution3Provider = SomeStaticModule_ContributeStringFromAnInstanceMethodFactory.create(builder.someStaticModule);
    this.setOfStringProvider = SetFactory.create(setOfStringContribution1Provider, setOfStringContribution2Provider, setOfStringContribution3Provider);
    this.setOfIntegerContribution1Provider = AllStaticModule_ContibuteEmptyIntegerSetFactory.create();
    this.setOfIntegerProvider = SetFactory.create(setOfIntegerContribution1Provider);
  }

  @Override
  public Set<String> getMultiboundStrings() {  
    return setOfStringProvider.get();
  }

  @Override
  public Set<Integer> getMultiboundIntegers() {  
    return setOfIntegerProvider.get();
  }

  public static final class Builder {
    private AllStaticModule allStaticModule;
    private SomeStaticModule someStaticModule;
  
    private Builder() {  
    }
  
    public StaticTestComponent build() {  
      if (allStaticModule == null) {
        this.allStaticModule = new AllStaticModule();
      }
      if (someStaticModule == null) {
        this.someStaticModule = new SomeStaticModule();
      }
      return new DaggerStaticTestComponent(this);
    }
  
    public Builder allStaticModule(AllStaticModule allStaticModule) {  
      if (allStaticModule == null) {
        throw new NullPointerException("allStaticModule");
      }
      this.allStaticModule = allStaticModule;
      return this;
    }
  
    public Builder someStaticModule(SomeStaticModule someStaticModule) {  
      if (someStaticModule == null) {
        throw new NullPointerException("someStaticModule");
      }
      this.someStaticModule = someStaticModule;
      return this;
    }
  }
}

