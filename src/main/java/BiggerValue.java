public class BiggerValue {

    //Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
    public int biggerValue(int i1, int i2){
        int max;
        if((i1 > Integer.MIN_VALUE && i1 < Integer.MAX_VALUE) && (i2 > Integer.MIN_VALUE && i2 < Integer.MAX_VALUE)) {
            if (i1 > i2) {
                max = i1;
            } else {
                max = i2;
            }
        } else {

            return 0;
        }
        return max;
    }
}
