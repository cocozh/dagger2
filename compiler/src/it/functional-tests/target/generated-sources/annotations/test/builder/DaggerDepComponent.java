package test.builder;

import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerDepComponent implements DepComponent {
  private DaggerDepComponent(Builder builder) {  
    assert builder != null;
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static DepComponent create() {  
    return builder().build();
  }

  public static final class Builder {
    private Builder() {  
    }
  
    public DepComponent build() {  
      return new DaggerDepComponent(this);
    }
  }
}

