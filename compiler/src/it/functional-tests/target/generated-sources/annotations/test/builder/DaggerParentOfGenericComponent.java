package test.builder;

import javax.annotation.Generated;
import javax.inject.Provider;
import test.builder.Grandchild;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerParentOfGenericComponent implements ParentOfGenericComponent {
  private Provider<String> stringProvider;

  private DaggerParentOfGenericComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.stringProvider = StringModule_StringFactory.create(builder.stringModule);
  }

  @Override
  public Grandchild.Builder subcomponentBuilder() {  
    return new GrandchildBuilder();
  }

  public static final class Builder {
    private StringModule stringModule;
  
    private Builder() {  
    }
  
    public ParentOfGenericComponent build() {  
      if (stringModule == null) {
        throw new IllegalStateException("stringModule must be set");
      }
      return new DaggerParentOfGenericComponent(this);
    }
  
    public Builder stringModule(StringModule stringModule) {  
      if (stringModule == null) {
        throw new NullPointerException("stringModule");
      }
      this.stringModule = stringModule;
      return this;
    }
  }

  private final class GrandchildImpl implements Grandchild {
    private Provider<Integer> integerProvider;
  
    private GrandchildImpl(GrandchildBuilder builder) {  
      assert builder != null;
      initialize(builder);
    }
  
    private void initialize(final GrandchildBuilder builder) {  
      this.integerProvider = IntModuleIncludingDoubleAndFloat_IntegerFactory.create(builder.intModuleIncludingDoubleAndFloat);
    }
  
    @Override
    public int i() {  
      return integerProvider.get();
    }
  
    @Override
    public String s() {  
      return DaggerParentOfGenericComponent.this.stringProvider.get();
    }
  }

  private final class GrandchildBuilder implements Grandchild.Builder {
    private IntModuleIncludingDoubleAndFloat intModuleIncludingDoubleAndFloat;
    private DoubleModule doubleModule;
    private FloatModule floatModule;
  
  
    @Override
    public Grandchild build() {  
      if (intModuleIncludingDoubleAndFloat == null) {
        throw new IllegalStateException("intModuleIncludingDoubleAndFloat must be set");
      }
      if (doubleModule == null) {
        this.doubleModule = new DoubleModule();
      }
      if (floatModule == null) {
        this.floatModule = new FloatModule();
      }
      return new GrandchildImpl(this);
    }
  
    @Override
    public GrandchildBuilder set(IntModuleIncludingDoubleAndFloat intModuleIncludingDoubleAndFloat) {  
      if (intModuleIncludingDoubleAndFloat == null) {
        throw new NullPointerException("intModuleIncludingDoubleAndFloat");
      }
      this.intModuleIncludingDoubleAndFloat = intModuleIncludingDoubleAndFloat;
      return this;
    }
  }
}

