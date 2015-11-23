package test;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.internal.Factory;
import dagger.producers.Producer;
import dagger.producers.internal.Producers;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerDependentComponent implements DependentComponent {
  private Producer<Integer> numGreetingsProducer;
  private Provider<String> getGreetingProvider;
  private Producer<List<String>> greetingsProducer;

  private DaggerDependentComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.numGreetingsProducer = new Producer<Integer>() {
      private final DependedProductionComponent dependedProductionComponent = builder.dependedProductionComponent;
      @Override public ListenableFuture<Integer> get() {
        return dependedProductionComponent.numGreetings();
      }
    };
    this.getGreetingProvider = new Factory<String>() {
      private final DependedComponent dependedComponent = builder.dependedComponent;
      @Override public String get() {
        String provided = dependedComponent.getGreeting();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.greetingsProducer = new DependentProducerModule_GreetingsFactory(builder.dependentProducerModule, builder.executor, numGreetingsProducer, Producers.producerFromProvider(getGreetingProvider));
  }

  @Override
  public ListenableFuture<List<String>> greetings() {  
    return greetingsProducer.get();
  }

  public static final class Builder {
    private DependentProducerModule dependentProducerModule;
    private DependedComponent dependedComponent;
    private DependedProductionComponent dependedProductionComponent;
    private Executor executor;
  
    private Builder() {  
    }
  
    public DependentComponent build() {  
      if (dependentProducerModule == null) {
        this.dependentProducerModule = new DependentProducerModule();
      }
      if (dependedComponent == null) {
        throw new IllegalStateException("dependedComponent must be set");
      }
      if (dependedProductionComponent == null) {
        throw new IllegalStateException("dependedProductionComponent must be set");
      }
      if (executor == null) {
        throw new IllegalStateException("executor must be set");
      }
      return new DaggerDependentComponent(this);
    }
  
    public Builder dependentProducerModule(DependentProducerModule dependentProducerModule) {  
      if (dependentProducerModule == null) {
        throw new NullPointerException("dependentProducerModule");
      }
      this.dependentProducerModule = dependentProducerModule;
      return this;
    }
  
    public Builder dependedComponent(DependedComponent dependedComponent) {  
      if (dependedComponent == null) {
        throw new NullPointerException("dependedComponent");
      }
      this.dependedComponent = dependedComponent;
      return this;
    }
  
    public Builder dependedProductionComponent(DependedProductionComponent dependedProductionComponent) {  
      if (dependedProductionComponent == null) {
        throw new NullPointerException("dependedProductionComponent");
      }
      this.dependedProductionComponent = dependedProductionComponent;
      return this;
    }
  
    public Builder executor(Executor executor) {  
      if (executor == null) {
        throw new NullPointerException("executor");
      }
      this.executor = executor;
      return this;
    }
  }
}

