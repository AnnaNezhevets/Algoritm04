public class SumArray {

    //Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    public int sumArray(int[] arr){
        int sum = 0;
        int[] arrNew = new int [arr.length];
        if(arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
        } else {

            return 0;
        }
        return sum;
    }
}
