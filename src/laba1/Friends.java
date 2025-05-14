package laba1;
import java.util.Scanner;
// task 6

public class Friends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bill = scanner.nextDouble();
        int friends = scanner.nextInt();

        if (bill < 0) {
            System.out.println("Сума рахунку не може бути від’ємною.");
        } else if (friends <= 0) {
            System.out.println("Кількість друзів має бути більше нуля.");
        } else {
            double total = bill * 1.10; // додаємо 10% чайових
            int share = (int)Math.round(total / friends); // округлення до цілого числа
            System.out.println(share);
        }
        scanner.close();
    }
}