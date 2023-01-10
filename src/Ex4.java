import java.util.Arrays;

public class Ex4 {
    /*Напишите метод бинарного поиска в одномерном мас-
сиве. В случае, если массив не отсортирован, метод должен
бросать проверяемое исключение.*/
    static int[] arr1 = {1, 8, 9, 0, 8, 4, 7, 4, 2};
    static int[] arr2 = {1, 3, 5, 7, 8, 10, 14, 67, 212, 369};
    public static void main(String[] args) {
        System.out.println(returnResult(arr1, 10));
        System.out.println();

        System.out.println(returnResult(arr2, 10));



     //Проверял здесь свою сортировку, вроде работает, но я до конца не уверен, сделал поиск с числами, со строками тяжелей будет, но думаю справился бы))
     /*   if(isSorted(arr2))
            System.out.println(binarySearch(arr2, 3));

        if(isSorted(arr2))
            System.out.println(binarySearch(arr2, 7));

        if(isSorted(arr2))
            System.out.println(binarySearch(arr2, 8));

        if(isSorted(arr2))
            System.out.println(binarySearch(arr2, 14));

        if(isSorted(arr2))
            System.out.println(binarySearch(arr2, 1));

        if(isSorted(arr2))
            System.out.println(binarySearch(arr2, 67));


        if(isSorted(arr2))
            System.out.println(binarySearch(arr2, 10));

        if(isSorted(arr2))
            System.out.println(binarySearch(arr2, 369));

        if(isSorted(arr2))
            System.out.println(binarySearch(arr2, 212));


*/
    }
        public static int returnResult(int[] arr, int a){
        if (isSorted(arr)) {
            System.out.println("Мы успешно нашли индекс заданного числа");
            return binarySearch(arr,a );
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Массив не отсортирован");
            }

return -1;
        }

    }
    public static boolean isSorted(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1])
                return false;
                }
       return true;
    }

    public static int binarySearch(int []arr, int a){


            int size = arr.length;
            int index=size/2;
            while (arr[index]!=a){
            if(arr[index]>a){
                if(index<=2 || Math.abs(index-size/2)<=2)
                    index--;
                else
                index-=index/2;}
            else if (arr[index]<a){
                if(size-index-1<=2 || Math.abs(index-size/2)<=2)
                    index++;
                else
            index+=index/2;
           }}


            return index;

        }



    }






