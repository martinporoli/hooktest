package math;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ToTestTest {

  @Test
  public void testPlus() {
    assertEquals(ToTest.plus(0, 0), 0);
    assertEquals(ToTest.plus(5, 11), ToTest.plus(11, 5));
    assertEquals(ToTest.plus(-4254, -10), -4264);
    assertEquals(ToTest.plus(10, -3), 7);
    assertEquals(ToTest.plus(44, -55), ToTest.plus(-55, 44));
  }
}
