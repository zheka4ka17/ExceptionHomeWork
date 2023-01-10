import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Float.NaN;

public class Ex1 {
    /*Создать метод, который выводит в консоль результат це-
лочисленного деления числа, введенного с клавиатуры, на
значения элементов одномерного массива целых чисел, за-
полненный случайным образом – от -10 до 10. Длина масси-
ва случайная – от 1 до 10.
Обработать все возможные исключительные ситуации в
данном методе.*/
    public static void main(String[] args) {
        System.out.println(getResult(getArray()));

    }

    public static int[] getArray() {
        Random random = new Random();
        int size = random.nextInt(10) + 1;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(21) - 10;
        return array;

    }

    public static double getResult(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        try {
            int x = scanner.nextInt();
            Random random = new Random();
            int index = random.nextInt(arr.length);
            System.out.println(arr[index]);
            if(arr[index]!=0)
            result = x*1.0 / arr[index];
            else throw new RuntimeException();}

         catch (InputMismatchException ex) {
            System.out.println("it's not a number");
        } catch (RuntimeException e) {
            System.out.println("Деление на ноль запрещено!!!");
            result=NaN;

        }
        return result;

    }
}



