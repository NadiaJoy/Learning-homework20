package MyLovelyMath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalcTest {

    @Test
    public void ExceptionTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calc.divider(2, 0);
        });
    }

    @Test
    public void NoExceptionTest() {
        Calc.divider(8, 3);
    }
}
