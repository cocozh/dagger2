package test.builder;

import javax.annotation.Generated;
import javax.inject.Provider;
import test.builder.Grandchild;
import test.builder.MiddleChild;
import test.builder.OtherMiddleChild;
import test.builder.TestChildComponentWithBuilderAbstractClass;
import test.builder.TestChildComponentWithBuilderInterface;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerParentComponent implements ParentComponent {
  private DaggerParentComponent(Builder builder) {  
    assert builder != null;
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static ParentComponent create() {  
    return builder().build();
  }

  @Override
  public TestChildComponentWithBuilderAbstractClass.Builder childAbstractClassBuilder() {  
    return new TestChildComponentWithBuilderAbstractClassBuilder();
  }

  @Override
  public TestChildComponentWithBuilderInterface.Builder childInterfaceBuilder() {  
    return new TestChildComponentWithBuilderInterfaceBuilder();
  }

  @Override
  public MiddleChild.Builder middleBuilder() {  
    return new MiddleChildBuilder();
  }

  @Override
  public OtherMiddleChild.Builder otherBuilder() {  
    return new OtherMiddleChildBuilder();
  }

  public static final class Builder {
    private Builder() {  
    }
  
    public ParentComponent build() {  
      return new DaggerParentComponent(this);
    }
  }

  private final class TestChildComponentWithBuilderAbstractClassImpl implements TestChildComponentWithBuilderAbstractClass {
    private Provider<String> stringProvider;
    private Provider<Integer> integerProvider;
    private Provider<Long> lProvider;
    private Provider<Float> fProvider;
    private Provider<Double> dProvider;
    private Provider<Byte> bProvider;
  
    private TestChildComponentWithBuilderAbstractClassImpl(TestChildComponentWithBuilderAbstractClassBuilder builder) {  
      assert builder != null;
      initialize(builder);
    }
  
    private void initialize(final TestChildComponentWithBuilderAbstractClassBuilder builder) {  
      this.stringProvider = StringModule_StringFactory.create(builder.stringModule);
      this.integerProvider = IntModuleIncludingDoubleAndFloat_IntegerFactory.create(builder.intModuleIncludingDoubleAndFloat);
      this.lProvider = LongModule_LFactory.create(builder.longModule);
      this.fProvider = FloatModule_FFactory.create(builder.floatModule);
      this.dProvider = DoubleModule_DFactory.create(builder.doubleModule);
      this.bProvider = ByteModule_BFactory.create(builder.byteModule);
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
  
    @Override
    public byte b() {  
      return bProvider.get();
    }
  }

  private final class TestChildComponentWithBuilderAbstractClassBuilder extends TestChildComponentWithBuilderAbstractClass.Builder {
    private StringModule stringModule;
    private IntModuleIncludingDoubleAndFloat intModuleIncludingDoubleAndFloat;
    private DoubleModule doubleModule;
    private FloatModule floatModule;
    private LongModule longModule;
    private ByteModule byteModule;
  
  
    @Override
    public TestChildComponentWithBuilderAbstractClass build() {  
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
      if (byteModule == null) {
        throw new IllegalStateException("byteModule must be set");
      }
      return new TestChildComponentWithBuilderAbstractClassImpl(this);
    }
  
    @Override
    public TestChildComponentWithBuilderAbstractClassBuilder setM1(StringModule stringModule) {  
      if (stringModule == null) {
        throw new NullPointerException("stringModule");
      }
      this.stringModule = stringModule;
      return this;
    }
  
    @Override
    public TestChildComponentWithBuilderAbstractClassBuilder setM2(IntModuleIncludingDoubleAndFloat intModuleIncludingDoubleAndFloat) {  
      if (intModuleIncludingDoubleAndFloat == null) {
        throw new NullPointerException("intModuleIncludingDoubleAndFloat");
      }
      this.intModuleIncludingDoubleAndFloat = intModuleIncludingDoubleAndFloat;
      return this;
    }
  
    @Override
    public void setM3(DoubleModule doubleModule) {  
      if (doubleModule == null) {
        throw new NullPointerException("doubleModule");
      }
      this.doubleModule = doubleModule;
    }
  
    @Override
    public TestChildComponentWithBuilderAbstractClassBuilder set(FloatModule floatModule) {  
      if (floatModule == null) {
        throw new NullPointerException("floatModule");
      }
      this.floatModule = floatModule;
      return this;
    }
  
    @Override
    public void set(ByteModule byteModule) {  
      if (byteModule == null) {
        throw new NullPointerException("byteModule");
      }
      this.byteModule = byteModule;
    }
  }

  private final class TestChildComponentWithBuilderInterfaceImpl implements TestChildComponentWithBuilderInterface {
    private Provider<String> stringProvider;
    private Provider<Integer> integerProvider;
    private Provider<Long> lProvider;
    private Provider<Float> fProvider;
    private Provider<Double> dProvider;
    private Provider<Byte> bProvider;
  
    private TestChildComponentWithBuilderInterfaceImpl(TestChildComponentWithBuilderInterfaceBuilder builder) {  
      assert builder != null;
      initialize(builder);
    }
  
    private void initialize(final TestChildComponentWithBuilderInterfaceBuilder builder) {  
      this.stringProvider = StringModule_StringFactory.create(builder.stringModule);
      this.integerProvider = IntModuleIncludingDoubleAndFloat_IntegerFactory.create(builder.intModuleIncludingDoubleAndFloat);
      this.lProvider = LongModule_LFactory.create(builder.longModule);
      this.fProvider = FloatModule_FFactory.create(builder.floatModule);
      this.dProvider = DoubleModule_DFactory.create(builder.doubleModule);
      this.bProvider = ByteModule_BFactory.create(builder.byteModule);
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
  
    @Override
    public byte b() {  
      return bProvider.get();
    }
  }

  private final class TestChildComponentWithBuilderInterfaceBuilder implements TestChildComponentWithBuilderInterface.Builder {
    private StringModule stringModule;
    private IntModuleIncludingDoubleAndFloat intModuleIncludingDoubleAndFloat;
    private DoubleModule doubleModule;
    private FloatModule floatModule;
    private LongModule longModule;
    private ByteModule byteModule;
  
  
    @Override
    public TestChildComponentWithBuilderInterface build() {  
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
      if (byteModule == null) {
        throw new IllegalStateException("byteModule must be set");
      }
      return new TestChildComponentWithBuilderInterfaceImpl(this);
    }
  
    @Override
    public TestChildComponentWithBuilderInterfaceBuilder setM1(StringModule stringModule) {  
      if (stringModule == null) {
        throw new NullPointerException("stringModule");
      }
      this.stringModule = stringModule;
      return this;
    }
  
    @Override
    public TestChildComponentWithBuilderInterfaceBuilder setM2(IntModuleIncludingDoubleAndFloat intModuleIncludingDoubleAndFloat) {  
      if (intModuleIncludingDoubleAndFloat == null) {
        throw new NullPointerException("intModuleIncludingDoubleAndFloat");
      }
      this.intModuleIncludingDoubleAndFloat = intModuleIncludingDoubleAndFloat;
      return this;
    }
  
    @Override
    public void setM3(DoubleModule doubleModule) {  
      if (doubleModule == null) {
        throw new NullPointerException("doubleModule");
      }
      this.doubleModule = doubleModule;
    }
  
    @Override
    public TestChildComponentWithBuilderInterfaceBuilder set(FloatModule floatModule) {  
      if (floatModule == null) {
        throw new NullPointerException("floatModule");
      }
      this.floatModule = floatModule;
      return this;
    }
  
    @Override
    public void set(ByteModule byteModule) {  
      if (byteModule == null) {
        throw new NullPointerException("byteModule");
      }
      this.byteModule = byteModule;
    }
  }

  private final class MiddleChildImpl implements MiddleChild {
    private Provider<String> stringProvider;
  
    private MiddleChildImpl(MiddleChildBuilder builder) {  
      assert builder != null;
      initialize(builder);
    }
  
    private void initialize(final MiddleChildBuilder builder) {  
      this.stringProvider = StringModule_StringFactory.create(builder.stringModule);
    }
  
    @Override
    public String s() {  
      return stringProvider.get();
    }
  
    @Override
    public Grandchild.Builder grandchildBuilder() {  
      return new GrandchildBuilder();
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
        return MiddleChildImpl.this.stringProvider.get();
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

  private final class MiddleChildBuilder implements MiddleChild.Builder {
    private StringModule stringModule;
  
  
    @Override
    public MiddleChild build() {  
      if (stringModule == null) {
        throw new IllegalStateException("stringModule must be set");
      }
      return new MiddleChildImpl(this);
    }
  
    @Override
    public MiddleChildBuilder set(StringModule stringModule) {  
      if (stringModule == null) {
        throw new NullPointerException("stringModule");
      }
      this.stringModule = stringModule;
      return this;
    }
  }

  private final class OtherMiddleChildImpl implements OtherMiddleChild {
    private Provider<Long> lProvider;
    private Provider<String> stringProvider;
  
    private OtherMiddleChildImpl(OtherMiddleChildBuilder builder) {  
      assert builder != null;
      initialize(builder);
    }
  
    private void initialize(final OtherMiddleChildBuilder builder) {  
      this.lProvider = LongModule_LFactory.create(builder.longModule);
      this.stringProvider = StringModule_StringFactory.create(builder.stringModule);
    }
  
    @Override
    public long l() {  
      return lProvider.get();
    }
  
    @Override
    public String s() {  
      return stringProvider.get();
    }
  
    @Override
    public Grandchild.Builder grandchildBuilder() {  
      return new GrandchildBuilder();
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
        return OtherMiddleChildImpl.this.stringProvider.get();
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

  private final class OtherMiddleChildBuilder implements OtherMiddleChild.Builder {
    private StringModule stringModule;
    private LongModule longModule;
  
  
    @Override
    public OtherMiddleChild build() {  
      if (stringModule == null) {
        throw new IllegalStateException("stringModule must be set");
      }
      if (longModule == null) {
        this.longModule = new LongModule();
      }
      return new OtherMiddleChildImpl(this);
    }
  
    @Override
    public OtherMiddleChildBuilder set(StringModule stringModule) {  
      if (stringModule == null) {
        throw new NullPointerException("stringModule");
      }
      this.stringModule = stringModule;
      return this;
    }
  }
}

