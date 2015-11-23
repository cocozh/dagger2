package test.subcomponent.hiding;

import javax.annotation.Generated;
import javax.inject.Provider;
import test.subcomponent.hiding.a.CommonModuleName;
import test.subcomponent.hiding.a.CommonModuleName_ProvideStringFactory;
import test.subcomponent.hiding.a.CommonName;
import test.subcomponent.hiding.a.CommonName_Factory;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerParentComponent implements ParentComponent {
  private Provider<String> provideStringProvider;
  private Provider<CommonName> commonNameProvider;

  private DaggerParentComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static ParentComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideStringProvider = CommonModuleName_ProvideStringFactory.create(builder.commonModuleName);
    this.commonNameProvider = CommonName_Factory.create(provideStringProvider);
  }

  @Override
  public CommonName aCommonName() {  
    return commonNameProvider.get();
  }

  @Override
  public ChildComponent newChildComponent() {  
    return new ChildComponentImpl();
  }

  public static final class Builder {
    private CommonModuleName commonModuleName;
  
    private Builder() {  
    }
  
    public ParentComponent build() {  
      if (commonModuleName == null) {
        this.commonModuleName = new CommonModuleName();
      }
      return new DaggerParentComponent(this);
    }
  
    public Builder commonModuleName(CommonModuleName commonModuleName) {  
      if (commonModuleName == null) {
        throw new NullPointerException("commonModuleName");
      }
      this.commonModuleName = commonModuleName;
      return this;
    }
  }

  private final class ChildComponentImpl implements ChildComponent {
    private final test.subcomponent.hiding.b.CommonModuleName commonModuleName;
    private Provider<Integer> provideStringProvider;
    private Provider<test.subcomponent.hiding.b.CommonName> commonNameProvider;
  
    private ChildComponentImpl() {  
      this.commonModuleName = new test.subcomponent.hiding.b.CommonModuleName();
      initialize();
    }
  
    private void initialize() {  
      this.provideStringProvider = test.subcomponent.hiding.b.CommonModuleName_ProvideStringFactory.create(commonModuleName);
      this.commonNameProvider = test.subcomponent.hiding.b.CommonName_Factory.create(provideStringProvider);
    }
  
    @Override
    public CommonName aCommonName() {  
      return DaggerParentComponent.this.commonNameProvider.get();
    }
  
    @Override
    public test.subcomponent.hiding.b.CommonName bCommonName() {  
      return commonNameProvider.get();
    }
  }
}

