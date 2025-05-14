package laba1;
import java.util.Arrays;
// task 14

public class Shift {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 7, 4};
        cycleSwap(arr1);
        System.out.println("Зсув на 1: " + Arrays.toString(arr1));

        int[] arr2 = {1, 3, 2, 7, 4};
        cycleSwap(arr2, 3);
        System.out.println("Зсув на 3: " + Arrays.toString(arr2));
    }

    public static void cycleSwap(int[] array) {
        if (array == null || array.length <= 1) return;

        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = last;
    }

    public static void cycleSwap(int[] array, int shift) {
        if (array == null || array.length <= 1 || shift == 0) return;

        shift = shift % array.length; 

        reverse(array, 0, array.length - 1);
        reverse(array, 0, shift - 1);
        reverse(array, shift, array.length - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}