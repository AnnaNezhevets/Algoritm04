public class SumArray {

    //Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    public int sumArray(int[] arr){
        int sum = 0;
        int[] arrNew = new int [arr.length];
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
}
