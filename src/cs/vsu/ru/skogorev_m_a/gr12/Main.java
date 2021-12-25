package cs.vsu.ru.skogorev_m_a.gr12;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scan.nextInt();
        System.out.print("Введите числа: ");
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }
        int[] array1 = {1, -2, -5, 6, 8, 0, 43, -18};
        int[] array2 = {0, 56, -100, 76, -5, 0, 7, -65};
        int[] array3 = {10, 12, 1, 6, -25, 0, 4, -5};
        int[] array4 = {1, 6, -10, 700, -5, 0, 7, -15};
        int n = 2;
        int q = 4;
        int k = Integer.MAX_VALUE;
        System.out.println(Arrays.toString(array));
        System.out.println(Logic.findSequence(array, n));
        System.out.println(Logic.findSequence(array1, n));
        System.out.println(Logic.findSequence(array2, n));
        System.out.println(Logic.findSequence(array3, q));
        System.out.println(Logic.findSequence(array4, k));
    }
}
