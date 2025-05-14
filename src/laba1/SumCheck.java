package laba1;
import java.util.Arrays;
// task 12

public class SumCheck {
    public static void main(String[] args) {
        int[] input = {1, -1, 0, 4, 6, 10, 15, 25};
        boolean[] result = getSumCheckArray(input);

        System.out.println(Arrays.toString(result));
    }

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] checks = new boolean[array.length];

        checks[0] = false;
        checks[1] = false;

        for (int i = 2; i < array.length; i++) {
            checks[i] = array[i] == (array[i - 1] + array[i - 2]);
        }

        return checks;
    }
}