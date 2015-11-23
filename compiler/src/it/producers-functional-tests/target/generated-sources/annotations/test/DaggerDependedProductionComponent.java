package test;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.Producer;
import java.util.concurrent.Executor;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerDependedProductionComponent implements DependedProductionComponent {
  private Producer<Integer> produceNumberOfGreetingsProducer;

  private DaggerDependedProductionComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.produceNumberOfGreetingsProducer = new DependedProducerModule_ProduceNumberOfGreetingsFactory(builder.dependedProducerModule, builder.executor);
  }

  @Override
  public ListenableFuture<Integer> numGreetings() {  
    return produceNumberOfGreetingsProducer.get();
  }

  public static final class Builder {
    private DependedProducerModule dependedProducerModule;
    private Executor executor;
  
    private Builder() {  
    }
  
    public DependedProductionComponent build() {  
      if (dependedProducerModule == null) {
        this.dependedProducerModule = new DependedProducerModule();
      }
      if (executor == null) {
        throw new IllegalStateException("executor must be set");
      }
      return new DaggerDependedProductionComponent(this);
    }
  
    public Builder dependedProducerModule(DependedProducerModule dependedProducerModule) {  
      if (dependedProducerModule == null) {
        throw new NullPointerException("dependedProducerModule");
      }
      this.dependedProducerModule = dependedProducerModule;
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

