package test.multipackage;

import dagger.internal.SetFactory;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.multipackage.a.AModule;
import test.multipackage.a.AModule_ProvideStringFactory;
import test.multipackage.b.BModule;
import test.multipackage.b.BModule_ProvideStringFactory;
import test.multipackage.c.CModule;
import test.multipackage.c.CModule_ProvideStringFactory;
import test.multipackage.d.DModule;
import test.multipackage.d.DModule_ProvideStringFactory;
import test.multipackage.foo.Foo;
import test.multipackage.foo.Foo_Factory;
import test.multipackage.grandsub.FooGrandchildComponent;
import test.multipackage.sub.FooChildComponent;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerFooComponent implements FooComponent {
  private Provider<Set<String>> setOfStringContribution1Provider;
  private Provider<Set<String>> setOfStringProvider;

  private DaggerFooComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static FooComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.setOfStringContribution1Provider = AModule_ProvideStringFactory.create(builder.aModule);
    this.setOfStringProvider = SetFactory.create(setOfStringContribution1Provider);
  }

  @Override
  public Set<String> setOfString() {  
    return setOfStringProvider.get();
  }

  @Override
  public FooChildComponent fooChildComponent() {  
    return new FooChildComponentImpl();
  }

  public static final class Builder {
    private AModule aModule;
  
    private Builder() {  
    }
  
    public FooComponent build() {  
      if (aModule == null) {
        this.aModule = new AModule();
      }
      return new DaggerFooComponent(this);
    }
  
    public Builder aModule(AModule aModule) {  
      if (aModule == null) {
        throw new NullPointerException("aModule");
      }
      this.aModule = aModule;
      return this;
    }
  }

  private final class FooChildComponentImpl implements FooChildComponent {
    private final BModule bModule;
    private final CModule cModule;
    private Provider<Set<String>> setOfStringContribution2Provider;
    private Provider<Set<String>> setOfStringContribution3Provider;
    private Provider<Set<String>> setOfStringProvider;
    private Provider<Foo<FooChildComponent>> fooProvider;
  
    private FooChildComponentImpl() {  
      this.bModule = new BModule();
      this.cModule = new CModule();
      initialize();
    }
  
    private void initialize() {  
      this.setOfStringContribution2Provider = BModule_ProvideStringFactory.create(bModule);
      this.setOfStringContribution3Provider = CModule_ProvideStringFactory.create(cModule);
      this.setOfStringProvider = SetFactory.create(setOfStringContribution1Provider, setOfStringContribution2Provider, setOfStringContribution3Provider);
      this.fooProvider = Foo_Factory.create(setOfStringProvider);
    }
  
    @Override
    public Foo<FooChildComponent> foo() {  
      return fooProvider.get();
    }
  
    @Override
    public FooGrandchildComponent fooGrandchildComponent() {  
      return new FooGrandchildComponentImpl();
    }
  
    private final class FooGrandchildComponentImpl implements FooGrandchildComponent {
      private final DModule dModule;
      private Provider<Set<String>> setOfStringContribution4Provider;
      private Provider<Set<String>> setOfStringProvider;
      private Provider<Foo<FooGrandchildComponent>> fooProvider;
    
      private FooGrandchildComponentImpl() {  
        this.dModule = new DModule();
        initialize();
      }
    
      private void initialize() {  
        this.setOfStringContribution4Provider = DModule_ProvideStringFactory.create(dModule);
        this.setOfStringProvider = SetFactory.create(setOfStringContribution1Provider, setOfStringContribution2Provider, setOfStringContribution3Provider, setOfStringContribution4Provider);
        this.fooProvider = Foo_Factory.create(setOfStringProvider);
      }
    
      @Override
      public Foo<FooGrandchildComponent> foo() {  
        return fooProvider.get();
      }
    }
  }
}

