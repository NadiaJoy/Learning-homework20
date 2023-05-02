package MyLovelyMath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MyArrayTest {

    @ValueSource(ints = {5, 6})
    @ParameterizedTest
    public void exceptionBoundariesNumbersTest(int ints) {
        ArrayIndexOutOfBoundsException thrown = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
        {
            MyArray.getArrayElementByIndex(ints);
        });

        System.out.println(thrown.getMessage());

    }

    @Test
    public void exceptionNegativeNumberTest() {
        ArrayIndexOutOfBoundsException thrown = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
        {
            MyArray.getArrayElementByIndex(-1);
        });
        System.out.println(thrown.getMessage());

    }

    @Test
    public void noExceptionZeroTest() {
        Assertions.assertEquals(0, MyArray.getArrayElementByIndex(0));

    }

    @ValueSource(ints = {1, 4})
    @ParameterizedTest
    public void noExceptionBoundariesNumbersTest(int ints) {
            Assertions.assertEquals(ints, MyArray.getArrayElementByIndex(ints));
    }


}
