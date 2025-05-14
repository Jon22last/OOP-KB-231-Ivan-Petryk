package laba3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Планування спринту");

        System.out.print("Кількість історій користувача: ");
        int userStoryCount = scanner.nextInt();
        scanner.nextLine();

        UserStory[] stories = new UserStory[userStoryCount];

        for (int i = 0; i < userStoryCount; i++) {
            System.out.println("\nСтворення UserStory #" + (i + 1));
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Назва: ");
            String name = scanner.nextLine();
            System.out.print("Скільки годин займе: ");
            int estimate = scanner.nextInt();
            scanner.nextLine();
            stories[i] = new UserStory(id, name, estimate, new UserStory[]{});
        }

        for (UserStory story : stories) {
            story.complete();
        }

        System.out.print("\nКількість багів: ");
        int bugCount = scanner.nextInt();
        scanner.nextLine();

        Bug[] bugs = new Bug[bugCount];

        for (int i = 0; i < bugCount; i++) {
            System.out.println("\nСтворення Bug #" + (i + 1));
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Назва: ");
            String name = scanner.nextLine();
            System.out.print("Скільки годин займе: ");
            int estimate = scanner.nextInt();
            scanner.nextLine();
            int index;
            while (true) {
                System.out.print("Номер UserStory для цього бага (від 0 до " + (stories.length - 1) + "): ");
                index = scanner.nextInt();
                scanner.nextLine();
                if (index >= 0 && index < stories.length) break;
                System.out.println(" Невірний індекс. Спробуйте ще раз.");
            }
            bugs[i] = Bug.createBug(id, name, estimate, stories[index]);
            if (bugs[i] == null) {
                System.out.println(" Баг не створено. Історія користувача не завершена.");
            }
        }

        System.out.print("\nМаксимальна загальна оцінка для спринту: ");
        int capacity = scanner.nextInt();
        System.out.print("Максимальна кількість завдань: ");
        int ticketLimit = scanner.nextInt();

        Sprint sprint = new Sprint(capacity, ticketLimit);

        for (UserStory us : stories) {
            if (sprint.addUserStory(us)) {
                System.out.println("Додано UserStory: " + us);
            } else {
                System.out.println("Не додано UserStory: " + us);
            }
        }

        for (Bug bug : bugs) {
            if (bug != null && sprint.addBug(bug)) {
                System.out.println("Додано Bug: " + bug);
            } else if (bug != null) {
                System.out.println("Не додано Bug: " + bug);
            }
        }

        System.out.println("\n Завдання у спринті:");
        for (Ticket t : sprint.getTickets()) {
            System.out.println(t);
        }

        System.out.println("\n Сумарна кількістьгодин: " + sprint.getTotalEstimate());
        scanner.close();
    }
}
