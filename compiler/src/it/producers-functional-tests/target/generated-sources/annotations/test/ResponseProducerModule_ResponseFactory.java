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
public final class ResponseProducerModule_ResponseFactory extends AbstractProducer<Response> {
  private final ResponseProducerModule module;
  private final Executor executor;
  private final Producer<String> greetingProducer;
  private final Producer<Request> requestProducer;

  public ResponseProducerModule_ResponseFactory(ResponseProducerModule module, Executor executor, Producer<String> greetingProducer, Producer<Request> requestProducer) {  
    assert module != null;
    this.module = module;
    assert executor != null;
    this.executor = executor;
    assert greetingProducer != null;
    this.greetingProducer = greetingProducer;
    assert requestProducer != null;
    this.requestProducer = requestProducer;
  }

  @Override
  protected ListenableFuture<Response> compute() {  
    ListenableFuture<String> greetingProducerFuture = greetingProducer.get();
    ListenableFuture<Request> requestProducerFuture = requestProducer.get();
    return Futures.transform(Futures.<Object>allAsList(greetingProducerFuture,requestProducerFuture), new AsyncFunction<List<Object>, Response>() {
      @SuppressWarnings("unchecked")  // safe by specification
      @Override public ListenableFuture<Response> apply(List<Object> args) {
        return Futures.immediateFuture(module.response((String) args.get(0), (Request) args.get(1)));
      }
    }, executor);
  }
}

