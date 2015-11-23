package test.builder;

import javax.annotation.Generated;
import javax.inject.Provider;
import test.builder.TestComponentWithBuilderAbstractClass;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerTestComponentWithBuilderAbstractClass extends TestComponentWithBuilderAbstractClass {
  private Provider<String> stringProvider;
  private Provider<Integer> integerProvider;
  private Provider<Long> lProvider;
  private Provider<Float> fProvider;
  private Provider<Double> dProvider;

  private DaggerTestComponentWithBuilderAbstractClass(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static TestComponentWithBuilderAbstractClass.Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.stringProvider = StringModule_StringFactory.create(builder.stringModule);
    this.integerProvider = IntModuleIncludingDoubleAndFloat_IntegerFactory.create(builder.intModuleIncludingDoubleAndFloat);
    this.lProvider = LongModule_LFactory.create(builder.longModule);
    this.fProvider = FloatModule_FFactory.create(builder.floatModule);
    this.dProvider = DoubleModule_DFactory.create(builder.doubleModule);
  }

  @Override
  public String s() {  
    return stringProvider.get();
  }

  @Override
  public int i() {  
    return integerProvider.get();
  }

  @Override
  public long l() {  
    return lProvider.get();
  }

  @Override
  public float f() {  
    return fProvider.get();
  }

  @Override
  public double d() {  
    return dProvider.get();
  }

  private static final class Builder extends TestComponentWithBuilderAbstractClass.Builder {
    private StringModule stringModule;
    private IntModuleIncludingDoubleAndFloat intModuleIncludingDoubleAndFloat;
    private DoubleModule doubleModule;
    private FloatModule floatModule;
    private LongModule longModule;
    private DepComponent depComponent;
  
  
    @Override
    public TestComponentWithBuilderAbstractClass build() {  
      if (stringModule == null) {
        throw new IllegalStateException("stringModule must be set");
      }
      if (intModuleIncludingDoubleAndFloat == null) {
        throw new IllegalStateException("intModuleIncludingDoubleAndFloat must be set");
      }
      if (doubleModule == null) {
        this.doubleModule = new DoubleModule();
      }
      if (floatModule == null) {
        this.floatModule = new FloatModule();
      }
      if (longModule == null) {
        this.longModule = new LongModule();
      }
      if (depComponent == null) {
        throw new IllegalStateException("depComponent must be set");
      }
      return new DaggerTestComponentWithBuilderAbstractClass(this);
    }
  
    @Override
    public Builder stringModule(StringModule stringModule) {  
      if (stringModule == null) {
        throw new NullPointerException("stringModule");
      }
      this.stringModule = stringModule;
      return this;
    }
  
    @Override
    public Builder intModule(IntModuleIncludingDoubleAndFloat intModuleIncludingDoubleAndFloat) {  
      if (intModuleIncludingDoubleAndFloat == null) {
        throw new NullPointerException("intModuleIncludingDoubleAndFloat");
      }
      this.intModuleIncludingDoubleAndFloat = intModuleIncludingDoubleAndFloat;
      return this;
    }
  
    @Override
    public void doubleModule(DoubleModule doubleModule) {  
      if (doubleModule == null) {
        throw new NullPointerException("doubleModule");
      }
      this.doubleModule = doubleModule;
    }
  
    @Override
    public void depComponent(DepComponent depComponent) {  
      if (depComponent == null) {
        throw new NullPointerException("depComponent");
      }
      this.depComponent = depComponent;
    }
  }
}

