package Day10;
import java.util.Scanner;
public class Question32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Add each number to sum
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
