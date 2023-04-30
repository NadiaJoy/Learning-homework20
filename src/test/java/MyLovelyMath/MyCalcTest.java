package MyLovelyMath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MyCalcTest {

    @Test
    public void exceptionTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            MyCalc.divider(2, 0);
        });
    }

    @Test
    public void noExceptionTest() {
        Assertions.assertEquals(2,MyCalc.divider(8, 4) );
    }
}
