package test;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheckLazy;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.sub.OtherThing;
import test.sub.OtherThing_Factory;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerBasicComponent implements BasicComponent {
  private Provider<OtherThing> otherThingProvider;
  private Provider<Thing> thingProvider;
  private MembersInjector<InjectedThing> injectedThingMembersInjector;
  private Provider<InjectedThing> injectedThingProvider;
  private MembersInjector<AbstractMembersInjectingBaseClass> abstractMembersInjectingBaseClassMembersInjector;
  private MembersInjector<AbstractMiddleClassWithoutMembers> abstractMiddleClassWithoutMembersMembersInjector;
  private MembersInjector<TypeWithInheritedMembersInjection> typeWithInheritedMembersInjectionMembersInjector;
  private Provider<TypeWithInheritedMembersInjection> typeWithInheritedMembersInjectionProvider;

  private DaggerBasicComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static BasicComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.otherThingProvider = OtherThing_Factory.create(PrimitivesModule_ProvideIntFactory.create());
    this.thingProvider = Thing_Factory.create(otherThingProvider);
    this.injectedThingMembersInjector = InjectedThing_MembersInjector.create(PrimitivesModule_ProvideByteFactory.create(), PrimitivesModule_ProvideCharFactory.create(), PrimitivesModule_ProvideShortFactory.create(), PrimitivesModule_ProvideIntFactory.create(), PrimitivesModule_ProvideLongFactory.create(), PrimitivesModule_ProvideBooleanFactory.create(), PrimitivesModule_ProvideFloatFactory.create(), PrimitivesModule_BoundDoubleFactory.create(), PrimitivesModule_ProvideByteArrayFactory.create(), PrimitivesModule_ProvideCharArrayFactory.create(), PrimitivesModule_ProvideShortArrayFactory.create(), PrimitivesModule_ProvideIntArrayFactory.create(), PrimitivesModule_ProvideLongArrayFactory.create(), PrimitivesModule_ProvideBooleanArrayFactory.create(), PrimitivesModule_ProvideFloatArrayFactory.create(), PrimitivesModule_BoundDoubleArrayFactory.create(), thingProvider, (MembersInjector) MembersInjectors.noOp());
    this.injectedThingProvider = InjectedThing_Factory.create(injectedThingMembersInjector, PrimitivesModule_ProvideByteFactory.create(), PrimitivesModule_ProvideCharFactory.create(), PrimitivesModule_ProvideShortFactory.create(), PrimitivesModule_ProvideIntFactory.create(), PrimitivesModule_ProvideLongFactory.create(), PrimitivesModule_ProvideBooleanFactory.create(), PrimitivesModule_ProvideFloatFactory.create(), PrimitivesModule_BoundDoubleFactory.create(), PrimitivesModule_ProvideByteArrayFactory.create(), PrimitivesModule_ProvideCharArrayFactory.create(), PrimitivesModule_ProvideShortArrayFactory.create(), PrimitivesModule_ProvideIntArrayFactory.create(), PrimitivesModule_ProvideLongArrayFactory.create(), PrimitivesModule_ProvideBooleanArrayFactory.create(), PrimitivesModule_ProvideFloatArrayFactory.create(), PrimitivesModule_BoundDoubleArrayFactory.create(), thingProvider, (MembersInjector) MembersInjectors.noOp());
    this.abstractMembersInjectingBaseClassMembersInjector = AbstractMembersInjectingBaseClass_MembersInjector.create(thingProvider);
    this.abstractMiddleClassWithoutMembersMembersInjector = MembersInjectors.delegatingTo(abstractMembersInjectingBaseClassMembersInjector);
    this.typeWithInheritedMembersInjectionMembersInjector = MembersInjectors.delegatingTo(abstractMiddleClassWithoutMembersMembersInjector);
    this.typeWithInheritedMembersInjectionProvider = TypeWithInheritedMembersInjection_Factory.create(typeWithInheritedMembersInjectionMembersInjector);
  }

  @Override
  public Thing instance() {  
    return thingProvider.get();
  }

  @Override
  public Provider<Thing> provider() {  
    return thingProvider;
  }

  @Override
  public Lazy<Thing> lazy() {  
    return DoubleCheckLazy.create(thingProvider);
  }

  @Override
  public MembersInjector<Thing> membersInjector() {  
    return MembersInjectors.noOp();
  }

  @Override
  public void injectMembers(Thing t) {  
    MembersInjectors.noOp().injectMembers(t);
  }

  @Override
  public Thing injectMembersAndReturn(Thing t) {  
    MembersInjectors.noOp().injectMembers(t);
    return t;
  }

  @Override
  public byte getByte() {  
    return PrimitivesModule_ProvideByteFactory.create().get();
  }

  @Override
  public char getChar() {  
    return PrimitivesModule_ProvideCharFactory.create().get();
  }

  @Override
  public short getShort() {  
    return PrimitivesModule_ProvideShortFactory.create().get();
  }

  @Override
  public int getInt() {  
    return PrimitivesModule_ProvideIntFactory.create().get();
  }

  @Override
  public long getLong() {  
    return PrimitivesModule_ProvideLongFactory.create().get();
  }

  @Override
  public boolean getBoolean() {  
    return PrimitivesModule_ProvideBooleanFactory.create().get();
  }

  @Override
  public float getFloat() {  
    return PrimitivesModule_ProvideFloatFactory.create().get();
  }

  @Override
  public double getDouble() {  
    return PrimitivesModule_BoundDoubleFactory.create().get();
  }

  @Override
  public Byte getBoxedByte() {  
    return PrimitivesModule_ProvideByteFactory.create().get();
  }

  @Override
  public Character getBoxedChar() {  
    return PrimitivesModule_ProvideCharFactory.create().get();
  }

  @Override
  public Short getBoxedShort() {  
    return PrimitivesModule_ProvideShortFactory.create().get();
  }

  @Override
  public Integer getBoxedInt() {  
    return PrimitivesModule_ProvideIntFactory.create().get();
  }

  @Override
  public Long getBoxedLong() {  
    return PrimitivesModule_ProvideLongFactory.create().get();
  }

  @Override
  public Boolean getBoxedBoolean() {  
    return PrimitivesModule_ProvideBooleanFactory.create().get();
  }

  @Override
  public Float getBoxedFloat() {  
    return PrimitivesModule_ProvideFloatFactory.create().get();
  }

  @Override
  public Double getBoxedDouble() {  
    return PrimitivesModule_BoundDoubleFactory.create().get();
  }

  @Override
  public Provider<Byte> getByteProvider() {  
    return PrimitivesModule_ProvideByteFactory.create();
  }

  @Override
  public Provider<Character> getCharProvider() {  
    return PrimitivesModule_ProvideCharFactory.create();
  }

  @Override
  public Provider<Short> getShortProvider() {  
    return PrimitivesModule_ProvideShortFactory.create();
  }

  @Override
  public Provider<Integer> getIntProvider() {  
    return PrimitivesModule_ProvideIntFactory.create();
  }

  @Override
  public Provider<Long> getLongProvider() {  
    return PrimitivesModule_ProvideLongFactory.create();
  }

  @Override
  public Provider<Boolean> getBooleanProvider() {  
    return PrimitivesModule_ProvideBooleanFactory.create();
  }

  @Override
  public Provider<Float> getFloatProvider() {  
    return PrimitivesModule_ProvideFloatFactory.create();
  }

  @Override
  public Provider<Double> getDoubleProvider() {  
    return PrimitivesModule_BoundDoubleFactory.create();
  }

  @Override
  public byte[] getByteArray() {  
    return PrimitivesModule_ProvideByteArrayFactory.create().get();
  }

  @Override
  public char[] getCharArray() {  
    return PrimitivesModule_ProvideCharArrayFactory.create().get();
  }

  @Override
  public short[] getShortArray() {  
    return PrimitivesModule_ProvideShortArrayFactory.create().get();
  }

  @Override
  public int[] getIntArray() {  
    return PrimitivesModule_ProvideIntArrayFactory.create().get();
  }

  @Override
  public long[] getLongArray() {  
    return PrimitivesModule_ProvideLongArrayFactory.create().get();
  }

  @Override
  public boolean[] getBooleanArray() {  
    return PrimitivesModule_ProvideBooleanArrayFactory.create().get();
  }

  @Override
  public float[] getFloatArray() {  
    return PrimitivesModule_ProvideFloatArrayFactory.create().get();
  }

  @Override
  public double[] getDoubleArray() {  
    return PrimitivesModule_BoundDoubleArrayFactory.create().get();
  }

  @Override
  public Provider<byte[]> getByteArrayProvider() {  
    return PrimitivesModule_ProvideByteArrayFactory.create();
  }

  @Override
  public Provider<char[]> getCharArrayProvider() {  
    return PrimitivesModule_ProvideCharArrayFactory.create();
  }

  @Override
  public Provider<short[]> getShortArrayProvider() {  
    return PrimitivesModule_ProvideShortArrayFactory.create();
  }

  @Override
  public Provider<int[]> getIntArrayProvider() {  
    return PrimitivesModule_ProvideIntArrayFactory.create();
  }

  @Override
  public Provider<long[]> getLongArrayProvider() {  
    return PrimitivesModule_ProvideLongArrayFactory.create();
  }

  @Override
  public Provider<boolean[]> getBooleanArrayProvider() {  
    return PrimitivesModule_ProvideBooleanArrayFactory.create();
  }

  @Override
  public Provider<float[]> getFloatArrayProvider() {  
    return PrimitivesModule_ProvideFloatArrayFactory.create();
  }

  @Override
  public Provider<double[]> getDoubleArrayProvider() {  
    return PrimitivesModule_BoundDoubleArrayFactory.create();
  }

  @Override
  public Object noOpMembersInjection(Object obviouslyDoesNotHaveMembersToInject) {  
    MembersInjectors.noOp().injectMembers(obviouslyDoesNotHaveMembersToInject);
    return obviouslyDoesNotHaveMembersToInject;
  }

  @Override
  public Thing thing() {  
    return thingProvider.get();
  }

  @Override
  public InjectedThing injectedThing() {  
    return injectedThingProvider.get();
  }

  @Override
  public Provider<InjectedThing> injectedThingProvider() {  
    return injectedThingProvider;
  }

  @Override
  public Lazy<InjectedThing> lazyInjectedThing() {  
    return DoubleCheckLazy.create(injectedThingProvider);
  }

  @Override
  public MembersInjector<InjectedThing> injectedThingMembersInjector() {  
    return injectedThingMembersInjector;
  }

  @Override
  public TypeWithInheritedMembersInjection typeWithInheritedMembersInjection() {  
    return typeWithInheritedMembersInjectionProvider.get();
  }

  @Override
  public MembersInjector<TypeWithInheritedMembersInjection> typeWithInheritedMembersInjectionMembersInjector() {  
    return typeWithInheritedMembersInjectionMembersInjector;
  }

  public static final class Builder {
    private PrimitivesModule primitivesModule;
  
    private Builder() {  
    }
  
    public BasicComponent build() {  
      if (primitivesModule == null) {
        this.primitivesModule = new PrimitivesModule();
      }
      return new DaggerBasicComponent(this);
    }
  
    public Builder primitivesModule(PrimitivesModule primitivesModule) {  
      if (primitivesModule == null) {
        throw new NullPointerException("primitivesModule");
      }
      this.primitivesModule = primitivesModule;
      return this;
    }
  }
}

