package test;

import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TestWrappedAnnotationKeyCreator {
  @com.google.auto.value.AutoAnnotation
  public static TestWrappedAnnotationKey createTestWrappedAnnotationKey(TestStringKey value, int[] integers, TestClassKey[] annotations, Class<? extends Number>[] classes) {  
    return new AutoAnnotation_TestWrappedAnnotationKeyCreator_createTestWrappedAnnotationKey(value, integers, annotations, classes);
  }

  @com.google.auto.value.AutoAnnotation
  public static TestStringKey createTestStringKey(String value) {  
    return new AutoAnnotation_TestWrappedAnnotationKeyCreator_createTestStringKey(value);
  }
}

