package laba1;
// task 11

public class Sum {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 7, 9, 2};
        int result = sum(numbers);
        System.out.println("The sum of even numbers: " + result);
    }

    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int total = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                total += num;
            }
        }

        return total;
    }
}