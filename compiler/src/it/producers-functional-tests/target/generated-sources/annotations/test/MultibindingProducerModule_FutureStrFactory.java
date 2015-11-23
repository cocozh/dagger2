package test;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.internal.AbstractProducer;
import dagger.producers.internal.Producers;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MultibindingProducerModule_FutureStrFactory extends AbstractProducer<Set<String>> {
  private final MultibindingProducerModule module;
  private final Executor executor;

  public MultibindingProducerModule_FutureStrFactory(MultibindingProducerModule module, Executor executor) {  
    assert module != null;
    this.module = module;
    assert executor != null;
    this.executor = executor;
  }

  @Override
  protected ListenableFuture<Set<String>> compute() {  
    ListenableFuture<ListenableFuture<Set<String>>> future = Producers.submitToExecutor(new Callable<ListenableFuture<Set<String>>>() {
      @Override public ListenableFuture<Set<String>> call() {
        return Producers.createFutureSingletonSet(module.futureStr());
      }
    }, executor);
    return Futures.dereference(future);
  }
}

