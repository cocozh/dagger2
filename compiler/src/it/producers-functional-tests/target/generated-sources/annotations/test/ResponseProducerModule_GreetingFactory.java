package test;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.internal.AbstractProducer;
import dagger.producers.internal.Producers;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ResponseProducerModule_GreetingFactory extends AbstractProducer<String> {
  private final ResponseProducerModule module;
  private final Executor executor;

  public ResponseProducerModule_GreetingFactory(ResponseProducerModule module, Executor executor) {  
    assert module != null;
    this.module = module;
    assert executor != null;
    this.executor = executor;
  }

  @Override
  protected ListenableFuture<String> compute() {  
    ListenableFuture<ListenableFuture<String>> future = Producers.submitToExecutor(new Callable<ListenableFuture<String>>() {
      @Override public ListenableFuture<String> call() {
        return module.greeting();
      }
    }, executor);
    return Futures.dereference(future);
  }
}

