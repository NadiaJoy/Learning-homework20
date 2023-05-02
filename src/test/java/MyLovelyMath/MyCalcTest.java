package MyLovelyMath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyCalcTest {

    @Test
    public void shouldThrowArithmeticExceptionWhenDividingByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            MyCalc.divider(2, 0);
        });
    }

    @Test
    public void shouldReturnCorrectResultWhenDividingNonZeroNumbers() {
        Assertions.assertEquals(2,MyCalc.divider(8, 4) );
    }
}
