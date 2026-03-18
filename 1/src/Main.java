import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers?");
        int n = scanner.nextInt();

        int[] values = new int[n];

        System.out.println("Enter numbers:");

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        double average = StatisticsHelper.calculateAverage(values);
        System.out.println("Average: " + average);
    }
}