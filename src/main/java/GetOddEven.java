public class GetOddEven {

    //Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”, если число нечетное,
    // и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.

    public String getOddEven(long l) {
        if(l <= 2147483647L && l >= -2147483648L) {
            if (l % 2 != 0) {

                return "Odd";
            } else {

                return "Even";
            }
        } else {

            return "Undefined";

        }
    }
}
