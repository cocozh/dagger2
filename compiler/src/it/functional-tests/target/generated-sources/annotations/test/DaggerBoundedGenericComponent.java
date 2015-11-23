package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerBoundedGenericComponent implements BoundedGenericComponent {
  private Provider<Integer> provideIntegerProvider;
  private Provider<ArrayList<String>> provideArrayListStringProvider;
  private Provider<LinkedList<CharSequence>> provideLinkedListCharSeqProvider;
  private Provider<List<Integer>> provideListOfIntegerProvider;
  private Provider<BoundedGenerics<Integer, ArrayList<String>, LinkedList<CharSequence>, Integer, List<Integer>>> boundedGenericsProvider;
  private Provider<Double> provideDoubleProvider;
  private Provider<LinkedList<String>> provideLinkedListStringProvider;
  private Provider<LinkedList<Comparable<String>>> provideArrayListOfComparableStringProvider;
  private Provider<Set<Double>> provideSetOfDoubleProvider;
  private Provider<BoundedGenerics<Double, LinkedList<String>, LinkedList<Comparable<String>>, Double, Set<Double>>> boundedGenericsProvider1;

  private DaggerBoundedGenericComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static BoundedGenericComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideIntegerProvider = BoundedGenericModule_ProvideIntegerFactory.create(builder.boundedGenericModule);
    this.provideArrayListStringProvider = BoundedGenericModule_ProvideArrayListStringFactory.create(builder.boundedGenericModule);
    this.provideLinkedListCharSeqProvider = BoundedGenericModule_ProvideLinkedListCharSeqFactory.create(builder.boundedGenericModule);
    this.provideListOfIntegerProvider = BoundedGenericModule_ProvideListOfIntegerFactory.create(builder.boundedGenericModule);
    this.boundedGenericsProvider = BoundedGenerics_Factory.create(provideIntegerProvider, provideArrayListStringProvider, provideLinkedListCharSeqProvider, provideIntegerProvider, provideListOfIntegerProvider);
    this.provideDoubleProvider = BoundedGenericModule_ProvideDoubleFactory.create(builder.boundedGenericModule);
    this.provideLinkedListStringProvider = BoundedGenericModule_ProvideLinkedListStringFactory.create(builder.boundedGenericModule);
    this.provideArrayListOfComparableStringProvider = BoundedGenericModule_ProvideArrayListOfComparableStringFactory.create(builder.boundedGenericModule);
    this.provideSetOfDoubleProvider = BoundedGenericModule_ProvideSetOfDoubleFactory.create(builder.boundedGenericModule);
    this.boundedGenericsProvider1 = BoundedGenerics_Factory.create(provideDoubleProvider, provideLinkedListStringProvider, provideArrayListOfComparableStringProvider, provideDoubleProvider, provideSetOfDoubleProvider);
  }

  @Override
  public BoundedGenerics<Integer, ArrayList<String>, LinkedList<CharSequence>, Integer, List<Integer>> bounds1() {  
    return boundedGenericsProvider.get();
  }

  @Override
  public BoundedGenerics<Double, LinkedList<String>, LinkedList<Comparable<String>>, Double, Set<Double>> bounds2() {  
    return boundedGenericsProvider1.get();
  }

  public static final class Builder {
    private BoundedGenericModule boundedGenericModule;
  
    private Builder() {  
    }
  
    public BoundedGenericComponent build() {  
      if (boundedGenericModule == null) {
        this.boundedGenericModule = new BoundedGenericModule();
      }
      return new DaggerBoundedGenericComponent(this);
    }
  
    public Builder boundedGenericModule(BoundedGenericModule boundedGenericModule) {  
      if (boundedGenericModule == null) {
        throw new NullPointerException("boundedGenericModule");
      }
      this.boundedGenericModule = boundedGenericModule;
      return this;
    }
  }
}

