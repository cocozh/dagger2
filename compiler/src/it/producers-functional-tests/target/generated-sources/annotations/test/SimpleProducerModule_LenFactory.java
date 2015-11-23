package test;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducer;
import java.util.concurrent.Executor;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SimpleProducerModule_LenFactory extends AbstractProducer<Integer> {
  private final SimpleProducerModule module;
  private final Executor executor;
  private final Producer<String> strProducer;

  public SimpleProducerModule_LenFactory(SimpleProducerModule module, Executor executor, Producer<String> strProducer) {  
    assert module != null;
    this.module = module;
    assert executor != null;
    this.executor = executor;
    assert strProducer != null;
    this.strProducer = strProducer;
  }

  @Override
  protected ListenableFuture<Integer> compute() {  
    ListenableFuture<String> strProducerFuture = strProducer.get();
    return Futures.transform(strProducerFuture, new AsyncFunction<String, Integer>() {
      @Override public ListenableFuture<Integer> apply(String str) {
        return Futures.immediateFuture(module.len(str));
      }
    }, executor);
  }
}

