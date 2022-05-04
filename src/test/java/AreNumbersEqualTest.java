import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {

    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathPositiveEqual(){
        int i1 = 89;
        int i2 = 89;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(i1, i2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathNegativeFirstNumber(){
        int i1 = -89;
        int i2 = 89;
        int expectedResult = -1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(i1, i2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathNegativeSecondNumber(){
        int i1 = 89;
        int i2 = -89;
        int expectedResult = 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(i1, i2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void testAreNumbersEqualHappyPathBothNegativeNumbers(){
        int i1 = -89;
        int i2 = -89;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(i1, i2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testAreNumbersEqualHappyPathBothZero(){
        int i1 = 0;
        int i2 = 0;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(i1, i2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
