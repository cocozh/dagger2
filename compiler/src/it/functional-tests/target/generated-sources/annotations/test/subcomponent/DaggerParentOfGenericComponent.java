package test.subcomponent;

import dagger.internal.ScopedProvider;
import dagger.internal.SetFactory;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerParentOfGenericComponent implements ParentOfGenericComponent {
  private Provider<SingletonType> singletonTypeProvider;
  private Provider<UnscopedType> unscopedTypeProvider;
  private Provider<Set<Object>> setOfObjectContribution1Provider;
  private Provider<Set<Object>> setOfObjectContribution2Provider;
  private Provider<Set<Object>> setOfObjectProvider;
  private Provider<UnscopedType> provideUnscopedTypeBoundAsSingletonProvider;

  private DaggerParentOfGenericComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static ParentOfGenericComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.singletonTypeProvider = ScopedProvider.create(SingletonType_Factory.create());
    this.unscopedTypeProvider = UnscopedType_Factory.create(singletonTypeProvider);
    this.setOfObjectContribution1Provider = ParentModule_ProvideUnscopedObjectFactory.create(builder.parentModule);
    this.setOfObjectContribution2Provider = ScopedProvider.create(ParentModule_ProvideSingletonObjectFactory.create(builder.parentModule));
    this.setOfObjectProvider = SetFactory.create(setOfObjectContribution1Provider, setOfObjectContribution2Provider);
    this.provideUnscopedTypeBoundAsSingletonProvider = ScopedProvider.create(ParentModule_ProvideUnscopedTypeBoundAsSingletonFactory.create(builder.parentModule, unscopedTypeProvider));
  }

  @Override
  public Provider<UnscopedType> getUnscopedTypeProvider() {  
    return unscopedTypeProvider;
  }

  @Override
  public Set<Object> objectSet() {  
    return setOfObjectProvider.get();
  }

  @Override
  public ChildComponent subcomponent() {  
    return new ChildComponentImpl();
  }

  public static final class Builder {
    private ParentModule parentModule;
  
    private Builder() {  
    }
  
    public ParentOfGenericComponent build() {  
      if (parentModule == null) {
        this.parentModule = new ParentModule();
      }
      return new DaggerParentOfGenericComponent(this);
    }
  
    public Builder parentModule(ParentModule parentModule) {  
      if (parentModule == null) {
        throw new NullPointerException("parentModule");
      }
      this.parentModule = parentModule;
      return this;
    }
  }

  private final class ChildComponentImpl implements ChildComponent {
    private final ChildModule childModule;
    private Provider<RequiresSingletons> requiresSingletonsProvider;
    private Provider<Set<Object>> setOfObjectContribution3Provider;
    private Provider<Set<Object>> setOfObjectProvider;
  
    private ChildComponentImpl() {  
      this.childModule = new ChildModule();
      initialize();
    }
  
    private void initialize() {  
      this.requiresSingletonsProvider = RequiresSingletons_Factory.create(DaggerParentOfGenericComponent.this.singletonTypeProvider, DaggerParentOfGenericComponent.this.provideUnscopedTypeBoundAsSingletonProvider);
      this.setOfObjectContribution3Provider = ChildModule_ProvideUnscopedObjectFactory.create(childModule);
      this.setOfObjectProvider = SetFactory.create(setOfObjectContribution1Provider, setOfObjectContribution2Provider, setOfObjectContribution3Provider);
    }
  
    @Override
    public Provider<UnscopedType> getUnscopedTypeProvider() {  
      return DaggerParentOfGenericComponent.this.unscopedTypeProvider;
    }
  
    @Override
    public RequiresSingletons requiresSingleton() {  
      return requiresSingletonsProvider.get();
    }
  
    @Override
    public Set<Object> objectSet() {  
      return setOfObjectProvider.get();
    }
  
    @Override
    public GrandchildComponent newGrandchildComponent() {  
      return new GrandchildComponentImpl();
    }
  
    private final class GrandchildComponentImpl implements GrandchildComponent {
      private final GrandchildModule grandchildModule;
      private Provider<Set<Object>> setOfObjectContribution4Provider;
      private Provider<Set<Object>> setOfObjectProvider;
      private Provider<AnInterface> provideAnInterfaceProvider;
      private Provider<NeedsAnInterface> provideNeedsAnInterfaceProvider;
    
      private GrandchildComponentImpl() {  
        this.grandchildModule = new GrandchildModule();
        initialize();
      }
    
      private void initialize() {  
        this.setOfObjectContribution4Provider = GrandchildModule_ProvideUnscopedObjectFactory.create(grandchildModule);
        this.setOfObjectProvider = SetFactory.create(setOfObjectContribution1Provider, setOfObjectContribution2Provider, setOfObjectContribution3Provider, setOfObjectContribution4Provider);
        this.provideAnInterfaceProvider = GrandchildModule_ProvideAnInterfaceFactory.create(grandchildModule, ImplementsAnInterface_Factory.create());
        this.provideNeedsAnInterfaceProvider = GrandchildModule_ProvideNeedsAnInterfaceFactory.create(grandchildModule, provideAnInterfaceProvider);
      }
    
      @Override
      public Provider<UnscopedType> getUnscopedTypeProvider() {  
        return DaggerParentOfGenericComponent.this.unscopedTypeProvider;
      }
    
      @Override
      public RequiresSingletons requiresSingleton() {  
        return ChildComponentImpl.this.requiresSingletonsProvider.get();
      }
    
      @Override
      public Set<Object> objectSet() {  
        return setOfObjectProvider.get();
      }
    
      @Override
      public NeedsAnInterface needsAnInterface() {  
        return provideNeedsAnInterfaceProvider.get();
      }
    }
  }
}

