package test;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.internal.AbstractProducer;
import dagger.producers.internal.Producers;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DependedProducerModule_ProduceNumberOfGreetingsFactory extends AbstractProducer<Integer> {
  private final DependedProducerModule module;
  private final Executor executor;

  public DependedProducerModule_ProduceNumberOfGreetingsFactory(DependedProducerModule module, Executor executor) {  
    assert module != null;
    this.module = module;
    assert executor != null;
    this.executor = executor;
  }

  @Override
  protected ListenableFuture<Integer> compute() {  
    ListenableFuture<Integer> future = Producers.submitToExecutor(new Callable<Integer>() {
      @Override public Integer call() {
        return module.produceNumberOfGreetings();
      }
    }, executor);
    return future;
  }
}

