public class OddIndices {

    //Написать алгоритм OddIndices, который принимает массив чисел, и возвращает массив значений нечетных индексов
    public int[] oddIndices(int[] arr) {


        int count = 0;
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 != 0)  {
                    count++;
                }

        }
        int[] arrNew = new int[count];
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arrNew[count1] = arr[i];
                count1++;

            }

        }
        return arrNew;
    }


}