package test.membersinject;

import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerMembersInjectComponent implements MembersInjectComponent {
  private Provider<String[]> provideStringArrayProvider;
  private MembersInjector<MembersInjectGenericParent<String[]>> membersInjectGenericParentMembersInjector;
  private MembersInjector<ChildOfStringArray> childOfStringArrayMembersInjector;
  private Provider<MembersInjectGenericParent<String[]>[]> provideFooArrayOfStringArrayProvider;
  private MembersInjector<MembersInjectGenericParent<MembersInjectGenericParent<String[]>[]>> membersInjectGenericParentMembersInjector1;
  private MembersInjector<ChildOfArrayOfParentOfStringArray> childOfArrayOfParentOfStringArrayMembersInjector;
  private Provider<int[]> provideIntArrayProvider;
  private MembersInjector<MembersInjectGenericParent<int[]>> membersInjectGenericParentMembersInjector2;
  private MembersInjector<ChildOfPrimitiveIntArray> childOfPrimitiveIntArrayMembersInjector;

  private DaggerMembersInjectComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static MembersInjectComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideStringArrayProvider = MembersInjectModule_ProvideStringArrayFactory.create(builder.membersInjectModule);
    this.membersInjectGenericParentMembersInjector = MembersInjectGenericParent_MembersInjector.create(provideStringArrayProvider);
    this.childOfStringArrayMembersInjector = MembersInjectors.delegatingTo(membersInjectGenericParentMembersInjector);
    this.provideFooArrayOfStringArrayProvider = MembersInjectModule_ProvideFooArrayOfStringArrayFactory.create(builder.membersInjectModule);
    this.membersInjectGenericParentMembersInjector1 = MembersInjectGenericParent_MembersInjector.create(provideFooArrayOfStringArrayProvider);
    this.childOfArrayOfParentOfStringArrayMembersInjector = MembersInjectors.delegatingTo(membersInjectGenericParentMembersInjector1);
    this.provideIntArrayProvider = MembersInjectModule_ProvideIntArrayFactory.create(builder.membersInjectModule);
    this.membersInjectGenericParentMembersInjector2 = MembersInjectGenericParent_MembersInjector.create(provideIntArrayProvider);
    this.childOfPrimitiveIntArrayMembersInjector = MembersInjectors.delegatingTo(membersInjectGenericParentMembersInjector2);
  }

  @Override
  public void inject(ChildOfStringArray subfoo) {  
    childOfStringArrayMembersInjector.injectMembers(subfoo);
  }

  @Override
  public void inject(ChildOfArrayOfParentOfStringArray subfoo) {  
    childOfArrayOfParentOfStringArrayMembersInjector.injectMembers(subfoo);
  }

  @Override
  public void inject(ChildOfPrimitiveIntArray subfoo) {  
    childOfPrimitiveIntArrayMembersInjector.injectMembers(subfoo);
  }

  public static final class Builder {
    private MembersInjectModule membersInjectModule;
  
    private Builder() {  
    }
  
    public MembersInjectComponent build() {  
      if (membersInjectModule == null) {
        this.membersInjectModule = new MembersInjectModule();
      }
      return new DaggerMembersInjectComponent(this);
    }
  
    public Builder membersInjectModule(MembersInjectModule membersInjectModule) {  
      if (membersInjectModule == null) {
        throw new NullPointerException("membersInjectModule");
      }
      this.membersInjectModule = membersInjectModule;
      return this;
    }
  }
}

