public class AreNumbersEqual {
    //Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
    //0, если числа равны
    //-1, если первое число меньше второго
    //1, если первое число больше второго
    public int areNumbersEqual(int i1, int i2) {
        int answer = 0;
        if (i1 == i2) {
            answer = 0;
        } else if (i1 < i2) {
            answer = -1;
        } else if (i1 > i2) {
            answer = 1;
        }

        return answer;
    }
}
