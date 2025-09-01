package Day10;
import java.util.Scanner;
public class Question34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        System.out.println("Numbers in ascending order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
