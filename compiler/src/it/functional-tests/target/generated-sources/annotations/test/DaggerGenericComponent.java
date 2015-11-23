package test;

import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.sub.DaggerGenericComponent_PackageProxy;
import test.sub.Exposed;
import test.sub.Exposed_Factory;
import test.sub.Exposed_MembersInjector;
import test.sub.OtherThing;
import test.sub.OtherThing_Factory;
import test.sub.PackagePrivateContainer$PublicEnclosed_Factory;
import test.sub.PackagePrivate_Factory;
import test.sub.PublicSubclass;
import test.sub.PublicSubclass_Factory;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerGenericComponent implements GenericComponent {
  private Provider<Generic<A>> genericProvider;
  private Provider<ReferencesGeneric> referencesGenericProvider;
  private Provider<Integer> provideIntegerProvider;
  private Provider<OtherThing> otherThingProvider;
  private Provider<Thing> thingProvider;
  private Provider<GenericDoubleReferences<A>> genericDoubleReferencesProvider;
  private Provider<GenericDoubleReferences<B>> genericDoubleReferencesProvider1;
  private Provider<Generic2<Generic<A>>> generic2Provider;
  private Provider<Generic<B>> genericProvider1;
  private Provider<Generic2<Generic<B>>> generic2Provider1;
  private Provider<Generic2<A>> generic2Provider2;
  private Provider<Generic<Generic2<A>>> genericProvider2;
  private Provider<Generic2<B>> generic2Provider3;
  private Provider<Generic<Generic2<B>>> genericProvider3;
  private Provider<ComplexGenerics> complexGenericsProvider;
  private MembersInjector<GenericParent<A, B>> genericParentMembersInjector;
  private MembersInjector<GenericChild<A>> genericChildMembersInjector;
  private MembersInjector<GenericParent<B, B>> genericParentMembersInjector1;
  private MembersInjector<GenericChild<B>> genericChildMembersInjector1;
  private final DaggerGenericComponent_PackageProxy test_sub_Proxy = new DaggerGenericComponent_PackageProxy();
  private MembersInjector<Exposed> exposedMembersInjector;
  private Provider<Exposed> exposedProvider;
  private Provider<PublicSubclass> publicSubclassProvider;
  private Provider<List<Integer>> provideListOfIntegerProvider;
  private Provider<Iterable<Integer>> provideIterableOfAWithCProvider;
  private Provider<Double> provideDoubleProvider;
  private Provider<List<Double>> provideListOfDoubleProvider;
  private Provider<Iterable<Double>> provideIterableOfAWithCProvider1;

  private DaggerGenericComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static GenericComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.genericProvider = Generic_Factory.create(A_Factory.create());
    this.referencesGenericProvider = ReferencesGeneric_Factory.create(genericProvider);
    this.provideIntegerProvider = ChildIntegerModule_ProvideIntegerFactory.create(builder.childIntegerModule);
    this.otherThingProvider = OtherThing_Factory.create(provideIntegerProvider);
    this.thingProvider = Thing_Factory.create(otherThingProvider);
    this.genericDoubleReferencesProvider = GenericDoubleReferences_Factory.create(A_Factory.create(), thingProvider);
    this.genericDoubleReferencesProvider1 = GenericDoubleReferences_Factory.create(B_Factory.create(), thingProvider);
    this.generic2Provider = Generic2_Factory.create(genericProvider);
    this.genericProvider1 = Generic_Factory.create(B_Factory.create());
    this.generic2Provider1 = Generic2_Factory.create(genericProvider1);
    this.generic2Provider2 = Generic2_Factory.create(A_Factory.create());
    this.genericProvider2 = Generic_Factory.create(generic2Provider2);
    this.generic2Provider3 = Generic2_Factory.create(B_Factory.create());
    this.genericProvider3 = Generic_Factory.create(generic2Provider3);
    this.complexGenericsProvider = ComplexGenerics_Factory.create(generic2Provider, generic2Provider1, generic2Provider2, genericProvider2, genericProvider3);
    this.genericParentMembersInjector = GenericParent_MembersInjector.create(A_Factory.create(), B_Factory.create(), B_Factory.create());
    this.genericChildMembersInjector = GenericChild_MembersInjector.create(genericParentMembersInjector, A_Factory.create(), A_Factory.create());
    this.genericParentMembersInjector1 = GenericParent_MembersInjector.create(B_Factory.create(), B_Factory.create(), B_Factory.create());
    this.genericChildMembersInjector1 = GenericChild_MembersInjector.create(genericParentMembersInjector1, A_Factory.create(), B_Factory.create());
    this.test_sub_Proxy.generic2Provider = Generic2_Factory.create(PackagePrivate_Factory.create());
    this.test_sub_Proxy.generic2Provider1 = Generic2_Factory.create(PackagePrivateContainer$PublicEnclosed_Factory.create());
    this.exposedMembersInjector = Exposed_MembersInjector.create(test_sub_Proxy.generic2Provider, test_sub_Proxy.generic2Provider1);
    this.test_sub_Proxy.genericProvider = Generic_Factory.create(PackagePrivate_Factory.create());
    this.test_sub_Proxy.genericProvider1 = Generic_Factory.create(PackagePrivateContainer$PublicEnclosed_Factory.create());
    this.exposedProvider = Exposed_Factory.create(exposedMembersInjector, test_sub_Proxy.genericProvider, test_sub_Proxy.genericProvider1);
    this.publicSubclassProvider = PublicSubclass_Factory.create((MembersInjector) MembersInjectors.noOp(), PackagePrivate_Factory.create());
    this.provideListOfIntegerProvider = ChildIntegerModule_ProvideListOfIntegerFactory.create(builder.childIntegerModule);
    this.provideIterableOfAWithCProvider = ParentModule_ProvideIterableOfAWithCFactory.create(builder.childIntegerModule, provideIntegerProvider, provideListOfIntegerProvider);
    this.provideDoubleProvider = ChildDoubleModule_ProvideDoubleFactory.create(builder.childDoubleModule);
    this.provideListOfDoubleProvider = ChildDoubleModule_ProvideListOfDoubleFactory.create(builder.childDoubleModule);
    this.provideIterableOfAWithCProvider1 = ParentModule_ProvideIterableOfAWithCFactory.create(builder.childDoubleModule, provideDoubleProvider, provideListOfDoubleProvider);
  }

  @Override
  public ReferencesGeneric referencesGeneric() {  
    return referencesGenericProvider.get();
  }

  @Override
  public GenericDoubleReferences<A> doubleGenericA() {  
    return genericDoubleReferencesProvider.get();
  }

  @Override
  public GenericDoubleReferences<B> doubleGenericB() {  
    return genericDoubleReferencesProvider1.get();
  }

  @Override
  public ComplexGenerics complexGenerics() {  
    return complexGenericsProvider.get();
  }

  @Override
  public GenericNoDeps<A> noDepsA() {  
    Provider<GenericNoDeps<A>> factory = GenericNoDeps_Factory.create();
    return factory.get();
  }

  @Override
  public GenericNoDeps<B> noDepsB() {  
    Provider<GenericNoDeps<B>> factory = GenericNoDeps_Factory.create();
    return factory.get();
  }

  @Override
  public void injectA(GenericChild<A> childA) {  
    genericChildMembersInjector.injectMembers(childA);
  }

  @Override
  public void injectB(GenericChild<B> childB) {  
    genericChildMembersInjector1.injectMembers(childB);
  }

  @Override
  public Exposed exposed() {  
    return exposedProvider.get();
  }

  @Override
  public PublicSubclass publicSubclass() {  
    return publicSubclassProvider.get();
  }

  @Override
  public Iterable<Integer> iterableInt() {  
    return provideIterableOfAWithCProvider.get();
  }

  @Override
  public Iterable<Double> iterableDouble() {  
    return provideIterableOfAWithCProvider1.get();
  }

  public static final class Builder {
    private ChildDoubleModule childDoubleModule;
    private ChildIntegerModule childIntegerModule;
  
    private Builder() {  
    }
  
    public GenericComponent build() {  
      if (childDoubleModule == null) {
        this.childDoubleModule = new ChildDoubleModule();
      }
      if (childIntegerModule == null) {
        this.childIntegerModule = new ChildIntegerModule();
      }
      return new DaggerGenericComponent(this);
    }
  
    public Builder childDoubleModule(ChildDoubleModule childDoubleModule) {  
      if (childDoubleModule == null) {
        throw new NullPointerException("childDoubleModule");
      }
      this.childDoubleModule = childDoubleModule;
      return this;
    }
  
    public Builder childIntegerModule(ChildIntegerModule childIntegerModule) {  
      if (childIntegerModule == null) {
        throw new NullPointerException("childIntegerModule");
      }
      this.childIntegerModule = childIntegerModule;
      return this;
    }
  }
}

