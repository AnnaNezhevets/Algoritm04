import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class DetermineMultipleNumberMTest {

 @Order(1)
 @Test
    public void testDetermineMultipleNumberMHappyPathBoth(){
        int m = 15;
        String expectedResult = "Good Number";

        DetermineMultipleNumberM dmnm = new DetermineMultipleNumberM();
        String actualResult = dmnm.determineMultipleNumberM(m);

     Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testDetermineMultipleNumberMHappyPathOnlyThree(){
        int m = 9;
        String expectedResult = "Bad Number";

        DetermineMultipleNumberM dmnm = new DetermineMultipleNumberM();
        String actualResult = dmnm.determineMultipleNumberM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testDetermineMultipleNumberMHappyPathOnlyFive(){
        int m = 25;
        String expectedResult = "Poor Number";

        DetermineMultipleNumberM dmnm = new DetermineMultipleNumberM();
        String actualResult = dmnm.determineMultipleNumberM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testDetermineMultipleNumberMHappyPathOthers(){
        int m = 11;
        String expectedResult = "-1";

        DetermineMultipleNumberM dmnm = new DetermineMultipleNumberM();
        String actualResult = dmnm.determineMultipleNumberM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testDetermineMultipleNumberMZero(){
        int m = 0;
        String expectedResult = "Good Number";

        DetermineMultipleNumberM dmnm = new DetermineMultipleNumberM();
        String actualResult = dmnm.determineMultipleNumberM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
