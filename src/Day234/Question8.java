package Day234;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + "°F = " + celsius + "°C");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        } else {
            System.out.println("Invalid choice! Please select 1 or 2.");
        }

        sc.close();
    }
}
