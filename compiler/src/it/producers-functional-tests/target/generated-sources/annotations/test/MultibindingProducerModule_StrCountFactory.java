package test;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducer;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MultibindingProducerModule_StrCountFactory extends AbstractProducer<Integer> {
  private final MultibindingProducerModule module;
  private final Executor executor;
  private final Producer<Set<String>> strsProducer;

  public MultibindingProducerModule_StrCountFactory(MultibindingProducerModule module, Executor executor, Producer<Set<String>> strsProducer) {  
    assert module != null;
    this.module = module;
    assert executor != null;
    this.executor = executor;
    assert strsProducer != null;
    this.strsProducer = strsProducer;
  }

  @Override
  protected ListenableFuture<Integer> compute() {  
    ListenableFuture<Set<String>> strsProducerFuture = strsProducer.get();
    return Futures.transform(strsProducerFuture, new AsyncFunction<Set<String>, Integer>() {
      @Override public ListenableFuture<Integer> apply(Set<String> strs) {
        return Futures.immediateFuture(module.strCount(strs));
      }
    }, executor);
  }
}

