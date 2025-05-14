package laba1;
// task 10

public class Array {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 9, 3};
        
        int result = max(numbers);
        System.out.println("The maximum value: " + result);
    }

    public static int max(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }
}