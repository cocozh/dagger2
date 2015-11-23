package test.subcomponent.repeat;

import dagger.internal.SetFactory;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.subcomponent.repeat.ParentComponent;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerParentComponent implements ParentComponent {
  private Provider<String> provideStringProvider;
  private Provider<Set<String>> setOfStringContribution1Provider;
  private Provider<Set<String>> setOfStringProvider;
  private Provider<OnlyUsedInParent> provideOnlyUsedInParentProvider;

  private DaggerParentComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static ParentComponent.Builder builder() {  
    return new Builder();
  }

  public static ParentComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideStringProvider = RepeatedModule_ProvideStringFactory.create(builder.repeatedModule);
    this.setOfStringContribution1Provider = RepeatedModule_ContributeStringFactory.create(builder.repeatedModule);
    this.setOfStringProvider = SetFactory.create(setOfStringContribution1Provider);
    this.provideOnlyUsedInParentProvider = RepeatedModule_ProvideOnlyUsedInParentFactory.create(builder.repeatedModule);
  }

  @Override
  public String getString() {  
    return provideStringProvider.get();
  }

  @Override
  public Set<String> getMultiboundStrings() {  
    return setOfStringProvider.get();
  }

  @Override
  public OnlyUsedInParent getOnlyUsedInParent() {  
    return provideOnlyUsedInParentProvider.get();
  }

  @Override
  public ChildComponent newChildComponent() {  
    return new ChildComponentImpl();
  }

  private static final class Builder implements ParentComponent.Builder {
    private RepeatedModule repeatedModule;
  
  
    @Override
    public ParentComponent build() {  
      if (repeatedModule == null) {
        this.repeatedModule = new RepeatedModule();
      }
      return new DaggerParentComponent(this);
    }
  }

  private final class ChildComponentImpl implements ChildComponent {
    private final RepeatedModule repeatedModule;
    private Provider<Set<String>> setOfStringContribution1Provider;
    private Provider<Set<String>> setOfStringProvider;
    private Provider<OnlyUsedInChild> provideOnlyUsedInChildProvider;
  
    private ChildComponentImpl() {  
      this.repeatedModule = new RepeatedModule();
      initialize();
    }
  
    private void initialize() {  
      this.setOfStringContribution1Provider = RepeatedModule_ContributeStringFactory.create(repeatedModule);
      this.setOfStringProvider = SetFactory.create(setOfStringContribution1Provider);
      this.provideOnlyUsedInChildProvider = RepeatedModule_ProvideOnlyUsedInChildFactory.create(repeatedModule);
    }
  
    @Override
    public String getString() {  
      return DaggerParentComponent.this.provideStringProvider.get();
    }
  
    @Override
    public Set<String> getMultiboundStrings() {  
      return setOfStringProvider.get();
    }
  
    @Override
    public OnlyUsedInChild getOnlyUsedInChild() {  
      return provideOnlyUsedInChildProvider.get();
    }
  }
}

