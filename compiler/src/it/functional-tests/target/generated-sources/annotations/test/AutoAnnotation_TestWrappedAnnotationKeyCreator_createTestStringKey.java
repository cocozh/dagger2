
package test;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoAnnotationProcessor")
final class AutoAnnotation_TestWrappedAnnotationKeyCreator_createTestStringKey implements TestStringKey {

  private final String value;

  AutoAnnotation_TestWrappedAnnotationKeyCreator_createTestStringKey(
      String value) {
    if (value == null) {
      throw new NullPointerException("Null value");
    }
    this.value = value;
  }

  @Override
  public Class<? extends TestStringKey> annotationType() {
    return TestStringKey.class;
  }

  @Override
  public String value() {
    return value;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("@test.TestStringKey(");
    appendQuoted(sb, value);
    return sb.append(')').toString();
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TestStringKey) {
      TestStringKey that = (TestStringKey) o;
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

  private static void appendQuoted(StringBuilder sb, String s) {
    sb.append('"');
    for (int i = 0; i < s.length(); i++) {
      appendEscaped(sb, s.charAt(i));
    }
    sb.append('"');
  }

  private static void appendEscaped(StringBuilder sb, char c) {
    switch (c) {
    case '\\':
    case '"':
    case '\'':
      sb.append('\\').append(c);
      break;
    case '\n':
      sb.append("\\n");
      break;
    case '\r':
      sb.append("\\r");
      break;
    case '\t':
      sb.append("\\t");
      break;
    default:
      if (c < 0x20) {
        sb.append(String.format("\\%03o", (int) c));
      } else if (c < 0x7f || Character.isLetter(c)) {
        sb.append(c);
      } else {
        sb.append(String.format("\\u%04x", (int) c));
      }
      break;
    }
  }
}
