package test;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.internal.AbstractProducer;
import dagger.producers.internal.Producers;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SimpleProducerModule_StrFactory extends AbstractProducer<String> {
  private final SimpleProducerModule module;
  private final Executor executor;

  public SimpleProducerModule_StrFactory(SimpleProducerModule module, Executor executor) {  
    assert module != null;
    this.module = module;
    assert executor != null;
    this.executor = executor;
  }

  @Override
  protected ListenableFuture<String> compute() {  
    ListenableFuture<ListenableFuture<String>> future = Producers.submitToExecutor(new Callable<ListenableFuture<String>>() {
      @Override public ListenableFuture<String> call() {
        return module.str();
      }
    }, executor);
    return Futures.dereference(future);
  }
}

