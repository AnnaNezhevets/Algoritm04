import org.junit.jupiter.api.*;

import java.util.Arrays;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OddIndicesTest {

    @Order(1)
    @Test
    public void testOddIndicesHappyPath() {
        int[] arr = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.oddIndices(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddIndicesZero() {
        int[] arr = {0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.oddIndices(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesZeroLength() {
        int[] arr = {};
        int[] expectedResult = {};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.oddIndices(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
