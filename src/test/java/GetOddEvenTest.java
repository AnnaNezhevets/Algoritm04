import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class GetOddEvenTest {

    @Order(1)
    @Test
    public void testGetOddEvenHappyPathNegative() {
        long l = -345;
        String expectedResult = "Odd";

        GetOddEven getOddEven = new GetOddEven();
        String actualResult = getOddEven.getOddEven(l);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testGetOddEvenHappyPathZero() {
        long l = 0;
        String expectedResult = "Even";

        GetOddEven getOddEven = new GetOddEven();
        String actualResult = getOddEven.getOddEven(l);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testGetOddEvenHappyPathLargeNumber() {
        long l = 222222;
        String expectedResult = "Even";

        GetOddEven getOddEven = new GetOddEven();
        String actualResult = getOddEven.getOddEven(l);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testGetOddEvenMaxPlusOne() {
        long l = 2147483647L + 1;
        String expectedResult = "Undefined";

        GetOddEven getOddEven = new GetOddEven();
        String actualResult = getOddEven.getOddEven(l);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
