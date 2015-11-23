package test;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.Producer;
import dagger.producers.internal.Producers;
import java.util.concurrent.Executor;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerSimpleComponent implements SimpleComponent {
  private Producer<String> greetingProducer;
  private Producer<Response> responseProducer;

  private DaggerSimpleComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.greetingProducer = new ResponseProducerModule_GreetingFactory(builder.responseProducerModule, builder.executor);
    this.responseProducer = new ResponseProducerModule_ResponseFactory(builder.responseProducerModule, builder.executor, greetingProducer, Producers.producerFromProvider(Request_Factory.create()));
  }

  @Override
  public ListenableFuture<Response> response() {  
    return responseProducer.get();
  }

  public static final class Builder {
    private ResponseProducerModule responseProducerModule;
    private Executor executor;
  
    private Builder() {  
    }
  
    public SimpleComponent build() {  
      if (responseProducerModule == null) {
        this.responseProducerModule = new ResponseProducerModule();
      }
      if (executor == null) {
        throw new IllegalStateException("executor must be set");
      }
      return new DaggerSimpleComponent(this);
    }
  
    public Builder responseProducerModule(ResponseProducerModule responseProducerModule) {  
      if (responseProducerModule == null) {
        throw new NullPointerException("responseProducerModule");
      }
      this.responseProducerModule = responseProducerModule;
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

