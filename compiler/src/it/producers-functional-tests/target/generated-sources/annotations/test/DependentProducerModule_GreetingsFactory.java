package test;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducer;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DependentProducerModule_GreetingsFactory extends AbstractProducer<List<String>> {
  private final DependentProducerModule module;
  private final Executor executor;
  private final Producer<Integer> numGreetingsProducer;
  private final Producer<String> greetingProducer;

  public DependentProducerModule_GreetingsFactory(DependentProducerModule module, Executor executor, Producer<Integer> numGreetingsProducer, Producer<String> greetingProducer) {  
    assert module != null;
    this.module = module;
    assert executor != null;
    this.executor = executor;
    assert numGreetingsProducer != null;
    this.numGreetingsProducer = numGreetingsProducer;
    assert greetingProducer != null;
    this.greetingProducer = greetingProducer;
  }

  @Override
  protected ListenableFuture<List<String>> compute() {  
    ListenableFuture<Integer> numGreetingsProducerFuture = numGreetingsProducer.get();
    ListenableFuture<String> greetingProducerFuture = greetingProducer.get();
    return Futures.transform(Futures.<Object>allAsList(numGreetingsProducerFuture,greetingProducerFuture), new AsyncFunction<List<Object>, List<String>>() {
      @SuppressWarnings("unchecked")  // safe by specification
      @Override public ListenableFuture<List<String>> apply(List<Object> args) {
        return module.greetings((Integer) args.get(0), (String) args.get(1));
      }
    }, executor);
  }
}

