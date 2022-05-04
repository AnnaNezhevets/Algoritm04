import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {

    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPathTrue(){

        int i = 555;
        boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumber(i);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIsPositiveNumberHappyPathFalse(){

        int i = -555;
        boolean expectedResult = false;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumber(i);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIsPositiveNumberHappyPathZero(){

        int i = 0;
        boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumber(i);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
