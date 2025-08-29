package Day6;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter your nationality: ");
        String nationality = sc.nextLine();

        System.out.println("\n--- Person Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Nationality: " + nationality);

        sc.close();
    }
}
