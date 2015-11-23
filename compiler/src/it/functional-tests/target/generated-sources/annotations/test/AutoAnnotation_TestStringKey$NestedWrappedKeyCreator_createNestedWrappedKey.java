
package test;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoAnnotationProcessor")
final class AutoAnnotation_TestStringKey$NestedWrappedKeyCreator_createNestedWrappedKey implements TestStringKey.NestedWrappedKey {

  private final Class<?> value;

  AutoAnnotation_TestStringKey$NestedWrappedKeyCreator_createNestedWrappedKey(
      Class<?> value) {
    if (value == null) {
      throw new NullPointerException("Null value");
    }
    this.value = value;
  }

  @Override
  public Class<? extends TestStringKey.NestedWrappedKey> annotationType() {
    return TestStringKey.NestedWrappedKey.class;
  }

  @Override
  public Class<?> value() {
    return value;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("@test.TestStringKey.NestedWrappedKey(");
    sb.append(value);
    return sb.append(')').toString();
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TestStringKey.NestedWrappedKey) {
      TestStringKey.NestedWrappedKey that = (TestStringKey.NestedWrappedKey) o;
      return (value.equals(that.value()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    return
        ((127 * 111972721) ^ (value.hashCode()));
    // 111972721 is "value".hashCode()
  }

}
