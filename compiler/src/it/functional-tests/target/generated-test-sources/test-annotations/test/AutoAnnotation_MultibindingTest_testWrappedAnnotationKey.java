
package test;

import java.util.Arrays;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoAnnotationProcessor")
final class AutoAnnotation_MultibindingTest_testWrappedAnnotationKey implements TestWrappedAnnotationKey {

  private final TestStringKey value;

  private final int[] integers;

  private final TestClassKey[] annotations;

  private final Class<? extends Number>[] classes;

  AutoAnnotation_MultibindingTest_testWrappedAnnotationKey(
      TestStringKey value,
      int[] integers,
      TestClassKey[] annotations,
      Class<? extends Number>[] classes) {
    if (value == null) {
      throw new NullPointerException("Null value");
    }
    this.value = value;
    if (integers == null) {
      throw new NullPointerException("Null integers");
    }
    this.integers = integers.clone();
    if (annotations == null) {
      throw new NullPointerException("Null annotations");
    }
    this.annotations = annotations.clone();
    if (classes == null) {
      throw new NullPointerException("Null classes");
    }
    this.classes = classes.clone();
  }

  @Override
  public Class<? extends TestWrappedAnnotationKey> annotationType() {
    return TestWrappedAnnotationKey.class;
  }

  @Override
  public TestStringKey value() {
    return value;
  }

  @Override
  public int[] integers() {
    return integers.clone();
  }

  @Override
  public TestClassKey[] annotations() {
    return annotations.clone();
  }

  @Override
  public Class<? extends Number>[] classes() {
    return classes.clone();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("@test.TestWrappedAnnotationKey(");
    sb.append("value=");
    sb.append(value);
    sb.append(", ");
    sb.append("integers=");
    sb.append(Arrays.toString(integers));
    sb.append(", ");
    sb.append("annotations=");
    sb.append(Arrays.toString(annotations));
    sb.append(", ");
    sb.append("classes=");
    sb.append(Arrays.toString(classes));
    return sb.append(')').toString();
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TestWrappedAnnotationKey) {
      TestWrappedAnnotationKey that = (TestWrappedAnnotationKey) o;
      return (value.equals(that.value()))
           && (Arrays.equals(integers,
        (that instanceof AutoAnnotation_MultibindingTest_testWrappedAnnotationKey)
            ? ((AutoAnnotation_MultibindingTest_testWrappedAnnotationKey) that).integers
            : that.integers()))
           && (Arrays.equals(annotations,
        (that instanceof AutoAnnotation_MultibindingTest_testWrappedAnnotationKey)
            ? ((AutoAnnotation_MultibindingTest_testWrappedAnnotationKey) that).annotations
            : that.annotations()))
           && (Arrays.equals(classes,
        (that instanceof AutoAnnotation_MultibindingTest_testWrappedAnnotationKey)
            ? ((AutoAnnotation_MultibindingTest_testWrappedAnnotationKey) that).classes
            : that.classes()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    return
        ((127 * 111972721) ^ (value.hashCode())) +
        ((127 * 570074869) ^ (Arrays.hashCode(integers))) +
        ((127 * -961709276) ^ (Arrays.hashCode(annotations))) +
        ((127 * 853620774) ^ (Arrays.hashCode(classes)));
    // 111972721 is "value".hashCode()
    // 570074869 is "integers".hashCode()
    // -961709276 is "annotations".hashCode()
    // 853620774 is "classes".hashCode()
  }

}
