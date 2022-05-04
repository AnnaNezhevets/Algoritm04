import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    @Order(1)
    @Test
    public void testBiggerValueHappyPath(){
        int i1 = 3333;
        int i2 = 9999;
        int expectedResult = i2;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(i1, i2);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testBiggerValueHappyPathNegative(){
        int i1 = -3333;
        int i2 = -9999;
        int expectedResult = i1;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(i1, i2);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testBiggerValueZero(){
        int i1 = 0;
        int i2 = 0;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(i1, i2);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Order(4)
    @Test
    public void testBiggerValueMaxAndMinInteger(){
        int i1 = Integer.MAX_VALUE + 1;
        int i2 = Integer.MIN_VALUE - 1;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(i1, i2);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
