package Day234;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter radius of cylinder: ");
        double r = sc.nextDouble();

        System.out.print("Enter height (length) of cylinder: ");
        double h = sc.nextDouble();

        // Calculation
        double volume = Math.PI * r * r * h;

        // Output
        System.out.println("Volume of Cylinder = " + volume);

        sc.close();
    }
}
