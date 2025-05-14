package laba1;
import java.util.Scanner;
// task 2

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);              
        int seconds = scanner.nextInt();                       

        int hours = seconds / 3600;                            
        int minutes = (seconds % 3600) / 60;                   
        int secs = seconds % 60;                               

        System.out.printf("%d:%02d:%02d%n", hours, minutes, secs);
        scanner.close();
    }
}