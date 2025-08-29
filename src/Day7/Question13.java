package Day7;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("The number is negative: " + num);
        } else {
            System.out.println("The number is not negative.");
        }

        sc.close();
    }
}
