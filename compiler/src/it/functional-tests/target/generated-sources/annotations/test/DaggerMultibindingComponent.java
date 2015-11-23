package test;

import dagger.internal.Factory;
import dagger.internal.MapFactory;
import dagger.internal.MapProviderFactory;
import dagger.internal.SetFactory;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.TestStringKey.NestedWrappedKey;
import test.sub.ContributionsModule;
import test.sub.ContributionsModule_ContributeAnIntFactory;
import test.sub.ContributionsModule_ContributeAnotherIntFactory;
import test.sub.ContributionsModule_ContributeSomeIntsFactory;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerMultibindingComponent implements MultibindingComponent {
  private Provider<Double> doubleDependencyProvider;
  private Provider<String> mapOfStringAndProviderOfStringContribution1;
  private Provider<String> mapOfStringAndProviderOfStringContribution2;
  private Provider<Map<String, Provider<String>>> mapOfStringAndProviderOfStringProvider;
  private Provider<Map<String, String>> mapOfStringAndStringProvider;
  private Provider<Set<String>> provideMapKeysProvider;
  private Provider<Collection<String>> provideMapValuesProvider;
  private Provider<Set<Integer>> setOfIntegerContribution1Provider;
  private Provider<Set<Integer>> setOfIntegerContribution2Provider;
  private Provider<Set<Integer>> setOfIntegerContribution3Provider;
  private Provider<Set<Integer>> setOfIntegerContribution4Provider;
  private Provider<Set<Integer>> setOfIntegerContribution5Provider;
  private Provider<Set<Integer>> setOfIntegerProvider;
  private Provider<String> mapOfNestedWrappedKeyAndProviderOfStringContribution1;
  private Provider<String> mapOfNestedWrappedKeyAndProviderOfStringContribution2;
  private Provider<Map<NestedWrappedKey, Provider<String>>> mapOfNestedWrappedKeyAndProviderOfStringProvider;
  private Provider<Map<NestedWrappedKey, String>> mapOfNestedWrappedKeyAndStringProvider;
  private Provider<String> mapOfClassOfAndProviderOfStringContribution1;
  private Provider<String> mapOfClassOfAndProviderOfStringContribution2;
  private Provider<Map<Class<? extends Number>, Provider<String>>> mapOfClassOfAndProviderOfStringProvider;
  private Provider<Map<Class<? extends Number>, String>> mapOfClassOfAndStringProvider;
  private Provider<String> mapOfClassOfAndProviderOfStringContribution11;
  private Provider<String> mapOfClassOfAndProviderOfStringContribution21;
  private Provider<Map<Class<?>, Provider<String>>> mapOfClassOfAndProviderOfStringProvider1;
  private Provider<Map<Class<?>, String>> mapOfClassOfAndStringProvider1;
  private Provider<String> mapOfLongAndProviderOfStringContribution1;
  private Provider<Map<Long, Provider<String>>> mapOfLongAndProviderOfStringProvider;
  private Provider<Map<Long, String>> mapOfLongAndStringProvider;
  private Provider<String> mapOfIntegerAndProviderOfStringContribution1;
  private Provider<Map<Integer, Provider<String>>> mapOfIntegerAndProviderOfStringProvider;
  private Provider<Map<Integer, String>> mapOfIntegerAndStringProvider;
  private Provider<String> mapOfShortAndProviderOfStringContribution1;
  private Provider<Map<Short, Provider<String>>> mapOfShortAndProviderOfStringProvider;
  private Provider<Map<Short, String>> mapOfShortAndStringProvider;
  private Provider<String> mapOfByteAndProviderOfStringContribution1;
  private Provider<Map<Byte, Provider<String>>> mapOfByteAndProviderOfStringProvider;
  private Provider<Map<Byte, String>> mapOfByteAndStringProvider;
  private Provider<String> mapOfBooleanAndProviderOfStringContribution1;
  private Provider<Map<Boolean, Provider<String>>> mapOfBooleanAndProviderOfStringProvider;
  private Provider<Map<Boolean, String>> mapOfBooleanAndStringProvider;
  private Provider<String> mapOfCharacterAndProviderOfStringContribution1;
  private Provider<String> mapOfCharacterAndProviderOfStringContribution2;
  private Provider<Map<Character, Provider<String>>> mapOfCharacterAndProviderOfStringProvider;
  private Provider<Map<Character, String>> mapOfCharacterAndStringProvider;
  private Provider<String> mapOfTestStringKeyAndProviderOfStringContribution1;
  private Provider<Map<TestStringKey, Provider<String>>> mapOfTestStringKeyAndProviderOfStringProvider;
  private Provider<Map<TestStringKey, String>> mapOfTestStringKeyAndStringProvider;
  private Provider<String> mapOfTestWrappedAnnotationKeyAndProviderOfStringContribution1;
  private Provider<Map<TestWrappedAnnotationKey, Provider<String>>> mapOfTestWrappedAnnotationKeyAndProviderOfStringProvider;
  private Provider<Map<TestWrappedAnnotationKey, String>> mapOfTestWrappedAnnotationKeyAndStringProvider;

  private DaggerMultibindingComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.doubleDependencyProvider = new Factory<Double>() {
      private final MultibindingDependency multibindingDependency = builder.multibindingDependency;
      @Override public Double get() {
        Double provided = multibindingDependency.doubleDependency();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.mapOfStringAndProviderOfStringContribution1 = MultibindingModule_ProvideFooKeyFactory.create(builder.multibindingModule, doubleDependencyProvider);
    this.mapOfStringAndProviderOfStringContribution2 = MultibindingModule_ProvideBarKeyFactory.create(builder.multibindingModule);
    this.mapOfStringAndProviderOfStringProvider = MapProviderFactory.<String, String>builder(2)
        .put("foo", mapOfStringAndProviderOfStringContribution1)
        .put("bar", mapOfStringAndProviderOfStringContribution2)
        .build();
    this.mapOfStringAndStringProvider = MapFactory.create(mapOfStringAndProviderOfStringProvider);
    this.provideMapKeysProvider = MultibindingModule_ProvideMapKeysFactory.create(builder.multibindingModule, mapOfStringAndProviderOfStringProvider);
    this.provideMapValuesProvider = MultibindingModule_ProvideMapValuesFactory.create(builder.multibindingModule, mapOfStringAndStringProvider);
    this.setOfIntegerContribution1Provider = MultibindingModule_ProvideFiveToSetFactory.create(builder.multibindingModule);
    this.setOfIntegerContribution2Provider = MultibindingModule_ProvideSixToSetFactory.create(builder.multibindingModule);
    this.setOfIntegerContribution3Provider = ContributionsModule_ContributeAnIntFactory.create(builder.contributionsModule, doubleDependencyProvider);
    this.setOfIntegerContribution4Provider = ContributionsModule_ContributeAnotherIntFactory.create(builder.contributionsModule);
    this.setOfIntegerContribution5Provider = ContributionsModule_ContributeSomeIntsFactory.create(builder.contributionsModule);
    this.setOfIntegerProvider = SetFactory.create(setOfIntegerContribution1Provider, setOfIntegerContribution2Provider, setOfIntegerContribution3Provider, setOfIntegerContribution4Provider, setOfIntegerContribution5Provider);
    this.mapOfNestedWrappedKeyAndProviderOfStringContribution1 = MultibindingModule_ValueForIntegerFactory.create(builder.multibindingModule);
    this.mapOfNestedWrappedKeyAndProviderOfStringContribution2 = MultibindingModule_ValueForLongFactory.create(builder.multibindingModule);
    this.mapOfNestedWrappedKeyAndProviderOfStringProvider = MapProviderFactory.<NestedWrappedKey, String>builder(2)
        .put(TestStringKey$NestedWrappedKeyCreator.createNestedWrappedKey(Integer.class), mapOfNestedWrappedKeyAndProviderOfStringContribution1)
        .put(TestStringKey$NestedWrappedKeyCreator.createNestedWrappedKey(Long.class), mapOfNestedWrappedKeyAndProviderOfStringContribution2)
        .build();
    this.mapOfNestedWrappedKeyAndStringProvider = MapFactory.create(mapOfNestedWrappedKeyAndProviderOfStringProvider);
    this.mapOfClassOfAndProviderOfStringContribution1 = MultibindingModule_ValueForNumberClassBigDecimalFactory.create(builder.multibindingModule);
    this.mapOfClassOfAndProviderOfStringContribution2 = MultibindingModule_ValueForNumberClassBigIntegerFactory.create(builder.multibindingModule);
    this.mapOfClassOfAndProviderOfStringProvider = MapProviderFactory.<Class<? extends Number>, String>builder(2)
        .put(BigDecimal.class, mapOfClassOfAndProviderOfStringContribution1)
        .put(BigInteger.class, mapOfClassOfAndProviderOfStringContribution2)
        .build();
    this.mapOfClassOfAndStringProvider = MapFactory.create(mapOfClassOfAndProviderOfStringProvider);
    this.mapOfClassOfAndProviderOfStringContribution11 = MultibindingModule_ValueForClassIntegerFactory.create(builder.multibindingModule);
    this.mapOfClassOfAndProviderOfStringContribution21 = MultibindingModule_ValueForClassLongFactory.create(builder.multibindingModule);
    this.mapOfClassOfAndProviderOfStringProvider1 = MapProviderFactory.<Class<?>, String>builder(2)
        .put(Integer.class, mapOfClassOfAndProviderOfStringContribution11)
        .put(Long.class, mapOfClassOfAndProviderOfStringContribution21)
        .build();
    this.mapOfClassOfAndStringProvider1 = MapFactory.create(mapOfClassOfAndProviderOfStringProvider1);
    this.mapOfLongAndProviderOfStringContribution1 = MultibindingModule_ValueFor100LongFactory.create(builder.multibindingModule);
    this.mapOfLongAndProviderOfStringProvider = MapProviderFactory.<Long, String>builder(1)
        .put(100L, mapOfLongAndProviderOfStringContribution1)
        .build();
    this.mapOfLongAndStringProvider = MapFactory.create(mapOfLongAndProviderOfStringProvider);
    this.mapOfIntegerAndProviderOfStringContribution1 = MultibindingModule_ValueFor100IntFactory.create(builder.multibindingModule);
    this.mapOfIntegerAndProviderOfStringProvider = MapProviderFactory.<Integer, String>builder(1)
        .put((int) 100, mapOfIntegerAndProviderOfStringContribution1)
        .build();
    this.mapOfIntegerAndStringProvider = MapFactory.create(mapOfIntegerAndProviderOfStringProvider);
    this.mapOfShortAndProviderOfStringContribution1 = MultibindingModule_ValueFor100ShortFactory.create(builder.multibindingModule);
    this.mapOfShortAndProviderOfStringProvider = MapProviderFactory.<Short, String>builder(1)
        .put((short) 100, mapOfShortAndProviderOfStringContribution1)
        .build();
    this.mapOfShortAndStringProvider = MapFactory.create(mapOfShortAndProviderOfStringProvider);
    this.mapOfByteAndProviderOfStringContribution1 = MultibindingModule_ValueFor100ByteFactory.create(builder.multibindingModule);
    this.mapOfByteAndProviderOfStringProvider = MapProviderFactory.<Byte, String>builder(1)
        .put((byte) 100, mapOfByteAndProviderOfStringContribution1)
        .build();
    this.mapOfByteAndStringProvider = MapFactory.create(mapOfByteAndProviderOfStringProvider);
    this.mapOfBooleanAndProviderOfStringContribution1 = MultibindingModule_ValueForTrueFactory.create(builder.multibindingModule);
    this.mapOfBooleanAndProviderOfStringProvider = MapProviderFactory.<Boolean, String>builder(1)
        .put(true, mapOfBooleanAndProviderOfStringContribution1)
        .build();
    this.mapOfBooleanAndStringProvider = MapFactory.create(mapOfBooleanAndProviderOfStringProvider);
    this.mapOfCharacterAndProviderOfStringContribution1 = MultibindingModule_ValueForAFactory.create(builder.multibindingModule);
    this.mapOfCharacterAndProviderOfStringContribution2 = MultibindingModule_ValueForNewlineFactory.create(builder.multibindingModule);
    this.mapOfCharacterAndProviderOfStringProvider = MapProviderFactory.<Character, String>builder(2)
        .put('a', mapOfCharacterAndProviderOfStringContribution1)
        .put('\n', mapOfCharacterAndProviderOfStringContribution2)
        .build();
    this.mapOfCharacterAndStringProvider = MapFactory.create(mapOfCharacterAndProviderOfStringProvider);
    this.mapOfTestStringKeyAndProviderOfStringContribution1 = MultibindingModule_ValueForUnwrappedAnnotationKeyFooFactory.create(builder.multibindingModule);
    this.mapOfTestStringKeyAndProviderOfStringProvider = MapProviderFactory.<TestStringKey, String>builder(1)
        .put(TestUnwrappedAnnotationKeyCreator.createTestStringKey("foo\n"), mapOfTestStringKeyAndProviderOfStringContribution1)
        .build();
    this.mapOfTestStringKeyAndStringProvider = MapFactory.create(mapOfTestStringKeyAndProviderOfStringProvider);
    this.mapOfTestWrappedAnnotationKeyAndProviderOfStringContribution1 = MultibindingModule_ValueForWrappedAnnotationKeyFooFactory.create(builder.multibindingModule);
    this.mapOfTestWrappedAnnotationKeyAndProviderOfStringProvider = MapProviderFactory.<TestWrappedAnnotationKey, String>builder(1)
        .put(TestWrappedAnnotationKeyCreator.createTestWrappedAnnotationKey(TestWrappedAnnotationKeyCreator.createTestStringKey("foo"), new int[] {(int) 1, (int) 2, (int) 3}, new TestClassKey[] {}, new Class[] {Long.class, Integer.class}), mapOfTestWrappedAnnotationKeyAndProviderOfStringContribution1)
        .build();
    this.mapOfTestWrappedAnnotationKeyAndStringProvider = MapFactory.create(mapOfTestWrappedAnnotationKeyAndProviderOfStringProvider);
  }

  @Override
  public Map<String, String> map() {  
    return mapOfStringAndStringProvider.get();
  }

  @Override
  public Map<String, Provider<String>> mapOfProviders() {  
    return mapOfStringAndProviderOfStringProvider.get();
  }

  @Override
  public Set<String> mapKeys() {  
    return provideMapKeysProvider.get();
  }

  @Override
  public Collection<String> mapValues() {  
    return provideMapValuesProvider.get();
  }

  @Override
  public Set<Integer> set() {  
    return setOfIntegerProvider.get();
  }

  @Override
  public Map<NestedWrappedKey, String> nestedKeyMap() {  
    return mapOfNestedWrappedKeyAndStringProvider.get();
  }

  @Override
  public Map<Class<? extends Number>, String> numberClassKeyMap() {  
    return mapOfClassOfAndStringProvider.get();
  }

  @Override
  public Map<Class<?>, String> classKeyMap() {  
    return mapOfClassOfAndStringProvider1.get();
  }

  @Override
  public Map<Long, String> longKeyMap() {  
    return mapOfLongAndStringProvider.get();
  }

  @Override
  public Map<Integer, String> integerKeyMap() {  
    return mapOfIntegerAndStringProvider.get();
  }

  @Override
  public Map<Short, String> shortKeyMap() {  
    return mapOfShortAndStringProvider.get();
  }

  @Override
  public Map<Byte, String> byteKeyMap() {  
    return mapOfByteAndStringProvider.get();
  }

  @Override
  public Map<Boolean, String> booleanKeyMap() {  
    return mapOfBooleanAndStringProvider.get();
  }

  @Override
  public Map<Character, String> characterKeyMap() {  
    return mapOfCharacterAndStringProvider.get();
  }

  @Override
  public Map<TestStringKey, String> unwrappedAnnotationKeyMap() {  
    return mapOfTestStringKeyAndStringProvider.get();
  }

  @Override
  public Map<TestWrappedAnnotationKey, String> wrappedAnnotationKeyMap() {  
    return mapOfTestWrappedAnnotationKeyAndStringProvider.get();
  }

  public static final class Builder {
    private MultibindingModule multibindingModule;
    private ContributionsModule contributionsModule;
    private MultibindingDependency multibindingDependency;
  
    private Builder() {  
    }
  
    public MultibindingComponent build() {  
      if (multibindingModule == null) {
        this.multibindingModule = new MultibindingModule();
      }
      if (contributionsModule == null) {
        this.contributionsModule = new ContributionsModule();
      }
      if (multibindingDependency == null) {
        throw new IllegalStateException("multibindingDependency must be set");
      }
      return new DaggerMultibindingComponent(this);
    }
  
    public Builder multibindingModule(MultibindingModule multibindingModule) {  
      if (multibindingModule == null) {
        throw new NullPointerException("multibindingModule");
      }
      this.multibindingModule = multibindingModule;
      return this;
    }
  
    public Builder contributionsModule(ContributionsModule contributionsModule) {  
      if (contributionsModule == null) {
        throw new NullPointerException("contributionsModule");
      }
      this.contributionsModule = contributionsModule;
      return this;
    }
  
    public Builder multibindingDependency(MultibindingDependency multibindingDependency) {  
      if (multibindingDependency == null) {
        throw new NullPointerException("multibindingDependency");
      }
      this.multibindingDependency = multibindingDependency;
      return this;
    }
  }
}

