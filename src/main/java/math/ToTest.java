package math;

public class ToTest {

  public static int plus(int a, int b) {
    return a + b;
  }

  public static int minusToZero(int a, int b) {
    int c = a - b;
    return c >= 0 ? c : 0;
  }
}
