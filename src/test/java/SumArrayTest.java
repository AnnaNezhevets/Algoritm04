import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {

    @Order(1)
    @Test
    public void sumArrayHappyPath() {

        int[] arr = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(arr);

        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Order(2)
    @Test
    public void sumArrayHappyPathNegativ() {

        int[] arr = {-3, -7};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(arr);

        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Order(3)
    @Test
    public void sumArrayZero() {

        int[] arr = {0, 0, 0};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(arr);

        Assertions.assertEquals(expectedResult, actualResult);


    }
    @Order(4)
    @Test
    public void sumArrayLengthZero() {

        int[] arr = {};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(arr);

        Assertions.assertEquals(expectedResult, actualResult);


    }
}
