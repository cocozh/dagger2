package test;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.Producer;
import dagger.producers.internal.SetProducer;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerMultibindingComponent implements MultibindingComponent {
  private Producer<Set<String>> setOfStringContribution1Producer;
  private Producer<Set<String>> setOfStringContribution2Producer;
  private Producer<Set<String>> setOfStringContribution3Producer;
  private Producer<Set<String>> setOfStringContribution4Producer;
  private Producer<Set<String>> setOfStringProducer;
  private Producer<Integer> strCountProducer;

  private DaggerMultibindingComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.setOfStringContribution1Producer = new MultibindingProducerModule_FutureStrFactory(builder.multibindingProducerModule, builder.executor);
    this.setOfStringContribution2Producer = new MultibindingProducerModule_StrFactory(builder.multibindingProducerModule, builder.executor);
    this.setOfStringContribution3Producer = new MultibindingProducerModule_FutureStrsFactory(builder.multibindingProducerModule, builder.executor);
    this.setOfStringContribution4Producer = new MultibindingProducerModule_StrsFactory(builder.multibindingProducerModule, builder.executor);
    this.setOfStringProducer = SetProducer.create(setOfStringContribution1Producer, setOfStringContribution2Producer, setOfStringContribution3Producer, setOfStringContribution4Producer);
    this.strCountProducer = new MultibindingProducerModule_StrCountFactory(builder.multibindingProducerModule, builder.executor, setOfStringProducer);
  }

  @Override
  public ListenableFuture<Set<String>> strs() {  
    return setOfStringProducer.get();
  }

  @Override
  public ListenableFuture<Integer> strCount() {  
    return strCountProducer.get();
  }

  public static final class Builder {
    private MultibindingProducerModule multibindingProducerModule;
    private Executor executor;
  
    private Builder() {  
    }
  
    public MultibindingComponent build() {  
      if (multibindingProducerModule == null) {
        this.multibindingProducerModule = new MultibindingProducerModule();
      }
      if (executor == null) {
        throw new IllegalStateException("executor must be set");
      }
      return new DaggerMultibindingComponent(this);
    }
  
    public Builder multibindingProducerModule(MultibindingProducerModule multibindingProducerModule) {  
      if (multibindingProducerModule == null) {
        throw new NullPointerException("multibindingProducerModule");
      }
      this.multibindingProducerModule = multibindingProducerModule;
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

