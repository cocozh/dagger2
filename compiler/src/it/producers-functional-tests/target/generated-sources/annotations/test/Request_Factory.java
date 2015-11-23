package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum Request_Factory implements Factory<Request> {
INSTANCE;

  @Override
  public Request get() {  
    return new Request();
  }

  public static Factory<Request> create() {  
    return INSTANCE;
  }
}

