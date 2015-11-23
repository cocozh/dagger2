package test;

import dagger.MembersInjector;
import dagger.internal.DoubleCheckLazy;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class InjectedThing_Factory implements Factory<InjectedThing> {
  private final MembersInjector<InjectedThing> membersInjector;
  private final Provider<Byte> boxedBypeAndPrimitiveByteAndByteProvider;
  private final Provider<Character> boxedCharAndPrimitiveCharAndCharProvider;
  private final Provider<Short> boxedShortAndPrimitiveShortAndShortProvider;
  private final Provider<Integer> boxedIntAndPrimitiveIntAndIntProvider;
  private final Provider<Long> boxedLongAndPrimitiveLongAndLongProvider;
  private final Provider<Boolean> boxedBooleanAndPrimitiveBooleanAndBooleanProvider;
  private final Provider<Float> boxedFloatAndPrimitiveFloatAndFloatProvider;
  private final Provider<Double> boxedDoubleAndPrimitiveDoubleAndDoubleProvider;
  private final Provider<byte[]> byteArrayProvider;
  private final Provider<char[]> charArrayProvider;
  private final Provider<short[]> shortArrayProvider;
  private final Provider<int[]> intArrayProvider;
  private final Provider<long[]> longArrayProvider;
  private final Provider<boolean[]> booleanArrayProvider;
  private final Provider<float[]> floatArrayAndLazyProvider;
  private final Provider<double[]> doubleArrayProvider;
  private final Provider<Thing> thingProvider;
  private final MembersInjector<Thing> thingMembersInjector;

  public InjectedThing_Factory(MembersInjector<InjectedThing> membersInjector, Provider<Byte> boxedBypeAndPrimitiveByteAndByteProvider, Provider<Character> boxedCharAndPrimitiveCharAndCharProvider, Provider<Short> boxedShortAndPrimitiveShortAndShortProvider, Provider<Integer> boxedIntAndPrimitiveIntAndIntProvider, Provider<Long> boxedLongAndPrimitiveLongAndLongProvider, Provider<Boolean> boxedBooleanAndPrimitiveBooleanAndBooleanProvider, Provider<Float> boxedFloatAndPrimitiveFloatAndFloatProvider, Provider<Double> boxedDoubleAndPrimitiveDoubleAndDoubleProvider, Provider<byte[]> byteArrayProvider, Provider<char[]> charArrayProvider, Provider<short[]> shortArrayProvider, Provider<int[]> intArrayProvider, Provider<long[]> longArrayProvider, Provider<boolean[]> booleanArrayProvider, Provider<float[]> floatArrayAndLazyProvider, Provider<double[]> doubleArrayProvider, Provider<Thing> thingProvider, MembersInjector<Thing> thingMembersInjector) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert boxedBypeAndPrimitiveByteAndByteProvider != null;
    this.boxedBypeAndPrimitiveByteAndByteProvider = boxedBypeAndPrimitiveByteAndByteProvider;
    assert boxedCharAndPrimitiveCharAndCharProvider != null;
    this.boxedCharAndPrimitiveCharAndCharProvider = boxedCharAndPrimitiveCharAndCharProvider;
    assert boxedShortAndPrimitiveShortAndShortProvider != null;
    this.boxedShortAndPrimitiveShortAndShortProvider = boxedShortAndPrimitiveShortAndShortProvider;
    assert boxedIntAndPrimitiveIntAndIntProvider != null;
    this.boxedIntAndPrimitiveIntAndIntProvider = boxedIntAndPrimitiveIntAndIntProvider;
    assert boxedLongAndPrimitiveLongAndLongProvider != null;
    this.boxedLongAndPrimitiveLongAndLongProvider = boxedLongAndPrimitiveLongAndLongProvider;
    assert boxedBooleanAndPrimitiveBooleanAndBooleanProvider != null;
    this.boxedBooleanAndPrimitiveBooleanAndBooleanProvider = boxedBooleanAndPrimitiveBooleanAndBooleanProvider;
    assert boxedFloatAndPrimitiveFloatAndFloatProvider != null;
    this.boxedFloatAndPrimitiveFloatAndFloatProvider = boxedFloatAndPrimitiveFloatAndFloatProvider;
    assert boxedDoubleAndPrimitiveDoubleAndDoubleProvider != null;
    this.boxedDoubleAndPrimitiveDoubleAndDoubleProvider = boxedDoubleAndPrimitiveDoubleAndDoubleProvider;
    assert byteArrayProvider != null;
    this.byteArrayProvider = byteArrayProvider;
    assert charArrayProvider != null;
    this.charArrayProvider = charArrayProvider;
    assert shortArrayProvider != null;
    this.shortArrayProvider = shortArrayProvider;
    assert intArrayProvider != null;
    this.intArrayProvider = intArrayProvider;
    assert longArrayProvider != null;
    this.longArrayProvider = longArrayProvider;
    assert booleanArrayProvider != null;
    this.booleanArrayProvider = booleanArrayProvider;
    assert floatArrayAndLazyProvider != null;
    this.floatArrayAndLazyProvider = floatArrayAndLazyProvider;
    assert doubleArrayProvider != null;
    this.doubleArrayProvider = doubleArrayProvider;
    assert thingProvider != null;
    this.thingProvider = thingProvider;
    assert thingMembersInjector != null;
    this.thingMembersInjector = thingMembersInjector;
  }

  @Override
  public InjectedThing get() {  
    InjectedThing instance = new InjectedThing(boxedBypeAndPrimitiveByteAndByteProvider.get(), boxedCharAndPrimitiveCharAndCharProvider.get(), boxedShortAndPrimitiveShortAndShortProvider.get(), boxedIntAndPrimitiveIntAndIntProvider.get(), boxedLongAndPrimitiveLongAndLongProvider.get(), boxedBooleanAndPrimitiveBooleanAndBooleanProvider.get(), boxedFloatAndPrimitiveFloatAndFloatProvider.get(), boxedDoubleAndPrimitiveDoubleAndDoubleProvider.get(), boxedBypeAndPrimitiveByteAndByteProvider, boxedCharAndPrimitiveCharAndCharProvider, boxedShortAndPrimitiveShortAndShortProvider, boxedIntAndPrimitiveIntAndIntProvider, boxedLongAndPrimitiveLongAndLongProvider, boxedBooleanAndPrimitiveBooleanAndBooleanProvider, boxedFloatAndPrimitiveFloatAndFloatProvider, boxedDoubleAndPrimitiveDoubleAndDoubleProvider, DoubleCheckLazy.create(boxedBypeAndPrimitiveByteAndByteProvider), DoubleCheckLazy.create(boxedCharAndPrimitiveCharAndCharProvider), DoubleCheckLazy.create(boxedShortAndPrimitiveShortAndShortProvider), DoubleCheckLazy.create(boxedIntAndPrimitiveIntAndIntProvider), DoubleCheckLazy.create(boxedLongAndPrimitiveLongAndLongProvider), DoubleCheckLazy.create(boxedBooleanAndPrimitiveBooleanAndBooleanProvider), DoubleCheckLazy.create(boxedFloatAndPrimitiveFloatAndFloatProvider), DoubleCheckLazy.create(boxedDoubleAndPrimitiveDoubleAndDoubleProvider), boxedBypeAndPrimitiveByteAndByteProvider.get(), boxedCharAndPrimitiveCharAndCharProvider.get(), boxedShortAndPrimitiveShortAndShortProvider.get(), boxedIntAndPrimitiveIntAndIntProvider.get(), boxedLongAndPrimitiveLongAndLongProvider.get(), boxedBooleanAndPrimitiveBooleanAndBooleanProvider.get(), boxedFloatAndPrimitiveFloatAndFloatProvider.get(), boxedDoubleAndPrimitiveDoubleAndDoubleProvider.get(), byteArrayProvider.get(), charArrayProvider.get(), shortArrayProvider.get(), intArrayProvider.get(), longArrayProvider.get(), booleanArrayProvider.get(), floatArrayAndLazyProvider.get(), doubleArrayProvider.get(), byteArrayProvider, charArrayProvider, shortArrayProvider, intArrayProvider, longArrayProvider, booleanArrayProvider, floatArrayAndLazyProvider, doubleArrayProvider, DoubleCheckLazy.create(byteArrayProvider), DoubleCheckLazy.create(charArrayProvider), DoubleCheckLazy.create(shortArrayProvider), DoubleCheckLazy.create(intArrayProvider), DoubleCheckLazy.create(longArrayProvider), DoubleCheckLazy.create(booleanArrayProvider), DoubleCheckLazy.create(floatArrayAndLazyProvider), DoubleCheckLazy.create(doubleArrayProvider), thingProvider.get(), thingProvider, DoubleCheckLazy.create(thingProvider), thingMembersInjector);
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<InjectedThing> create(MembersInjector<InjectedThing> membersInjector, Provider<Byte> boxedBypeAndPrimitiveByteAndByteProvider, Provider<Character> boxedCharAndPrimitiveCharAndCharProvider, Provider<Short> boxedShortAndPrimitiveShortAndShortProvider, Provider<Integer> boxedIntAndPrimitiveIntAndIntProvider, Provider<Long> boxedLongAndPrimitiveLongAndLongProvider, Provider<Boolean> boxedBooleanAndPrimitiveBooleanAndBooleanProvider, Provider<Float> boxedFloatAndPrimitiveFloatAndFloatProvider, Provider<Double> boxedDoubleAndPrimitiveDoubleAndDoubleProvider, Provider<byte[]> byteArrayProvider, Provider<char[]> charArrayProvider, Provider<short[]> shortArrayProvider, Provider<int[]> intArrayProvider, Provider<long[]> longArrayProvider, Provider<boolean[]> booleanArrayProvider, Provider<float[]> floatArrayAndLazyProvider, Provider<double[]> doubleArrayProvider, Provider<Thing> thingProvider, MembersInjector<Thing> thingMembersInjector) {  
    return new InjectedThing_Factory(membersInjector, boxedBypeAndPrimitiveByteAndByteProvider, boxedCharAndPrimitiveCharAndCharProvider, boxedShortAndPrimitiveShortAndShortProvider, boxedIntAndPrimitiveIntAndIntProvider, boxedLongAndPrimitiveLongAndLongProvider, boxedBooleanAndPrimitiveBooleanAndBooleanProvider, boxedFloatAndPrimitiveFloatAndFloatProvider, boxedDoubleAndPrimitiveDoubleAndDoubleProvider, byteArrayProvider, charArrayProvider, shortArrayProvider, intArrayProvider, longArrayProvider, booleanArrayProvider, floatArrayAndLazyProvider, doubleArrayProvider, thingProvider, thingMembersInjector);
  }
}

